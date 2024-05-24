package org.example;

public class PlayerCharacter {
    public static void main(String[] args) {


    }
    static int Y = 0;
    static int X = 0;
    public static int getX(int a) {
        return a=0;

    }
    public static int getY(int a) {
        return a=0;

    }
    public static int move(String a) {
        if(a.equals("w")) {
            return Y=Y+1;
        }
        else if(a.equals("s")) {
            return Y=Y-1;
        }
        else if(a.equals("d")) {
            return X=X+1;
        }
        else if(a.equals("a")) {
            return X=X-1;
        }
        return 0;
    }
}
