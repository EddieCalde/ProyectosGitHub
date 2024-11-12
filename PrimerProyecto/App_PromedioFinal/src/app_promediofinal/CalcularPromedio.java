
    package app_promediofinal;

public class CalcularPromedio {

    private Notas notas;

    public CalcularPromedio(Notas notas) {
        this.notas = notas;
    }

    // Método para calcular el promedio de las notas
    public double calcularPromedio() {
        double sumaNotas = 0;
        int cantidadNotas = notas.getNotas().size();

        if (cantidadNotas == 0) {
            System.out.println("No hay notas registradas.");
            return 0;
        }

        // Sumar todas las notas
        for (double nota : notas.getNotas().values()) {
            sumaNotas += nota;
        }

        // Calcular el promedio
        return sumaNotas / cantidadNotas;
    }
}

    
