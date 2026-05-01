public class RegularConRecargo extends EstudianteRegular{

    private double recargoPendiente;

    public RegularConRecargo(String codigo, String nombre, double promedio, double valorMatricula, int numeroMaterias , double recargoPendiente){
        super(codigo, nombre, promedio, valorMatricula, numeroMaterias);
        setRecargoPendiente(recargoPendiente);
    }

    public void setRecargoPendiente(double recargoPendiente){
        if (recargoPendiente>0){
            this.recargoPendiente = recargoPendiente;
        } else {
            System.out.println("\n ** Recargo no válido ");
        }
    }

    @Override
    public double calcularPagoFinal(){
        double pagoRecargo = super.calcularPagoFinal();
        return pagoRecargo + recargoPendiente;
    }
}

