package compania;

public class Main {
    public static void main(String[] args) {

        PersonaJuridica personaJuridica = new PersonaJuridica("Gobal", "Ramon Castilla 301", "620-6549874",
                "20600347891", "Activo");
        personaJuridica.mostrarDatos();
        personaJuridica.ingreso();
        personaJuridica.calculoIngresoMensual();

        Empleado empleado = new Empleado("Carlos", "Zapata", "19 Feb", "Calle Francisco 169", "987458749",
                "41051225", 25, 'm', 2000, "ABC123");
        empleado.mostrarDatos();
        empleado.ingreso();
        empleado.calculoIngresoMensual();
    }
}
