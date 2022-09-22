package com.example.lab2javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    public Button btnMain;
    public TextField radius;
    public TextField height;
    public TextField weight;
    public TextField mass_normal;
    public TextField mass_enhanced;
    public TextField price_normal;
    public TextField price_enhanced;

    public void onBtnAction(ActionEvent actionEvent) {
        double r = Double.valueOf( radius.getText() );
        double h = Double.valueOf( height.getText() );
        double w = Double.valueOf( weight.getText() );

        if (r != 0 && h != 0 && w != 0) {
            double V = ((Math.PI*r*r)*2 + 2*Math.PI*r*h) * w;
            mass_normal.setText(Double.toString(V));
            mass_enhanced.setText(Double.toString(V*1.735));

            double price_n = Math.round(V*5 * 100.0)/100.0;
            double price_e = Math.round(V*1.735*10 * 100.0)/100.0;

            price_normal.setText(Double.toString(price_n) + " zł");
            price_enhanced.setText(Double.toString(price_e) + " zł");
        }
    }
}