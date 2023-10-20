package hu.elte.progtech.qwerty.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackSpaceActionListener implements ActionListener {

    private JTextField textField;

    public BackSpaceActionListener(JTextField textField) {
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!textField.getText().isEmpty()) {
            String text = textField.getText().substring(0, textField.getText().length() - 1);
            textField.setText(text);
        }
    }
}
