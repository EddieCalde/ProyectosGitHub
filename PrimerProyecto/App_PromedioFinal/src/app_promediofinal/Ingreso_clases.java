 
package app_promediofinal;

import java.util.ArrayList;
import java.util.Scanner;

public class Ingreso_clases {
    private ArrayList<String> cursos;

    public Ingreso_clases() {
        cursos = new ArrayList<>();
    }

    // Method to input number of courses and their names
    public void ingresarCursos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de cursos: ");
        int cantidadCursos = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        for (int i = 0; i < cantidadCursos; i++) {
            System.out.print("Ingrese el nombre del curso #" + (i + 1) + ": ");
            String nombreCurso = scanner.nextLine();
            cursos.add(nombreCurso);
        }
    }

    // Method to display the courses
    public void mostrarCursos() {
        System.out.println("Cursos ingresados:");
        for (String curso : cursos) {
            System.out.println("- " + curso);
        }
    }
    
    // Method to get the list of courses
    public ArrayList<String> getCursos() {
        return cursos;
    }
}

