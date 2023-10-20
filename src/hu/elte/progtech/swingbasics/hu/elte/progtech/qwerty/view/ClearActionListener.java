package hu.elte.progtech.qwerty.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClearActionListener implements ActionListener {

    private JTextField textField;

    public ClearActionListener(JTextField textField) {
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        textField.setText("");
    }
}
