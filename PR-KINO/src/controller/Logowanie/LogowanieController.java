package controller.Logowanie;

import controller.MainController;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class LogowanieController {
    private MainController main;
    @FXML
    public TextField ttt;
    public void init(MainController main){
        this.main = main;
    }
    public void test(){
        System.out.println(this.main.test.getText());
    }
}