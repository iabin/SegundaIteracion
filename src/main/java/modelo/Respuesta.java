package modelo;
// Generated 20/03/2018 02:44:30 PM by Hibernate Tools 4.3.1



/**
 * Respuesta generated by hbm2java
 */
public class Respuesta  implements java.io.Serializable {


     private int idrespuesta;
     private Pregunta pregunta;
     private Usuario usuario;
     private String contenido;

    public Respuesta() {
    }

    public Respuesta(int idrespuesta, Pregunta pregunta, Usuario usuario, String contenido) {
       this.idrespuesta = idrespuesta;
       this.pregunta = pregunta;
       this.usuario = usuario;
       this.contenido = contenido;
    }
   
    public int getIdrespuesta() {
        return this.idrespuesta;
    }
    
    public void setIdrespuesta(int idrespuesta) {
        this.idrespuesta = idrespuesta;
    }
    public Pregunta getPregunta() {
        return this.pregunta;
    }
    
    public void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getContenido() {
        return this.contenido;
    }
    
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }




}

