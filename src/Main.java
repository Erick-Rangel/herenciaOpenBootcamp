public class Main{
    public static void main(String[] args){
         Cliente cliente = new Cliente();
         cliente.credito = 10000;
         cliente.edad = 31;
         cliente.telefono ="520510205603";
         cliente.nombre = "Erick";
        System.out.println(cliente);

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 31;
        trabajador.nombre = "Erick";
        trabajador.salario = 1500;
        trabajador.telefono = "52515060230";
        System.out.println(trabajador);
    }

}

class Persona{
    int edad;
    String nombre;
    String telefono;
}

class Cliente extends Persona {

    int credito;
    public String toString() {

        return "Cliente: " + nombre + " " + edad + " " + telefono + " " + credito;
    }
}


class Trabajador extends Persona{

    int salario;
    public String toString() {
        return "Trabajador: " + nombre + " " + edad + " " + telefono + " " + salario;
    }
}

