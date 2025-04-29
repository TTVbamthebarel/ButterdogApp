package butterdogapp;

import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AppNames {
    private ArrayList<String> appNames;
    private JButton appNameButton;

    public AppNames() {
        appNames = new ArrayList<>();
        appNames.add("Wikabedia");
        appNames.add("Bweeter");
        appNames.add("Boogle");
        appNames.add("butterFlix");
        appNames.add("bulu");
        appNames.add("butter+");
        appNames.add("butterfly");
        appNames.add("LEADERBOARD");
        appNames.add("butter webstore");
        appNames.add("bbay");
        appNames.add("butter OS");
        appNames.add("butterdonalds");
        appNames.add("calculater");
        
        // Now create the button inside the constructor
        appNameButton = new JButton("App Names");

        appNameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // When you click the button, open a new window showing the app names
                showAppNamesWindow();
            }
        });
    }

    // This method RETURNS the button
    public JButton getAppNameButton() {
        return appNameButton;
    }

    // This method opens a new window showing app names
    private void showAppNamesWindow() {
        JFrame namesFrame = new JFrame("Butterdog Apps");
        namesFrame.setSize(300, 400);
        namesFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        for (String name : appNames) {
            JLabel label = new JLabel(name);
            label.setAlignmentX(Component.CENTER_ALIGNMENT);
            panel.add(label);
        }

        namesFrame.add(new JScrollPane(panel)); // In case it overflows
        namesFrame.setVisible(true);
    }
}
