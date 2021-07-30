package com.mber.khasang.mvc_swing.view;

import com.mber.khasang.mvc_swing.controller.UserController;

import javax.swing.*;
import java.awt.*;

public class UserView extends JFrame {
    private JTextArea text;
    private JButton sendButton;
    private JLabel info;
    private UserController controller;

    public UserView(UserController controller) {
        this.controller = controller;
    }

    public void init() {
        setSize(400, 300);
        text = new JTextArea();
        sendButton = new JButton("Send");
        info = new JLabel("Info");

        add(text, BorderLayout.CENTER);
        add(sendButton, BorderLayout.SOUTH);
        add(info, BorderLayout.NORTH);

        sendButton.addActionListener(e -> {

            int pin;
            String textPin = this.text.getText();
            text.setText("");

            try {
                pin = Integer.parseInt(textPin);
                info.setText("Got it: " + pin + " Waiting ...");

                new Thread(()->{
                    sendButton.setEnabled(false);
                    String resultMessage;
                    if (controller.checkPin(pin)) resultMessage = "Right";
                    else resultMessage = "Wrong, try again";
                    info.setText(resultMessage);
                    sendButton.setEnabled(true);
                }).start();


            } catch (NumberFormatException err) {
                info.setText("Only numbers allowed ...");
            }

        });

        setVisible(true);
    }
}
