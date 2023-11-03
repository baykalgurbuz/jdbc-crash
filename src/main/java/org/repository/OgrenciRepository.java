package org.repository;

import org.jdbc.Constants;
import org.model.Ogrenci;

import java.sql.*;
import java.util.ArrayList;

public class OgrenciRepository {
    public ArrayList<Ogrenci> getAll() throws SQLException {
        ArrayList<Ogrenci> ogrenci =new ArrayList<>();
        Connection connection = Constants.getConnection();
        Statement statement =connection.createStatement();
        ResultSet result =statement.executeQuery("select * from \"public\".\"OGRENCI\" order by \"ID\" asc");
        while (result.next())
        {
            long id = result.getLong("ID");
            String name = result.getString("NAME");
            long ogrencı_number = result.getLong("OGRENCI_NUMBER");
            long year = result.getLong("YEAR");
            ogrenci.add(new Ogrenci(id,name,ogrencı_number,year));
        }
        result.close();
        statement.close();
        connection.close();
        return ogrenci;
    }
    public Ogrenci getbyId(long id) throws SQLException {
        Ogrenci ogrenci=new Ogrenci();
        Connection connection =Constants.getConnection();
        String sql ="select * from \"public\".\"OGRENCI\" where \"ID\" = ?";
        PreparedStatement statement=connection.prepareStatement(sql);
        statement.setLong(1,id);
        ResultSet result =statement.executeQuery();
        while(result.next())
        {
            ogrenci=new Ogrenci(result.getLong("ID"),result.getString("NAME"),result.getLong("OGRENCI_NUMBER"),result.getLong("YEAR"));
        }
        connection.close();
        return ogrenci;
    }
    public boolean save(Ogrenci ogrenci) throws SQLException {
        boolean result = false;
        Connection con = Constants.getConnection();
        String sql = "INSERT INTO \"public\".\"OGRENCI\"(\"NAME\", \"OGRENCI_NUMBER\",\"YEAR\") VALUES (?, ?, ?)";
        PreparedStatement statement = con.prepareStatement(sql);
        statement.setString(1, ogrenci.getNAME());
        statement.setLong(2, ogrenci.getOGRENCI_NUMBER());
        statement.setLong(3, ogrenci.getYEAR());
        result = statement.executeUpdate() == 1;
        statement.close();
        con.close();
        return result;
    }
    public boolean deleteByID(long id) throws SQLException {
        Connection con = Constants.getConnection();
        String sql = "delete from \"public\".\"OGRENCI\" where \"ID\" = ?";
        PreparedStatement statement = con.prepareStatement(sql);
        statement.setLong(1, id);
        boolean result = statement.executeUpdate() == 1;
        statement.close();
        con.close();
        return result;
    }
}
