package JavaTaskTwo;

import javax.swing.*;

public class GUImethods {

    public static String toTitleCase(String givenString) {
        String[] arr = givenString.split(" ");
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {
            sb.append(Character.toUpperCase(arr[i].charAt(0)))
                    .append(arr[i].substring(1)).append(" ");
        }
        return sb.toString().trim();
    }

    public static void printArray(String[] inputArray, JTextField outputField){

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < inputArray.length; i++) {
            sb.append(String.valueOf(GUImethods.toTitleCase(inputArray[i]))+" ");
            outputField.setText(sb.toString());
        }
    }
}
