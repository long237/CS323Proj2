/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package termproject2;

/**
 *
 * @author gowus
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lunastra
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.*;

public class UniversitySurvey {
    public static Connection conn = null; //initialize the connection
    public static Statement stmt = null;  //initialize the statement that we're using
    public static String sql;
    public static PreparedStatement pstmt;
    public static ResultSet rs;

    //  Database credentials
    static String USER;
    static String PASS;
    static String DBNAME;
    //This is the specification for the printout that I'm doing:
    //each % denotes the start of a new field.
    //The - denotes left justification.
    //The number indicates how wide to make the field.
    //The "s" denotes that it's a string.  All of our output in this test are
    //strings, but that won't always be the case.
    static String displayFormat="%-5s%-15s%-15s%-15s\n";
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "org.apache.derby.jdbc.ClientDriver";
    static String DB_URL = "jdbc:derby://localhost:1527/";
    
/**
 * Takes the input string and outputs "N/A" if the string is empty or null.
 * @param input The string to be mapped.
 * @return  Either the input string or "N/A" as appropriate.
 */
    public static String dispNull (String input) {
      //because of short circuiting, if it's null, it never checks the length.
      if (input == null || input.length() == 0)
        return "N/A";
      else
        return input;
    }


    public static void printMenu() {
      System.out.println("1. List output per team \n2. List average scores for a student"
      +"\n3. Produce a report for teams with more than 2 members\n4. Report the average value that the student received from their peers"
      +"\n5. For each team, list the department name, the course name, the course units, the section number, the team name"
      +"\n6. For each team, report the department name, the course number, the section number, the team name, and the number of students in the team.");
    }

    public static void listAllStudents(Connection conn){
        try
        {
            
            //Establish connection
            System.out.println("Connecting to database...");

            //Execute query
            sql = "SELECT * FROM WritingGroup";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            System.out.println();

            //Displays formatted data
            displayFormat = "%-30s%-20s%-20s%-20s\n";


            while(rs.next()){
                //Table columns
             
            }
            rs.close();
            pstmt.close();
            conn.close();
        } 
        
        catch (SQLException se)
        {
        //Replace w/ comment     
        se.printStackTrace();
        }
        
        catch (Exception e)
        {
           //Replace w/ comment 
          e.printStackTrace();
        }
        
        finally
        {
            try {
                if (stmt != null) { stmt.close(); }
            }
            catch (SQLException se2) {}
            try
            {
                if (conn != null) { conn.close(); }
            }
            catch (SQLException se)
            {
                se.printStackTrace();
            }
        }
    
    }

    public static void listStudentScore(Connection conn){
        try
        {
            //Establish connection
            System.out.println("Connecting to database...");

            //Execute query
            sql = "SELECT * FROM WritingGroup";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            System.out.println();

            //Displays formatted data
            displayFormat = "%-30s%-20s%-20s%-20s\n";


            while(rs.next()){
                //Table columns
             
            }
            rs.close();
            pstmt.close();
            conn.close();
        } 
        
        catch (SQLException se)
        {
        //Replace w/ comment     
        se.printStackTrace();
        }
        
        catch (Exception e)
        {
           //Replace w/ comment 
          e.printStackTrace();
        }
        
        finally
        {
            try {
                if (stmt != null) { stmt.close(); }
            }
            catch (SQLException se2) {}
            try
            {
                if (conn != null) { conn.close(); }
            }
            catch (SQLException se)
            {
                se.printStackTrace();
            }
        }
    
    
    }

    public static void listReport(Connection conn){
        try
        {

            //Establish connection
            System.out.println("Connecting to database...");

            //Execute query
            sql = "SELECT * FROM WritingGroup";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            System.out.println();

            //Displays formatted data
            displayFormat = "%-30s%-20s%-20s%-20s\n";


            while(rs.next()){
                //Table columns
             
            }
            rs.close();
            pstmt.close();
            conn.close();
        } 
        
        catch (SQLException se)
        {
        //Replace w/ comment     
        se.printStackTrace();
        }
        
        catch (Exception e)
        {
           //Replace w/ comment 
          e.printStackTrace();
        }
        

    
    }

    public static void listAvgRating(Connection conn){
        try
        {

            //Establish connection
            System.out.println("Connecting to database...");

            //Execute query
            sql = "SELECT * FROM WritingGroup";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            System.out.println();

            //Displays formatted data
            displayFormat = "%-30s%-20s%-20s%-20s\n";


            while(rs.next()){
                //Table columns
             
            }
            rs.close();
            pstmt.close();
            conn.close();
        } 
        
        catch (SQLException se)
        {
        //Replace w/ comment     
        se.printStackTrace();
        }
        
        catch (Exception e)
        {
           //Replace w/ comment 
          e.printStackTrace();
        }
        

    
    }

    public static void listTeamInfo(Connection conn){
        try
        {

            //Establish connection
            System.out.println("Connecting to database...");
            

            //Execute query
            sql = "SELECT * FROM WritingGroup";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            System.out.println();

            //Displays formatted data
            displayFormat = "%-30s%-20s%-20s%-20s\n";


            while(rs.next()){
                //Table columns
             
            }
            rs.close();
            pstmt.close();
            conn.close();
        } 
        
        catch (SQLException se)
        {
        //Replace w/ comment     
        se.printStackTrace();
        }
        
        catch (Exception e)
        {
           //Replace w/ comment 
          e.printStackTrace();
        }
        
       
    
    }

    public static void listTeamInfoOrdered(Connection conn){
     try
        {
           
            //Establish connection
            System.out.println("Connecting to database...");
            

            //Execute query
            sql = "SELECT * FROM WritingGroup";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            System.out.println();

            //Displays formatted data
            displayFormat = "%-30s%-20s%-20s%-20s\n";


            while(rs.next()){
                //Table columns
             
            }
            rs.close();
            pstmt.close();
            conn.close();
        } 
        
        catch (SQLException se)
        {
        //Replace w/ comment     
        se.printStackTrace();
        }
        
        catch (Exception e)
        {
           //Replace w/ comment 
          e.printStackTrace();
        }
        
    
    
    }



    public static void main(String[] args){
        //Prompt the user for the database name, and the credentials.
        //If your database has no credentials, you can update this code to
        //remove that from the connection string.
        try{
            Scanner in = new Scanner(System.in);
            System.out.print("Name of the database (not the user account): ");
            DBNAME = in.nextLine();
            System.out.print("Database user name: ");
            USER = in.nextLine();
            System.out.print("Database password: ");
            PASS = in.nextLine();
            conn = DriverManager.getConnection(DB_URL);

            //Constructing the database URL connection string
            DB_URL = DB_URL + DBNAME + ";user="+ USER + ";password=" + PASS;
            System.out.println(); 
            boolean runAgain = true;

            while (runAgain) { //Menu keeps running until the user chooses to quit 
                int choice = -1; 
                while (choice < 0 || choice > 10) { //Input validation for menu choices
                    System.out.println();
                    System.out.println("**********************************************************************");
                    printMenu(); 
                    choice = in.nextInt();
                }

                switch(choice){
                    case 1: 
                        listAllStudents(conn);
                        break;

                    case 2: 
                        listStudentScore(conn);
                        break;

                    case 3: 
                        listReport(conn);
                        break; 

                    case 4: 
                        listAvgRating(conn);
                        break; 

                    case 5:
                        listTeamInfo(conn);
                        break;

                    case 6:
                        listTeamInfoOrdered(conn);
                        break; 

                } 
            }
        }   
        catch (SQLException se) {
            // Handle errors for JDBC
            //se.printStackTrace();
            System.out.println("Error when connecting to database !!!");
        } catch (Exception e) {
            // Handle errors for Class.forName
            //e.printStackTrace();
            System.out.println("Error for Class.forName!!");
        }
    }  
}

