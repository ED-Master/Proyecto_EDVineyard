package EDMaster.Proyecto.Entidades;


public class Perfil{
    //Atributos para la clase. El atributo user debemos saber cómo implementarlo
    private String id, imagen, telefono; 
    

    //Constructor para la clase
    public Perfil(String id, String imagen, String telefono) {
        this.id = id;
        this.imagen = imagen;
        this.telefono = telefono;
    }

    //Getters y setters para la clase
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getimagen() {
        return imagen;
    }
    public void setimagen(String imagen) {
        this.imagen = imagen;
    }
    public String gettelefono() {
        return telefono;
    }
    public void settelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Perfil = [id=" + id + ", imagen=" + imagen + ", telefono=" + telefono + "]";
    }
    
    

    //Aún no he creado el "createdAt" ni "updatedAt", no sé si son métodos o atributos
    
}