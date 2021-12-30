package Model;

import Vue.Fenetre;

public class Start implements java.lang.Runnable{
    private KanagUT kanagUT;

    public Start() {
        kanagUT = new KanagUT();
    }
    public void run(){
        new Fenetre(kanagUT);

    }
}
