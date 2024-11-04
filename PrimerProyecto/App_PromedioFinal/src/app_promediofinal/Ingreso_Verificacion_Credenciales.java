package app_promediofinal;

import java.util.Scanner;

/**
 *
 * @author Eddie
 */
public class Ingreso_Verificacion_Credenciales {

    // Creamos clase para poder obtener y verificar los credenciales obtenidos.
    //Se crearon mensajes constantes para llamar luego
    private static final String BIENVENIDO = "Bienvenido a la Aplicacion de Promedio Final y Notas";
    private static final String CREAR_USUARIO = "Por Favor crear su Usuario: ";
    private static final String CREAR_CONTRASENA = "Por Favor crear una contraseña:";
    private static final String INGRESAR_USUARIO = "Ingrese Usuario: ";
    private static final String INGRESE_CONTRASENA = "Ingrese Contraseña: ";
    private static final String USUARIO_CONTRASENA_VALIDOS = "Usuario y contraseña aceptados";
    private static final String USUARIO_CONTRASENA_INVALIDOS = "Usuario o contraseña no aceptados";
    private static final String INTENTOS_RESTANTES = "Te quedan %d intentos de 3";
    private static final String FIN_INTENTOS = "Fin de intentos, Usuario bloqueado";

    // Variables
    String usuarioIn, pwIn, usuario, pw;
// pedimos el ingreso  al sistema

    /* este metodo llama a los metodos que se encargan de
        solicitar los credenciales y la verificacion de los mismos*/
    public Ingreso_Verificacion_Credenciales() {
        // creamos scanner para input
        Scanner input = new Scanner(System.in);
        inicializarCredenciales(input);
        verificarCredenciales(input);
    }

    private void inicializarCredenciales(Scanner input) {
        System.out.println(BIENVENIDO);
        System.out.println(CREAR_USUARIO);
        usuarioIn = input.nextLine();
        System.out.print(CREAR_CONTRASENA);
        pwIn = input.nextLine();
}
    private void verificarCredenciales(Scanner input){
     
        
        
        /*
        System.out.println("Bienvenido a la aplicacion de Promedio Final!");
        System.out.println("Por favor crear su usuario: ");
        usuarioIn = input.nextLine();
        System.out.println("Por favor crear una contrasena: ");
        pwIn = input.nextLine();*/
        
        
        // pedimos el ingreso con su nuevo usuario y contrasena
        for (int i = 3; i > 0; i--) {
            System.out.println(INGRESAR_USUARIO);
            usuario = input.nextLine();
            System.out.println(INGRESE_CONTRASENA);
            pw = input.nextLine();
            if (usuario.equals(usuarioIn) && pw.equals(pwIn)) {
                System.out.println(USUARIO_CONTRASENA_VALIDOS);
                break;
            } else {
                System.out.println(USUARIO_CONTRASENA_INVALIDOS);
                System.out.printf(INTENTOS_RESTANTES, i - 1);
                System.out.println();
            }
            if (i == 1) {
                System.out.println(FIN_INTENTOS);
                System.exit(0);
            }
        }
    }

    public String getUsuarioIn() {
        return usuarioIn;
    }

    public void setUsuarioIn(String usuarioIn) {
        this.usuarioIn = usuarioIn;
    }

    public String getPwIn() {
        return pwIn;
    }

    public void setPwIn(String pwIn) {
        this.pwIn = pwIn;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

}
