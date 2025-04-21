package butterdogapp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButterdogApp { // Renamed class
    public JButton createButton() {
        JButton butterDogMain = new JButton("Welcome to ButterDogCo!");
        butterDogMain.setBounds(200, 250, 200, 50); // Position button

        // Add button action listener
        butterDogMain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "ButterDog welcomes you!");
            }
        });

        return butterDogMain;
    }
}
