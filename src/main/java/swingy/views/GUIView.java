package swingy.views;

import java.awt.BorderLayout;

import javax.swing.*;

import swingy.controllers.GUIController;

import java.awt.event.*;

public class GUIView extends JFrame{
    private JTextArea text;
    private JButton sendButton;
    private JLabel info;
    private GUIController controller;

    public GUIView(GUIController controller){
        this.controller = controller;
    }

    public void init(){
        setSize(400, 300);
        text = new JTextArea();
        sendButton = new JButton("Send");
        info = new JLabel("Info");
        add(text, BorderLayout.CENTER);
        add(sendButton, BorderLayout.SOUTH);
        add(info, BorderLayout.NORTH);
        sendButton.addActionListener(new SendButtonListener());

        setVisible(true);
    }

    public class SendButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            int pin;
            String textPin = text.getText();
            pin = Integer.parseInt(textPin);
            info.setText("Got it: " + pin);
            controller.checkPin(pin);
        }
    }
}
