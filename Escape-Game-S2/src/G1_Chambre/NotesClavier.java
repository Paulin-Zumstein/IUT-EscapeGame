package G1_Chambre;

import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public  class  NotesClavier extends Parent {

    public String lettre;
    private int positionX =0;
    private int positionY =0;
    private int note =0;
    private  Saxophone saxophone;

    private  Rectangle base_touche = new Rectangle(75,75, Color.BLUE);


    Text lettre_touche = new Text();

    public String getLettre() {
        return lettre;
    }

    public NotesClavier(String lettre, int positionX, int positionY, int note, Saxophone saxophone) {

        this.lettre = lettre;
        this.positionX = positionX;
        this.positionY = positionY;
        this.note = note;
        this.saxophone = saxophone;

        base_touche.setArcHeight(10);
        base_touche.setArcWidth(10);
        base_touche.setOpacity(0.75);
        this.getChildren().add(base_touche);

        lettre_touche.setText(lettre);
        lettre_touche.setFill(Color.GREY);
        lettre_touche.setX(25);
        lettre_touche.setY(45);
        this.getChildren().add(lettre_touche);//ajout de la lettre de la touche

        this.setTranslateX(positionX);//positionnement de la touche sur le clavier
        this.setTranslateY(positionY);

        this.setOnMouseEntered(mouseEvent -> base_touche.setFill(Color.LIGHTBLUE));
        this.setOnMouseExited(mouseEvent -> base_touche.setFill(Color.BLUE));
        this.setOnMousePressed(mouseEventSon -> appuyer());
        this.setOnMouseReleased(mouseEventSon -> relacher());
    }

    public  void appuyer(){
        base_touche.setFill(Color.DARKBLUE);
        saxophone.note_on(note);
    }

    public  void relacher(){
        base_touche.setFill(Color.BLUE);
        saxophone.note_off(note);
    }
}
