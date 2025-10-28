public class ProductoAgricola {
    //atributos privados de la clase
    private String nombre;
    private int cantidad;
    private boolean esVegano;
    private double precio;

    //Constructor con valores iniciales
    public ProductoAgricola() {
        this.nombre = "";
        this.cantidad = 0;
        this.esVegano = false;
        this.precio = 0.0;
    }
    //Constructor que inicializa parametros
    public ProductoAgricola(String nombre, int cantidad, boolean esVegano, double precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.esVegano = esVegano;
        this.precio = precio;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isEsVegano() {
        return esVegano;
    }

    public void setEsVegano(boolean esVegano) {
        this.esVegano = esVegano;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Metodo toString:
    @Override
    public String toString() {
        return "Producto:\n" +
                "Nombre:   " + nombre + "\n" +
                "Cantidad: " + cantidad + "\n" +
                "Vegano:   " + (esVegano ? "Si" : "No") + "\n" +       //Por simplicidad se usa una condicional anidada
                "Precio:   $" + String.format("%.0f", precio) + "\n"; //El precio está representado como double, sin ceros despues de la coma.
    }
}
