package gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GUI extends Application {


    @Override
    public void start(Stage stage) throws Exception{
        stage.setTitle("Stock Reader");
        GridPane pane = new GridPane();
        this.initContent (pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();

    }

    private void initContent(GridPane pane) {
        pane.setPadding(new Insets(100));
        pane.setHgap(10);
        pane.setVgap(10);



        Label lblSymbol = new Label("Stock Symbol");
        pane.add(lblSymbol,1,1);

        TextField txfSymbol = new TextField();
        pane.add(txfSymbol,1,2);

        //------

        Label lblPrice = new Label("Stock Price");
        pane.add(lblPrice, 3,1);

        TextField txfPrice = new TextField();
        pane.add(txfPrice,3,2);

        //------

        Button btnGetPrice = new Button("Get Stock Price");
        pane.add(btnGetPrice, 1,4);



    }

}
