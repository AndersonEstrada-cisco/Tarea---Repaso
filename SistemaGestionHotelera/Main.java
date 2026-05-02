import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== SISTEMA DE GESTION HOTELERA =====");

        System.out.print(" Número de noches: ");
        int noches = sc.nextInt();
        sc.nextLine();

        System.out.print(" Tipo de habitación (simple / suite / familiar): ");
        String tipo = sc.nextLine().toLowerCase();

        System.out.print(" Disponible (true/false): ");
        boolean disponible = sc.nextBoolean();
        sc.nextLine();

        if (!disponible) {
            System.out.println(" La habitacion no esta disponible");
            return;
        }


        if (tipo.equals("simple")) {

            HabitacionSimple simple = new HabitacionSimple(
                    "S001",
                    "Simple",
                    noches,
                    disponible,
                    true,
                    //Costo báscio
                    5.0
            );

            simple.mostrarDetalle();


        } else if (tipo.equals("suite")) {

            System.out.print("Jacuzzi (true/false): ");
            boolean jacuzzi = sc.nextBoolean();

            HabitacionSimple aux = null; // solo para evitar error de buffer si lo expandes

            Suite suite = new Suite(
                    "SU.01",
                    "Suite",
                    noches,
                    disponible,
                    jacuzzi,
                    30.0       // servicio premium fijo
            );

            suite.mostrarDetalle();


        } else if (tipo.equals("familiar")) {

            System.out.print(" Capacidad de personas: ");
            int personas = sc.nextInt();

            HabitacionFamiliar familiar = new HabitacionFamiliar(
                    "F001",
                    "Familiar",
                    noches,
                    disponible,
                    personas,
                    0.10       // descuento fijo
            );

            familiar.mostrarDetalle();

        } else {
            System.out.println(" Tipo de habitación inválido");
        }
    }
}