
package appjogovelha;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FrmJogo extends JFrame implements ActionListener {
    

    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
    String n = "X", res="0";
    String usuario1 = JOptionPane.showInputDialog(null,"Digite o Nome do Jogador 1:");
    String usuario2 = JOptionPane.showInputDialog(null,"Digite o Nome do Jogador 2:");
    boolean atb1 = false,atb2 = false,atb3 = false,atb4 = false,atb5 = false,atb6 = false,atb7 = false, atb8 = false,atb9 = false;
            
    public FrmJogo() {
        
        
        super("Jogo da Velha");
        setSize(400, 400);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setLocation(null);

        b1 = new JButton("");
        b2 = new JButton("");
        b3 = new JButton("");
        b4 = new JButton("");
        b5 = new JButton("");
        b6 = new JButton("");
        b7 = new JButton("");
        b8 = new JButton("");
        b9 = new JButton("");

        
        
        Container c = getContentPane();
        

        c.setLayout(new GridLayout(3, 3, 5, 5));
        c.setBackground(Color.RED);

        add(b1);
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setFont(new Font("arial",Font.BOLD,70));
        b1.setForeground(Color.red);
        add(b2);
        b2.addActionListener(this);
        b2.setBackground(Color.BLACK);
        b2.setFont(new Font("arial",Font.BOLD,70));
        b2.setForeground(Color.red);
        add(b3);
        b3.addActionListener(this);
        b3.setBackground(Color.BLACK);
        b3.setFont(new Font("arial",Font.BOLD,70));
        b3.setForeground(Color.red);
        add(b4);
        b4.addActionListener(this);
        b4.setBackground(Color.BLACK);
        b4.setFont(new Font("arial",Font.BOLD,70));
        b4.setForeground(Color.red);
        add(b5);
        b5.addActionListener(this);
        b5.setBackground(Color.BLACK);
        b5.setFont(new Font("arial",Font.BOLD,70));
        b5.setForeground(Color.red);
        add(b6);
        b6.addActionListener(this);
        b6.setBackground(Color.BLACK);
        b6.setFont(new Font("arial",Font.BOLD,70));
        b6.setForeground(Color.red);
        add(b7);   
        b7.addActionListener(this);
        b7.setBackground(Color.BLACK);
        b7.setFont(new Font("arial",Font.BOLD,70));
        b7.setForeground(Color.red);
        add(b8);
        b8.addActionListener(this);
        b8.setBackground(Color.BLACK);
        b8.setFont(new Font("arial",Font.BOLD,70));
        b8.setForeground(Color.red);
        add(b9);
        b9.addActionListener(this);
        b9.setBackground(Color.BLACK);
        b9.setFont(new Font("arial",Font.BOLD,70));
        b9.setForeground(Color.red);

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (b1 == ae.getSource() && atb1==false) {
            b1.setText(n);
            if (n == "X") {
                n = "O";
            } else {
                n = "X";
            }
           // b1.setEnabled(false);
           atb1=true;
           
        }

        if (b2 == ae.getSource() && atb2==false ) {
            b2.setText(n);
            if (n == "X") {
                n = "O";
            } else {
                n = "X";
            }
           // b2.setEnabled(false);
            atb2=true;
        }

        if (b3 == ae.getSource()&& atb3==false) {
            b3.setText(n);
            if (n == "X") {
                n = "O";
            } else {
                n = "X";
            }
            //b3.setEnabled(false);
            atb3=true;
        }
        
        if (b4 == ae.getSource()&& atb4==false) {
            b4.setText(n);
            if (n == "X") {
                n = "O";
            } else {
                n = "X";
            }
            //b4.setEnabled(false);
            atb4=true;
        }
        
        if (b5 == ae.getSource() && atb5==false) {
            b5.setText(n);
            if (n == "X") {
                n = "O";
            } else {
                n = "X";
            }
            //b5.setEnabled(false);
            atb5=true;
        }
        
        if (b6 == ae.getSource()&& atb6==false) {
            b6.setText(n);
            if (n == "X") {
                n = "O";
            } else {
                n = "X";
            }
            //b6.setEnabled(false);
            atb6=true;
        }
        
         if (b7 == ae.getSource()&& atb7==false) {
            b7.setText(n);
            if (n == "X") {
                n = "O";
            } else {
                n = "X";
            }
            //b7.setEnabled(false);
            atb7=true;
        }
         
         if (b8 == ae.getSource()&& atb8==false) {
            b8.setText(n);
            if (n == "X") {
                n = "O";
            } else {
                n = "X";
            }
           // b8.setEnabled(false);
           atb8=true;
        }
         
           if (b9 == ae.getSource()&& atb9==false) {
            b9.setText(n);
            if (n == "X") {
                n = "O";
            } else {
                n = "X";
            }
            //b9.setEnabled(false);
            atb9=true;
        }

if (b1.getText()== "X" && b2.getText()== "X" && b3.getText() =="X"){
    
    b9.setEnabled(false); 
    b1.setEnabled(false); 
    b2.setEnabled(false); 
    b3.setEnabled(false); 
    b4.setEnabled(false); 
    b5.setEnabled(false); 
    b6.setEnabled(false); 
    b7.setEnabled(false); 
    b8.setEnabled(false); 
    JOptionPane.showMessageDialog(null,"O "+usuario1+" ganhou");
    res="1";
}

if (b1.getText()== "O" && b2.getText()== "O" && b3.getText() =="O"){
    b9.setEnabled(false); 
    b1.setEnabled(false); 
    b2.setEnabled(false); 
    b3.setEnabled(false); 
    b4.setEnabled(false); 
    b5.setEnabled(false); 
    b6.setEnabled(false); 
    b7.setEnabled(false); 
    b8.setEnabled(false); 
    JOptionPane.showMessageDialog(null,"O "+usuario2+" ganhou");
    res="1";
}

if (b4.getText()== "X" && b5.getText()== "X" && b6.getText() =="X"){
    b9.setEnabled(false); 
    b1.setEnabled(false); 
    b2.setEnabled(false); 
    b3.setEnabled(false); 
    b4.setEnabled(false); 
    b5.setEnabled(false); 
    b6.setEnabled(false); 
    b7.setEnabled(false); 
    b8.setEnabled(false); 
    JOptionPane.showMessageDialog(null,"O "+usuario1+" ganhou");
    res="1";
}

if (b4.getText()== "O" && b5.getText()== "O" && b6.getText() =="O"){
    b9.setEnabled(false); 
    b1.setEnabled(false); 
    b2.setEnabled(false); 
    b3.setEnabled(false); 
    b4.setEnabled(false); 
    b5.setEnabled(false); 
    b6.setEnabled(false); 
    b7.setEnabled(false); 
    b8.setEnabled(false); 
    JOptionPane.showMessageDialog(null,"O "+usuario2+" ganhou");
    res="1";
}

if (b7.getText()== "X" && b8.getText()== "X" && b9.getText() =="X"){
    b9.setEnabled(false); 
    b1.setEnabled(false); 
    b2.setEnabled(false); 
    b3.setEnabled(false); 
    b4.setEnabled(false); 
    b5.setEnabled(false); 
    b6.setEnabled(false); 
    b7.setEnabled(false); 
    b8.setEnabled(false); 
    JOptionPane.showMessageDialog(null,"O "+usuario1+" ganhou");
    res="1";
}

if (b7.getText()== "O" && b8.getText()== "O" && b9.getText() =="O"){
    b9.setEnabled(false); 
    b1.setEnabled(false); 
    b2.setEnabled(false); 
    b3.setEnabled(false); 
    b4.setEnabled(false); 
    b5.setEnabled(false); 
    b6.setEnabled(false); 
    b7.setEnabled(false); 
    b8.setEnabled(false); 
    JOptionPane.showMessageDialog(null,"O "+usuario2+" ganhou");
    res="1";
}

// vertical 

if (b1.getText()== "X" && b4.getText()== "X" && b7.getText() =="X"){
    b9.setEnabled(false); 
    b1.setEnabled(false); 
    b2.setEnabled(false); 
    b3.setEnabled(false); 
    b4.setEnabled(false); 
    b5.setEnabled(false); 
    b6.setEnabled(false); 
    b7.setEnabled(false); 
    b8.setEnabled(false); 
    JOptionPane.showMessageDialog(null,"O "+usuario1+" ganhou");
    res="1";
}

if (b1.getText()== "O" && b4.getText()== "O" && b7.getText() =="O"){
    b9.setEnabled(false); 
    b1.setEnabled(false); 
    b2.setEnabled(false); 
    b3.setEnabled(false); 
    b4.setEnabled(false); 
    b5.setEnabled(false); 
    b6.setEnabled(false); 
    b7.setEnabled(false); 
    b8.setEnabled(false); 
    JOptionPane.showMessageDialog(null,"O "+usuario2+" ganhou");
    res="1";
}

if (b2.getText()== "X" && b5.getText()== "X" && b8.getText() =="X"){
    b9.setEnabled(false); 
    b1.setEnabled(false); 
    b2.setEnabled(false); 
    b3.setEnabled(false); 
    b4.setEnabled(false); 
    b5.setEnabled(false); 
    b6.setEnabled(false); 
    b7.setEnabled(false); 
    b8.setEnabled(false); 
    JOptionPane.showMessageDialog(null,"O "+usuario1+" ganhou");
    res="1";
}

if (b2.getText()== "O" && b5.getText()== "O" && b8.getText() =="O"){
    b9.setEnabled(false); 
    b1.setEnabled(false); 
    b2.setEnabled(false); 
    b3.setEnabled(false); 
    b4.setEnabled(false); 
    b5.setEnabled(false); 
    b6.setEnabled(false); 
    b7.setEnabled(false); 
    b8.setEnabled(false); 
    JOptionPane.showMessageDialog(null,"O "+usuario2+" ganhou");
    res="1";
}

if (b3.getText()== "X" && b6.getText()== "X" && b9.getText() =="X"){
    b9.setEnabled(false); 
    b1.setEnabled(false); 
    b2.setEnabled(false); 
    b3.setEnabled(false); 
    b4.setEnabled(false); 
    b5.setEnabled(false); 
    b6.setEnabled(false); 
    b7.setEnabled(false); 
    b8.setEnabled(false); 
    JOptionPane.showMessageDialog(null,"O "+usuario1+" ganhou");
    res="1";
}

if (b3.getText()== "O" && b6.getText()== "O" && b9.getText() =="O"){
    b9.setEnabled(false); 
    b1.setEnabled(false); 
    b2.setEnabled(false); 
    b3.setEnabled(false); 
    b4.setEnabled(false); 
    b5.setEnabled(false); 
    b6.setEnabled(false); 
    b7.setEnabled(false); 
    b8.setEnabled(false); 
    JOptionPane.showMessageDialog(null,"O "+usuario2+" ganhou");
    res="1";
    
}

if (b1.getText()== "X" && b5.getText()== "X" && b9.getText() =="X"){
    b9.setEnabled(false); 
    b1.setEnabled(false); 
    b2.setEnabled(false); 
    b3.setEnabled(false); 
    b4.setEnabled(false); 
    b5.setEnabled(false); 
    b6.setEnabled(false); 
    b7.setEnabled(false); 
    b8.setEnabled(false); 
    JOptionPane.showMessageDialog(null,"O "+usuario1+" ganhou");
    res="1";
}

if (b1.getText()== "O" && b5.getText()== "O" && b9.getText() =="O"){
    b9.setEnabled(false); 
    b1.setEnabled(false); 
    b2.setEnabled(false); 
    b3.setEnabled(false); 
    b4.setEnabled(false); 
    b5.setEnabled(false); 
    b6.setEnabled(false); 
    b7.setEnabled(false); 
    b8.setEnabled(false); 
    JOptionPane.showMessageDialog(null,"O "+usuario2+" ganhou");
    res="1";
}

if (b7.getText()== "X" && b5.getText()== "X" && b3.getText() =="X"){
    b9.setEnabled(false); 
    b1.setEnabled(false); 
    b2.setEnabled(false); 
    b3.setEnabled(false); 
    b4.setEnabled(false); 
    b5.setEnabled(false); 
    b6.setEnabled(false); 
    b7.setEnabled(false); 
    b8.setEnabled(false); 
    JOptionPane.showMessageDialog(null,"O "+usuario1+" ganhou");
    res="1";
}

if (b7.getText()== "O" && b5.getText()== "O" && b3.getText() =="O"){
    b9.setEnabled(false); 
    b1.setEnabled(false); 
    b2.setEnabled(false); 
    b3.setEnabled(false); 
    b4.setEnabled(false); 
    b5.setEnabled(false); 
    b6.setEnabled(false); 
    b7.setEnabled(false); 
    b8.setEnabled(false); 
    JOptionPane.showMessageDialog(null,"O "+usuario2+" ganhou");
    res="1";
    }

    if (res != "1" && b1.getText()!="" && b2.getText()!="" && b3.getText()!="" && b4.getText()!="" && b5.getText()!="" && b6.getText()!="" && b7.getText()!="" && b8.getText()!="" && b9.getText()!="") {
      
        JOptionPane.showMessageDialog(null,"Velha");
        b9.setEnabled(false); 
        b1.setEnabled(false); 
        b2.setEnabled(false); 
        b3.setEnabled(false); 
        b4.setEnabled(false); 
        b5.setEnabled(false); 
        b6.setEnabled(false); 
        b7.setEnabled(false); 
        b8.setEnabled(false); 
      
       
        
    }   
    }
}
