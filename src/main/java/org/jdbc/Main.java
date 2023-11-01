package org.jdbc;

import org.repository.DersRepository;
import org.repository.KonuRepository;

import java.sql.SQLException;

public class Main {
    private static DersRepository ders_repo=new DersRepository();
    private static KonuRepository konu_repo=new KonuRepository();
    public static void main(String[] args) {
       try {
//           System.out.println(ders_repo.getById(1));
           System.out.println(ders_repo.getAll());
           System.out.println(konu_repo.getAll());

       }
       catch (SQLException e)
       {
           e.printStackTrace();
       }
    }
}