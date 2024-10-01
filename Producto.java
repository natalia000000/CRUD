public class Producto{

    //Atributos id, nombre, precio.

    private int idProducto;
    private String nombreProducto;
    private double precioProducto;

    //Constructor
    public Producto(int id, String nombre, double precio){
        this.idProducto = id;
        this.nombreProducto = nombre;
        this.precioProducto = precio;

    }

    //Accesadores=get(Obtener)
    public int getIdProducto() {
        return idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    // Mutadores=set(Cambiar)
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }


    //toString

    @Override
    public String toString() {
        
        return "Id producto " + idProducto + "Nombre producto " + nombreProducto + "Precio producto " + precioProducto;

    }
}