package compania;

public class PersonaJuridica extends Persona{
    String ruc;
    String estado;
    Integer ingreso;

    public PersonaJuridica(String nombre, String direccion, String telefono, String ruc, String estado) {
        super(nombre, direccion, telefono);
        this.ruc = ruc;
        this.estado=estado;
    }
    public PersonaJuridica() {
    }

    public void mostrarDatosPersonaJuridica(){
        System.out.println("Este es un metdodo de la clase PersonaJuridica que hereda de la clase persona\n");
        System.out.println("Los Datos de la persona Juridica: ");
        System.out.println("Nombre: "+getNombre() +"\nDireccion: "+getDireccion() +"\nTelefono"+getTelefono()+"\nRuc: "+ruc+"\nEstado: "+estado+"\n");
    }

    @Override
    public void mostrarDatos(){
        System.out.println("\nNobre PersonaJuridica es:");
        System.out.println("AZ Global IT Services\n");
    }

    public void datosParaCalcularRentaPersonaJuridica(Integer ingreso){
        this.ingreso=ingreso;

    }
    @Override
    public double impuesto(){
        System.out.println("Impuesto calculado para la persona Juridica es: ");

        return ingreso*0.001;
    }
}
