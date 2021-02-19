package G1_Chambre;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Main extends Application {
    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;
        primaryStage.setTitle("test");
        primaryStage.setHeight(720);
        primaryStage.setWidth(1280);
        Group root = new Group();
        Scene chambreScene = new Scene(root,1280,720);
        primaryStage.setScene(chambreScene);
        Image chambre = new Image(Main.class.getResourceAsStream("image/chambre2.png"));
        ImageView fondChambre = new ImageView(chambre);
        root.getChildren().add(fondChambre);
        boolean estResolu = false;



        VBox vBox = new VBox();
        vBox.setPrefWidth(100);


        TextArea storie = new TextArea("Ou suis-je?" +
                " J’ai une musique dans la tête, il me faut trouver un moyen de l’écouter pour pouvoir l’oublier et passer à autre chose." +
                " Tiens ? Il y a un saxophone, je pourrai même la jouer en attendant de savoir ce que je fais ici.");
        storie.setWrapText(true);
        storie.setOpacity(0.66);
        storie.setMaxHeight(100);
        storie.setTranslateY(50);
        storie.setTranslateX(360);
        storie.setStyle("-fx-background-color: blue");
        storie.forward();


        storie.setEditable(false);
        root.getChildren().add(storie);







        ImageView imgSaxo = new ImageView(new Image(Main.class.getResourceAsStream("image/saxophone3.png")));
        ImageView imgChaineHifi = new ImageView(new Image(Main.class.getResourceAsStream("image/chaineHifi.png")));
        ImageView imgCahier = new ImageView(new Image(Main.class.getResourceAsStream("image/cahier.png")));
        ImageView imgPorte = new ImageView(new Image(Main.class.getResourceAsStream("image/porte.png")));
        placementImg(imgSaxo,840,540);
        placementImg(imgChaineHifi,232,34);
        placementImg(imgCahier,0,183);
        placementImg(imgPorte,0,-500);
        animmationButton(imgSaxo);
        animmationButton(imgChaineHifi);
        animmationButton(imgCahier);


        URL musicFond = getClass().getResource("musique/generique.wav");
        Media media = new Media(musicFond.toExternalForm());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setVolume(10);
        mediaPlayer.isAutoPlay();



        TextArea note = new TextArea("   Cahier de note");
        note.setOpacity(0);
        note.setTranslateX(5);
        note.setRotate(-19);
        note.setTranslateY(480);
        note.setMaxWidth(250);
        imgCahier.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                note.setOpacity(0.75);


                ImageView fermer = new ImageView(new Image(Main.class.getResourceAsStream("image/fermer1.png")));
                fermer.setTranslateY(420);
                fermer.setTranslateX(180);
                root.getChildren().remove(storie);

                root.getChildren().addAll(fermer);

                fermer.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        note.setOpacity(0);
                        root.getChildren().remove(fermer);
                    }
                });


            }
        });

        imgChaineHifi.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                root.getChildren().remove(storie);
                URL musicURL = getClass().getResource("musique/generique.wav");
                Media media = new Media(musicURL.toExternalForm());
                MediaPlayer mediaPlayer = new MediaPlayer(media);
                mediaPlayer.setVolume(75);
                mediaPlayer.play();

            }
        });

        StackPane interfaceSaxo = new StackPane();
        interfaceSaxo.setPrefSize(1280,720);
        Saxophone instruSaxo = new Saxophone();
        Clavier monClavier = new Clavier(instruSaxo);
        Enigme monEnigme = new Enigme(monClavier);

        imgSaxo.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                root.getChildren().remove(storie);



                interfaceSaxo.getChildren().addAll(monEnigme);
                interfaceSaxo.setAlignment(monEnigme, Pos.BOTTOM_CENTER);
                root.getChildren().addAll(interfaceSaxo);


                ImageView fermer = new ImageView(new Image(Main.class.getResourceAsStream("image/fermer1.png")));
                fermer.setTranslateX(950);
                fermer.setTranslateY(580);
                fermer.setScaleX(2);
                fermer.setScaleY(2);
                root.getChildren().addAll(fermer);

                fermer.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        root.getChildren().remove(interfaceSaxo);
                        root.getChildren().remove(fermer);
                    }
                });



            }
        });

            animmationButton(imgPorte);
            imgPorte.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    if (monEnigme.isResolu()){
                        // CHANGMENT DE SCNEE ICI
                        try {
                            changeScene("sample.fxml");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }else {
                        URL musicURL = getClass().getResource("musique/Doh.wav");
                        Media media = new Media(musicURL.toExternalForm());
                        MediaPlayer mediaPlayer = new MediaPlayer(media);
                        mediaPlayer.setVolume(75);
                        mediaPlayer.play();
                    }


                }
            });




        vBox.getChildren().addAll(imgSaxo, imgChaineHifi,imgCahier,imgPorte);

        root.getChildren().add(vBox);



        root.getChildren().add(note);
        primaryStage.show();
    }

    public void animmationButton(ImageView img){
        img.setOnMouseEntered(mouseEvent -> {
            img.setScaleX(1.5);
            img.setScaleY(1.5);
        });
        img.setOnMouseExited(mouseEvent -> {
            img.setScaleX(1);
            img.setScaleY(1);
        });

    }

    public void placementImg(ImageView img, int x, int y){
        img.setTranslateY(y);
        img.setTranslateX(x);
    }

    public void changeScene(String fxml) throws IOException {
        Parent pane = FXMLLoader.load(
                getClass().getResource(fxml));

        Scene scene = new Scene( pane );
        primaryStage.setScene(scene);
    }

    public static void main(String[] args) {
        launch(args);
    }

}
