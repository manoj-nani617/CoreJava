package com.techouts;

import com.sun.security.jgss.GSSUtil;

import java.sql.*;

public class JdbcConnectivity {
    static void display(Connection con, Statement s) {
        try (ResultSet rs = s.executeQuery("select * from employees order by emp_id")) {
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();
            for(int i = 1; i < columnCount; i++)
                System.out.print(rsmd.getColumnName(i)+"\t");
            System.out.println();
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getDouble(4) + "\t");
            }
        }
        catch(SQLException se) {
            System.out.println(se.getMessage());
        }

    }
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");      // load and register
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/employee","postgres","manojkasu");
            Statement s = con.createStatement();

//            displaying the details
            display(con,s);

//            Updating the details
            int rowAffected = s.executeUpdate("update employees set department = 'IT' where emp_id = 7 ");
            System.out.println("Rows affected "+rowAffected);

//          Inserting the details
            try {
                rowAffected = s.executeUpdate("insert into employees values(9,'manideep','Aiml',2000), (10,'shivaji','Aiml',3000),(11,'Rajesh','Aiml',4000)");
                System.out.println(rowAffected);

            }
            catch(Exception e) {
                System.out.println(e.getMessage()    );
            }

//            Deleting Row
            rowAffected = s.executeUpdate("delete from employees where emp_id = 11");
            System.out.println("Row Effected "+rowAffected);
            con.close();
        }
        catch( ClassNotFoundException |  SQLException cne) {
            cne.printStackTrace();
            System.out.println(cne.getMessage());
        }

    }
}
