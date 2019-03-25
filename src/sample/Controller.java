package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public TextField ulaz;
    public Label ispisBrojeva;

    public void ispisBrojeva(ActionEvent actionEvent) {
        int n = Integer.parseInt(ulaz.getText());

    String rez = "";

    for (int i=1; i<=n; i++) {
        if (i % sumaCifara(i) == 0) {
            rez+=i + " ";
        }
    }
    ispisBrojeva.setText(rez);
    }

    private static int sumaCifara(int n) {
        int sum=0;

        while(n!=0) {
            sum+=n%10;
            n=n/10;
        }

        return sum;
    }
}
