package G1_Chambre;

import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.net.URL;


public class Enigme extends Parent {
    private TextArea afficheur;
    private Clavier clavier;
    private boolean resolu = false;

    public Enigme(Clavier clavier) {
        this.afficheur = new TextArea();
        afficheur.setTranslateY(260);
        afficheur.setTranslateX(10);
        afficheur.setMaxWidth(480);
        //afficheur.setMinSize(480, 100);
        afficheur.setMaxHeight(100);
        this.clavier = clavier;
        afficheur.setWrapText(true);
        //afficheur.setEditable(false);


        clavier.getNoteClavier(0).setOnMouseClicked(mouseEvent -> {
            clavier.getSaxophone().note_on(54);
            afficheur.setText(afficheur.getText()+ "Fa#1 ");
            clavier.getSaxophone().note_off(54);

        });
        clavier.getNoteClavier(1).setOnMouseClicked(mouseEvent -> {
            clavier.getSaxophone().note_on(55);
            afficheur.setText(afficheur.getText()+ "Sol1 ");
            clavier.getSaxophone().note_off(55);

        });
        clavier.getNoteClavier(2).setOnMouseClicked(mouseEvent -> {
            clavier.getSaxophone().note_on(57);
            afficheur.setText(afficheur.getText()+ "La1 ");
            clavier.getSaxophone().note_off(57);

        });
        clavier.getNoteClavier(3).setOnMouseClicked(mouseEvent -> {
            clavier.getSaxophone().note_on(58);
            afficheur.setText(afficheur.getText()+ "La#1 ");
            clavier.getSaxophone().note_off(58);

        });
        clavier.getNoteClavier(4).setOnMouseClicked(mouseEvent -> {
            clavier.getSaxophone().note_on(59);
            afficheur.setText(afficheur.getText()+ "Si1 ");
            clavier.getSaxophone().note_off(59);

        });
        clavier.getNoteClavier(5).setOnMouseClicked(mouseEvent -> {
            clavier.getSaxophone().note_on(60);
            afficheur.setText(afficheur.getText()+ "Do2 ");
            clavier.getSaxophone().note_off(60);

        });
        clavier.getNoteClavier(6).setOnMouseClicked(mouseEvent -> {
            clavier.getSaxophone().note_on(61);
            afficheur.setText(afficheur.getText()+ "Do#2 ");
            clavier.getSaxophone().note_off(61);

        });
        clavier.getNoteClavier(7).setOnMouseClicked(mouseEvent -> {
            clavier.getSaxophone().note_on(62);
            afficheur.setText(afficheur.getText()+ "Ré2 ");
            clavier.getSaxophone().note_off(62);

        });
        clavier.getNoteClavier(8).setOnMouseClicked(mouseEvent -> {
            clavier.getSaxophone().note_on(63);
            afficheur.setText(afficheur.getText()+ "Ré#2 ");
            clavier.getSaxophone().note_off(63);

        });
        clavier.getNoteClavier(9).setOnMouseClicked(mouseEvent -> {
            clavier.getSaxophone().note_on(64);
            afficheur.setText(afficheur.getText()+ "Mi2 ");
            clavier.getSaxophone().note_off(64);

        });
        clavier.getNoteClavier(10).setOnMouseClicked(mouseEvent -> {
            clavier.getSaxophone().note_on(65);
            afficheur.setText(afficheur.getText()+ "Fa2 ");
            clavier.getSaxophone().note_off(65);

        });
        clavier.getNoteClavier(11).setOnMouseClicked(mouseEvent -> {
            clavier.getSaxophone().note_on(66);
            afficheur.setText(afficheur.getText()+ "Fa#2 ");
            clavier.getSaxophone().note_off(66);

        });
        clavier.getNoteClavier(12).setOnMouseClicked(mouseEvent -> {
            clavier.getSaxophone().note_on(67);
            afficheur.setText(afficheur.getText()+ "Sol2 ");
            clavier.getSaxophone().note_off(67);

        });
        clavier.getNoteClavier(13).setOnMouseClicked(mouseEvent -> {
            clavier.getSaxophone().note_on(68);
            afficheur.setText(afficheur.getText()+ "Sol#2 ");
            clavier.getSaxophone().note_off(68);

        });
        clavier.getNoteClavier(14).setOnMouseClicked(mouseEvent -> {
            clavier.getSaxophone().note_on(69);
            afficheur.setText(afficheur.getText()+ "La2 ");
            clavier.getSaxophone().note_off(69);

        });
        /*
        clavier.getNoteClavier(0).setOnMousePressed(mouseEvent -> afficheur.setText(afficheur.getText()+"Fa#1 "));
        clavier.getNoteClavier(1).setOnMousePressed(mouseEvent -> afficheur.setText(afficheur.getText()+"Sol1 "));
        clavier.getNoteClavier(2).setOnMousePressed(mouseEvent -> afficheur.setText(afficheur.getText()+"La1 "));
        clavier.getNoteClavier(3).setOnMousePressed(mouseEvent -> afficheur.setText(afficheur.getText()+"La#1 "));
        clavier.getNoteClavier(4).setOnMousePressed(mouseEvent -> afficheur.setText(afficheur.getText()+"Si1 "));
        clavier.getNoteClavier(5).setOnMousePressed(mouseEvent -> afficheur.setText(afficheur.getText()+"Do2 "));
        clavier.getNoteClavier(6).setOnMousePressed(mouseEvent -> afficheur.setText(afficheur.getText()+"Do#2 "));
        clavier.getNoteClavier(7).setOnMousePressed(mouseEvent -> afficheur.setText(afficheur.getText()+"Ré2 "));
        clavier.getNoteClavier(8).setOnMousePressed(mouseEvent -> afficheur.setText(afficheur.getText()+"Ré#2 "));
        clavier.getNoteClavier(9).setOnMousePressed(mouseEvent -> afficheur.setText(afficheur.getText()+"Mi2 "));
        clavier.getNoteClavier(10).setOnMousePressed(mouseEvent -> afficheur.setText(afficheur.getText()+"Fa2 "));
        clavier.getNoteClavier(11).setOnMousePressed(mouseEvent -> afficheur.setText(afficheur.getText()+"Fa#2 "));
        clavier.getNoteClavier(12).setOnMousePressed(mouseEvent -> afficheur.setText(afficheur.getText()+"Sol2 "));
        clavier.getNoteClavier(13).setOnMousePressed(mouseEvent -> afficheur.setText(afficheur.getText()+"Sol#2 "));
        clavier.getNoteClavier(14).setOnMousePressed(mouseEvent -> afficheur.setText(afficheur.getText()+"La2 "));*/

        ImageView valider = new ImageView(new Image(Main.class.getResourceAsStream("image/valider1.png")));
        valider.setOnMousePressed(mouseEvent -> valider());
        valider.setTranslateX(20);
        valider.setTranslateY(315);

        ImageView recommencer = new ImageView(new Image(Main.class.getResourceAsStream("image/fermer3.png")));
        recommencer.setOnMousePressed(mouseEvent -> recommencer());
        recommencer.setTranslateX(55);
        recommencer.setTranslateY(315);
        this.getChildren().addAll(clavier, afficheur,valider, recommencer);
    }

