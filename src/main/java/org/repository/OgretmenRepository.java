package org.repository;

import org.jdbc.Constants;
import org.model.Ogretmen;

import java.sql.*;
import java.util.ArrayList;

public class OgretmenRepository {
    public Boolean save(Ogretmen ogretmen) throws SQLException {
        boolean result =false;
        Connection connection = Constants.getConnection();
        String sql = "INSERT INTO \"public\".\"OGRETMEN\"(\"NAME\", \"IS_GICIK\") VALUES (?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, ogretmen.getNAME());
        statement.setBoolean(2, ogretmen.isIS_GICIK());
        result=statement.executeUpdate()==1;
        statement.close();
        connection.close();
        return  result;
    }
    public boolean deleteByID(long id) throws SQLException {
        boolean result =false;
        Connection connection = Constants.getConnection();
        String sql = "delete from \"public\".\"OGRETMEN\" where \"ID\" = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setLong(1, id);
        result = statement.executeUpdate() == 1;
        statement.close();
        connection.close();
        return result;
    }
    public Ogretmen getbyid(long id) throws SQLException {
        Ogretmen ogretmen=new Ogretmen();
        Connection connection= Constants.getConnection();
        String sql ="select * from \"public\".\"OGRETMEN\" where \"ID\" = ?";
        PreparedStatement statement=connection.prepareStatement(sql);
        statement.setLong(1,id);
        ResultSet result = statement.executeQuery();
        while(result.next())
        {
            ogretmen=new Ogretmen(result.getLong("ID"),result.getString("NAME"),result.getBoolean("IS_GICIK"));
        }
        connection.close();
        return ogretmen;

    }
    public ArrayList<Ogretmen> getAll() throws SQLException {
        ArrayList<Ogretmen> ogretmen =new ArrayList<>();
        Connection connection=Constants.getConnection();
        Statement statement = connection.createStatement();
        String sql="select * from \"public\".\"OGRETMEN\" order by \"ID\" asc";
        ResultSet resultSet=statement.executeQuery(sql);
        while (resultSet.next())
        {
            ogretmen.add(new Ogretmen(resultSet.getLong("ID"),resultSet.getString("NAME"),resultSet.getBoolean("IS_GICIK")));
        }
        resultSet.close();
        statement.close();
        connection.close();
        return ogretmen;
    }
    public ArrayList<Ogretmen> getByBoolean(Boolean isGicik) throws SQLException {
        ArrayList<Ogretmen> list = new ArrayList<>();
        Ogretmen ogr = null;
        Connection con = Constants.getConnection();
        String sql = "select * from \"public\".\"OGRETMEN\" where \"IS_GICIK\" = ?";
        PreparedStatement stmnt = con.prepareStatement(sql);
        stmnt.setBoolean(1, isGicik);
        ResultSet result = stmnt.executeQuery();
        while (result.next())
        {
            ogr = new Ogretmen(result.getLong("ID"), result.getString("NAME"), result.getBoolean("IS_GICIK"));
            list.add(ogr);
        }
        con.close();
        return list;
    }
}
