package app_promediofinal;

import java.util.Scanner;

public class App_PromedioFinal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            // Verificación de credenciales
            Ingreso_Verificacion_Credenciales verificar = new Ingreso_Verificacion_Credenciales();
            
            // Capturar datos del estudiante
            Info_Estudiantil infoEstudiante = new Info_Estudiantil();

            // Ingresar los cursos
            Ingreso_clases ingresoClases = new Ingreso_clases();
            ingresoClases.ingresarCursos();

            // Crear objeto de Notas, pasando la instancia de Info_Estudiantil
            Notas notas = new Notas(infoEstudiante);
            notas.ingresarNotas(ingresoClases);

            // Mostrar resumen de cursos y notas usando ResumenClases
            ResumenClases resumen = new ResumenClases(ingresoClases, notas);
            resumen.mostrarResumen();

            // Calcular y mostrar el promedio final
            CalcularPromedio calcularPromedio = new CalcularPromedio(notas);
            double promedioFinal = calcularPromedio.calcularPromedio();
            System.out.println("El promedio final es: " + promedioFinal);

            // Preguntar si desea agregar otro estudiante
            System.out.println("¿Desea agregar datos de otro estudiante? (si/no)");
            String respuestaFinal = input.nextLine().trim().toLowerCase();
            continuar = respuestaFinal.equals("si");
        }

        System.out.println("Gracias por usar la aplicación de promedio. ¡Hasta luego!");
    }
}
