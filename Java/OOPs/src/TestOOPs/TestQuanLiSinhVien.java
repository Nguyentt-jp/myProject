package TestOOPs;

import OOPs.QuanLiSinhVien;

import java.util.ArrayList;
import java.util.Scanner;

public class TestQuanLiSinhVien{

    public static void main(String[] args) {
        QuanLiSinhVien sv1 = new QuanLiSinhVien(1,"Nguyen Van Teo",10,1);
        QuanLiSinhVien sv2 = new QuanLiSinhVien(2,"Tran Van A",1,10);
        QuanLiSinhVien sv3 = new QuanLiSinhVien();
        Scanner scanInt = new Scanner(System.in);
        Scanner scanDou = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);
        sv3.setMaSV(scanInt.nextInt());
        sv3.setTen(scanStr.nextLine());
        sv3.setDiemLT(scanDou.nextDouble());
        sv3.setDiemTH(scanDou.nextDouble());
        sv1.diemTrungBinh(sv1.getDiemLT(),sv1.getDiemTH());
        sv2.diemTrungBinh(sv2.getDiemLT(),sv2.getDiemTH());
        sv3.diemTrungBinh(sv3.getDiemLT(),sv3.getDiemTH());

        ArrayList<QuanLiSinhVien> quanLiSinhViens = new ArrayList<>();
        quanLiSinhViens.add(sv1);
        quanLiSinhViens.add(sv2);
        quanLiSinhViens.add(sv3);

        for (Object obj:quanLiSinhViens){
            System.out.println(obj);
        }

    }

}
