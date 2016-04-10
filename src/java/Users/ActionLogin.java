package Users;

public class ActionLogin extends org.apache.struts.action.ActionForm {
        
        private String nombre;
        private String password;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }                   
}
