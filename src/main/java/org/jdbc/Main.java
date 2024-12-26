package org.jdbc;

import java.sql.*;

public class Main {


    public static void main(String[] ar) throws Exception {

        String sql = "select * from test;";
//        String insertQueury = String.format("insert into test(id,firstName) values(%o,'%s')",3,"Shyam");
//        String insertQueury = "insert into test(id,firstName) values(4,'Krishna')";
        String insertQueury = "insert into test(id,firstName) values(?,?)";

        String url = "jdbc:mysql://localhost:3308/testing";
        String user = "root";
        String pass = "RamNagri@22012024";
        Connection con = DriverManager.getConnection(url, user, pass);

        Statement st = con.createStatement();

        PreparedStatement pst=con.prepareStatement(insertQueury);
        pst.setInt(1,5);
        pst.setString(2,"God");
        final var i = pst.executeUpdate();
        System.out.println("Update : "+i+" record/s");

        ResultSet resultSet = st.executeQuery(sql);


        while(resultSet.next()){
           int id=resultSet.getInt("id"); // resultSet.getInt(1);
           String name=resultSet.getString("firstName");

           System.out.println(id+"  :  "+name);
        }
            con.close();
    }
}
