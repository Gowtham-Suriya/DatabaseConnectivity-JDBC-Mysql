package Database_connectivity;
import java.sql.*;
//prepared statement
public class DatabasePreparedStatement {
    public static void main(String[] args) throws Exception
    {
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
                            "jdbc:mysql://localhost:3306/gowtham","root","root");  
            PreparedStatement st=con.prepareStatement("insert into student values(default,?,?,?)");  
            st.setString(1,"anand");
            st.setString(2, "Anand123@gmail.com");
            st.setInt(3,421);

            int rs=st.executeUpdate();
            if(rs==1){
            System.out.println("updated");
            }
            else
            {
                System.out.println("Not updated Try again");
            }
            

            con.close();
            
}
}
