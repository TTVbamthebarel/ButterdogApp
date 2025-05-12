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
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int screenWidth = screenSize.width;
    int screenHeight = screenSize.height;

    // Create JFrame
    JFrame frame = new JFrame("Butterdog");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(screenWidth, screenHeight);
    frame.setLayout(null);

    // Load background image
    Image backgroundImage = ImageIO.read(new File("C:/Users/barel/Downloads/DarkBG.png"));

    // Create JPanel with background image
    JPanel panel = new JPanel() {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        }
    };
    panel.setBounds(0, 0, screenWidth, screenHeight);
    panel.setLayout(null);

    // Load and scale ButterDog Glow image
    ImageIcon originalIcon = new ImageIcon("ButterDog Glow.png");
    Image scaledImage = originalIcon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
    ImageIcon resizedIcon = new ImageIcon(scaledImage);

    // Add logo
    JLabel logoLabel = new JLabel(resizedIcon);
    logoLabel.setBounds((screenWidth / 2) - 75, 100, 150, 150); // centered
    panel.add(logoLabel);

    // Add button
    JButton butterDogMain = new JButton("Welcome to ButterDogCo!");
    butterDogMain.setBounds((screenWidth / 2) - 100, 300, 200, 50);
    panel.add(butterDogMain);

    // Add Wikabedia panel
    Wikabedia wikabediaPanel = new Wikabedia();
    wikabediaPanel.setBounds(50, screenHeight - 450, 400, 400);
    panel.add(wikabediaPanel);

    // Add ButterApps panel
    ButterApps butterAppsPanel = new ButterApps();
    butterAppsPanel.setBounds(screenWidth - 530, screenHeight - 490, 480, 480);
    panel.add(butterAppsPanel);
    
    AppNames appNames = new AppNames();
    JButton appButton = appNames.getAppNameButton();
    appButton.setBounds(1550, 400, 100, 50);
    panel.add(appButton);


    frame.setContentPane(panel);
    frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // Optional: full screen
    frame.setVisible(true);
}
}
