package Vista.Tablas;

import Controlador.TDA_Lista.ListaEnlazadaServices;
import Modelo.DatosPinturas;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Hilary Calva
 */
public class TablaPinturas extends AbstractTableModel {

    ListaEnlazadaServices<DatosPinturas> listaPinturas = new ListaEnlazadaServices<>();

    public ListaEnlazadaServices<DatosPinturas> getListaPinturas() {
        return listaPinturas;
    }

    public void setListaPinturas(ListaEnlazadaServices<DatosPinturas> listaPinturas) {
        this.listaPinturas = listaPinturas;
    }
    
    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public int getRowCount() {
        return listaPinturas.getSize();
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Marca";
            case 1:
                return "Color";
            case 2:
                return "Tipo";
            case 3:
                return "Precio";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int arg0, int arg1)  {
        DatosPinturas pintura = listaPinturas.obtenerDato(arg0);
        switch (arg1) {
            case 0:
                return pintura.getMarca();
            case 1:
                return pintura.getColor();
            case 2:
                return pintura.getTipo();
            case 3:
                return pintura.getPrecio();
            default:
                return null;
        }
    }
}
