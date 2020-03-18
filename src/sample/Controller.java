package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;

import java.util.Vector;

public class Controller {
    public Label rezultat;
    public TextField unesen;

    public int sumaCifara(int n){
        int rezultat = 0,c;

        do{
            c=Math.abs(n%10);
            rezultat+=c;
            n/=10;
        }while(n!=0);


    return rezultat;
    }
    public void posalji(ActionEvent actionEvent) {
        String unos = unesen.getText();
        String izlaz = "Rezultat je: ";
        try {
            int broj = Integer.parseInt(unos);
            //Vector v=new Vector();
            int rez=sumaCifara(broj), nekiBr=0;
           // rezultat.setText("Rezultat je: ");
            for(int i=1;i<=broj;i++){
                nekiBr=sumaCifara(i);
                if(i%nekiBr==0) izlaz=izlaz+i+", ";
            }
            rezultat.setText(izlaz);

        }catch(NumberFormatException err){
            rezultat.setText("Nije unesen broj!");
        }

    }
}