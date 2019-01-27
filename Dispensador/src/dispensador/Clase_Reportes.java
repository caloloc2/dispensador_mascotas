/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dispensador;

/**
 *
 * @author calol
 */
public class Clase_Reportes extends Clase_Variables {
    
    public Clase_Reportes(){
        super();
    }
    
    public String Mayor_Venta(){
        int m = 0;
        int pos = -1;
        for (int x=0; x<=10; x++){
            if (this.Get_Ventas(x)>m){                
                m = this.Get_Ventas(x);
                pos = x;
            }
        }
        String respuesta = this.Get_Nombre(pos);
        return respuesta;
    }
    
    public String Menor_Venta(){
        int m = 30000;
        int pos = -1;
        for (int x=0; x<=10; x++){
            if (this.Get_Ventas(x)<m){
                m = this.Get_Ventas(x);
                pos = x;
            }
        }        
        String respuesta = this.Get_Nombre(pos);
        return respuesta;
    }
}
