package JDBCQueries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.cj.jdbc.Driver;

public class SelectQuery {

	public static void main(String[] args) throws Throwable {

		//Step:01  Register/Load database
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		
		//Step:02 get connection to database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
		
		//Step:03 Create Sql statement
		Statement stat = con.createStatement();
		String query="select * from student_info;";
		
		//Step:04 execute sql statement
		ResultSet res = stat.executeQuery(query);
		
		while(res.next())
		{
			System.out.println(res.getInt(1)+"\t"+res.getString(2)+"\t"+res.getString(3)+"\t"+res.getString(4));
		}
		
		//Step:05 Close the Connection
		con.close();
		
		
		
		
	}

}
