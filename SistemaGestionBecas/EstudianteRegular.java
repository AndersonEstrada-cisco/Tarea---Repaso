public class EstudianteRegular extends Estudiante{
    private int numeroMaterias;

    public EstudianteRegular(String codigo, String nombre, double promedio, double valorMatricula, int numeroMaterias){
        super(codigo, nombre, promedio, valorMatricula);
        setNumeroMaterias(numeroMaterias);
    }

    public void setNumeroMaterias(int numeroMaterias){
        if(numeroMaterias>0){
            this.numeroMaterias = numeroMaterias;
        } else {
            System.out.println("\n ** Debe haber materias ");
        }
    }

    @Override
    public double calcularPagoFinal(){
        double pagoRegular = getValorMatricula() + (numeroMaterias*10);
        return pagoRegular;
    }
}
