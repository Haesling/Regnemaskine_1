package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.ArrayList;


public class Controller {
    ArrayList<String> numbers = new ArrayList<String>();
    int result;
    @FXML
    public TextField talDisplay;

    public void plusM(ActionEvent actionEvent) {
        String s = talDisplay.getText();
        System.out.println(s + "er nu tilføjet");
        numbers.add(s);
        talDisplay.clear();
    }

    public void equalM(ActionEvent actionEvent) {
        String s = talDisplay.getText();
        System.out.println(s + "er nu tilføjet");
        numbers.add(s);
        talDisplay.clear();

        for (String number:numbers) {
            result += Integer.parseInt(number);
        }

            System.out.println("Det bliver: " + result);
            talDisplay.setText(Integer.toString(result));

        }

    }

