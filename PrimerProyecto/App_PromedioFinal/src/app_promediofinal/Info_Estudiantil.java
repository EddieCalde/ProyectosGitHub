
package app_promediofinal;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


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
    private LocalDate fechaIn; 
    private LocalDate fechaSal;
            
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
        
        /*System.out.println("Fecha de Ingreso DD/MM/AAAA: ");
        fechaIn = input.nextLine();
        System.out.println("Fecha de Salida DD/MM/AAAA: ");
        fechaSal = input.nextLine();*/
        
        /*Para capturar la fecha vamos a utilizar localdate para guardar la informacion en formato de fecha 
        */
        fechaIn = leerFecha(input," Fecha de ingreso (DD/MM/AAAA)");
        fechaSal = leerFecha(input, "Fecha de salida (DD/MM/AAAA)");
         
    }
    private LocalDate leerFecha(Scanner input, String mensaje) {
        LocalDate fecha = null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        while (fecha == null){
        System.out.println(mensaje);
        String fechaStr = input.nextLine();
        try{
            fecha = LocalDate.parse(fechaStr, formatter);}
            catch (DateTimeParseException e) {
                System.out.println("El formato de fecha no es correcto, intente nuevamente (Dia,Mes,Año) ");
            
        }
    }
        return fecha; /* Se utilizo un try catch para verificar que el ingreso de la fecha sea correcto*/
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

    public LocalDate getFechaIn() {
        return fechaIn;
    }

    public void setFechaIn(LocalDate fechaIn) {
        this.fechaIn = fechaIn;
    }

    public LocalDate getFechaSal() {
        return fechaSal;
    }

    public void setFechaSal(LocalDate fechaSal) {
        this.fechaSal = fechaSal;
    }
    
}
