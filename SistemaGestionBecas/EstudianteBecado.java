public class EstudianteBecado extends Estudiante {
  private int porcentajeBeca;

    public EstudianteBecado(String codigo, String nombre, double promedio, double valorMatricula, int porcentajeBeca){
        super(codigo, nombre, promedio, valorMatricula);
        setPorcentajeBeca(porcentajeBeca);
    }

    public void setPorcentajeBeca(int porcentajeBeca){
        if(porcentajeBeca>0 && porcentajeBeca<=100){
            this.porcentajeBeca = porcentajeBeca;
        }else {
            System.out.println(" ** PORCENTAJE INVALIDO");
        }
    }

    public int getPorcentajeBeca() {
        return porcentajeBeca;
    }

    @Override
    public double calcularPagoFinal(){
        double pagoBeca = getValorMatricula() - (getValorMatricula()*(getPorcentajeBeca()/100.0));
        return pagoBeca;
    }
}
