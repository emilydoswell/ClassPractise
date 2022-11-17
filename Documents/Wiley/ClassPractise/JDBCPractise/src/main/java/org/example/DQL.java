package org.example;

public class DQL {
//    public static void main(String[] args) {
//
//        Connection connection=null;
//        PreparedStatement preparedStatement;
//
//        try {
//            //	1. Connect
//            //	1.1 Register Driver
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            //	1.2 Connect to the Database
//            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/classpractise", "root", "HelloWorld");
//
//            //  2. Query
//            preparedStatement = connection.prepareStatement("SELECT * FROM EMPLOYEES");
//
//            //DQL : executeQuery() , which will result ResultSet
//            ResultSet resultSet= preparedStatement.executeQuery();
//
//            //	3. Process The result
//            while(resultSet.next()) {
//                //read int type "employeeid" column from employee table
//                int id=resultSet.getInt("EMPLOYEE_ID");
//                //read varchar type "name" column from employee table
//                String name=resultSet.getString("FIRST_NAME");
//                //read varchar type "designation" column from employee table
//                String lastName=resultSet.getString("LAST_NAME");
//                //read varchar type "designation" column from employee table
//                String email=resultSet.getString("EMAIL");
//
//                //displaying result
//                System.out.println(id+" "+name+" "+lastName+" "+email);
//            }
//
//        } catch (ClassNotFoundException e) {
//            //displaying the complete stack for exceptions
//            e.printStackTrace();
//        }
//        catch(SQLException e) {
//            e.printStackTrace();
//        }
//        finally {
//            try {
//                //	4.Close
//                connection.close();
//            } catch (SQLException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
//        }
//    }
}