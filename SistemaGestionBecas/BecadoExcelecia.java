public class BecadoExcelencia extends EstudianteBecado{
    private double bonoExcelencia;

    public BecadoExcelencia(String codigo, String nombre, double promedio,
                            double valorMatricula, int porcentajeBeca,
                            double bonoExcelencia) {

        super(codigo, nombre, promedio, valorMatricula, porcentajeBeca);
        this.bonoExcelencia = bonoExcelencia;
    }

    public double getBonoExcelencia(){
        return bonoExcelencia;
    }

    @Override
    public double calcularPagoFinal() {
        double pagoBeca = super.calcularPagoFinal();

        if (bonoExcelencia>pagoBeca){
            return 0;
        } else {
            return pagoBeca - bonoExcelencia;
        }
    }

}
