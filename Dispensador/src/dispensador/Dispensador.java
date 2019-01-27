
package dispensador;

// Esta es la clase inicial que llama a la Clase Principal
// que es la que muestra la primera ventana

public class Dispensador {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clase_Inventario inventario = new Clase_Inventario();
        
        // Asignacion de nombres
        inventario.Set_Nombre(0, "Shampoo para mascotas");
        inventario.Set_Nombre(1, "Jabón para mascotas");
        inventario.Set_Nombre(2, "Galletas para mascotas");
        inventario.Set_Nombre(3, "Huesos");
        inventario.Set_Nombre(4, "Collares para razas pequeñas");
        inventario.Set_Nombre(5, "Collares para razas grandes");
        inventario.Set_Nombre(6, "Juguetes para mascotas");
        inventario.Set_Nombre(7, "Croquetas - Dog Star");
        inventario.Set_Nombre(8, "Croquetas - Pro Can");
        inventario.Set_Nombre(9, "Croquetas - Dog Chow");
        inventario.Set_Nombre(10, "Croquetas - Nutri Can");
        
        // Asignacion de Stock Inicial
        inventario.Set_Stock(0, 0);
        inventario.Set_Stock(1, 0);
        inventario.Set_Stock(2, 0);
        inventario.Set_Stock(3, 0);
        inventario.Set_Stock(4, 0);
        inventario.Set_Stock(5, 0);
        inventario.Set_Stock(6, 0);
        inventario.Set_Stock(7, 0);
        inventario.Set_Stock(8, 0);
        inventario.Set_Stock(9, 0);
        inventario.Set_Stock(10, 0);
        
        // Asignacion de Ventas Iniciales 
        inventario.Set_Ventas(0, 0);
        inventario.Set_Ventas(1, 0);
        inventario.Set_Ventas(2, 0);
        inventario.Set_Ventas(3, 0);
        inventario.Set_Ventas(4, 0);
        inventario.Set_Ventas(5, 0);
        inventario.Set_Ventas(6, 0);
        inventario.Set_Ventas(7, 0);
        inventario.Set_Ventas(8, 0);
        inventario.Set_Ventas(9, 0);
        inventario.Set_Ventas(10, 0);
        
        Principal f = new Principal();
        f.setVisible (true); 
    }
}
