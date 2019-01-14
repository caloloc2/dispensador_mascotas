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
public class Variables {    
    public static int[] stock = new int[11]; // contiene el stock de productos
    public static int[] ventas = new int[11]; // recoge las ventas de los productos
    public static int seleccion = 0; // variable que contiene el producto seleccionado
    public static String informacion = "Informacion para la mascota. Recomendaciones.";
    
    int Lectura(int pos){
        return ventas[pos];
    }
    
    void Seleccionar_Item(int pos){
        seleccion = pos;
    }
    
    int Item_Seleccionado(){
        return seleccion;
    }
    
    void Asignar(int pos, int valor){
        ventas[pos]+= valor;
    }
    
    String Obtener_Informacion(){
        return informacion;
    }
    
    void Asignar_Stock(int pos, int valor){
        stock[pos] += valor;
    }
    
    int Obtener_Stock(int pos){
        return stock[pos];
    }
    
    int Producto_Mayor_Venta(){
        int m = 0;
        int pos = -1;
        for (int x=0; x<=10; x++){
            if (ventas[x]>m){
                m = ventas[x];
                pos = x;
            }
        }
        return pos;
    }
    
    int Producto_Menor_Venta(){
        int m = 30000;
        int pos = -1;
        for (int x=0; x<=10; x++){
            if (ventas[x]<m){
                m = ventas[x];
                pos = x;
            }
        }
        return pos;
    }
}
