package lab5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    Automata automata = new Automata();

    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    @FXML
    private Button on;
    @FXML
    private Button off;
    @FXML
    private Button add;
    @FXML
    private Button cancel;

    @FXML
    private Label state;
    @FXML
    private Label systemMessage;

    @FXML
    private TextField textAreaDeposit;



    @FXML
    private void click1(ActionEvent actionEvent){
        automata.choice(1);
        getState();
    }
    @FXML
    private void click2(ActionEvent actionEvent){
        automata.choice(2);
        getState();
    }
    @FXML
    private void click3(ActionEvent actionEvent){
        automata.choice(3);
        getState();
    }
    @FXML
    private void click4(ActionEvent actionEvent){
        automata.choice(4);
        getState();
    }
    @FXML
    private void click5(ActionEvent actionEvent){
        automata.choice(5);
        getState();
    }
    @FXML
    private void click6(ActionEvent actionEvent){
        automata.choice(6);
        getState();
    }

    @FXML
    private void on(ActionEvent actionEvent) {
        automata.on();
        btn1.setText(automata.getMenuString().get(0).substring(2)+" "  + automata.getPrices().get(0)+"руб.");
        btn2.setText(automata.getMenuString().get(1).substring(2)+" "  + automata.getPrices().get(1)+"руб.");
        btn3.setText(automata.getMenuString().get(2).substring(2)+" "  + automata.getPrices().get(2)+"руб.");
        btn4.setText(automata.getMenuString().get(3).substring(2)+" "  + automata.getPrices().get(3)+"руб.");
        btn5.setText(automata.getMenuString().get(4).substring(2)+" "  + automata.getPrices().get(4)+"руб.");
        btn6.setText(automata.getMenuString().get(5).substring(2)+" "  + automata.getPrices().get(5)+"руб.");
        getState();
    }

    @FXML
    private void off(ActionEvent actionEvent){
        automata.off();
        getState();
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
    }

    @FXML
    private void add(ActionEvent actionEvent){
        automata.coin(Integer.parseInt(textAreaDeposit.getText()));
        getState();
    }

    @FXML
    private void cancel(ActionEvent actionEvent){
        automata.cancel();
        getState();
    }




    private void getState(){
        state.setText(automata.getState().toString());
        systemMessage.setText(automata.getStatesInClass());
        textAreaDeposit.setText("");
       }
    }



