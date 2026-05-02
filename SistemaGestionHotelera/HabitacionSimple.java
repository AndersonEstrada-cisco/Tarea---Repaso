public class HabitacionSimple extends Habitacion {
    private boolean desayunoIncluido;
    private double costoBasico;

    public HabitacionSimple(
            String codigo,
            String tipoHabitacion,
            int numeroNoches,
            boolean disponible,
            boolean desayunoIncluido,
            double costoBasico
    ) {
        super(codigo, tipoHabitacion, 35.0, numeroNoches, disponible);
        this.desayunoIncluido = desayunoIncluido;
        this.costoBasico = costoBasico;

    }

    @Override
    public double calcularHospedaje() {
        double subtotal = getTarifaBase() * getNumeroNoches();
        double descuento = 0;

        if (getNumeroNoches() > 5) {
            descuento = subtotal * 0.10;
        }

        double recargo = 0;
        double base = subtotal - descuento + recargo;
        double iva = base * 0.15;

        return base + iva;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("\n===== DETALLE DE HOSPEDAJE =====");

        System.out.println(" Tipo de habitación: " + getTipoHabitacion());
        System.out.println(" Número de noches: " + getNumeroNoches());
        System.out.println(" Tarifa base: $" + getTarifaBase());

        System.out.println(" Total a pagar: $" + calcularHospedaje());

        System.out.println(" ================================");
    }

}
