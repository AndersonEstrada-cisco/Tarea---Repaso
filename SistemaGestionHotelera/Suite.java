public class Suite extends Habitacion {

    private boolean jacuzzi;
    private double servicioPremium;

    public Suite(String codigo, String tipoHabitacion, int numeroNoches, boolean disponible,
                 boolean jacuzzi, double servicioPremium) {

        super(codigo, tipoHabitacion, 80.0, numeroNoches, disponible);
        this.jacuzzi = jacuzzi;
        this.servicioPremium = servicioPremium;
    }

    @Override
    public double calcularHospedaje() {

        double subtotal = getTarifaBase() * getNumeroNoches();

        double descuento = 0;
        double recargo = 0;

        if (getNumeroNoches() > 5) {
            descuento = subtotal * 0.10;
        }


        // RECARGO DEL JACUZZI
        if (jacuzzi == true) {
            recargo = recargo + (20 * getNumeroNoches());
        }

        recargo = recargo + servicioPremium;

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

        System.out.println(" Jacuzzi: " + jacuzzi);
        System.out.println(" Servicio Premium: $" + servicioPremium);
        System.out.println(" Total a pagar: $" + calcularHospedaje());

        System.out.println("===================================");
    }
}