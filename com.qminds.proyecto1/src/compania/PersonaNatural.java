package compania;

public class PersonaNatural extends Persona{
    private String dni;
    private char sexo;
    private String estado_civil;


    public PersonaNatural(String nombre, String apellido, String fech_nac, String direccion, String telefono, String dni,  char sexo, String estado_civil){
        super(nombre, apellido, fech_nac, direccion, telefono);
        this.dni=dni;
        this.sexo=sexo;
        this.estado_civil=estado_civil;

    }
    public PersonaNatural(){

    }

    @Override
    public void mostrarDatos(){
        System.out.println("Nombre PersonaNatural");
        System.out.println("Nombre Completo: Marena Venancino Chuquibal\n");

    }
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }


}
