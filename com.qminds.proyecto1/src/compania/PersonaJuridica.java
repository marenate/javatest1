package compania;

public class PersonaJuridica extends Persona implements IngresoMensual {
    String ruc;
    String estado;

    public PersonaJuridica(String nombre, String direccion, String telefono, String ruc, String estado) {
        super(nombre, direccion, telefono);
        this.ruc = ruc;
        this.estado = estado;
    }

    public void ingreso() {
        System.out.println("El ingreso de la persona Juridica será segun el año fiscal.");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("\nDatos Persona Juridica es: ");
        System.out.println("Nombre: " + getNombre() + ", Direccion: " + getDireccion() + ", Telefono: " + getTelefono() + ", Ruc: " + this.ruc + ", Estado: " + this.estado);

    }

    public void calculoIngresoMensual() {
        System.out.println("\nEl calculo de ingreso mensual de persona Juridica es:");
        double ventas = 1000.00;
        double gastos = 300.00;
        double utilidad = ventas - gastos;
        System.out.println("Ventas: " + ventas + " - " + " Gastos: " + gastos + " = " + utilidad);
    }


}
