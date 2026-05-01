public class PersonaAcademica {
    private String codigo;
    private String nombre;
    private int edad;

    public PersonaAcademica(String codigo, String nombre, int edad) {
        setCodigo(codigo);
        setNombre(nombre);
        setEdad(edad);
    }

    public void setCodigo(String codigo) {
        if (codigo != null && !codigo.isEmpty()) {
            this.codigo = codigo;
        }
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
        }
    }

    public void setEdad(int edad) {
        if (edad >= 18) {
            this.edad = edad;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void mostrarDatos() {
        System.out.println(" \n ----------------------- ");
        System.out.println(" Código: " + codigo);
        System.out.println(" Nombre: " + nombre);
        System.out.println(" Edad: " + edad);
    }

    public void describirRol() {
        System.out.println(" Rol: Persona académica.");
    }

    public double calcularPago() {
        return 0;
    }
}
