package butterdogapp;
import java.awt.*;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Desktop;
import java.net.URI;
/**
 * @author barel
 */
public class ButterApps extends JPanel {
    private ImageIcon icon;
    
    public ButterApps() {
        setOpaque(true);
        setBackground(Color.green);
        
        
        icon = new ImageIcon("Apps.png");
        
        JLabel imageLabel = new JLabel(icon);
        imageLabel.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight());
        add(imageLabel);
        
        
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Click here for some AMAZING apps");
                
                try{
                    Desktop.getDesktop().browse(new URI("https://butterdogceo.github.io/bdogco/applications"));
                } catch(Exception ex) {
                    ex.printStackTrace();
                }
                 
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                setCursor(Cursor.getDefaultCursor());
            }
        });
        
        setPreferredSize(new Dimension(icon.getIconWidth(), icon.getIconHeight()));
        setSize(icon.getIconWidth(), icon.getIconHeight());
    }
    
}
