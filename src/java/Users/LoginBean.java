package Users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginBean {

   private String iduser = "";
   private String pass = "";
   
   private static final String CONTROLADOR = "com.mysql.jdbc.Driver";
   private static final String PATH = "jdbc:mysql://localhost:3306/BaseLogin";
   private static final String USER = "root";
   private static final String PASS = "admin";

    public boolean validateUser(String userName, String password) {
        String sql = "SELECT * FROM User WHERE nombre = '"+userName+" ' and pass = '"+password+"'; ";
        try {
            Statement s;
            ResultSet rs;
            Connection con = null;
            Class.forName(CONTROLADOR);
            con = DriverManager.getConnection(PATH,USER,PASS);
            s = con.createStatement();
            rs = s.executeQuery(sql);
            while(rs.next()){
              iduser = rs.getString("nombre");
              pass = rs.getString("pass");    
            }
            con.close();
        } catch (SQLException e) {
            System.err.println("Error SQL al intentar conectar con la base de datos");
            e.printStackTrace();
        } catch (ClassNotFoundException ee) {
            System.err.println("No se pudo cargar la clase " + ee);
        }
        if(iduser.compareTo(userName) == 0){
            if(pass.compareTo(password) == 0){
                return true;
            }            
        }
        return false;
    }
}