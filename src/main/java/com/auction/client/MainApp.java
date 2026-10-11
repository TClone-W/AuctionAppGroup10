package com.auction.client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Entry point cua ung dung JavaFX Client.
 * Tuan thu mo hinh MVC: Loader FXML va Controller lien ket.
 */
public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/auction_room.fxml"));
        Parent root = loader.load();

        primaryStage.setTitle("He thong Dau gia Truc tuyen - JavaFX Client");
        Scene scene = new Scene(root, 1080, 720);
        
        // CSS Style
        scene.getStylesheets().add(getClass().getResource("/css/style.css").toExternalForm());

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}