public class ProductoService {

    private ProductoDAO dao = new ProductoDAO();

    public Producto mostrarProducto() {

        return dao.obtenerProducto();
    }
}
