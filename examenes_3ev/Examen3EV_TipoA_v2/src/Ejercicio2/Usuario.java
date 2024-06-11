package Ejercicio2;

public class Usuario {
    private int idUsuario;
    private String nombre;
    private String clave;

    public Usuario(int idUsuario, String nombre, String clave) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.clave = clave;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", nombre='" + nombre + '\'' +
                ", clave='" + clave + '\'' +
                '}';
    }
}
