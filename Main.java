/**
 * Main class of the Java program.
 */
import java.util.*;

public class Main {
    
    //Implementamos la lista de inmuebles:
    private static List<Inmueble> listaAgenciaInmobiliaria = new ArrayList<>();
    
    public static void main(String[] args) {
        
        //Creamos tres objetos Inmueble:
        listaAgenciaInmobiliaria.add(new Inmueble(12, "Serrano", "Madrid", 80, 320000));
        listaAgenciaInmobiliaria.add(new Inmueble(21, "Calasparra", "Madrid", 78, 240000));
        listaAgenciaInmobiliaria.add(new Inmueble(14, "La Rambla", "Barcelona", 82, 350000));

        do {
            //Hacemos un looping para preguntar que desea hacer:
            System.out.println(" Elija la opcion que desea ejecutar:");
            System.out.println("1. Alta inmueble");
            System.out.println("2. Baja inmueble");
            System.out.println("3. Editar inmueble");
            System.out.println("4. Disminuir importe inmueble");
            System.out.println("5. Aumentar importe inmueble");
            System.out.println("6. Busqueda de un inmueble determinado:");
            System.out.println("    a. Busqueda por municipio");
            System.out.println("    b. Busqueda por metros cuadrados");
            System.out.println("    c. Busqueda por codigo de inmueble");
            System.out.println("7. Salir");
            
            //Preguntamos por un numero para saber la opcion que quieren:
            Scanner numero = new Scanner(System.in);
            int seleccion = numero.nextInt();
            
            //Depende de la seleccion saldra una cosa u otra:
            if (seleccion == 1){ //Le pediremos los datos del inmueble:
                Inmueble.addInmueble();
                System.out.println("1. Volver a mostrar el menu");
                System.out.println("2. No volver a mostrar el menu");
                Scanner empezar = new Scanner(System.in);
                int respuesta = numero.nextInt();
                if (respuesta == 1) {
                    continue;
                }
                else if (respuesta == 2) {
                    System.out.println("Saliendo...");
                    break; 
                }
                else {
                    System.out.println("No era una respuesta asi que volveremos a mostrar el menu.");
                }
            }
            else if (seleccion == 2){
                //Indicamos que opcion ha elegido y pedimos que introduzca los siguientes datos para dar de baja el inmueble.
                System.out.println("Ha seleccionado la opcion 2. Introduzca el codigo del inmueble que desea eliminar:");
                Scanner recibido = new Scanner(System.in);
                int codigoBorrar = recibido.nextInt();
                recibido.nextLine();
                Inmueble.bajaInmueble(codigoBorrar);
                System.out.println("1. Volver a mostrar el menu");
                System.out.println("2. No volver a mostrar el menu");
                Scanner empezar = new Scanner(System.in);
                int respuesta = numero.nextInt();
                numero.nextLine();
                if (respuesta == 1) {
                   continue;
                }
                else if (respuesta == 2) {
                    System.out.println("Saliendo...");
                    break; 
                }
                else {
                    System.out.println("No era una respuesta asi que volveremos a mostrar el menu.");
                }
            }
            else if (seleccion == 3){
                //Indicamos que opcion ha elegido y pedimos que introduzca los siguientes datos para modificar el inmueble.
                System.out.println("Ha seleccionado la opcion 3.");
                Inmueble.editarInmueble();
                System.out.println("1. Volver a mostrar el menu");
                System.out.println("2. No volver a mostrar el menu");
                Scanner empezar = new Scanner(System.in);
                int respuesta = numero.nextInt();
                numero.nextLine();
                if (respuesta == 1) {
                    continue;
                }
                else if (respuesta == 2) {
                    System.out.println("Saliendo...");
                    break; 
                }
                else {
                    System.out.println("No era una respuesta asi que volveremos a mostrar el menu.");
                }
            }
            else if (seleccion == 4){
                System.out.println("Ha seleccionado la opcion 4.");
                Inmueble.disminuirImporte();
                System.out.println("1. Volver a mostrar el menu");
                System.out.println("2. No volver a mostrar el menu");
                Scanner empezar = new Scanner(System.in);
                int respuesta = numero.nextInt();
                numero.nextLine();
                if (respuesta == 1) {
                    continue;
                }
                else if (respuesta == 2) {
                    System.out.println("Saliendo...");
                    break; 
                }
                else {
                    System.out.println("No era una respuesta asi que volveremos a mostrar el menu.");
                }
            }
            else if (seleccion == 5){
                System.out.println("Ha seleccionado la opcion 5.");
                Inmueble.aumentarImporte();
                System.out.println("1. Volver a mostrar el menu");
                System.out.println("2. No volver a mostrar el menu");
                Scanner empezar = new Scanner(System.in);
                int respuesta = numero.nextInt();
                numero.nextLine();
                if (respuesta == 1) {
                    continue;
                }
                else if (respuesta == 2) {
                    System.out.println("Saliendo...");
                    break; 
                }
                else {
                    System.out.println("No era una respuesta asi que volveremos a mostrar el menu.");
                }
            }
            else if (seleccion == 10){
                for(Inmueble inmueble : listaAgenciaInmobiliaria){
                    System.out.println(inmueble);
                }
                
            }
            else if (seleccion == 6){
                System.out.println("Ha seleccionado la opcion 6. Elija ahora la opcion de busqueda que desea ejecutar:");
                System.out.println("    a. Busqueda por municipio");
                System.out.println("    b. Busqueda por metros cuadrados");
                System.out.println("    c. Busqueda por codigo de inmueble");
                Scanner letra = new Scanner(System.in);
                String opcion = letra.nextLine();
                if (opcion.equals("a")) {
                    Scanner recibido = new Scanner(System.in);
                    System.out.println("Introduzca el municipio de los inmuebles que desea buscar:");
                String municipio = recibido.nextLine();
                List<Inmueble> porMunicipio = AgenciaInmobiliaria.buscarPorMunicipio(municipio);
                if (!porMunicipio.isEmpty()) {
                        System.out.println("Inmueble(s) encontrado(s) con el municipio " + municipio + ":");
                        Inmueble.printResults(porMunicipio);
                    } 
                else {
                    System.out.println("No se encontraron inmuebles con el municipio " + municipio);
                }
                }
                else if (opcion.equals("b")) {
                    Scanner recibido = new Scanner(System.in);
                    System.out.println("Introduzca el minimo de metros cuadrados de los inmuebles que desea buscar:");
                    double minMetros = recibido.nextDouble();
                    recibido.nextLine();
                    System.out.println("Introduzca el maximo de metros cuadrados de los inmuebles que desea buscar:");
                    double maxMetros = recibido.nextDouble();
                    recibido.nextLine();
                    List<Inmueble> porMetros = AgenciaInmobiliaria.buscarPorMetrosCuadrados(minMetros, maxMetros);
                    if (!porMetros.isEmpty()) {
                        System.out.println("Inmueble(s) encontrado(s) con los metros cuadrados entre: " + minMetros + " y " + maxMetros + ":");
                        Inmueble.printResults(porMetros);
                    } 
                    else {
                        System.out.println("No se encontraron inmuebles con los metros cuadrados entre: " + minMetros + " y " + maxMetros + ":");
                    }
                }
                else if (opcion.equals("c")) {
                    Scanner recibido = new Scanner(System.in);
                    System.out.println("Introduzca el codigo de los inmuebles que desea buscar:");
                    int codigo = recibido.nextInt();
                    recibido.nextLine();
                    List<Inmueble> porCodigo = AgenciaInmobiliaria.buscarPorCodigo(codigo);
                    if (!porCodigo.isEmpty()) {
                        System.out.println("Inmueble(s) encontrado(s) con el codigo " + codigo + ":");
                        Inmueble.printResults(porCodigo);
                    } 
                    else {
                        System.out.println("No se encontraron inmuebles con el codigo " + codigo);
                    }
                
                }
                else {
                    System.out.println("ERROR 404.");
                }
                
                System.out.println("1. Volver a mostrar el menu");
                System.out.println("2. No volver a mostrar el menu");
                Scanner empezar = new Scanner(System.in);
                int respuesta = numero.nextInt();
                numero.nextLine();
                if (respuesta == 1) {
                    continue;
                }
                else if (respuesta == 2) {
                    System.out.println("Saliendo...");
                    break; 
                }
                else {
                    System.out.println("No era una respuesta asi que volveremos a mostrar el menu.");
                }
            }
            else if (seleccion == 7){
                System.out.println("Saliendo...");
                break;
            }
            else {
                System.out.println("El numero elegido no es una opcion. Vuelva a intentarlo");
            }
            } while (true);
    }
}
