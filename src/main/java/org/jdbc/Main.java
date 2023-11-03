package org.jdbc;

import org.model.Ogrenci;
import org.repository.DersRepository;
import org.repository.KonuRepository;
import org.repository.OgrenciRepository;
import org.repository.OgretmenRepository;

import java.sql.SQLException;

public class Main {
    private static DersRepository ders_repo=new DersRepository();
    private static KonuRepository konu_repo=new KonuRepository();
    private static OgretmenRepository ogretmen_repo=new OgretmenRepository();
    private static OgrenciRepository ogrenci_repo=new OgrenciRepository();

    public static void main(String[] args) {
       try {
//         System.out.println(ders_repo.getById(1));
//         System.out.println(ders_repo.getAll());
//         System.out.println(konu_repo.getAll());
//         System.out.println(ders_repo.getAllDTO());
//         System.out.println(ogrenci_repo.getAll());
//         System.out.println(ogrenci_repo.save(new Ogrenci("Enes",121,2)));
           System.out.println(ogrenci_repo.getAll());
//         System.out.println(ogretmen_repo.getAll());

       }
       catch (SQLException e)
       {
           e.printStackTrace();
       }
    }
}