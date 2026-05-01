import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print(" Código: ");
        String codigo = sc.nextLine();

        System.out.print(" Nombre: ");
        String nombre = sc.nextLine();

        System.out.print(" Edad: ");
        int edad = sc.nextInt();

        System.out.print(" Horas de clase: ");
        int horas = sc.nextInt();

        System.out.print(" Valor por hora: ");
        double valor = sc.nextDouble();

        System.out.print(" Publicaciones: ");
        int publicaciones = sc.nextInt();

        PersonaAcademica docenteInvestigador = new DocenteInvestigador(codigo, nombre, edad, horas, valor, publicaciones);
        docenteInvestigador.mostrarDatos();

        docenteInvestigador.describirRol();
        System.out.println(" Pago final: $" + docenteInvestigador.calcularPago());
    }
}
