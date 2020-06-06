
package Database_connectivity;
import java.sql.*;//1
public class GettingNameFromDatabaseUsingRoll {

	public static void main(String []args) throws Exception 
	{
		StudentDAO dao=new StudentDAO();
		Student s1=dao.getStudent(12);
		System.out.print(s1.name);
		
		 
}
}

class StudentDAO
{
	public Student getStudent(int rollno)
	{
		Student s=new Student();
		s.rollno=rollno; 
		try{  
        Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection(  
    			"jdbc:mysql://localhost:3306/gowtham","root","root"); 
        Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from student where rollno="+rollno+";");
		rs.next();
		String name=rs.getString(2);
		s.name=name;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return s;
		
	}
}
 
class Student
{
	int rollno;
	String name;
}