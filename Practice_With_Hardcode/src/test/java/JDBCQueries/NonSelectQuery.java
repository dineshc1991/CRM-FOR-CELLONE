package JDBCQueries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class NonSelectQuery {

	public static void main(String[] args) throws Throwable {

		//Step:01 Load/register database
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		
		//Step:02 create connection to database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
		
		//Step:03 create statement
		Statement stat = con.createStatement();
		String query="insert into student_info (regno,fname,lname,address)values('25','Vasanth','&','Co'),('26','Hello','&','hello');";
		
		//Step:04 execute statement
		int upd = stat.executeUpdate(query);
		if(upd==2) {
			System.out.println("user is created");
		}else {
			System.out.println("user is not created");
		}
		System.out.println(upd);
		
		//Step:05 close connection
		con.close();
	}

}
