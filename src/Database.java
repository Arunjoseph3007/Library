import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {
    public static void main(String[] args){
        try{
//            Class.forName("com.mysql .jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/library","root","Tu^sh1234");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from books");

            while(resultSet.next()){
                System.out.println(resultSet.getString("author_name"));
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}


