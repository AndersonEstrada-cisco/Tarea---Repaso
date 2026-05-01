public class DocenteInvestigador extends Docente {
    private int publicaciones;

    public DocenteInvestigador(String codigo, String nombre, int edad,
                               int horasClase, double valorHora, int publicaciones) {
        super(codigo, nombre, edad, horasClase, valorHora);
        if (publicaciones >= 0) {
            this.publicaciones = publicaciones;
        }
    }

  

    @Override
    public double calcularPago() {
        double pagoBase = super.calcularPago();
        double bono = publicaciones * 20;
        return pagoBase + bono;
    }
  

    // Sobrecarga
    public double calcularPago(double bonoExtra) {
        return calcularPago() + bonoExtra;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(" Publicaciones: " + publicaciones);
    }
  
    @Override
    public void describirRol() {
        System.out.println(" Rol: Docente investigador con producción académica.");
    }
}
