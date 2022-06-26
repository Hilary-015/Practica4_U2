package Controlador.PinturaController;

import Controlador.TDA_Lista.ListaEnlazadaServices;
import Controlador.TDA_Lista.TipoOrdenacion;
import Modelo.DatosPinturas;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hilary Madeley Calva Camacho
 */
public class PinturaController {

    DatosPinturas pinturaPrueba = new DatosPinturas();
    ListaEnlazadaServices<DatosPinturas> listaPinturas = new ListaEnlazadaServices<>();
    DatosPinturas[] cuentaDC = new DatosPinturas[10000];

    public DatosPinturas[] getCuentaDC() {
        return cuentaDC;
    }

    public void setCuentaDC(DatosPinturas[] cuentaDC) {
        this.cuentaDC = cuentaDC;
    }

    public DatosPinturas getPinturaPrueba() {
        return pinturaPrueba;
    }

    public void setPinturaPrueba(DatosPinturas pinturaPrueba) {
        this.pinturaPrueba = pinturaPrueba;
    }

    public ListaEnlazadaServices<DatosPinturas> getListaPinturas() {
        return listaPinturas;
    }

    public void setListaPinturas(ListaEnlazadaServices<DatosPinturas> listaPinturas) {
        this.listaPinturas = listaPinturas;
    }

    public PinturaController() {
    }

    public String[] marca(){
        String[] marcasAleatorias = new String[10000];
        
        String[] marcas = {"Unidas", "Condor", "Pintuco", "Pintulac", "Sherwin Williams", "Evans", "Vencedor"};
        for (int i = 0; i < 10000; i++) {
            marcasAleatorias[i] = marcas [(int)(Math.floor(Math.random()*((marcas.length-1)-0+1)))];
        }
        return marcasAleatorias;
    }
    
    public String[] color(){
        String[] coloresAleatorios = new String[10000];
        
        String[] colores = {"Azul", "Blanco", "Rosa", "Rosa pastel", "Celeste", "Naranja", "Amarillo", "Terracota", "Verde", "Verde limon", "Negro", 
            "Gris", "Gris frio", "Blanco hueso", "Golden", "Oliva fresca", "Purpura solido", "Azul atlantico", "Turquesa", "Azul violeta", "Violeta", "Gris calido"};
        for (int i = 0; i < 10000; i++) {
            coloresAleatorios[i] = colores [(int)(Math.floor(Math.random()*((colores.length-1)-0+1)))];
        }
        return coloresAleatorios;
    }
    
    public String[] tipo(){
        String[] tiposAleatorios = new String[10000];
        
        String[] tipo = {"Interiores", "Exteriores"};
        for (int i = 0; i < 10000; i++) {
            tiposAleatorios[i] = tipo [(int)(Math.floor(Math.random()*((tipo.length-1)-0+1)))];
        }
        return tiposAleatorios;
    }
    
    public double precio() {
        double minValor = 15.0;
        double maxValor = 40.0;
        double precio = (Math.random() * (maxValor- minValor)+5);
        return Math.round(precio * 100.0) / 100.0;
    }

    public ListaEnlazadaServices<DatosPinturas> guardarLista() {
        DatosPinturas cuenta;
        for (int i = 0; i < 10000; i++) {
            cuenta = (new DatosPinturas(color()[i], tipo()[i], marca()[i], precio()));
            listaPinturas.insertarAlInicio(cuenta);
            setListaPinturas(listaPinturas);
        }
        return getListaPinturas();
    }

    public void ordenarShell(String atributo, TipoOrdenacion ordenacion){
        try {  
            getListaPinturas().getLista().ordenarShell(atributo, ordenacion);
        } catch (Exception ex) {
            Logger.getLogger(PinturaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void ordenarQuickShort(String atributo, TipoOrdenacion ordenacion){
        try {  
            getListaPinturas().getLista().ordenarQuickShort(atributo, ordenacion);
        } catch (Exception ex) {
            Logger.getLogger(PinturaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
