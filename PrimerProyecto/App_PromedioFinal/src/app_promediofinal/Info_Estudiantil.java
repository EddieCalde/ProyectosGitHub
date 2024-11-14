package app_promediofinal;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Info_Estudiantil {
    
    // Static ArrayList to hold all student instances
    private static ArrayList<Info_Estudiantil> listaEstudiantes = new ArrayList<>();

    // Instance variables
    static String nombre;
    static String apellidos;
    static String correo;
    static String cedula;
    static String numTel; 
    static LocalDate fechaIn; 
    static LocalDate fechaSal;

    // Constructor
    public Info_Estudiantil() {
        // Collect student information
        Scanner input = new Scanner(System.in);
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

        // Collect dates
        fechaIn = leerFecha(input,"Fecha de ingreso (DD/MM/AAAA)");
        fechaSal = leerFecha(input, "Fecha de salida (DD/MM/AAAA)");

        // Add this instance to the static list
        listaEstudiantes.add(this);
    }

    // Method to read date input and convert to LocalDate
    private LocalDate leerFecha(Scanner input, String mensaje) {
        LocalDate fecha = null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        while (fecha == null) {
            System.out.println(mensaje);
            String fechaStr = input.nextLine();
            try {
                fecha = LocalDate.parse(fechaStr, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("El formato de fecha no es correcto, intente nuevamente (Dia, Mes, Año)");
            }
        }
        return fecha;
    }

    // Method to display all students in the static list
    public static void mostrarEstudiantes() {
        System.out.println("Información de todos los estudiantes:");
        for (Info_Estudiantil estudiante : listaEstudiantes) {
            System.out.println("Nombre: " + estudiante.getNombre());
            System.out.println("Apellidos: " + estudiante.getApellidos());
            System.out.println("Correo: " + estudiante.getCorreo());
            System.out.println("Cédula: " + estudiante.getCedula());
            System.out.println("Número de Teléfono: " + estudiante.getNumTel());
            System.out.println("Fecha de Ingreso: " + estudiante.getFechaIn());
            System.out.println("Fecha de Salida: " + estudiante.getFechaSal());
            System.out.println("---------------------------");
        }
    }

    // Getter methods
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNumTel() {
        return numTel;
    }

    public LocalDate getFechaIn() {
        return fechaIn;
    }

    public LocalDate getFechaSal() {
        return fechaSal;
    }

    public static void setListaEstudiantes(ArrayList<Info_Estudiantil> listaEstudiantes) {
        Info_Estudiantil.listaEstudiantes = listaEstudiantes;
    }

    public static void setNombre(String nombre) {
        Info_Estudiantil.nombre = nombre;
    }

    public static void setApellidos(String apellidos) {
        Info_Estudiantil.apellidos = apellidos;
    }

    public static void setCorreo(String correo) {
        Info_Estudiantil.correo = correo;
    }

    public static void setCedula(String cedula) {
        Info_Estudiantil.cedula = cedula;
    }

    public static void setNumTel(String numTel) {
        Info_Estudiantil.numTel = numTel;
    }

    public static void setFechaIn(LocalDate fechaIn) {
        Info_Estudiantil.fechaIn = fechaIn;
    }

    public static void setFechaSal(LocalDate fechaSal) {
        Info_Estudiantil.fechaSal = fechaSal;
    }
    
}
