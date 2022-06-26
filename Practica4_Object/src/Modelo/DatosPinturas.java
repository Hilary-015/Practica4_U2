
package Modelo;

/**
 *
 * @author Hilary Madeley Calva Camacho
 */
public class DatosPinturas {
    private String color;
    private String tipoP;
    private String marcaPintura;
    private Double precio;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoP() {
        return tipoP;
    }

    public void setTipoP(String tipoP) {
        this.tipoP = tipoP;
    }
    
    public String getMarcaPintura() {
        return marcaPintura;
    }

    public void setMarcaPintura(String marcaPintura) {
        this.marcaPintura = marcaPintura;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public DatosPinturas(String color, String tipo, String marca, Double precio) {
        this.color = color;
        this.tipoP = tipo;
        this.marcaPintura = marca;
        this.precio = precio;
    }

    public DatosPinturas() {
    }

    @Override
    public String toString() {
        return "DatosPinturas{" + "color=" + color + ", tipo=" + tipoP + ", marca=" + marcaPintura + ", precio=" + precio + '}';
    }

}
