
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.*;

public class UniversitySurvey {

    //  Database credentials
    static String USER;
    static String PASS;
    static String DBNAME;

    static final String displayFormat = "%-5s%-15s%-15s%-15s\n";
    static final String JDBC_DRIVER = "org.apache.derby.jdbc.ClientDriver";
    static String DB_URL = "jdbc:derby://localhost:1527/";
    
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

            //Constructing the database URL connection string
            DB_URL = DB_URL + DBNAME + ";user="+ USER + ";password=" + PASS;
            Connection conn = null;
            // STEP 2: Register JDBC driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            
            //Step 3: Connect to the Database
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL);
            
            System.out.println(); 
            boolean runAgain = true;

//            while (runAgain) { //Menu keeps running until the user chooses to quit 
//                int choice = -1; 
//                while (choice < 0 || choice > 10) { //Input validation for menu choices
//                    System.out.println();
//                    System.out.println("**********************************************************************");
//                    //printMenu(); 
//                    choice = in.nextInt();
//                }
//
//                switch(choice){
//                    case 1: 
//                        listAllStudents(conn);
//                        break;
//
//                    case 2: 
//                        listStudentScore(conn);
//                        break;
//
//                    case 3: 
//                        listReport(conn);
//                        break; 
//
//                    case 4: 
//                        listAvgRating(conn);
//                        break; 
//
//                    case 5:
//                        listTeamInfo(conn);
//                        break;
//
//                    case 6:
//                        listTeamInfoOrdered(conn);
//                        break; 
//
//                } 
//            }
            conn.close();
        }   
        catch (SQLException se) {
            // Handle errors for JDBC
            se.printStackTrace();
            //System.out.println("Error when connecting to database !!!");
        } 
        catch (Exception e) {
            // Handle errors for Class.forName
            e.printStackTrace();
            //System.out.println("Error for Class.forName!!");
        }
    }

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

    public static void listAllStudents(Connection conn){
//        catch (SQLException se)
//        {
//        //Replace w/ comment     
//            se.printStackTrace();
//        }
//        
//        catch (Exception e)
//        {
//           //Replace w/ comment 
//            e.printStackTrace();
//        }
    }

    public static void listStudentScore(Connection conn){
//        catch (SQLException se)
//        {
//        //Replace w/ comment     
//        se.printStackTrace();
//        }
//        
//        catch (Exception e)
//        {
//           //Replace w/ comment 
//          e.printStackTrace();
//        }
    }

    public static void listReport(Connection conn){
//        catch (SQLException se)
//        {
//        //Replace w/ comment     
//        se.printStackTrace();
//        }
//        
//        catch (Exception e)
//        {
//           //Replace w/ comment 
//          e.printStackTrace();
//        }
    }

    public static void listAvgRating(Connection conn){

//        catch (SQLException se)
//        {
//        //Replace w/ comment     
//        se.printStackTrace();
//        }
//        
//        catch (Exception e)
//        {
//           //Replace w/ comment 
//          e.printStackTrace();
//        }
    }

    public static void listTeamInfo(Connection conn){
        
//        catch (SQLException se)
//        {
//        //Replace w/ comment     
//        se.printStackTrace();
//        }
//        
//        catch (Exception e)
//        {
//           //Replace w/ comment 
//          e.printStackTrace();
//        }
    }

    public static void listTeamInfoOrdered(Connection conn){

//        catch (SQLException se)
//        {
//        //Replace w/ comment     
//        se.printStackTrace();
//        }
//        
//        catch (Exception e)
//        {
//           //Replace w/ comment 
//          e.printStackTrace();
//        } 
    }
}

