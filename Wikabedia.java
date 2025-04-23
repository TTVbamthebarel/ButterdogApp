
package butterdogapp;

import java.awt.*;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Desktop;
import java.net.URI;
/**
 *
 * @author barel
 */
public class Wikabedia extends JPanel{
    private ImageIcon icon;
    public Wikabedia() {
       
        setOpaque(true);
        setBackground(Color.BLUE);
        
         
       icon = new ImageIcon("Wikabedia.png");
      JLabel imageLabel = new JLabel(icon);
      imageLabel.setBounds(0, 0, icon.getIconHeight(), icon.getIconWidth());
      add(imageLabel);
     
      
      addMouseListener(new MouseAdapter() {
          @Override
          public void mouseClicked(MouseEvent e ) {
              JOptionPane.showMessageDialog(null, "Wikabedia, uplode epik artikles instentley!");
              try{
                  Desktop.getDesktop().browse(new URI("https://butterdogceo.github.io/Wikabedia/"));
              } catch (Exception ex) {
                  ex.printStackTrace();
              }
              
          }
          @Override
          public void mouseEntered(MouseEvent e ) {
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
