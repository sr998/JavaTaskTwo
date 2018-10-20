package JavaTaskTwo.Controller.Events;

import JavaTaskTwo.Model.ArrayOperations.CheckArrayForNumbers;
import JavaTaskTwo.Controller.OptionPane.Option;
import JavaTaskTwo.Model.ArrayOperations.ArrayPrint;
import JavaTaskTwo.View.GUI.GUIapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPressedEvent extends GUIapp {

   public static class ButtonEventListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String inputString = getInputField().getText();
            String[] inputArray = inputString.split(" ");
            if(CheckArrayForNumbers.isThereAnyNumbers(inputArray)==true)
            {
                boolean option =Option.optionDialog();
                if (option==true)
                {
                    ArrayPrint.printArray(inputArray,getOutputField());
                } else
                {
                    getOutputField().setText("You canceled the conversion!");
                }
            }else
                ArrayPrint.printArray(inputArray,getOutputField());


        }
}

}
