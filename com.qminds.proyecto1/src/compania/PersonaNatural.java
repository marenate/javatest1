package compania;

public class PersonaNatural extends Persona{
    String dni;
    char sexo;
    String estado_civil;

    public PersonaNatural(String nombre, String apellido, String fech_nac, String direccion, String telefono, String dni,  char sexo, String estado_civil){
        super(nombre, apellido, fech_nac, direccion, telefono);
        this.dni=dni;
        this.sexo=sexo;
        this.estado_civil=estado_civil;

    }
}
