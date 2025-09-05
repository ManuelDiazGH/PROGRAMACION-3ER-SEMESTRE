public class Producto {
    private String codigo;
    private String descripcion;

    public Producto(String codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        return codigo.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Producto)) return false;
        Producto otro = (Producto) obj;
        return this.codigo.equals(otro.codigo);
    }

    @Override
    public String toString() {
        return "codigo: " + codigo + " descripcion del producto: " + descripcion;
    }
}
