package JavaTaskTwo.Controller.OptionPane;

import javax.swing.*;

public class Option {

    public static boolean optionDialog() {
        int input = JOptionPane.showConfirmDialog(null, "You entered number/numbers, would you like to proceed the conversion?", "Warning!",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (input==0){
            return true;
        }
        return false;
    }

}
