import java.util.*;

public class Inmueble {

    //-- PROPIEDADES --
    int codigo;
    String calle;
    String municipio;
    double metrosCuadrados;
    double importe;
    
    static List<Inmueble> listaAgenciaInmobiliaria = new ArrayList<>();
    
    //-- CONSTRUCTORES --
    public Inmueble (int nuevoCodigo, String nuevaCalle, String nuevoMunicipio, double nuevosMetros, double nuevoImporte) {
        codigo = nuevoCodigo;
        calle = nuevaCalle;
        municipio = nuevoMunicipio;
        metrosCuadrados = nuevosMetros;
        importe = nuevoImporte;
    }
    
    //-- ACCIONES -- 
    
        static {
            listaAgenciaInmobiliaria.add(new Inmueble(12, "Serrano", "Madrid", 80, 320000));
            listaAgenciaInmobiliaria.add(new Inmueble(21, "Calasparra", "Madrid", 78, 240000));
            listaAgenciaInmobiliaria.add(new Inmueble(14, "La Rambla", "Barcelona", 82, 350000));
        }
        
        public static void addInmueble() {
            int codigo;
            String calle;
            String municipio;
            double metrosCuadrados;
            double importe;
            
            
            //Indicamos que opcion ha elegido y pedimos que introduzca los siguientes datos para dar de alta el inmueble.
            System.out.println("Ha seleccionado la opcion 1. Introduzca los siguientes datos:");
            Scanner recibido = new Scanner(System.in);
            
            System.out.println("Introduzca el codigo del inmueble:");
            codigo = recibido.nextInt();
            
            //Esto esto para que no se quede oillado el programa despues de pedir un int.
            recibido.nextLine();
            
            System.out.println("Introduzca la calle del inmueble:");
            calle = recibido.nextLine();
            
            System.out.println("Introduzca el municipio del inmueble:");
            municipio = recibido.nextLine();
            
            System.out.println("Introduzca los metros cuadrados del inmueble:");
            metrosCuadrados = recibido.nextDouble();
            recibido.nextLine();
            
            System.out.println("Introduzca el importe del inmueble:");
            importe = recibido.nextDouble();
            recibido.nextLine();
            
            //Metemos los datos recibidos en el inmueble.
            listaAgenciaInmobiliaria.add(new Inmueble (codigo, calle, municipio, metrosCuadrados, importe));
            
            //Dejamos un comprobante para que vea que su inmueble se ha dado de alta correctamente
            System.out.println("Su Inmueble con Codigo: " + codigo + " - Calle: " + calle + " - Municipio:" + municipio + " - Metros Cuadraos: " + metrosCuadrados + " - Importe: " + importe + ". Se ha dado de alta correctamente.");         
        }
        
        public static void bajaInmueble(int codigoRecibido) {
            
            if (listaAgenciaInmobiliaria.isEmpty()) {
                System.out.println("La lista de inmuebles esta vacia.");
                return;
            }
            // Buscar el inmueble por su codigo
            Inmueble inmuebleAEliminar = null;
            for (Inmueble inmueble : listaAgenciaInmobiliaria) {
                if (inmueble.getCodigo() == codigoRecibido) {
                    inmuebleAEliminar = inmueble;
                // Se encontro el inmueble, salir del bucle
                break;  
                }
            }
                
            if (inmuebleAEliminar != null) {
                // Eliminar el inmueble de la lista
                listaAgenciaInmobiliaria.remove(inmuebleAEliminar);
                System.out.println("Inmueble eliminado de la lista.");
            } else {
                System.out.println("Inmueble no encontrado para eliminar.");
            }
        }
        
        public static void editarInmueble() {
            String calle;
            String municipio;
            double metrosCuadrados;
            double importe;

            //Pedimos que introduzca el codigo del inmueble que desea editar.
            Scanner recibido = new Scanner(System.in);
            System.out.println("Introduzca el codigo del inmueble que desea editar:");
            int codigo = recibido.nextInt();
            recibido.nextLine();
            
            // Buscamos el inmueble por su codigo.
            Inmueble inmuebleAEditar = null;
            for (Inmueble inmueble : listaAgenciaInmobiliaria) {
                if (inmueble.getCodigo() == codigo) {
                    inmuebleAEditar = inmueble;
                    // Si encontro el inmueble, salir del bucle.
                    break;  
                }
            }
            // Verificamos si se encontro el inmueble.
            if (inmuebleAEditar != null) {
            //Pedimos los nuevos datos.
            System.out.println("Introduzca el nuevo codigo del inmueble:");
            codigo = recibido.nextInt();    
            recibido.nextLine();
                
            System.out.println("Introduzca la nueva calle del inmueble:");
            calle = recibido.nextLine();
            
            System.out.println("Introduzca el nuevo municipio del inmueble:");
            municipio = recibido.nextLine();
            
            System.out.println("Introduzca los nuevos metros cuadrados del inmueble:");
            metrosCuadrados = recibido.nextDouble();
            recibido.nextLine();
            
            System.out.println("Introduzca el nuevo importe del inmueble:");
            importe = recibido.nextDouble();
            recibido.nextLine();
            
            //Sustituimos los datos recibidos por los antiguos.
            inmuebleAEditar.setCodigo(codigo);
            inmuebleAEditar.setCalle(calle);
            inmuebleAEditar.setMunicipio(municipio);
            inmuebleAEditar.setMetrosCuadrados(metrosCuadrados);
            inmuebleAEditar.setImporte(importe);
            
            //Dejamos un comprobante para que vea que su inmueble se ha editado correctamente
            System.out.println("Su Inmueble con Codigo: " + codigo + " - Calle: " + calle + " - Municipio:" + municipio + " - Metros Cuadraos: " + metrosCuadrados + " - Importe: " + importe + ". Ha sido editado correctamente.");         
            }
        }
        
