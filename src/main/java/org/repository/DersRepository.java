package org.repository;

import org.jdbc.Constants;
import org.model.Ders;

import java.sql.*;
import java.util.ArrayList;

public class DersRepository {
    public Ders getById(long id) throws SQLException {
        Ders ders =null;
        Connection con = Constants.getConnection();
        String sql ="select * from \"public\".\"DERS\" where \"ID\" = ?";
        PreparedStatement statement =con.prepareStatement(sql);
        statement.setLong(1,id);
        ResultSet result = statement.executeQuery();
        while (result.next())
        {
            ders =new Ders(result.getLong("ID"));
        }
        con.close();
        return ders;
    }
    public ArrayList<Ders> getAll() throws SQLException {
        ArrayList<Ders> dersList =new ArrayList<>();
        Connection con =Constants.getConnection();
        Statement statement =con.createStatement();
        ResultSet result = statement.executeQuery("select * from \"public\".\"DERS\" order by \"ID\" asc");
        while (result.next())
        {
            long id =result.getLong("ID");
            long ogretmen_id =result.getLong("OGRETMEN_ID");
            long konu_id =result.getLong("KONU_ID");
            dersList.add(new Ders(id,ogretmen_id,konu_id));
        }
        result.close();
        statement.close();
        con.close();
        return dersList;
    }
    public boolean deleteByID(long id) throws SQLException {
        Connection con =Constants.getConnection();
        String sql = "delete from \"public\".\"DERS\" where \"ID\" = ?";
        PreparedStatement statement =con.prepareStatement(sql);
        statement.setLong(1,id);
        boolean result = statement.executeUpdate()==1;
        statement.close();
        con.close();
        return result;
    }
    public boolean save(Ders ders) throws SQLException {
        boolean result =false;
        Connection con =Constants.getConnection();
        String sql = "INSERT INTO \"public\".\"DERS\"(\"OGRETMEN_ID\", \"KONU_ID\") VALUES (?, ?)";
        PreparedStatement statement =con.prepareStatement(sql);
        statement.setLong(1,ders.getOGRETMEN_ID());
        statement.setLong(1,ders.getKONU_ID());
        result=statement.executeUpdate()==1;
        statement.close();
        con.close();
        return result;
    }

}
