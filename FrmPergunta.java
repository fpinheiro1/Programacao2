
package apppergunta;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;


public class FrmPergunta extends JFrame implements ActionListener, ItemListener{
    JLabel lblpergunta, lblr1, lblr2, lblr3, lblr4;
    JRadioButton ra,rb,rc,rd,re;
    JButton btresposta;
    ButtonGroup grupo1;
    JPanel p1,p2,p3;
    boolean resposta = false;
    
    FrmPergunta(){
        super("Pergunta");
        setResizable(false);
        setSize(400,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,1));
        
        lblpergunta = new JLabel("Flamengo é :");
        btresposta = new JButton("Responder");
        
        ra = new JRadioButton("(A)Bom",false);
        rb = new JRadioButton("(B)Muito Bom",false);
        rc = new JRadioButton("(C)Excelente",false);
        rd = new JRadioButton("(D)O Melhor do Mundo",false);
        grupo1 = new ButtonGroup();
        p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        p2 = new JPanel();
        p2.setLayout(new GridLayout(4,1,3,3));
        p3= new JPanel();
        p3.setLayout(new FlowLayout());
        
        
               
   Container c = getContentPane();
   
   grupo1.add(ra);
   grupo1.add(rb);
   grupo1.add(rc);
   grupo1.add(rd);
      
   p1.add(lblpergunta);
   c.add(p1);
   p2.add(ra);
   p2.add(rb);
   p2.add(rc);
   p2.add(rd);
   c.add(p2);
   
   ra.addItemListener(this);
   rb.addItemListener(this);
   rc.addItemListener(this);
   rd.addItemListener(this);
   
   btresposta.addActionListener(this);
   
   p3.add(btresposta);
   c.add(p3);
   setVisible(true);

     
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (btresposta == ae.getSource()){
            if (resposta == true){
                JOptionPane.showMessageDialog (null,"Não Tem Como ERRAR !! Campeao Brasileiro 2018");
            }            
            else {JOptionPane.showMessageDialog (null,"Reposta Errada... Ta de Sacanagem !!!");}
        }
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        if (ra.isSelected()==true){
            resposta = false;        
        } else if (rb.isSelected()==true){
            resposta =false;
        }
        else if (rc.isSelected()==true){
            resposta =false;
        }
        else if (rd.isSelected()==true){
            resposta =true;
        }
    }
}
