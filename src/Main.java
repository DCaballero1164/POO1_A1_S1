public class Main {
    public static void main(String[] args) {
    // Se crean los productos
        ProductoAgricola p1 = new ProductoAgricola("Melón", 100, true, 800.0);
        ProductoAgricola p2 = new ProductoAgricola("Sandía", 50, true, 1500.0);
        ProductoAgricola p3 = new ProductoAgricola("Higo", 2000, false, 1000.0);

        // Se muestran los objetos instanciados por consola con System.Out.Println
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}