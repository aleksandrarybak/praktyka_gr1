package controller.Użytkownik;

import controller.MainController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.image.*;

public class UWybor_filmuController<topBtn> {

    @FXML
    GridPane button_grid;


    private MainController main;
    public void init(MainController main){
        this.main = main;
    }
    public void initialize() {



        String url = "http://83437-254797-raikfcquaxqncofqfm.stackpathdns.com/17167-home_default/obrazek-obrazki-19paz.jpg";
        Image image = new Image(url, 100, 100, false, true);
        button_grid.add(new ImageView(image),0,0);

        int indexX =0;
        int indexY =0;
        Button btn = new Button("Button_ ddkdkdddddddddddd0oo0ldl" + indexX);

       // btn.setStyle("-fx-graphic: url('http://83437-254797-raikfcquaxqncofqfm.stackpathdns.com/17167-home_default/obrazek-obrazki-19paz.jpg')");

        button_grid.add(btn, indexX,indexY);


    }
    void addButton(){
        int index = 2;
        Button sound_button = new Button("Button_" + index);
        button_grid.add(sound_button, index,2);
    }
}

