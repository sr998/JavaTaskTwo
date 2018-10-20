package JavaTaskTwo.Model.ArrayOperations;

import JavaTaskTwo.Model.StringOperations.StringConversions;

import javax.swing.*;

public class ArrayPrint {
    public static void printArray(String[] inputArray, JTextField outputField){

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < inputArray.length; i++) {
            sb.append(String.valueOf(StringConversions.toTitleCase(inputArray[i]))+" ");
            outputField.setText(sb.toString());
        }
    }
}
