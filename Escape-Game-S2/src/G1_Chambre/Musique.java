package G1_Chambre;

import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;

import java.util.ArrayList;

public class Musique {
    private Clavier clavier;

    public Musique(Clavier clavier) {
        this.clavier = clavier;
    }

    public void generiqueSimpson(){
        Saxophone saxophone = new Saxophone();
        NotesClavier fadiese1 = new NotesClavier("Fa#1", 50, 25, 54, saxophone);//0
        NotesClavier sol1 = new NotesClavier("Sol1", 128, 25, 55, saxophone);//1
        NotesClavier la1 = new NotesClavier("La1", 206, 25, 57, saxophone);//2
        NotesClavier ladiese1 = new NotesClavier("La#1", 284, 25, 58, saxophone);//3
        NotesClavier si1 = new NotesClavier("Si1", 362, 25, 59, saxophone);//4
        NotesClavier do2 = new NotesClavier("Do2", 75, 103, 60, saxophone);//5

        NotesClavier mi2 = new NotesClavier("Mi2", 387, 103, 64, saxophone);//9

        NotesClavier fadiese2 = new NotesClavier("Fa#2", 128, 181, 66, saxophone);//11
        NotesClavier sol2 = new NotesClavier("Sol2", 206, 181, 67, saxophone);//12

        NotesClavier la2 = new NotesClavier("La2", 362, 181, 69, saxophone);//14
        NotesClavier[] jeSaisPasPourquoi = new NotesClavier[]{do2,mi2,fadiese2,la2,sol2,mi2,do2,la1,sol1,sol1,sol1,fadiese1,sol1,sol1,sol1,fadiese1, sol1,sol1,sol1,fadiese1, ladiese1,si1};

        for (NotesClavier courant : jeSaisPasPourquoi){
            if (courant==fadiese1){
                clavier.getSaxophone().note_on(54);
                clavier.getSaxophone().note_off(54);
            }
            if (courant==sol1){
                clavier.getSaxophone().note_on(55);
                clavier.getSaxophone().note_off(55);
            }
            if (courant==la1){
                clavier.getSaxophone().note_on(57);
                clavier.getSaxophone().note_off(57);
            }
            if (courant==ladiese1){
                clavier.getSaxophone().note_on(58);
                clavier.getSaxophone().note_off(58);
            }
            if (courant==si1){
                clavier.getSaxophone().note_on(59);
                clavier.getSaxophone().note_off(59);
            }
            if (courant==do2){
                clavier.getSaxophone().note_on(60);
                clavier.getSaxophone().note_off(60);
            }
            if (courant==mi2){
                clavier.getSaxophone().note_on(64);
                clavier.getSaxophone().note_off(64);
            }
            if (courant==fadiese2){
                clavier.getSaxophone().note_on(66);
                clavier.getSaxophone().note_off(66);
            }
            if (courant==sol2){
                clavier.getSaxophone().note_on(67);
                clavier.getSaxophone().note_off(67);
            }
            if (courant==la2){
                clavier.getSaxophone().note_on(69);
                clavier.getSaxophone().note_off(69);
            }
        }


    }
}
