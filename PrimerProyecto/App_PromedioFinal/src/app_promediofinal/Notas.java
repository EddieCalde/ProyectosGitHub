package app_promediofinal;

import java.util.HashMap;
import java.util.Scanner;

public class Notas extends Info_Estudiantil {  // Extendemos Info_Estudiantil
    private HashMap<String, Double> notas;

    public Notas() {
        super();  // Llamada a constructor para infoEstudiantil
        notas = new HashMap<>();
    }

    // Method to input grades for each course
    public void ingresarNotas(Ingreso_clases ingresoClases) {
        Scanner scanner = new Scanner(System.in);
        for (String curso : ingresoClases.getCursos()) {
            System.out.print("Ingrese la nota para " + curso + ": ");
            double nota = scanner.nextDouble();
            notas.put(curso, nota);
        }
    }

    // Method to display grades for each course
    public void mostrarNotas() {
        System.out.println("Notas ingresadas:");
        for (String curso : notas.keySet()) {
            System.out.println(curso + ": " + notas.get(curso));
        }
    }
    
    // Method to get the grade for a specific course
    public Double getNota(String curso) {
        return notas.get(curso);
    }

    // Method to get all grades
    public HashMap<String, Double> getNotas() {
        return notas;
    }

    // Method to display student information, courses, and grades
    public void mostrarResumenEstudiante(Ingreso_clases ingresoClases) {
        // Display student information
        System.out.println("Información del Estudiante:");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellidos: " + getApellidos());
        System.out.println("Fecha de Ingreso: " + getFechaIn());
        System.out.println("Fecha de Salida: " + getFechaSal());

        // Display courses and grades
        System.out.println("\nResumen de Cursos y Notas:");
        for (String curso : ingresoClases.getCursos()) {
            Double nota = getNota(curso);
            System.out.println(curso + ": " + (nota != null ? nota : "Sin nota registrada"));
        }
    }
}

