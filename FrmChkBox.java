
package aula4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class FrmChkBox extends JFrame implements ItemListener {
    JLabel lblnome;
    JCheckBox chknegrito, chkitalico;
    
    public FrmChkBox(){
        super("Uso do JCheckBox");
        
    setSize(300,100);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    
    lblnome = new JLabel("JAVA:");
    chknegrito = new JCheckBox("Negrito");
    chkitalico = new JCheckBox("Italico");
    
    Container c = getContentPane();
    c.setLayout(new GridLayout(1,3));
    c.add(lblnome);
    c.add(chknegrito);
    c.add(chkitalico);
    
    chknegrito.addItemListener(this);
    chkitalico.addItemListener(this);
    
    setVisible(true);
                 
    
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        
        if (chkitalico.isSelected()==true && chknegrito.isSelected()==true ){
            lblnome.setFont(new Font ("", Font.ITALIC + Font. BOLD , 14));
            
                       
            
            
        }
        
        if (chknegrito.isSelected()==true && chkitalico.isSelected()==false) {
            lblnome.setFont(new Font ("", Font.PLAIN + Font.BOLD, 14));
            //lblnome.setFont(new Font ("", Font.BOLD, 14));
        }
        
        if (chknegrito.isSelected()==false && chkitalico.isSelected()==true ) {
            lblnome.setFont(new Font ("", Font.PLAIN + Font.ITALIC , 14));
            
            
            //lblnome.setFont(new Font ("", Font.ITALIC, 14));
        }
                
        
        if (chkitalico.isSelected()== false && chknegrito.isSelected()==false) {
            lblnome.setFont(new Font ("", Font.PLAIN, 14));
        
        } 
    }
}
