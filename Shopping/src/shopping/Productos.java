
package shopping;

/**
 *
 * @author 56978
 */
public class Productos {
    private String codigo;
    private String titulo;
    private String descripcion;
    private double precio;
    
    
    public Productos(String codigo, String titulo, String descripcion, double precio){
    
        this.codigo = codigo;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.precio = precio;
       
    }
    public String getCodigo(){
        return codigo;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public double getPrecio(){
        return precio;
    }
}
