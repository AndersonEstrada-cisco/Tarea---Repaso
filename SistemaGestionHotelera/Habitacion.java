abstract class Habitacion {
    private String codigo;
    private String tipoHabitacion;
    private double tarifaBase;
    private int numeroNoches;
    private boolean disponible;

    public Habitacion(String codigo, String tipoHabitacion, double tarifaBase, int numeroNoches, boolean disponible){
        this.codigo = codigo;
        this.tipoHabitacion = tipoHabitacion;
        setTarifaBase(tarifaBase);
        setNumeroNoches(numeroNoches);
        setDisponible(disponible);

    }

    public abstract double calcularHospedaje();

    public abstract void mostrarDetalle();


    public void setNumeroNoches(int numeroNoches){
        if(numeroNoches>0){
            this.numeroNoches = numeroNoches;
        } else {
            throw new IllegalArgumentException("Numero de noches no válidos");
        }
    }

    public void setTarifaBase(double tarifaBase){
        if(tarifaBase>0){
            this.tarifaBase = tarifaBase;
        } else {
            throw new IllegalArgumentException("Tarifa no valida");
        }
    }

    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }

    public boolean verificarDisponibilidad(){
        if(disponible){
            return disponible;
        } else {
            throw new IllegalStateException(" Habitacion No disponible ");
        }
    }


    public int getNumeroNoches(){
        return numeroNoches;
    }

    public double getTarifaBase(){
        return tarifaBase;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }
}
