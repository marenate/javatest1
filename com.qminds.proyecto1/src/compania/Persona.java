package compania;

public class Persona {
    protected String nombre;
    protected String apellido;
    protected String fech_nac;
    protected String direccion;
    protected String telefono;
    protected Integer ingreso;
    protected double impuestoGeneral;

  public Persona(String nombre, String apellido, String fech_nac, String direccion, String telefono){
      this.nombre= nombre;
      this.apellido=apellido;
      this.fech_nac=fech_nac;
      this.direccion=direccion;
      this.telefono=telefono;
  }
    public Persona(String nombre, String direccion, String telefono){
        this.nombre= nombre;
        this.direccion=direccion;
        this.telefono=telefono;
    }

    public Persona() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setFech_nac(String _fech_nac){
        fech_nac=_fech_nac;
    }
    public String getFech_nac(){
        return fech_nac;
    }

    public void setDireccion(String _direccion){
        direccion=_direccion;
    }

    public  String getDireccion(){
        return direccion;
    }

    public void setApellido(String _apellido){
        apellido=_apellido;
    }

    public String getApellido (){
        return apellido;
    }
    public void setTelefono(String _telefono){
        telefono=_telefono;
    }

    public String getTelefono(){
        return telefono;
    }

    public void mostrarDatos(){
        System.out.println("Los Datos completos de persona es: ");
        System.out.println("Nombre: "+this.nombre+ "\nApellido: "+this.apellido+"\nFecha Nacimiento: "+this.fech_nac+"\nDireccion: "+this.direccion+"" +
                "\nTelefono: "+this.direccion);

    }

    public void datosParaCalcularRenta(Integer ingreso, double impuestoGeneral){
        this.ingreso=ingreso;
        this.impuestoGeneral= impuestoGeneral;

        
    }
    public double impuesto(){
        System.out.println("Impuesto calculado para la persona es: ");

        return +ingreso*impuestoGeneral;
    }


}
