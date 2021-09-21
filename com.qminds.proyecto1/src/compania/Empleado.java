package compania;

import java.util.Date;

public class Empleado extends PersonaNatural{
    double salario_basico ;
    Date fecha_ingreso;

    public Empleado(String nombre, String apellido, String fech_nac, String direccion, String telefono, String dni, Integer edad, char sexo, String estado_civil, double salario_basico) {
        super(nombre, apellido, fech_nac, direccion, telefono, dni, sexo, estado_civil);
        this.salario_basico = salario_basico;
    }
}
