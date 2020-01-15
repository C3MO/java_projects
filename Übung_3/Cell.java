/**
 * Created by cemsaygili on 28.10.17.
 */
import java.awt.Color;
import java.awt.Graphics;

public class Cell {

    private boolean alive, nextState;
    private int x, y;

    public Cell(boolean alive, int x, int y){
        this.alive = alive;
        this.x = x;
        this.y = y;
    }

    public boolean getAlive(){
        return alive;
    }

    public boolean nextState(){
        return nextState;
    }

    public void setAlive(boolean alive){
        this.alive = alive;
    }

    public void setNextState(boolean nextState){
        this.nextState = nextState;
    }

    public void paintCell(Graphics gr){
        if(alive){
            gr.setColor(Color.RED);
        }else{
            gr.setColor(Color.WHITE);
        }
        gr.fillRect(x, y, 40, 40);
    }


    public void step() {
        alive = nextState;

    }

}