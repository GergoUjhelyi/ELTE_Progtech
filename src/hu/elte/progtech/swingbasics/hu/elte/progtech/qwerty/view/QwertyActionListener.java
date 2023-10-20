package hu.elte.progtech.qwerty.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QwertyActionListener implements ActionListener {

    private String button;
    private JTextField textArea;

    public QwertyActionListener(String button, JTextField textArea) {
        this.button = button;
        this.textArea = textArea;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = textArea.getText();
        textArea.setText(text + button);
    }
}
