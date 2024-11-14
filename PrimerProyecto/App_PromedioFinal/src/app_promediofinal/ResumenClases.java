package app_promediofinal;

public class ResumenClases {
    private Ingreso_clases ingresoClases;
    private Notas notas;

    public ResumenClases(Ingreso_clases ingresoClases, Notas notas) {
        this.ingresoClases = ingresoClases;
        this.notas = notas;
    }

    // Método para mostrar el resumen completo de cursos, notas e información del estudiante
    public void mostrarResumen() {
        // Mostrar información del estudiante (nombre, apellidos, fechas)
        System.out.println("Resumen del Estudiante:");
        System.out.println("Nombre: " + notas.getInfoEstudiantil().getNombre());  // Accedemos a infoEstudiantil
        System.out.println("Apellidos: " + notas.getInfoEstudiantil().getApellidos());  // Accedemos a infoEstudiantil
        System.out.println("Fecha de Ingreso: " + notas.getInfoEstudiantil().getFechaIn());  // Accedemos a infoEstudiantil
        System.out.println("Fecha de Salida: " + notas.getInfoEstudiantil().getFechaSal());  // Accedemos a infoEstudiantil

        // Mostrar los cursos y las notas correspondientes
        System.out.println("\nResumen de Cursos y Notas:");
        for (String curso : ingresoClases.getCursos()) {
            Double nota = notas.getNotas().get(curso);  // Obtener la nota para cada curso
            System.out.println(curso + ": " + (nota != null ? nota : "Sin nota registrada"));
        }
    }

    public Ingreso_clases getIngresoClases() {
        return ingresoClases;
    }

    public void setIngresoClases(Ingreso_clases ingresoClases) {
        this.ingresoClases = ingresoClases;
    }

    public Notas getNotas() {
        return notas;
    }

    public void setNotas(Notas notas) {
        this.notas = notas;
    }
}
