/**
 * Created by cemsaygili on 28.10.17.
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameOfLive extends JPanel implements Runnable {

    private static final long serialVersionUID = 1L;

    private Cell[][] cell = new Cell[10][10];
    private boolean start = false;

    public GameOfLive() {
        initCells();
        this.addMouseListener(new MouseController(this));
        this.setFocusable(true);
        this.addKeyListener(new KeyController(this));
    }

    public static void main(String[] args) {
        // Erzeugung eines neuen Frames

        JFrame frame = new JFrame("Das Spiel des Lebens");

        frame.setSize(350, 380);
        //die Breite und die Höhe

        frame.setLocation(150, 30);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GameOfLive game = new GameOfLive();
        frame.setContentPane(game);

        //Anzeige des Frames
        frame.setVisible(true);
        new Thread(game).start();

        JFrame frame2 = new JFrame("Die Regeln vom Spiel des Lebens");

        frame2.setSize(350, 380);
        //die Breite und die Höhe

        frame2.setLocation(150, 30);
        JLabel jl = new JLabel("<html><body>'Hinweis: Ein Kaestchen ist eine Zelle und die grauen Kaestchen sind die Grenzen!'<p><p> Sie können die Zellen mit der Leertaste bestaetigen um auf die naeste Generation zu springen.<p><p>Die Regeln: <p><p>1. Eine Zelle stirbt aufgrund Einsamkeit – sie hat weniger als 2 lebende Nachbarn.<p><p> 2. Eine Zelle lebt aufgrund Genossenschaft – sie hat entweder 2 oder 3 lebende Nachbarn.<p><p>3. Eine Zelle stirbt aufgrund Überbevölkerung – sie hat mehr als 3 lebende Nachbarn.<p><p>4. In einer “toten” Position wird eine neue Zelle geboren aufgrund Fortpflanzung – es gibt\n" +
                "genau 3 lebende Nachbarn.</body></html>");
        frame2.add(jl);

        //Anzeige des Frames
        frame2.setVisible(true);


    }

    public void calculateNextStep() {

        int a = 10; //8
        for (int x = 0; x < a; x++) {
            for (int y = 0; y < a; y++) {
                int count = 0;
                for (int dx = -1; dx <= 1; dx++) {
                    for (int dy = -1; dy <= 1; dy++) {
                        int xx = x + dx;
                        int yy = y + dy;
                        if (!(dx == 0 && dy == 0) && isInside(xx, yy)) {
                            if (cell[xx][yy].getAlive()) {
                                count++;
                            }
                        }
                    }
                }
                if (cell[x][y].getAlive()) {
                    boolean alive = (count == 2 || count == 3);
                    cell[x][y].setNextState(alive);
                } else {
                    cell[x][y].setNextState(count == 3);
                }
            }
        }
    }

    private boolean isInside(int xx, int yy) {
        int a = 8;      //8
        return xx >= 0 && yy >= 0 && xx < a && yy < a;
    }

    public void initCells() {

        int a = 8;      //8
        int b = 40;
        for (int x = 0; x < a; x++) {
            for (int y = 0; y < a; y++) {
                cell[x][y] = new Cell(false, x * b, y * b);
            }
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int a = 8;          //8
        for (int x = 0; x < a; x++) {
            for (int y = 0; y < a; y++) {
                cell[x][y].paintCell(g);
            }
        }

        //Linien erstellen *Färbe die Fläche schwarz
        g.setColor(Color.BLACK);
        int c = 10;
        int d = 40;         //40
        int e = 400;        //400
        int f = 350;           //350
        for (int i = 0; i < c; i++) {
            g.drawLine(d * i, 0, d * i, e);
            g.drawLine(0, d * i, f, d * i);
        }
    }

    public void doStep(){
        int a = 8;              //8
        calculateNextStep();
        for (int x = 0; x < a; x++) {
            for (int y = 0; y < a; y++) {
                cell[x][y].step();
            }
        }
    }

    public void run() {
        while (true) {
            if (start) {
                doStep();
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            repaint();
        }

    }

    public void setStart(boolean b) {
        start = b;
    }

    public void setCellAlive(int x, int y, boolean b) {
        cell[x][y].setAlive(true);
    }
}
//Tastencontroller (innerhalb der Klasse eine neue Klasse)
class KeyController extends KeyAdapter {
    private GameOfLive gol;

    public KeyController(GameOfLive gol) {
        this.gol = gol;
    }
//Die Leertaste wurde gedrückt
    public void keyPressed(KeyEvent e)
    {

        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            gol.setStart(true);

            }

            }
    public void GenAnzeige(KeyEvent e){
        if(e.getKeyCode() ==KeyEvent.VK_SPACE){

        }
    }
//Die Leertaste wurde losgelassen
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            gol.setStart(false);
        }
    }
}

//Mauscontroller (weitere Klasse)
class MouseController extends MouseAdapter {
    private GameOfLive sdl;

    public MouseController(GameOfLive sdl) {
        this.sdl = sdl;
    }

    //Zeiger(Maus) wird auf die Fläche gedrückt
    public void mousePressed(MouseEvent e) {
        int x = e.getX() / 40;
        int y = e.getY() / 40;
        sdl.setCellAlive(x, y, true);
        System.out.println("X: " + x + " Y: " + y);

    }


}

