package Datenansammlung;

/**
 * Created by cemsaygili on 12.12.17.
 */
public enum Steuern {
    NORMAL,
    VERRINGERT;

    public static Steuern analyseSteuern(final String analyse)
    {
        switch (analyse.toLowerCase().charAt(0))
        {
            case 'e':
            case 'r':
                return Steuern.VERRINGERT;
            case 'n':
            default:
                return Steuern.NORMAL;
        }
    }
}
