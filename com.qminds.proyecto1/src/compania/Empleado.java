package compania;

public class Empleado extends PersonaNatural{
    double salario_basico ;
    String codigo_empleado;
    float rentaEmpleado;

    public Empleado(String nombre, String apellido, String fech_nac, String direccion, String telefono, String dni, Integer edad, char sexo, String estado_civil,
                    double salario_basico, String codigo_empleado) {
        super(nombre, apellido, fech_nac, direccion, telefono, dni, sexo, estado_civil);
        this.salario_basico = salario_basico;
        this.codigo_empleado = codigo_empleado;
    }

    public Empleado() {

    }

    public void mostrarDatosEmpleado(){
        System.out.println("Este es un metdodo de la clase empleado que hereda de la clase PersonaNatural y ésta hereda de la clase Peronsa\n");
        System.out.println("Los datos del empleado es:");
        System.out.println("Nobre: "+ getNombre()+"\nAppellido: "+ getApellido()+"\nFecha Nac: "+getFech_nac()+"\nDireccion: "+getDireccion()+
                "\nTelefono: "+ getTelefono()+"\nDNI: "+getDni()+"\nSexo: "+getSexo()+"\nEstado civil: "+getEstado_civil()+"\nCon Salario: "+salario_basico);
    }

    public String getCodigo_empleado() {
        return codigo_empleado;
    }

    public void setCodigo_empleado(String codigo_empleado) {
        this.codigo_empleado = codigo_empleado;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Los datos del empleado: 'empleado del mes'!!!!!!");
        System.out.println("Sophia Tamara Cardena");
        System.out.println("Felicidades disfrute un dia de Vacaciones\n");;
    }

    public void datosParaCalcularRentaEmpleado(Integer salario_basico, float rentaEmpleado){
        this.salario_basico=salario_basico;
        this.rentaEmpleado=rentaEmpleado;

    }
    @Override
    public double impuesto(){
        float impuesto = (float) (salario_basico - rentaEmpleado)/100;
        System.out.println("Impuesto calculado para la persona es: ");

        return impuesto;
    }
}
