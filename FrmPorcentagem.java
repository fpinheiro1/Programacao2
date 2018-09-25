
package appradiob;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;


public class FrmPorcentagem extends JFrame implements ItemListener{
    JLabel lbldgtvalor, lblporcentagem, lblresultado;
    JTextField txtvalor;
    JRadioButton rd30, rd20, rd10;
    ButtonGroup grupo1, grupo2, grupo3;
    JPanel p1,p2,p3;
    float valor, resultado;
   
    FrmPorcentagem(){
        super("Uso de Radio Button");
        setSize(320,400);
        setResizable(false);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        lbldgtvalor = new JLabel("Digite o Valor: ");
        lblporcentagem = new JLabel ("% do Valor: ");
        lblresultado= new JLabel("");
        rd30 = new JRadioButton("30% do valor", false);
        rd20 = new JRadioButton("20% do valor", false);
        rd10 = new JRadioButton("10% do valor", false);
        
        rd10.addItemListener(this);
        rd20.addItemListener(this);
        rd30.addItemListener(this);
        
        txtvalor = new JTextField(15);
        grupo1 = new ButtonGroup();
        p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        
        p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        
        p3 = new JPanel();
        p3.setLayout(new FlowLayout());
               
        
       Container c = getContentPane();
       c.add(p1);
       p1.add(lbldgtvalor);
       p1.add(txtvalor);
       
                   
       grupo1.add(rd10);
       grupo1.add(rd20);
       grupo1.add(rd30);
       
       c.add(p2); 
       p2.add(rd10);
       p2.add(rd20);
       p2.add(rd30);
      
       c.add(p3);
       p3.add(lblporcentagem);
       p3.add(lblresultado);
       

setVisible(true) ;      
        
         }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        if (rd10.isSelected()==true){
          valor = Float.parseFloat(txtvalor.getText());
          resultado = valor *10/100; 
          lblresultado.setText(resultado+"");
                      
    }
        else if(rd20.isSelected()==true){
         valor = Float.parseFloat(txtvalor.getText());
          resultado = valor *20/100; 
          lblresultado.setText(resultado+"");
        }
        else if(rd30.isSelected()==true){
           valor = Float.parseFloat(txtvalor.getText());
          resultado = valor *30/100; 
          lblresultado.setText(resultado+"");
            
        }
        
    
}
}
