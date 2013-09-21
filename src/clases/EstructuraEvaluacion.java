package clases;

import java.sql.ResultSet;
import java.sql.Statement;
import util.Conecta;

/**
 * @author Pablo Hurtado
 * @version 1.0
 * @created 21-abr-2013 09:45:01 PM
 */
public class EstructuraEvaluacion {

    private String nombreE;
    private double valor;
    Conecta cnx = new Conecta();
    Statement stm;
    ResultSet rs;

    public EstructuraEvaluacion(){

    }

    public EstructuraEvaluacion(String nombreE, double valor) {
        this.nombreE = nombreE;
        this.valor = valor;
    }        

    public String getnombreE(){
            return nombreE;
    }

    public double getvalor(){
            return valor;
    }

    public void setnombreE(String nombre){
            nombreE = nombre;
    }

    public void setvalor(double Valo){
            valor = Valo;
    }
    
    
    
    public int ObtenerIDEstruvturaevaluacion(String Estevaluacion){
        
            cnx.Conecta();
            int fe=0;
            
            try{
                stm = cnx.conn.createStatement();
                rs = stm.executeQuery("select idestructuraevaluacion from estructuraevaluacion "
                        + "where nombreEs='"+ Estevaluacion +"' ");
                
                rs.next();
                
                fe = rs.getInt("idestructuraevaluacion");
                
                rs.close();
                stm.close();
                cnx.conn.close();
                        
            
            }catch(Exception e){javax.swing.JOptionPane.showMessageDialog(null, "Error obtenerIDEstructuraevaluacion: "
                    + e.getMessage());}
                
            
            return fe;
            }
    
    
}