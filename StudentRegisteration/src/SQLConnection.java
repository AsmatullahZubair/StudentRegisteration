
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class SQLConnection {
    private SQLConnection() {}
    static Connection con= null;
    public static Connection makeConnection() 
    {
	if(con==null) {
            try {
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3308/uni_db","root","Asmat");
                    System.out.println("Connection Established!");
            }
            catch (SQLException e) {
            	System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null, "Connection not successfull!"+e.getMessage());
                    }
		}
	return con;
    }
}