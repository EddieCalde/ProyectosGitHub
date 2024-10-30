
package app_promediofinal;

import java.util.Scanner;

/**
 *
 * @author Eddie
 */
public class Ingreso_Verificacion_Credenciales {
    // Creamos clase para poder obtener y verificar los credenciales obtenidos.
    
    // Variables
    String usuarioIn,pwIn,usuario,pw;
    
    public Ingreso_Verificacion_Credenciales(){
        // creamos scanner para input
        Scanner input = new Scanner(System.in);
        // pedimos el ingreso  al sistema
        System.out.println("Bienvenido a la aplicacion de Promedio Final!");
        System.out.println("Por favor crear su usuario: ");
        usuarioIn = input.nextLine();
        System.out.println("Por favor crear una contrasena: ");
        pwIn = input.nextLine();

        // pedimos el ingreso con su nuevo usuario y contrasena
        for (int i = 3; i > 0; i--) {
            System.out.println("Ingrese Usuario: ");
            usuario = input.nextLine();
            System.out.println("Ingrese Contraseña: ");
            pw = input.nextLine();
            if (usuario.equals(usuarioIn) && pw.equals(pwIn)) {
                System.out.println("Usuaurio y contrasena aceptados existosamente!");
                break;
            } else {
                System.out.println("Usuario o Contrasena no acceptado, favor intenta de nuevo");
                System.out.println("Te quedan " + (i - 1) + " intentos de 3.");
            }
            if (i == 1) {
                System.out.println("Fin de intentos, usuario bloqueado!");
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
