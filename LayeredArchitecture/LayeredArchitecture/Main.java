public class Main {

    public static void main(String[] args) {

        ProductoService service =
                new ProductoService();

        Producto producto =
                service.mostrarProducto();

        System.out.println(
                "Producto: "
                + producto.getNombre()
        );

        System.out.println(
                "Precio: "
                + producto.getPrecio()
        );
    }
}
