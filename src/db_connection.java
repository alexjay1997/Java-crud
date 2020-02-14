import java.sql.*;
import java.sql.Connection;

/**
 *
 * @author Fauni
 */
public class db_connection {
    
    public static void main (String [] args){

    }    
        public Connection get_connection(){
        
            Connection myConn=null;
        
        try{
            
            /// Get a connection to database
            
         myConn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root" , "");
            
            if (myConn != null) {
            System.out.println("Connection working");
        } else {
            System.out.println("Failed to make connection!");
        }
            
        
        
            }
        
        catch  (Exception exc){
             
                System.out.println("Failed to make connection!");
            
               }
        return myConn;
    
        }

    static PreparedStatement prepareStatement(String select__From_users_WHERE_username___AND_p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
