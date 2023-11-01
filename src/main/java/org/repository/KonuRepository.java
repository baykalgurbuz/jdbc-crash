package org.repository;

import org.jdbc.Constants;
import org.model.Konu;

import java.sql.*;
import java.util.ArrayList;

public class KonuRepository {

    public ArrayList<Konu> getAll() throws SQLException
    {
        ArrayList<Konu> list = new ArrayList<>();
        Connection con = Constants.getConnection();
        Statement statement = con.createStatement();
        ResultSet result = statement.executeQuery("select * from \"public\".\"KONU\" order by \"ID\" asc");
        while (result.next())
        {
            long id = result.getLong("ID");
            String name =result.getString("NAME");
            list.add(new Konu(id, name));
        }

        con.close();
        return list;
    }

    public boolean save(Konu konu) throws SQLException
    {
        boolean result = false;
        Connection con = Constants.getConnection();
        String sql = "INSERT INTO \"public\".\"KONU\"(\"NAME\") VALUES (?)";
        PreparedStatement statement = con.prepareStatement(sql);
        statement.setString(1,konu.getNAME() );
        result = statement.executeUpdate() == 1;
        statement.close();
        con.close();
        return result;
    }
    public boolean deleteByID(long id) throws SQLException
    {
        Connection con = Constants.getConnection();
        String sql = "delete from \"public\".\"KONU\" where \"ID\" = ?";
        PreparedStatement statement = con.prepareStatement(sql);
        statement.setLong(1, id);
        boolean result = statement.executeUpdate() == 1;
        statement.close();
        con.close();
        return result;
    }
    public Konu getByID(long id) throws SQLException
    {
        Konu ogr = null;
        Connection con = Constants.getConnection();
        String sql = "select * from \"public\".\"KONU\" where \"ID\" = ?";
        PreparedStatement statement = con.prepareStatement(sql);
        statement.setLong(1, id);
        ResultSet result = statement.executeQuery();
        while (result.next())
        {
            ogr = new Konu(result.getLong("ID"), result.getString("NAME"));
        }
        con.close();
        return ogr;
    }

}
