import java.util.ArrayList;
import java.util.Scanner;

//Tienda va a gestionar todo el CRUD
public class Tienda {
    //Atributos

    //Lista para almacenar productos
    private ArrayList<Producto> productos;

    //Crear scanner como atributos para poder usarlo dentro de los metodos
    private Scanner scanner;

    //Inicializar Constructor
    public Tienda() {

        productos = new ArrayList<>();
        scanner = new Scanner(System.in);

    }

    //Metodo agregar productos
    public void agregarProducto(){
        System.out.println("Ingrese el id del producto");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el nombre del producto");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el precio del producto");
        double precio = scanner.nextDouble();

        //Agregar un producto a la lista
        Producto producto = new Producto(id, nombre, precio);
        productos.add(producto);
        System.out.println("El producto" + nombre + "fue agregado correctamente a la lista");

    }

    //Metodo para mostrar o listar productos
    public void mostrarProductos(){

        if(productos.isEmpty()){

            System.out.println("No hay productos en la lista");

        }else{
            //El for va a imprimir un sout por cada producto de mi lista
            for(Producto producto : productos){
                System.out.println(producto);

            }

        }
    }

    //Metodo para actualizar productos id

    public void actualizarProductos(){

        //Solicito en primer lugar el id al usuario
        System.out.println("Ingrese el id del producto a actualizar");
        int id = scanner.nextInt();
        scanner.nextLine();

        //Buscar ese id dentro de mi lista de productos
        for (Producto producto : productos){
            //Evaluo si existe una coincidencia entre el idProducto y el id del usuario
            if(producto.getIdProducto()==id){
                //le 
                System.out.println("Ingresa el nombre a actualizar");
                String nombreActualizado = scanner.nextLine();

                System.out.println("Ingrese el precio a actualizar");
                double precioActualizado = scanner.nextDouble();

                //Actualizar estos datos
                producto.setNombreProducto(nombreActualizado);
                //Actualizar el precio
                producto.setPrecioProducto(precioActualizado);
                System.out.println("El producto fue actualizado");
                return;

            }
        }System.out.println("El producto que quieres actualizar no se encuentra");
    }


    //Metodo para eliminar productos id
    public void eliminarProducto(){
    System.out.println("Ingrese el id del producto a eliminar");
    int id = scanner.nextInt();
    scanner.nextLine();

    Producto productoAEliminar = null;


    //For para recorrer la lista y encontrar alguna coincidencia
        for (Producto producto : productos){
            if(producto.getIdProducto()==id){
                productoAEliminar = producto;
                break;

            }
        }

        if(productoAEliminar!=null){
            productos.remove(productoAEliminar);
            System.out.println("Producto eliminado");

        }else{
            System.out.println("Producto no encontrado");
        }
    }
}