    public TextArea getAfficheur() {
        return afficheur;
    }

    public boolean isResolu() {
        return resolu;
    }

    public void valider(){
        // Do2 Mi2 Fa#2 La2 Sol2 Mi2 Do2 La1
        // Sol1 Sol1 Sol1 Fa#1 La1
        // Sol1 Sol1 Sol1 Fa#1
        // Sol1 Sol1 Sol1 Fa#1
        // La#1 Si1

        if (afficheur.getText().equals(new String("Do2 Mi2 Fa#2 La2 Sol2 Mi2 Do2 La1 Sol1 Sol1 Sol1 Fa#1 Sol1 Sol1 Sol1 Fa#1 Sol1 Sol1 Sol1 Fa#1 La#1 Si1 "))){
            afficheur.setText("Ha ! Enfin débarrassé de cette musique mais j’entends toujours un bourdonnement." +
                    " Ça venais pas de ça alors, je vais aller voir ce qu’il se passe en dehors de cette chambre.");
            resolu = true;


        } else {
            afficheur.setText("Pas encore recommence");
            URL musicURL = getClass().getResource("musique/Doh.wav");
            Media media = new Media(musicURL.toExternalForm());
            MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.setVolume(75);
            mediaPlayer.play();
        }
        
    }

    public void recommencer(){
        afficheur.setText("");
    }
}
