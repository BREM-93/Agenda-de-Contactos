package agendatelefonica;

import java.util.Scanner;

public class AgendaTelefonica {


    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int opcion;
        int telefono;
        String nombre;
        Contacto contacto;
        int tamañoAgenda;
        

        Agenda agendaTelefonica = new Agenda();
        
        do{
            System.out.println("\n\t************** Agenda Telefonica ***********");
            System.out.println("");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Eliminar un contacto");
            System.out.println("4. Listar contactos");
            System.out.println("5. Comprobar si aun se pueden agregar contactos");
            System.out.println("6. Vaciar agenda");
            System.out.println("Digite una opcion porfavor");
            opcion = teclado.nextInt();
            
            
            switch(opcion){
                //Agregar contacto
                case 1:
                    System.out.println("\nDigite su nombre");
                    nombre = teclado.next();
                    System.out.println("Digite su telefono.");
                    telefono = teclado.nextInt();
                    
                    contacto = new Contacto(nombre, telefono);
                    agendaTelefonica.añadirContacto(contacto);
                    System.out.println("");
                    break;
   
                    
                //Buscar contactos
                case 2:
                    System.out.println("\nDigite un nombre: ");
                    nombre = teclado.next();
                    agendaTelefonica.Buscar(nombre);
                    System.out.println("");
                    break;
                    
                    
                //Eliminar un contacto
                case 3: 
                    System.out.println("Digite su nombre: ");
                    nombre = teclado.next();
                    
                    contacto = new Contacto(nombre);
                    agendaTelefonica.Eliminar(contacto);
                    System.out.println("");
                    break;
                    
                //Listar Contactos
                case 4: 
                    agendaTelefonica.listaContactos();
                    System.out.println("");
                    break;
                
                //Comprobar agenda llena
                case 5:
                    if(agendaTelefonica.AgendaLlena()){
                        System.out.println("La agenda esta llena.");
                    }
                    else{
                        System.out.println("\nAun puedes registrar contactos.");
                    }
                    System.out.println("");
                    break;
                
                    
                // Vaciar lista de contactos    
                case 6:
                     System.out.println("\n¿Está seguro que desea vaciar la lista de contactos? (Si/No)");
                     String confirmacion = teclado.next();

                if (confirmacion.equalsIgnoreCase("Si")) {
                     agendaTelefonica.vaciarContactos();
                     System.out.println("\nLa lista de contactos ha sido vaciada con éxito.");
                    } 
                    else {
                    System.out.println("\nOperación cancelada. La lista de contactos no ha sido modificada.");
                    }
                    break;
 
                    
                default:
                    System.out.println("\nOpcion no valida.");
                    System.out.println("");
                    break;
            }    
        }
        while(opcion !=7);
    }  
}
