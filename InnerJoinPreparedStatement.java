package com.pardeep.Tyeion1Sep;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InnerJoinPreparedStatement {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            String dbUrl = "jdbc:mysql://localhost:3306/PardeepDb?user=root&password=Advika@123";
            conn = DriverManager.getConnection(dbUrl);
            if (conn != null) {
                System.out.println("Connection established using Connection conn");
            }

            // Define your SQL query with INNER JOIN and placeholders
            String query="SELECT * FROM emp_table  INNER JOIN dept_table WHERE emp_table.deptno=dept_table.deptno";


            // Create a prepared statement
            pstmt = conn.prepareStatement(query);

            rs = pstmt.executeQuery();

            // Process the result set
            while (rs.next()) {
              
            	System.out.println(rs.getInt(1)+
            			"\t"+rs.getString(2)+
            			"\t"+rs.getString(3)+
            			"\t"+rs.getInt(4)+"\t"
            			+rs.getDate(5)+"\t"+
            			rs.getInt(6)+"\t"+
            			rs.getInt(7)+"\t"+
            			rs.getInt(8)+"\t"+
            			rs.getInt(9)+"\t"+
            			rs.getString(10)+
            			"\t"+rs.getInt(11)+
            			"\t"+rs.getInt(12));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Sbb bdiya hai");
    }
}