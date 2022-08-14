public class App {
    public static void main( String args[] ){
        Cliente cliente = new Cliente();
        cliente.setEdad(34);
        cliente.setNombre("Victor Achocalla");
        cliente.setTelefono("+59178613777");
        cliente.setCredito( 100000000.99);

        System.out.println("Cliente");
        System.out.println("Edad: " + cliente.getEdad() );
        System.out.println("Nombre: " + cliente.getNombre() );
        System.out.println("Telefono: " + cliente.getTelefono() );
        System.out.println("Credito: " + cliente.getCredito() );


        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(34);
        trabajador.setNombre("Victor Romero");
        trabajador.setTelefono("+59178613776");
        trabajador.setSalario( 990000000.99);

        System.out.println("Trabajador");
        System.out.println("Edad: " + trabajador.getEdad() );
        System.out.println("Nombre: " + trabajador.getNombre() );
        System.out.println("Telefono: " + trabajador.getTelefono() );
        System.out.println("Credito: " + trabajador.getSalario() );

    }
}
