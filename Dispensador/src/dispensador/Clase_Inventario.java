package dispensador;

public class Clase_Inventario extends Clase_Variables{
    
    public Clase_Inventario(){
        super();
    }
    
    public void Asignar_Inventario(int valor){
        int is = this.Get_Seleccion(); // obtiene el item seleccionado
        this.Set_Stock(is, valor);
    }
    
    public void Sumar_Inventario(int cantidad){
        int is = this.Get_Seleccion(); // obtiene el item seleccionado
        int sa = this.Get_Stock(is); // obtiene el stock actual
        sa = sa +cantidad; // suma cantidad al stock actual
        this.Set_Stock(is, sa); // asigna el nuevo stock
    }
}
