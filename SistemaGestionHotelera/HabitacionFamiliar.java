public class HabitacionFamiliar extends Habitacion {

    private int capacidadPersonas;
    private double descuentoFamiliar;

    public HabitacionFamiliar(String codigo, String tipoHabitacion, int numeroNoches, boolean disponible,
                              int capacidadPersonas, double descuentoFamiliar) {

        super(codigo, tipoHabitacion, 60.0, numeroNoches, disponible);
        this.capacidadPersonas = capacidadPersonas;
        this.descuentoFamiliar = descuentoFamiliar;
    }

    @Override
    public double calcularHospedaje() {

        double subtotal = getTarifaBase() * getNumeroNoches();

        double descuento = 0;
        double recargo = 0;

        if (getNumeroNoches() > 5) {
            descuento = subtotal * 0.10;
        }

        // DESCUENTO FAMILIAR
        descuento = descuento + (subtotal * descuentoFamiliar);

        double base = subtotal - descuento + recargo;

        double iva = base * 0.15;

        double total = base + iva;

        return total;
    }

    @Override
    public void mostrarDetalle() {

        System.out.println("====== DETALLE DE HOSPEDAJE ======");

        System.out.println(" Tipo de habitación: " + getTipoHabitacion());
        System.out.println(" Numero de Noches: " + getNumeroNoches());
        System.out.println(" Tarifa base: $" + getTarifaBase());

        System.out.println(" Capacidad de personas: " + capacidadPersonas);
        System.out.println(" Descuento familiar: " + (descuentoFamiliar * 100) + "%");

        System.out.println(" Total a pagar: $" + calcularHospedaje());

        System.out.println("===================================");
    }
}