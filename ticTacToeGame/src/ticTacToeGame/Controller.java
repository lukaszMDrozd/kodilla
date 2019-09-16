package ticTacToeGame;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private boolean isClicked;

    public boolean isClicked() {
        return isClicked;
    }

    public void setClicked(boolean clicked) {
        isClicked = clicked;
    }

    @FXML
    private Button button00;

    @FXML
    private Circle circle00;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        button00.setOnAction(actionEvent -> {
            if(isClicked()) {
                circle00.getStyleClass().remove("correctChoice");
                circle00.getStyleClass().add("defaultColor");
                setClicked(false);
            } else {
                circle00.getStyleClass().remove("defaultColor");
                circle00.getStyleClass().add("correctChoice");
                setClicked(true);
            }
        });
    }
}
