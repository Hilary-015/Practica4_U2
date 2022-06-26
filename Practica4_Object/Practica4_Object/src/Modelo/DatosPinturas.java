
package Modelo;

/**
 *
 * @author Hilary Madeley Calva Camacho
 */
public class DatosPinturas {
    private String color;
    private String tipo;
    private String marca;
    private Double precio;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public DatosPinturas(String color, String tipo, String marca, Double precio) {
        this.color = color;
        this.tipo = tipo;
        this.marca = marca;
        this.precio = precio;
    }

    public DatosPinturas() {
    }

    @Override
    public String toString() {
        return "DatosPinturas{" + "color=" + color + ", tipo=" + tipo + ", marca=" + marca + ", precio=" + precio + '}';
    }

}
