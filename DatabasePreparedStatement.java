package Database_connectivity;
import java.sql.*;
//prepared statement
public class DatabasePreparedStatement {
    public static void main(String[] args) throws Exception
    {
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
                            "jdbc:mysql://localhost:3306/gowtham","root","root");  
            PreparedStatement st=con.prepareStatement("insert into student values(default,?,?,?)");  //prepared statments
            st.setString(1,"Gowtham");
            st.setString(2, "gowthamsuriyad@gmail.com");
            st.setInt(3,421);

            int rs=st.executeUpdate();
            if(rs==1){                          //check whether the given statment is connected
            System.out.println("updated");
            }
            else
            {
                System.out.println("Not updated Try again");
            }
            

            con.close();
            
}
}
