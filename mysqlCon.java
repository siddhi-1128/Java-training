import java.sql.*;
class mysqlCon{
    public static void main(String[] args) {
        try{
            //step 1 load the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            //step 2 create the connection object
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","siddhi@2811parth");

            //step 3 create the statement object
            Statement st= con.createStatement();

            //step 4 execute query
            ResultSet rs=st.executeQuery("select * from designation");
            while(rs.next())
                System.out.println(rs.getString(2)+" "+rs.getInt(1));

            //step 5 close the connection object
            con.close();
        }catch(Exception e){System.out.println(e);}
    }
}