package G1_Chambre;

import javafx.scene.Parent;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Clavier extends Parent {
    private Saxophone saxophone;
    private NotesClavier[] touches;


    public Saxophone getSaxophone() {
        return saxophone;
    }

    public Clavier (Saxophone ins){
        saxophone = ins;  // L'obet de type Instru passé en param

        Rectangle base_clavier = new Rectangle();
        base_clavier.setWidth(500);
        base_clavier.setHeight(375);
        base_clavier.setArcHeight(30);
        base_clavier.setArcWidth(30);
        base_clavier.setFill(Color.BLACK);
        base_clavier.setOpacity(0.20);




        this.getChildren().addAll(base_clavier);
        /*NotesClavier fadiese1 = new NotesClavier("Fa#1", 50, 25, 54, saxophone);//0
        NotesClavier sol1 = new NotesClavier("Sol1", 128, 25, 55, saxophone);//1
        NotesClavier la1 = new NotesClavier("La1", 206, 25, 57, saxophone);//2
        NotesClavier ladiese1 = new NotesClavier("La#1", 284, 25, 58, saxophone);//3
        NotesClavier si1 = new NotesClavier("Si1", 362, 25, 59, saxophone);//4
        NotesClavier do2 = new NotesClavier("Do2", 75, 103, 60, saxophone);//5
        NotesClavier dodiese2 = new NotesClavier("Do#2", 153, 103, 61, saxophone);//6
        NotesClavier re2 = new NotesClavier("Ré2", 231, 103, 62, saxophone);//7
        NotesClavier rediese2 = new NotesClavier("Ré#2", 309, 103, 63, saxophone);//8
        NotesClavier mi2 = new NotesClavier("Mi2", 387, 103, 64, saxophone);//9
        NotesClavier fa2 = new NotesClavier("Fa2", 50, 181, 65, saxophone);//10
        NotesClavier fadiese2 = new NotesClavier("Fa#2", 128, 181, 66, saxophone);//11
        NotesClavier sol2 = new NotesClavier("Sol2", 206, 181, 67, saxophone);//12
        NotesClavier soldiese2 = new NotesClavier("Sol#2", 284, 181, 68, saxophone);//13
        NotesClavier la2 = new NotesClavier("La2", 362, 181, 69, saxophone);//14*/
        touches = new NotesClavier[]{
                new NotesClavier("Fa#1", 50, 25, 54, saxophone),//0
                new NotesClavier("Sol1", 128, 25, 55, saxophone),//1
                new NotesClavier("La1", 206, 25, 57, saxophone),//2
                new NotesClavier("La#1", 284, 25, 58, saxophone),//3
                new NotesClavier("Si1", 362, 25, 59, saxophone),//4
                new NotesClavier("Do2", 75, 103, 60, saxophone),//5
                new NotesClavier("Do#2", 153, 103, 61, saxophone),//6
                new NotesClavier("Ré2", 231, 103, 62, saxophone),//7
                new NotesClavier("Ré#2", 309, 103, 63, saxophone),//8
                new NotesClavier("Mi2", 387, 103, 64, saxophone),//9
                new NotesClavier("Fa2", 50, 181, 65, saxophone),//10
                new NotesClavier("Fa#2", 128, 181, 66, saxophone),//11
                new NotesClavier("Sol2", 206, 181, 67, saxophone),//12
                new NotesClavier("Sol#2", 284, 181, 68, saxophone),//13
                new NotesClavier("La2", 362, 181, 69, saxophone)//14


        // , sol1, la1, ladiese1, si1, do2, dodiese2, re2, rediese2, mi2,fa2, fadiese2,sol2, soldiese2, la2

        };

        for(NotesClavier touche:touches){
            this.getChildren().add(touche);
        }

        this.setOnKeyPressed(keyEvent -> {
            for (NotesClavier touche:touches){
                if (touche.lettre.equals(keyEvent.getText().toUpperCase()))
                    touche.appuyer();
            }
        });

        this.setOnKeyReleased(keyEvent -> {
            for (NotesClavier touche:touches){
                if (touche.lettre.equals(keyEvent.getText().toUpperCase()))
                    touche.relacher();
            }
        });
    }

    public NotesClavier getNoteClavier(int i){
        return touches[i];
    }
}
