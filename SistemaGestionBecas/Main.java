import java.util.Scanner;

public class Main{
        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            System.out.print(" \nCodigo: ");
            String codigo = sc.nextLine();

            System.out.print(" Estudiante: ");
            String nombre = sc.nextLine();

            System.out.print("Promedio: ");
            double promedio = sc.nextDouble();

            System.out.print("Valor de matrícula: ");
            double valorMatricula = sc.nextDouble();

            System.out.print("Número de materias: ");
            int numeroMaterias = sc.nextInt();

            System.out.print("Recargo pendiente: ");
            double recargo = sc.nextDouble();

            System.out.print("Porcentaje de beca: ");
            int porcentaje = sc.nextInt();

            System.out.print("Bono excelencia: ");
            double bonoExcelencia = sc.nextDouble();

            /* EstudianteRegular e1 = new EstudianteRegular(codigo, nombre, promedio, valorMatricula, numeroMaterias);
            e1.mostrarDatos();

            EstudianteBecado e2 = new EstudianteBecado(codigo, nombre, promedio, valorMatricula, porcentaje);
            e2.mostrarDatos();

            RegularConRecargo e3 = new RegularConRecargo(codigo, nombre, promedio, valorMatricula, numeroMaterias, recargo);
            e3.mostrarDatos();
        */

            BecadoExcelencia e4 = new BecadoExcelencia(codigo, nombre, promedio, valorMatricula, porcentaje, bonoExcelencia);
            e4.mostrarDatos();

        }
    }
