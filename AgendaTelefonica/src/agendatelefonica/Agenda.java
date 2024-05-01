package agendatelefonica;

public class Agenda {
    
    private Contacto contactos[];

    //Tamaño de la agenda
    public Agenda() {
        contactos = new Contacto[10];
    }
    
    //Sobrecargamos el constructor y definimos el tamaño de la agenda
    public Agenda(int tamaño){
        contactos = new Contacto[tamaño];
    }
    
    //Metodo para agregar contactos
    public void añadirContacto(Contacto contacto){
        boolean registrado = false;
        boolean nombreExistente = false;

        if(AgendaLlena()){
            System.out.println("\nLa agenda esta llena");
        }

    for(int i = 0; i < contactos.length && !registrado; i++){
        if(contactos[i] == null){
            contactos[i] = contacto;
            registrado = true; // Aquí se registra el contacto
        }
        else if(contactos[i].getNombre().equals(contacto.getNombre())) {
            nombreExistente = true;
        }
        else if(AgendaLlena()){
            System.out.println("\nLa agenda esta llena");
        }
    }

    if(nombreExistente){
        System.out.println("\nSe agrego un contacto con el mismo nombre '" + contacto.getNombre() + "'.");
    }

    if(registrado){
        System.out.println("\nEl contacto se ha registrado con éxito.");
    }
}
    
    //Metodo para validar si hay contactos
    public boolean Comprobar(Contacto contacto){
        for(int i=0;i<contactos.length;i++){
            if(contactos[i]!= null && contactos[i].equals(contacto)){
                return true;
            }
        }
        return false;
    }
    
    //Metodo para validar si la agenda esta llena.
    public boolean AgendaLlena(){
        for(int i=0;i<contactos.length;i++){
            if(contactos[i] == null){
                return false;
            }
        }
        return true;
    }
    
    //Metodo para listar los contactos
    public void listaContactos(){
        if(comprobarContactos() == contactos.length){
            System.out.println("\nNo hay contactos para listar");
        }
        else{
            for(int i=0;i<contactos.length;i++){
                if(contactos[i] !=null){
                    System.out.println("Nombre: " + contactos[i].getNombre());
                    System.out.println("\nTelefono: " + contactos[i].getTelefono());
                }
            }
        }
    }
    
    
    //Metodo para comprobar espacios libres en el arreglo.
    public int comprobarContactos(){
        int contadorVacios = 0;
        for(int i=0;i<contactos.length;i++){
            if(contactos[i] == null){
                contadorVacios ++;
            }
        }
        return contadorVacios;
    }
    
    
    //Metodo para buscar un contacto por nombre
    public void Buscar(String nombre){
        boolean encontrado = false;
        for(int i=0;i<contactos.length && !encontrado; i++){
            if(contactos[i] !=null && contactos[i].getNombre().trim().equalsIgnoreCase(nombre.trim())){
                System.out.println("\nContacto encontrado, su telefono es : " + contactos[i].getTelefono());
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("\nNo se ha encontrado el contacto.");
        }
    }
    
    
    //Metodo para eliminar contactos
    public void Eliminar(Contacto contacto){
        boolean eliminado = false;
        for(int i=0;i<contactos.length && !eliminado;i++){
            if(contactos[i] !=null && contactos[i].equals(contacto)){
                contactos[i] = null;
                eliminado = true;
            }
        }
        if(eliminado == true){
            System.out.println("\nEl contacto ha sido eliminado");
        }
        else{
            System.out.println("\nEl contacto no se ha eliminado.");
        }
    }
    
    
    //Metodo para vaciar contactos
    public void vaciarContactos() {
        for (int i = 0; i < contactos.length; i++) {
             contactos[i] = null;
        }
        System.out.println("\nLa lista de contactos ha sido vaciada.");
    }
    
    
    /*public void modificarContacto(String nombreAnterior, String nuevoNombre, String nuevoTelefono) {
    boolean encontrado = false;

    for (int i = 0; i < contactos.length; i++) {
        if (contactos[i] != null && contactos[i].getNombre().equals(nombreAnterior)) {
            encontrado = true;
            // Modificar el nombre si se proporciona uno nuevo
            if (nuevoNombre != null && !nuevoNombre.isEmpty()) {
                contactos[i].setNombre(nuevoNombre);
                System.out.println("Nombre del contacto modificado a: " + nuevoNombre);
            }
            // Modificar el teléfono si se proporciona uno nuevo
            if (nuevoTelefono != null && !nuevoTelefono.isEmpty()) {
                contactos[i].setTelefono(nuevoTelefono);
                System.out.println("Teléfono del contacto modificado a: " + nuevoTelefono);
            }
        }
    }

    if (!encontrado) {
        System.out.println("No se encontró un contacto con el nombre especificado.");
    }
}*/
   
}
