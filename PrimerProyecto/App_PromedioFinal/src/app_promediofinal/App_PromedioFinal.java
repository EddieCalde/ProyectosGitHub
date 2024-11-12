
package app_promediofinal;

import java.util.Scanner;

public class App_PromedioFinal {

    public static void main(String[] args) {
        // creamos scanner para input
        Scanner input = new Scanner(System.in);
        boolean continuar = true;
         while (continuar) { // este while lo que hace es que al final del programa consulta si quiere agregar datos de otro estudiante si la respuesta es no finaliza
        // creamos variables
        String materias;
        int cantMat; 
        double notaFin = 0, notaIn, promedio;

        // Llamamos a la Clase Ingreso_Verificacion_Credenciales para crear y verificar usuario
        Ingreso_Verificacion_Credenciales credenciales = new Ingreso_Verificacion_Credenciales();
        
        // ponemos una entrada al menu de la aplicacion
        System.out.println("Menu Principal");

        // pedimos info de estudiante 
        Info_Estudiantil info = new Info_Estudiantil();
        
        // Mostrar la información del estudiante
        
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
        // Preguntar si quiere agregar otro estudiante
        System.out.println("¿Desea agregar datos de otro estudiante? (si/no)");
        String respuesta = input.nextLine();
        if (!respuesta.equalsIgnoreCase("si")) {
           continuar = false;}
        }
    }
}
