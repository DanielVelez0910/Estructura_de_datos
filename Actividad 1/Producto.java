public class Producto {
    private static int contador = 0;
    private int idProducto;
    private String nombreProducto;
    private double precioProducto;
    private int cantidadProducto;

    public Producto(){ this.idProducto = ++Producto.contador; }
    public Producto(String nombreProducto, double precioProducto, int cantidadProducto) {
        this();
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.cantidadProducto = cantidadProducto;
    }

    public static int getContador(){
        return contador;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(float precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", precioProducto=" + precioProducto +
                ", cantidadProducto=" + cantidadProducto +
                '}';
    }
}
