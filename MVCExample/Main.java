public class Main {

    public static void main(String[] args) {

        Usuario modelo =
                new Usuario("Sebastian");

        UsuarioView vista =
                new UsuarioView();

        UsuarioController controller =
                new UsuarioController(
                        modelo,
                        vista
                );

        controller.actualizarVista();
    }
}
