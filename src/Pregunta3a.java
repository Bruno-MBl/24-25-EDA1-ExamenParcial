public class Pregunta3a{
    public static void main(String[] args) {
        Persona manuel = new Persona("Manuel", "1233");
        Persona copia = new Persona(manuel);
        Persona referencia = manuel;
        
        Lista lista = new Lista();
        lista.insertarPersona(manuel);
        lista.insertarPersona(copia);
        lista.insertarPersona(referencia);
        System.out.println("Ejercicio 3A");
        lista.imprimirReferencias();
        System.out.println("Ejercicio 3B");
        lista.imprimir();
        System.out.println("Cambio el nombre de la variable manuel");
        manuel.setNombre("Manuel Antonio");
        lista.imprimir();
        System.out.println("Cambio el nombre de la variable referencia");
        referencia.setNombre("Antonio");
        lista.imprimir();
        System.out.println("Cambio el nombre de la variable copia");
        copia.setNombre("Miguel");
        lista.imprimir();
    }
}