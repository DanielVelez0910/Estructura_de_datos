import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class maquinaRegistro {
    public static void main(String[] args) {
        maquinaRegistro();
    }

    public static void maquinaRegistro(){
        var salir = false;
        var lector = new Scanner(System.in);
        // Lista de productos
        List<Producto> productos = new ArrayList<>();
        System.out.println("*** Maquina de Registro ***");
        while(!salir){
            try{
                var opcion = mostrarMenu(lector);
                salir = ejecutarOpciones(opcion, lector, productos);
            }
            catch (Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            }
            finally {
                System.out.println(); // salto de linea
            }
        }
    }

    private static int mostrarMenu(Scanner lector){
        System.out.print("""
                Menu:
                1. Registrar Producto
                2. Mostrar Productos
                3. Mostrar Producto por Id
                4. Salir
                Elige una opcion:\s""");
        // Leer y retornar la opción seleccionada
        return Integer.parseInt(lector.nextLine());
    }

    private static boolean ejecutarOpciones(int opcion, Scanner lector, List<Producto> productos){
        var salir = false;
        switch (opcion){
            case 1 -> agregarProducto(lector);
            case 2 -> mostrarProductos(productos);
            case 3 -> mostrarProductoId(lector);
            case 4 -> {
                System.out.println("Saliendo del sistema");
                salir = true;
            }
            default -> System.out.println("Opción inválida: " + opcion);
        }
        return salir;
    }

    private static void agregarProducto(Scanner lector){
        System.out.print("Nombre del producto: ");
        var nombre = lector.nextLine();
        System.out.print("Precio del producto: ");
        var precio = Double.parseDouble(lector.nextLine());
        System.out.print("Cantidad del producto: ");
        var cantidad = Integer.parseInt(lector.nextLine());
        Productos.agregarProducto(new Producto(nombre, precio, cantidad));
        System.out.println("El producto ha sido agregado correctamente :)");
        Productos.mostrarProductos();
    }

    private static void mostrarProductos(List<Producto> productos){
        Productos.mostrarProductos();
    }

    private static void mostrarProductoId(Scanner lector){
        Productos.mostrarProductoId(lector);
    }
}
