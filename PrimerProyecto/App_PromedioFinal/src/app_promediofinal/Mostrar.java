
package app_promediofinal;

import java.util.Scanner;

/**
 *
 * @author Eddie
 */
public class Mostrar {
    //Variables
    private String nombre;
    private String apellidos;
    private String correo;
    private String cedula;
    private String numTel; 
    private String fechaIn; 
    private String fechaSal;
    
    public Mostrar(){
        // creamos scanner para input
        Scanner input = new Scanner(System.in);
        
        String materias;
        int cantMat;
        double notas, notaFin = 0, notaIn, promedio;
        
        // pedimos la cantidad de materias
        System.out.println("Digite la cantidad de materias inscritas");
        cantMat = input.nextInt();

        // utilizamos el ciclo for para pedir la info de cada materia
        notaIn = 0;
        for (int i = 1; i <= cantMat; i++) {
            System.out.println("Ingrese el nombre de la materia: ");
            materias = input.nextLine();
            System.out.println("Digite la nota obtenida en la materia: " + materias);
            notas = input.nextDouble();
            input.nextLine(); // limpiar
            notaFin = notaIn + notas;
        }
        for (int j = 1; j <= cantMat; j++) {
            System.out.println("");
        }
        // Calcular el promedio
        promedio = notaFin / cantMat;
        
        System.out.println("\nInformacion del Estudiante:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Cedula: " + cedula);
        System.out.println("Correo: " + correo);
        System.out.println("Numero de Telefono: " + numTel);
        System.out.println("Fecha de Ingreso: " + fechaIn);
        System.out.println("Fecha de Salida: " + fechaSal);
        System.out.println("Cantidad de Materias: " + cantMat);
        System.out.println("Promedio de Notas: " + promedio);
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
