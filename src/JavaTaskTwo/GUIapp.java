package JavaTaskTwo;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.*;



public class GUIapp extends JFrame {

    private JButton button = new JButton("Convert");
    private JLabel input = new JLabel("Input");
    private JLabel output = new JLabel("Output");
    private JTextField inputField = new JTextField("some random text", 2);
    private JTextField outputField = new JTextField("", 2);



    public GUIapp() {
        super("Text converter");
        this.setBounds(400, 400, 500, 550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(7, 6, 0, 4));

        container.add(input);
        container.add(inputField);
        container.add(output);
        container.add(outputField);


        ButtonGroup group = new ButtonGroup();



        button.addActionListener(new ButtonEventListener());



        container.add(button);


    }
class ButtonEventListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
    String inputString = inputField.getText();
    String[] inputArray = inputString.split(" ");

    GUImethods.printArray(inputArray,outputField);

    }
}
}