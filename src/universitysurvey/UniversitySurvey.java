/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lunastra
 */
import java.sql.*;
import java.util.Scanner;
public class UniversitySurvey {
    static String USER;
    static String PASS;
    static String DBNAME;

    static final String displayFormat = "%-5s%-15s%-15s%-15s\n";
    static final String JDBC_DRIVER = "org.apache.derby.jdbc.ClientDriver";
    static String DB_URL = "jdbc:derby://localhost:1527/";
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Name of the database (not the user account): ");
        DBNAME = in.nextLine();
        System.out.print("Database user name: ");
        USER = in.nextLine();
        System.out.print("Database password: ");
        PASS = in.nextLine();


        // Building String for connection
        DB_URL = DB_URL + DBNAME + ";user=" + USER + ";password=" + PASS;
        Connection conn = null; // initialize the connection
        Statement stmt = null; // initialize the statement that we're using

        try{
        // STEP 2: Register JDBC driver
        Class.forName("org.apache.derby.jdbc.ClientDriver");

        // Established connection to the database
        System.out.println("Connecting to database...");
        conn = DriverManager.getConnection(DB_URL);

        System.out.println("Connect to " + DBNAME + " user: " + USER + " password: " + PASS);
        }
        catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");
    }  
}
