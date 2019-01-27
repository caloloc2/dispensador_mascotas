package dispensador;

public class Clase_Ventas extends Clase_Variables{
    
    public Clase_Ventas(){
        super(); // hereda los metodos de la clase padre
    }
    
    public void Suma_Ventas(int valor){
        int is = this.Get_Seleccion(); // obtiene el item seleccionado
        int v = this.Get_Ventas(is); // obtiene las ventas previas
        v= v + valor; // aumenta las ventas 
        this.Set_Ventas(is, v); // Asigna al arreglo inventario
    }
}
