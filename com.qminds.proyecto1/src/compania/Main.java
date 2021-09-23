package compania;

public class Main {
    public static void main(String[] args) {
        //Herencia y sobrecarga de metodos
        PersonaJuridica personaJuridica = new PersonaJuridica("Gobal", "Ramon Castilla 301", "620-6549874",
                "20600347891", "Activo");
        personaJuridica.mostrarDatosPersonaJuridica();

        Empleado empleado = new Empleado("Carlos", "Zapata", "19 Feb", "Calle Francisco 169", "987458749",
                "41051225", 25, 'f', "soltero", 200, "ABC123");
        empleado.mostrarDatosEmpleado();

        // Esta parte es sobrescritura del metodo mostrar
        personaJuridica.mostrarDatos();
        PersonaNatural personaNatural = new PersonaNatural();
        personaNatural.mostrarDatos();
        empleado.mostrarDatos();

        // Polimorfismo

        /*
        El arreglo que estas creando es de tipo Persona y al momento de utilizas los métodos lo que regresan son un void
        no un tipo de dato persona. Como por ejemplo:

        public void datosParaCalcularRenta(Integer ingreso, double impuestoGeneral) {
            this.ingreso = ingreso;
            this.impuestoGeneral = impuestoGeneral;
        }

        Sin embargo, es posible usarlo como lo utilizas siempre y cuando regreses un tipo de dato Persona. Por ejemplo:

        public Persona datosParaCalcularRenta(Integer ingreso, double impuestoGeneral) {
            {.. Aquí iría tu implementación ..}
            return this; // el primer objeto de tipo persona podemos regresar el mismo objeto con this.
        }

        * */
        Persona persona[] = new Persona[4];
        persona[0] = new Persona();
        persona[1] = new PersonaNatural();
        persona[2] = new PersonaJuridica();
        persona[3] = new Empleado();

        persona[0].datosParaCalcularRenta(100, 10);
        persona[1].datosParaCalcularRentaPersona(500, 1, 10);
        persona[2].datosParaCalcularRentaPersonaJuridica(1000);
        persona[3].datosParaCalcularRentaEmpleado(500, 400);


        for (Persona datosPersonas : persona) {
            System.out.println("Imprimiendo impuestos" + datosPersonas.impuesto());
        }
    }

}
