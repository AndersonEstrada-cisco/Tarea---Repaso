public class Estudiante {
    private String codigo;
    private String nombre;
    private double promedio;
    private double valorMatricula;

    public Estudiante(String codigo, String nombre, double promedio, double valorMatricula){
        setCodigo(codigo);
        setNombre(nombre);
        setPromedio(promedio);
        setValorMatricula(valorMatricula);
    }

    public void setCodigo(String codigo){
        if(codigo != null && !codigo.trim().isEmpty()){
            this.codigo = codigo;
        } else {
            System.out.printf(" ** El codigo no es valido ");
        }
    }

    public void setNombre(String nombre){
        if(nombre != null && !nombre.trim().isEmpty()){
            this.nombre = nombre;
        }
    }

    public boolean validarPromedio(double promedio){
        if(promedio >= 0 && promedio <=10){
            return true;
        } else {
            return false;
        }
    }

    public void setPromedio(double promedio) {
        if (validarPromedio(promedio) == true){
            this.promedio = promedio;
        } else {
            System.out.println(" ** Promedio fuera de rango ");
        }
    }

    public void setValorMatricula(double valorMatricula){
        if (valorMatricula>0){
            this.valorMatricula = valorMatricula;
        }
    }

    public void mostrarDatos(){
        System.out.println("\n ---- Estudiante ---");
        System.out.println(" Codigo: " + codigo);
        System.out.println(" Nommbre: " + nombre);
        System.out.println(" Promedio: " + promedio);
        System.out.println(" Matrícula:  $" + valorMatricula);
        System.out.println(" Pago Final: $" + calcularPagoFinal());
    }

    public double calcularPagoFinal(){
        return 0;
    }

    public double getValorMatricula(){
        return valorMatricula;
    }


}
