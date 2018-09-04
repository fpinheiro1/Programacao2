
package aula2;

import java.awt.Container;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class FrmCalculadora extends JFrame implements ActionListener{
   
    JLabel lblnumero1;
    JLabel lblnumero2;
    JLabel lbltotal ;
    JTextField txtnumero1;
        //txtnumero1.setColumns(10);
    JTextField txtnumero2;
    JTextField txttotal;
       //txtnumero2.setColumns(5);
    JButton btsomar ;
    JButton btsubtrair ;
    JButton btdividir ;
    JButton btmultiplicar;
    JButton btlimpar ;
    
    
    public FrmCalculadora(){
    super ("Calculadora");
    
    setSize(320,100);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);
    setCursor(0);
    
    Container c = getContentPane();
    c.setLayout(new GridLayout(3,4,5,5)); 
    lblnumero1 = new JLabel("Numero 1:");
    lblnumero2 = new JLabel("Numero 2:");
    lbltotal = new JLabel("Total:");
    txtnumero1 = new JTextField();
        //txtnumero1.setColumns(10);
    txtnumero2 = new JTextField();
    txttotal = new JTextField();
       //txtnumero2.setColumns(5);
    btsomar = new JButton("+");
    btsubtrair = new JButton("-");
    btdividir = new JButton("/");
    btmultiplicar = new JButton("X");
    btlimpar = new JButton("Limpar");
    
    
    c.add(lblnumero1);
    c.add(txtnumero1);
    c.add(btsomar);
    c.add(btsubtrair);
    
    c.add(lblnumero2);
    c.add(txtnumero2);
    c.add(btdividir);
    c.add(btmultiplicar);
    
    c.add(lbltotal);
    c.add(txttotal);
    c.add(btlimpar);
    btsomar.addActionListener(this);
    btsubtrair.addActionListener(this);
    btmultiplicar.addActionListener(this);
    btdividir.addActionListener(this);
    btlimpar.addActionListener(this);
    
    setVisible(true);
      
    }

@Override
public void actionPerformed(ActionEvent a){

double numero1 = Double.parseDouble(txtnumero1.getText());
double numero2 = Double.parseDouble(txtnumero2.getText());
double resultado;

if (btsubtrair == a.getSource()){
    resultado = numero1-numero2;
    txttotal.setText(resultado+"");
    }  

if (btsomar==a.getSource()){
    resultado = numero1+numero2;
    txttotal.setText(resultado+"");
}
if (btmultiplicar==a.getSource()){
  resultado=numero1*numero2;
  txttotal.setText(resultado+"");
}
if (btdividir==a.getSource()){
  resultado=numero1/numero2;
  txttotal.setText(resultado+"");
}
if (btlimpar == a.getSource()){
    txtnumero1.setText("");
    txtnumero2.setText("");
    txttotal.setText("");
}

}

}


