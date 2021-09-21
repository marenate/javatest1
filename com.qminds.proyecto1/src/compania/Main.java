package compania;

public class Main {
    public static void main(String [] args){
        PersonaJuridica personaJuridica= new PersonaJuridica("Gobal", "Ramon Castilla 301", "620-6549874",
                "20600347891", "Activo");
        System.out.println("Los datos de la empresa es: "+ personaJuridica.getNombre());
    }
    public void datosEmpresa(){
        PersonaJuridica personaJuridica= new PersonaJuridica("Gobal", "Ramon Castilla 301", "620-6549874",
                "20600347891", "Activo");

    }

    public void datosEmpleado(){
        Empleado empleado= new Empleado("Carlos", "Zapata", "19 Feb", "Calle Francisco 169", "987458749",
                "41051225", 25,  'f', "soltero", 200);

    }
}
