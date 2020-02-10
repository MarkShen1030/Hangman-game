import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Puzzle {

    String[] target; 
    String[] guesses;
    String[] wrong;  

    public Puzzle() {
        target = new String[]{"A","P","P","L","E"};    
        guesses = new String[target.length];
        wrong = new String[6];

        for (int i = 0; i < guesses.length; i++) {
            guesses[i] = "_";
        }

    }

    public boolean isUnsolved() {
        for (int i = 0; i < guesses.length; i++) {
            if (guesses[i].equals("_")) {
                return true;
            }

        }
        return false;
    }

    public void show() {
        for (int i = 0; i < guesses.length; i++) {
            System.out.println(guesses[i] + " ");
        }

        for (int i = 0; i < wrong.length; i++) {
            if (wrong[i] != null) {
                System.out.println(wrong[i] + " ");     
            } else {
                break;
            }
        }
    }

    public boolean makeGuess(String guess) {
        return true;  
    }

    public String getWord() {

        return "";
    }

}
