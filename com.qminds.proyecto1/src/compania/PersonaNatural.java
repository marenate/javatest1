package compania;

public abstract class PersonaNatural extends Persona {
    private final String dni = "410910999";
    private final char sexo = 'f';

    protected PersonaNatural(String nombre, String apellido, String fech_nac, String direccion, String telefono) {
        super(nombre, apellido, fech_nac, direccion, telefono);
    }

    @Override
    public void ingreso() {
    }

    public String getDni() {
        return dni;
    }

    public char getSexo() {
        return sexo;
    }

}
