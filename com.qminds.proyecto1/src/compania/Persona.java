package compania;

import java.security.PublicKey;

public class Persona {
    private String nombre;
    private String apellido;
    private String fech_nac;
    private String direccion;
    private String telefono;

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




}
