package app_promediofinal;

public class ResumenClases {
    private Ingreso_clases ingresoClases;
    private Notas notas;

    public ResumenClases(Ingreso_clases ingresoClases, Notas notas) {
        this.ingresoClases = ingresoClases;
        this.notas = notas;
    }

    // Method to display courses with their respective grades
    public void mostrarResumen() {
        System.out.println("Resumen de cursos y notas:");
        for (String curso : ingresoClases.getCursos()) {
            Double nota = notas.getNota(curso); // Get the grade for each course
            System.out.println(curso + ": " + (nota != null ? nota : "No hay nota registrada"));
        }
    }
}
