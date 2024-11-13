package app_promediofinal;

import java.util.HashMap;
import java.util.Scanner;

public class Notas {
    private HashMap<String, Double> notas;

    public Notas() {  // que notas herede de info estudiantes para que sean ligados de una vez
        notas = new HashMap<>();
    }

    // Method to input grades for each course
    public void ingresarNotas(Ingreso_clases ingreso_clases) {
        Scanner scanner = new Scanner(System.in);
        for (String curso : ingreso_clases.getCursos()) {
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
    public HashMap<String, Double> getNotas() {
        return notas;
    }
}
