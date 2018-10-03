/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appposto;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;


public class FrmPosto extends JFrame implements ItemListener{
    JLabel lblcombustivel, lblvaloruncomb, lblvalorunlabel, lblqtdlitros, lbltotalcomb, lbltotalcomb2, lblqtdestoque, lblqtdestoque2; 
    JTextField txtlitro;
    JPanel jpcombustivel1,jpcombustivel2, jpcliente, jpproduto;
    JRadioButton rbetanol, rbgasolina, rbdiesel;
    ButtonGroup grupocomb;
     Combustivel gasolina = new Combustivel("Gasolina",5,3000);
     Combustivel etanol = new Combustivel("Gasolina",3,3000);
     Combustivel diesel = new Combustivel("Gasolina",3.5,3000);
    
     JLabel lblprodnome, lblprodnome2, lblprodmarca, lblprodmarca2, lblprodquant;
     JTextField txtquantprod;
     
    FrmPosto(){
        setSize(800,600);
        //setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        jpcombustivel1 = new JPanel();
        lblcombustivel = new JLabel("Tipo de Combustivel:");
          
        rbetanol = new JRadioButton("Etanol");
        rbetanol.addItemListener(this);
        rbgasolina = new JRadioButton("Gasolina");
        rbgasolina.addItemListener(this);
        rbdiesel = new JRadioButton("Disel");
        rbdiesel.addItemListener(this);
        grupocomb = new ButtonGroup();
        
        // Tipo de Combustivel //
        jpcombustivel1.setLayout(new GridLayout(1,4,2,2));
        grupocomb.add(rbgasolina);
        grupocomb.add(rbetanol);
        grupocomb.add(rbdiesel);
        jpcombustivel1.add(lblcombustivel);
        jpcombustivel1.add(rbgasolina);
        jpcombustivel1.add(rbetanol);
        jpcombustivel1.add(rbdiesel);
        
        //Calculo Combustivel
        
        jpcombustivel2 = new JPanel();
             
         lblvalorunlabel = new JLabel("Valor Unitario:");
         lblqtdestoque = new JLabel("Quantidade em Estoque:");
         lblqtdestoque2 = new JLabel();
         lblvalorunlabel = new JLabel("Valor Unitario:");
         lblvaloruncomb = new JLabel();
         lblqtdlitros = new JLabel("Quantidade de Litros :");
         txtlitro = new JTextField();
         lbltotalcomb = new JLabel("Valor Total do Combustivel:");
         lbltotalcomb2 = new JLabel();
         
         jpcombustivel2.setLayout(new GridLayout(4,2,2,2));
         jpcombustivel2.add(lblvalorunlabel);
          jpcombustivel2.add(lblvaloruncomb);
           jpcombustivel2.add(lblqtdlitros);
            jpcombustivel2.add(txtlitro);
             jpcombustivel2.add(lbltotalcomb);
              jpcombustivel2.add(lbltotalcomb2);
               jpcombustivel2.add(lblqtdestoque);
               jpcombustivel2.add(lblqtdestoque2);
           
              
        
       Container c = getContentPane();
        
        
        
        c.add(jpcombustivel1);
        c.add(jpcombustivel2);
//        c.add(jpproduto);
              
             
        
        
        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
     if (rbgasolina.isSelected()==true){
         lblvaloruncomb.setText(gasolina.getValorunitario()+"");
         lbltotalcomb2.setText(gasolina.calcValorTotal(gasolina, (float) Double.parseDouble(txtlitro.getText()))+"");
         lblqtdestoque2.setText(gasolina.calcEstoque(gasolina, (float) Double.parseDouble(txtlitro.getText()))+"");
         lblqtdestoque2.setText(gasolina.getQtdestoque()+"");
         System.out.println(gasolina.getQtdestoque());
         
     }
     
     if (rbdiesel.isSelected()==true){
         lblvaloruncomb.setText(diesel.getValorunitario()+"");
         lbltotalcomb2.setText(diesel.calcValorTotal(diesel, (float) Double.parseDouble(txtlitro.getText()))+"");
         lblqtdestoque2.setText(diesel.calcEstoque(diesel, (float) Double.parseDouble(txtlitro.getText()))+"");
         lblqtdestoque2.setText(diesel.getQtdestoque()+"");
         System.out.println(diesel.getQtdestoque());
         
     }
     
     if (rbetanol.isSelected()==true){
         lblvaloruncomb.setText(etanol.getValorunitario()+"");
         lbltotalcomb2.setText(etanol.calcValorTotal(etanol, (float) Double.parseDouble(txtlitro.getText()))+"");
         lblqtdestoque2.setText(etanol.calcEstoque(etanol, (float) Double.parseDouble(txtlitro.getText()))+"");
         lblqtdestoque2.setText(etanol.getQtdestoque()+"");
         System.out.println(etanol.getQtdestoque());
         
     }
            
        
     
    
    
}
}
