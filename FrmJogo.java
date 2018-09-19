package jogodavelha;

import java.awt.Container;
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

        c.setLayout(new GridLayout(3, 3, 2, 2));

        add(b1);
        b1.addActionListener(this);
        add(b2);
        b2.addActionListener(this);
        add(b3);
        b3.addActionListener(this);
        add(b4);
        b4.addActionListener(this);
        add(b5);
        b5.addActionListener(this);
        add(b6);
        b6.addActionListener(this);
        add(b7);
        b7.addActionListener(this);
        add(b8);
        b8.addActionListener(this);
        add(b9);
        b9.addActionListener(this);

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (b1 == ae.getSource()) {
            b1.setText(n);
            if (n == "X") {
                n = "O";
            } else {
                n = "X";
            }
            b1.setEnabled(false);
        }

        if (b2 == ae.getSource()) {
            b2.setText(n);
            if (n == "X") {
                n = "O";
            } else {
                n = "X";
            }
            b2.setEnabled(false);
        }

        if (b3 == ae.getSource()) {
            b3.setText(n);
            if (n == "X") {
                n = "O";
            } else {
                n = "X";
            }
            b3.setEnabled(false);
        }
        
        if (b4 == ae.getSource()) {
            b4.setText(n);
            if (n == "X") {
                n = "O";
            } else {
                n = "X";
            }
            b4.setEnabled(false);
        }
        
        if (b5 == ae.getSource()) {
            b5.setText(n);
            if (n == "X") {
                n = "O";
            } else {
                n = "X";
            }
            b5.setEnabled(false);
        }
        
        if (b6 == ae.getSource()) {
            b6.setText(n);
            if (n == "X") {
                n = "O";
            } else {
                n = "X";
            }
            b6.setEnabled(false);
        }
        
         if (b7 == ae.getSource()) {
            b7.setText(n);
            if (n == "X") {
                n = "O";
            } else {
                n = "X";
            }
            b7.setEnabled(false);
        }
         
         if (b8 == ae.getSource()) {
            b8.setText(n);
            if (n == "X") {
                n = "O";
            } else {
                n = "X";
            }
            b8.setEnabled(false);
        }
         
           if (b9 == ae.getSource()) {
            b9.setText(n);
            if (n == "X") {
                n = "O";
            } else {
                n = "X";
            }
            b9.setEnabled(false);
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
       
        
    }   
    }
}
