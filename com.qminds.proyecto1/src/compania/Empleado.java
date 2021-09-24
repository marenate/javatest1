package compania;

public class Empleado extends PersonaNatural implements IngresoMensual {
    double salario_basico;
    String codigo_empleado;
    String dni;
    Integer edad;
    char sexo;

    public Empleado(String nombre, String apellido, String fech_nac, String direccion, String telefono, String dni, Integer edad, char sexo,
                    double salario_basico, String codigo_empleado) {
        super(nombre, apellido, fech_nac, direccion, telefono);
        this.salario_basico = salario_basico;
        this.codigo_empleado = codigo_empleado;
        this.dni = dni;
        this.edad = edad;
        this.sexo = sexo;

    }

    @Override
    public void ingreso() {
        System.out.println("El Salario basico de la persona es :" + salario_basico);
    }

    public String getCodigo_empleado() {
        return codigo_empleado;
    }

    public void setCodigo_empleado(String codigo_empleado) {
        this.codigo_empleado = codigo_empleado;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("\nLos datos del empleado: 'empleado del mes'!!!!!!");
        System.out.println("Nobre: " + super.getNombre() + ", Appellido: " + super.getApellido() + ", Fecha Nac: " + super.getFech_nac() + ", Direccion: " + super.getDireccion() +
                ", Telefono: " + super.getTelefono() + ", DNI: " + super.getDni() + ", Sexo: " + super.getSexo() + ", Con Salario: " + salario_basico);

    }


    @Override
    public void calculoIngresoMensual() {
        System.out.println("\nEl calculo de ingreso mensual de la persona es: ");
        double seguro = 0.18;
        double descuentoSeguro = salario_basico - salario_basico * seguro;
        System.out.println("Salario básico: " + salario_basico + " - " + " Descuento Seguro: " + seguro + " x Salario básico: " + salario_basico + " = " + descuentoSeguro);
    }
}
