import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Crear una instancia
        Tienda tienda = new Tienda();
        Scanner datoUsuario = new Scanner(System.in);

        //Crear una variable para almacenar la opcion seleccionada
        int opcion;

        do{

            //Opciones del menu
            System.out.println("Menu de la tienda");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Actualizar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Salir de la tienda");
            opcion = datoUsuario.nextInt();


            switch (opcion) {
                case 1:
                    tienda.agregarProducto();
                    break;
                
                case 2:
                    tienda.mostrarProductos();
                    break;

                case 3:
                    tienda.actualizarProductos();
                    break;

                case 4:
                    tienda.eliminarProducto();
                    break;

                case 5:
                    datoUsuario.close();
                    return;
                default:
                    System.out.println("Ingresa una opción correcta");
            }
        }while(opcion!=5);
    }
}
