package Database_connectivity;
/*
    1.first step importing the package
        import java.sql.*;
    2.load and regiter the driver
        load ===> com.mysql.jdbc.Driver
        register ===> Class.forName("com.mysql.jdbc.Driver")
         
    3.establish the connection
        Connection
        Connection con=DriverManager.getConnection(url, user, password);
    4.create the statment
        *statment
        *prepared statment
        *callable statment
            Statment st=con.createStatement();
    5.execute the query
        select *from student
    6.process the result
        Result rs=st.executeQuery("select *from student");

    7.close

*/
import java.sql.*;
public class DatabaseMysqlConnection {
   
   public static void main(String []args)
	{
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/test?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");  
			//here sonoo is database name, root is username and password  
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from emp");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			con.close();  
			}catch(Exception e){ System.out.println(e);}  
    }
}
