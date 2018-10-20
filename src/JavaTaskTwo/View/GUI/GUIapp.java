package JavaTaskTwo.View.GUI;

import JavaTaskTwo.Controller.Events.ButtonPressedEvent;

import java.awt.*;
import javax.swing.*;



public class GUIapp extends JFrame {

    private static JButton button = new JButton("Convert");
    private static JLabel input = new JLabel("Input");
    private static JLabel output = new JLabel("Output");
    private static JTextField inputField = new JTextField("some random text 1", 2);
    private static JTextField outputField = new JTextField("", 2);



    public GUIapp() {
        super("Matrix Calculator");
        this.setBounds(400, 400, 500, 550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(7, 6, 0, 4));

        container.add(input);
        container.add(inputField);
        container.add(output);
        container.add(outputField);


        ButtonGroup group = new ButtonGroup();



        button.addActionListener(new ButtonPressedEvent.ButtonEventListener());



        container.add(button);


    }

    public static JButton getButton() {
        return button;
    }

    public static void setButton(JButton button) {
        GUIapp.button = button;
    }

    public static JLabel getInput() {
        return input;
    }

    public static void setInput(JLabel input) {
        GUIapp.input = input;
    }

    public static JLabel getOutput() {
        return output;
    }

    public static void setOutput(JLabel output) {
        GUIapp.output = output;
    }

    public static JTextField getInputField() {
        return inputField;
    }

    public static void setInputField(JTextField inputField) {
        GUIapp.inputField = inputField;
    }

    public static JTextField getOutputField() {
        return outputField;
    }

    public static void setOutputField(JTextField outputField) {
        GUIapp.outputField = outputField;
    }
}