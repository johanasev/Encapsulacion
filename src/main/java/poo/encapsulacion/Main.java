package poo.encapsulacion;

public class Main {

    public static void main(String[] args) {

        Persona persona1 = new Persona();

        persona1.setNombre("Johana");
        persona1.setEdad(30);
        persona1.setTelefono(3219012);
        System.out.println("\n La priemra persona se llama "+persona1.getNombre()+" tiene "+persona1.getEdad()+" años de edad y su número de teléfono es "+persona1.getTelefono());

        Persona persona2 = new Persona();

        persona2.setNombre("Juan");
        persona2.setEdad(24);
        persona2.setTelefono(7892356);
        System.out.println("\n La sesgunda persona se llama "+persona2.getNombre()+" tiene "+persona2.getEdad()+" años de edad y su número de teléfono es "+persona2.getTelefono());
    }
}
