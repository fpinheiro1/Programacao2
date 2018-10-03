package appposto;

import static java.lang.System.out;


public class Combustivel {
    
    private String tipo ;
    private double valorunitario ;
    private double qtdestoque;
    
    Combustivel(){
        this.tipo="";
        this.valorunitario = 0;
         }  
     
    Combustivel(String tipo, double valorunitario, double qtdestoque){
        this.tipo= tipo;
        this.valorunitario = valorunitario;
        this.qtdestoque = qtdestoque;
         }  

    
    public String getTipo() {
        return tipo;
    }

    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValorunitario() {
        return valorunitario;
    }

    
    public void setValorunitario(double valorunitario) {
        this.valorunitario = valorunitario;
    }
    
    public double calcValorTotal (Combustivel comb, float qtdlitros){
        double   valortotal = comb.valorunitario*qtdlitros;
       
        System.out.println(valortotal);
        return valortotal;
                
           }

    
    public double calcEstoque (Combustivel comb, float qtdlitros){
           return this.qtdestoque = comb.getQtdestoque() - qtdlitros;
                
           }

    /**
     * @return the qtdestoque
     */
    public double getQtdestoque() {
        return qtdestoque;
    }

    /**
     * @param qtdestoque the qtdestoque to set
     */
    public void setQtdestoque(double qtdestoque) {
        this.qtdestoque = qtdestoque;
    }

}

