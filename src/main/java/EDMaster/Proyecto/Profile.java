package EDMaster.Proyecto;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;

public class Profile{
    //Atributos para la clase. El atributo user debemos saber cómo implementarlo
    private String id, image, phone; 
    private User user;

    //Constructor para la clase
    public Profile(String id, String image, String phone) {
        this.id = id;
        this.image = image;
        this.phone = phone;
    }

    //Getters y setters para la clase
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    //Aún no he creado el "createdAt" ni "updatedAt", no sé si son métodos o atributos
    
}