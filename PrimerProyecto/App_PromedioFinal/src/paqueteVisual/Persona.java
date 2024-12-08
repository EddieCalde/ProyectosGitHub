
package paqueteVisual;

public class Persona {
    private String nombre;
    private String cedula;
    private String nombreUser;
    private String contrasena;

    public Persona(String nombre, String cedula, String nombreUser, String contrasena) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.nombreUser = nombreUser;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombreUser() {
        return nombreUser;
    }

    public void setNombreUser(String nombreUser) {
        this.nombreUser = nombreUser;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
            
    
}
