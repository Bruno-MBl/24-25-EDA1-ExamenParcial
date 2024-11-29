public class Lista {
    private Nodo primero;

    public void insertarPersona(Persona persona) {
        if (primero==null){
            primero=new Nodo(persona);
            return;
        }
        Nodo siguiente=primero;
        while (siguiente.getSiguiente()!=null) {
            siguiente=siguiente.getSiguiente();
        }
        siguiente.setSiguiente(new Nodo(persona));
    }

    public void imprimir(){
        Nodo siguiente=primero;
        while (siguiente!=null) {
            System.out.println("Nombre: "+siguiente.getPersona().getNombre()+" |Dni: "+siguiente.getPersona().getDni());
            siguiente=siguiente.getSiguiente();
        }
    }

    public void imprimirReferencias(){
        Nodo siguiente=primero;
        while (siguiente!=null) {
            System.out.println("Nombre: "+siguiente.getPersona().getNombre()+" |Referencia: "+siguiente.getPersona());
            siguiente=siguiente.getSiguiente();
        }
    }
}
