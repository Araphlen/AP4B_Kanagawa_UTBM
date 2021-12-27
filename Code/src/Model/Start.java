package Model;

import Vue.Fenetre;

public class Start implements java.lang.Runnable{
    public static void start() {
        KanagUT kanagUT = new KanagUT();
    }
    public void run(){
        new Fenetre();

    }
}
