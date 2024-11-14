package app_promediofinal;

import java.util.HashMap;
import java.util.Scanner;

public class Notas {
    private Info_Estudiantil infoEstudiantil; // Referencia a Info_Estudiantil
    private HashMap<String, Double> notas;

    public Notas(Info_Estudiantil infoEstudiantil) {
        this.infoEstudiantil = infoEstudiantil;  // Recibe Info_Estudiantil para no duplicar la solicitud de datos
        this.notas = new HashMap<>();
    }

    // Método para ingresar las notas de cada curso
    public void ingresarNotas(Ingreso_clases ingresoClases) {
        Scanner scanner = new Scanner(System.in);
        // Verifica si hay cursos en ingresoClases antes de continuar
        if (ingresoClases.getCursos().isEmpty()) {
            System.out.println("No se han ingresado cursos.");
            return;
        }

        for (String curso : ingresoClases.getCursos()) {
            System.out.print("Ingrese la nota para " + curso + ": ");
            double nota = scanner.nextDouble();
            notas.put(curso, nota);
        }
    }

    // Método para mostrar la información del estudiante y sus notas
    public void mostrarResumenEstudiante(Ingreso_clases ingresoClases) {
        // Mostramos la información del estudiante
        System.out.println("Información del Estudiante:");
        System.out.println("Nombre: " + infoEstudiantil.getNombre());
        System.out.println("Apellidos: " + infoEstudiantil.getApellidos());
        System.out.println("Fecha de Ingreso: " + infoEstudiantil.getFechaIn());
        System.out.println("Fecha de Salida: " + infoEstudiantil.getFechaSal());

        // Mostramos los cursos y notas
        System.out.println("\nResumen de Cursos y Notas:");
        if (notas.isEmpty()) {
            System.out.println("No se han ingresado notas para los cursos.");
        } else {
            for (String curso : ingresoClases.getCursos()) {
                Double nota = notas.get(curso); // Intenta obtener la nota del curso
                // Si la nota no existe (null), mostramos "Sin nota registrada"
                System.out.println(curso + ": " + (nota != null ? nota : "Sin nota registrada"));
            }
        }
    }

    // Getters y setters
    public HashMap<String, Double> getNotas() {
        return notas;
    }

    public void setNotas(HashMap<String, Double> notas) {
        this.notas = notas;
    }

    public Info_Estudiantil getInfoEstudiantil() {
        return infoEstudiantil;
    }

    public void setInfoEstudiantil(Info_Estudiantil infoEstudiantil) {
        this.infoEstudiantil = infoEstudiantil;
    }
    
}
