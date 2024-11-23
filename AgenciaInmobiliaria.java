import java.util.*;

public class AgenciaInmobiliaria {
    
        public static List<Inmueble> listaAgenciaInmobiliaria = Inmueble.listaAgenciaInmobiliaria;

    public static List<Inmueble> buscarPorMunicipio(String municipio) {
        return Inmueble.buscarPorMunicipio(listaAgenciaInmobiliaria, municipio);
    }

    public static List<Inmueble> buscarPorMetrosCuadrados(double minMetros, double maxMetros) {
        return Inmueble.buscarPorMetrosCuadrados(listaAgenciaInmobiliaria, minMetros, maxMetros);
    }

    public static List<Inmueble> buscarPorCodigo(int codigo) {
        return Inmueble.buscarPorCodigo(listaAgenciaInmobiliaria, codigo);
    }
}