
package app_promediofinal;

import java.util.Scanner;

public class App_PromedioFinal {

    public static void main(String[] args) {
        // creamos scanner para input
        Scanner input = new Scanner(System.in);
        boolean continuar = true;
         while (continuar) { // este while lo que hace es que al final del programa consulta si quiere agregar datos de otro estudiante si la respuesta es no finaliza
        // creamos variables
        double promedio;

        // Llamamos a la Clase Ingreso_Verificacion_Credenciales para crear y verificar usuario
        Ingreso_Verificacion_Credenciales credenciales = new Ingreso_Verificacion_Credenciales(); // utilizar un arraylist para almacenar la info
        
        
        // ponemos una entrada al menu de la aplicacion
        System.out.println("Menu Principal");

        // pedimos info de estudiante 
        Info_Estudiantil info = new Info_Estudiantil();
        
        //Pedir y demostrar 
         Ingreso_clases ingresoClases = new Ingreso_clases();
        // llamar el metodo para el ingreso de cursos
        ingresoClases.ingresarCursos();
        // demostrar la clases ingresados
        ingresoClases.mostrarCursos();
        
        // Pedir notas de los cursos
        Notas notas = new Notas();
        notas.ingresarNotas(ingresoClases);
        notas.mostrarNotas();
        
        // resumen de notas con los cursos
        ResumenClases resumen = new ResumenClases(ingresoClases, notas);
        resumen.mostrarResumen();
        
        // instancia para el calculo del promedio
        CalcularPromedio calcularPromedio = new CalcularPromedio(notas);
            double promediofinal = calcularPromedio.calcularPromedio();
        System.out.println("El promedio de las notas es: " + promediofinal);
        
        
        boolean agregarMaterias = true;
            while (agregarMaterias) {
                System.out.println("¿Desea agregar mas materias? (si/no)");
                String respuesta = input.nextLine().trim().toLowerCase();
                
                if (respuesta.equals("si")) {
                    // Si el usuario quiere agregar más materias, pedimos nuevamente los cursos y notas
                    ingresoClases.ingresarCursos();
                    ingresoClases.mostrarCursos();
                    notas.ingresarNotas(ingresoClases);
                    notas.mostrarNotas();
                    
                    // Volvemos a calcular el promedio con las nuevas notas
                    calcularPromedio = new CalcularPromedio(notas);
                    promedio = calcularPromedio.calcularPromedio();
                    System.out.println("El nuevo promedio de las notas es: " + promedio);
                } else if (respuesta.equals("no")) {
                    // Si el usuario no quiere agregar más materias, salimos del ciclo
                    agregarMaterias = false;
                } else {
                    // Si la respuesta es inválida, pedimos nuevamente
                    System.out.println("Por favor ingrese 'si' o 'no'.");
                }
            }
            
            // Preguntar si desea continuar con otro estudiante o salir de la aplicación
            System.out.println("¿Desea agregar datos de otro estudiante? (si/no)");
            String respuestaFinal = input.nextLine().trim().toLowerCase();
            if (!respuestaFinal.equals("si")) {
                continuar = false; // Salir del ciclo si el usuario no quiere continuar
            }
        }
        
       
        System.out.println("Gracias por usar la aplicacion de promedio. ¡Hasta luego!");
    }
}
        
        
        /* Preguntar si quiere agregar otro estudiante
        System.out.println("¿Desea agregar datos de otro estudiante? (si/no)");
        String respuesta = input.nextLine();
        if (!respuesta.equalsIgnoreCase("si")) {
           continuar = false;}*/
        
        
        
        
        
        
        
    

