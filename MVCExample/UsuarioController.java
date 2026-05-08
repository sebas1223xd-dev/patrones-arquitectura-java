public class UsuarioController {

    private Usuario modelo;
    private UsuarioView vista;

    public UsuarioController(
            Usuario modelo,
            UsuarioView vista
    ) {

        this.modelo = modelo;
        this.vista = vista;
    }

    public void actualizarVista() {

        vista.mostrarUsuario(
                modelo.getNombre()
        );
    }
}
