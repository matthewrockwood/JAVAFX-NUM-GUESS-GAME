package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class FXController implements Initializable {
    public TextField numguess;
    public Text reply;
    @FXML
    private int guess;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        RandomGame.GenerateAnswer();

    }

    @FXML
    public void onSubmitPress(){
        String regex = "[0-9]+";
        if(numguess.getText().matches(regex)) {
            guess = Integer.parseInt(numguess.getText());
            System.out.println(guess + " " + RandomGame.getAnswer());
            if(guess <= 10 && guess >= 1){
                if (guess == RandomGame.getAnswer()) {
                    reply.setText("Correct");
                } else {
                    reply.setText("Incorrect");
                }
            }
            else{
                reply.setText("ENTER NUMBER 1-10");
            }


        }
        else{
            reply.setText("WRONG SHIT DARHN");
        }



    }


}
