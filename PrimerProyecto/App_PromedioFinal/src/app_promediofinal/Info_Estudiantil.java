
package app_promediofinal;

import java.util.Scanner;

/**
 *
 * @author Eddie
 */
public class Info_Estudiantil {
    
    //Variables
    private String nombre;
    private String apellidos;
    private String correo;
    private String cedula;
    private String numTel; 
    private String fechaIn; 
    private String fechaSal;
            
    public Info_Estudiantil(){
        // creamos scanner para input
        Scanner input = new Scanner(System.in);
        
        // pedimos la info de estudiante
        System.out.println("Ingrese su Nombre: ");
        nombre = input.nextLine();
        System.out.println("Ingrese sus Apellidos: ");
        apellidos = input.nextLine();
        System.out.println("Ingrese su numero de Cedula: ");
        cedula = input.nextLine();
        System.out.println("Ingrese su Correo electronico: ");
        correo = input.nextLine();
        System.out.println("Ingrese su numero de telefono: ");
        numTel = input.nextLine();
        System.out.println("Ingrese la fecha de ingreso y su fecha de salid de este cuatrimestre.");
        System.out.println("Fecha de Ingreso DD/MM/AAAA: ");
        fechaIn = input.nextLine();
        System.out.println("Fecha de Salida DD/MM/AAAA: ");
        fechaSal = input.nextLine();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public String getFechaIn() {
        return fechaIn;
    }

    public void setFechaIn(String fechaIn) {
        this.fechaIn = fechaIn;
    }

    public String getFechaSal() {
        return fechaSal;
    }

    public void setFechaSal(String fechaSal) {
        this.fechaSal = fechaSal;
    }
    
}
