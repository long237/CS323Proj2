
package universitysurvey;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class UniUI {
    public void printMenu() {
        System.out.println("1. List output per team \n2. List average scores for a student"
        +"\n3. Produce a report for teams with more than 2 members\n4. Report the average value that the student received from their peers"
        +"\n5. For each team, list the department name, the course name, the course units, the section number, the team name"
        +"\n6. For each team, report the department name, the course number, the section number, the team name, and the number of students in the team.");
    }
      
    public void printResultSet(ResultSet rs) {
        try {
            ResultSetMetaData rsmd = rs.getMetaData();
            int numCol = rsmd.getColumnCount();
            //String space = String.format("%-" + 15 + "s", "");
            //String row_sp = String.format("%-" + 20 + "s", "");
            for (int j = 1; j <= numCol; j++){
                System.out.format("%-25s",rsmd.getColumnName(j));
            }
            System.out.println("");
            while (rs.next()) {
                for (int i = 1; i <= numCol; i++) {
                    String colValue = rs.getString(i);
                    //System.out.print(colValue);
                    System.out.format("%-25s",colValue);
//                    System.out.print(row_sp);
                }
                System.out.println("");
            }
        } catch (SQLException se) {
            // Handle errors for JDBC
            //se.printStackTrace();
            System.out.println("Error when printing result set!");
        }
    }
}
