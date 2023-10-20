package hu.elte.progtech.qwerty.view;

import hu.elte.progtech.qwerty.model.ButtonActions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QwertyView {

    private JFrame window;
    private JPanel panel;
    private JPanel buttonPanel;

    private JTextField textField;

    private JMenuBar menuBar;

    public QwertyView() {
        window = new JFrame("Qwerty App");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        buttonPanel = new JPanel();
        menuBar = new JMenuBar();

        textField = new JTextField(30);
        textField.setEnabled(false);
        panel.add(textField);

        window.getContentPane().add(panel, BorderLayout.NORTH);
        for (String text: ButtonActions.buttonText) {
            JButton button = new JButton(text);
            switch (text) {
                case "<-/Back":
                    button.addActionListener(new BackSpaceActionListener(textField));
                    break;
                case "CLR":
                    button.addActionListener(new ClearActionListener(textField));
                    break;
                default:
                    button.addActionListener(new QwertyActionListener(text,textField));
            }
            buttonPanel.add(button);
        }
        window.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        window.setJMenuBar(menuBar);
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);
        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(exitItem);

      /*  exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        */
        exitItem.addActionListener(ae -> System.exit(0));


        window.pack();
        window.setVisible(true);
    }
}
