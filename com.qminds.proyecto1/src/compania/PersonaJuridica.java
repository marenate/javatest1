package compania;

public class PersonaJuridica extends Persona{
    String ruc;
    String estado;

    public PersonaJuridica(String nombre, String direccion, String telefono, String ruc, String estado) {
        super(nombre, direccion, telefono);
        this.ruc = ruc;
        this.estado=estado;
    }
}
