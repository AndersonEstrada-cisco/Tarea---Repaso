public class Docente extends PersonaAcademica{
    private int horasClase;
    private double valorHora;

    public Docente(String codigo, String nombre, int edad, int horasClase, double valorHora) {
        super(codigo, nombre, edad);
        setHorasClase(horasClase);
        if (valorHora > 0) {
            this.valorHora = valorHora;
        }
    }

    public void setHorasClase(int horas) {
        if (horas >= 1 && horas <= 40) {
            this.horasClase = horas;
        }
    }

    public int getHorasClase() {
        return horasClase;
    }

    @Override
    public double calcularPago() {
        return horasClase * valorHora;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(" Horas de clase: " + horasClase);
        System.out.println(" Valor por hora: " + valorHora);
    }

    @Override
    public void describirRol() {
        System.out.println(" Rol: Docente.");
    }
}
