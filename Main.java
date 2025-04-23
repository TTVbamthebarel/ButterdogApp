package butterdogapp;

import javax.swing.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Main {
    private int icon;
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                new Main().createAndShowGUI();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

        public void createAndShowGUI() throws IOException {

        Dimention screenSize = Toolkit.getDefaultToolKit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

    // Create JFrame
        JFrame frame = new JFrame("Butterdog");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(screenWidth, screenHeight);
        frame.setLayout(null); // Allows manual placement of components

        // Load background image
        Image backgroundImage = ImageIO.read(new File("DarkBG.png"));

        // Create JPanel with background
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        };
        panel.setBounds(0, 0, screenWidth, screenHeight); // Set size of background panel
        panel.setLayout(null); // Allow manual placement

        // Load and scale ButterDog Glow image
        ImageIcon originalIcon = new ImageIcon("ButterDog Glow.png");
        Image scaledImage = originalIcon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH); // Resize
        ImageIcon resizedIcon = new ImageIcon(scaledImage);

        // Create JLabel with resized image
        JLabel logoLabel = new JLabel(resizedIcon);
        logoLabel.setBounds((screenWidth / 2 ) -75, 100, 150, 150); // Position logo
        panel.add(logoLabel); // Add image above the button

        // Create JButton
        JButton butterDogMain = new JButton("Welcome to ButterDogCo!");
        butterDogMain.setBounds((screenWidth / 2) - 100, 400, 200, 50); // Position button below the logo
        panel.add(butterDogMain); // Add button to the panel

        // Create and add Wikabedia panel
        Wikabedia wikabediaPanel = new Wikabedia();
        wikabediaPanel.setBounds(50, screenHeight - 450, 400, 400); // Set position and size
        panel.add(wikabediaPanel); // Add Wikabedia panel to the main panel
        
        
        ButterApps butterAppsPanel = new ButterApps();
        butterAppsPanel.setBounds(screenWidth - 530, screenHeight - 500, 480, 480);
        panel.add(butterAppsPanel);
        
       
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setContentPane(panel);
        frame.setVisible(true);


        
    }
}
