import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Productos {
    private static final List<Producto> productos;

    static {
        productos = new ArrayList<>();
        productos.add(new Producto("Milo", 27.000, 2));
        productos.add(new Producto("Café", 14.000, 1));
    }

    public static void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public static void mostrarProductos(){
        var inventarioProductos = "";
        for(var producto: productos){
            inventarioProductos += producto.toString() + "\n";
        }
        System.out.println("--- Productos en el inventario ---");
        System.out.println(inventarioProductos);
    }

    public static List<Producto> getProductos(){
        return productos;
    }

    public static void mostrarProductoId(Scanner lector){
        System.out.print("Ingresa el id del producto a consultar: ");
        var idProducto = Integer.parseInt(lector.nextLine());
        var productoEncontrado = false;
        for(var producto: Productos.getProductos()){
            if (idProducto == producto.getIdProducto()){
                System.out.println(producto);
                productoEncontrado = true;
                break;
            }
        }
        if (!productoEncontrado){
            System.out.println("Id de producto no encontrado: " + idProducto);
        }
    }
}
