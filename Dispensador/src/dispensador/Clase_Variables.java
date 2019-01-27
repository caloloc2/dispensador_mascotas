package dispensador;

public abstract class Clase_Variables {
    private static int[][] inventario = new int[11][2]; // contiene el stock y ventas de productos
    private static String[] items = new String[11]; // contiene los nombres de los productos
    private static String recomendaciones;
    private static int seleccionado;
    
    public Clase_Variables(){}
    
    // Items
    public void Set_Nombre(int id, String nombre){
        this.items[id] = nombre;
        System.out.println(this.items[id]);
    }
    
    public String Get_Nombre(int id){
        System.out.println(id);
        return this.items[id];
    }
    
    // Stock
    public void Set_Stock(int id, int valor){
        this.inventario[id][0] = valor;
        System.out.println(this.inventario[id][0]);
    }
    
    public int Get_Stock(int id){
        return this.inventario[id][0];
    }
    
    // Ventas
    public void Set_Ventas(int id, int valor){
        this.inventario[id][1] = valor;
        System.out.println(this.inventario[id][1]);
    }
    
    public int Get_Ventas(int id){
        System.out.println(id);
        return this.inventario[id][1];
    }
    
    // Item Seleccionado
    public void Set_Seleccion(int id){
        System.out.println("item seleccionado: "+id);
        this.seleccionado = id;
    }
    
    public int Get_Seleccion(){
        return this.seleccionado;
    }
    
    // Recomendacion
    public void Set_Recomendacion(String valor){
        this.recomendaciones = valor;
    }
    
    public String Get_Recomendacion(){
        return this.recomendaciones;
    }
}