        public static void disminuirImporte() {
            double importe;
            
            //Pedimos que introduzca el codigo del inmueble que desea disminuir el precio.
            Scanner recibido = new Scanner(System.in);
            System.out.println("Introduzca el codigo del inmueble que desea disminuir el importe:");
            int codigo = recibido.nextInt();
            recibido.nextLine();
            
            // Buscamos el inmueble por su codigo.
            Inmueble inmuebleAEditar = null;
            for (Inmueble inmueble : listaAgenciaInmobiliaria) {
                if (inmueble.getCodigo() == codigo) {
                    inmuebleAEditar = inmueble;
                    // Si encontro el inmueble, salir del bucle.
                    break;  
                }            
            }
            
            
            if (inmuebleAEditar != null) {
                
                System.out.println("Introduzca el importe disminuido del inmueble:");
                importe = recibido.nextDouble();
                recibido.nextLine();
                
                inmuebleAEditar.setImporte(importe);
                
                 //Dejamos un comprobante para que vea que su inmueble ha disminuido el precio correctamente
                System.out.println("Su Inmueble con Codigo: " + codigo + ". Ha reducido su importe a: " + importe + " correctamente.");
            }
        }
        
        public static void aumentarImporte() {
            double importe;
            
            //Pedimos que introduzca el codigo del inmueble que desea aumenmtar el precio.
            Scanner recibido = new Scanner(System.in);
            System.out.println("Introduzca el codigo del inmueble que desea disminuir el importe:");
            int codigo = recibido.nextInt();
            recibido.nextLine();
            
            // Buscamos el inmueble por su codigo.
            Inmueble inmuebleAEditar = null;
            for (Inmueble inmueble : listaAgenciaInmobiliaria) {
                if (inmueble.getCodigo() == codigo) {
                    inmuebleAEditar = inmueble;
                    // Si encontro el inmueble, salir del bucle.
                    break;  
                }            
            }
            
            
            if (inmuebleAEditar != null) {
                
                System.out.println("Introduzca el importe aumentado del inmueble:");
                importe = recibido.nextDouble();
                recibido.nextLine();
                
                inmuebleAEditar.setImporte(importe);
                
                 //Dejamos un comprobante para que vea que su inmueble ha aumentado el precio correctamente
                System.out.println("Su Inmueble con Codigo: " + codigo + ". Ha aumentado su importe a: " + importe + " correctamente.");
            }
        }
        
        public static List<Inmueble> buscarPorMunicipio(List<Inmueble> inmuebles, String municipio) {
            List<Inmueble> resultados = new ArrayList<>();
            for (Inmueble inmueble : inmuebles) {
                if (inmueble.getMunicipio().equalsIgnoreCase(municipio)) {
                    resultados.add(inmueble);
                }
            }
            return resultados;
        }
        
        public static List<Inmueble> buscarPorMetrosCuadrados(List<Inmueble> inmuebles, double minMetros, double maxMetros) {
            List<Inmueble> resultados = new ArrayList<>();
            for (Inmueble inmueble : inmuebles) {
                if (inmueble.getMetrosCuadrados() >= minMetros && inmueble.getMetrosCuadrados() <= maxMetros) {
                    resultados.add(inmueble);
                }
            }
            return resultados;
        }
        
        public static List<Inmueble> buscarPorCodigo(List<Inmueble> inmuebles, int codigo) {
            List<Inmueble> resultados = new ArrayList<>();
            for (Inmueble inmueble : inmuebles) {
                if (inmueble.getCodigo() == codigo) {
                    resultados.add(inmueble);
                }
            }
            return resultados;
        }
        
        static void printResults(List<Inmueble> resultados) {
            for (Inmueble inmueble : resultados) {
                System.out.println(inmueble);
            }
        }
           
        public String toString() {
            return "Inmueble{" +
                "municipio='" + municipio + '\'' +
                ", metrosCuadrados=" + metrosCuadrados +
                ", codigo=" + codigo +
                ", calle=" + calle +
                ", importe=" + importe +

                '}';
            }
        
        //getters y setters
        
        public int getCodigo() {
            return codigo;
        }
            public void setCodigo(int codigo) {
            this.codigo = codigo;
            }
        public String getCalle() {
            return calle;
        }
            public void setCalle(String calle) {
            this.calle = calle;
            }
        public String getMunicipio() {
            return municipio;
        }
            public void setMunicipio(String municipio) {
            this.municipio = municipio;
            }
        public double getMetrosCuadrados() {
            return metrosCuadrados;
        }
            public void setMetrosCuadrados(double metrosCuadrados) {
            this.metrosCuadrados = metrosCuadrados;
            }
        public double getImporte() {
            return importe;
        }
            public void setImporte(double importe) {
            this.importe = importe;
            }
    
   
    
}
