package OOPs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Vehicle {

    DecimalFormat df = new DecimalFormat("#.0");

    private int dungTich;
    private float giaTri;
    private String tenChuXe;
    private String loaiXe;

    public float getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(float giaTri) {
        this.giaTri = giaTri;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public Vehicle() {
    }

    public Vehicle(String tenChuXe, String loaiXe, int dungTich,  float giaTri) {
        this.dungTich = dungTich;
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.giaTri = giaTri;
    }

    public float thuePhaiNop(int dungTich, float giaTri){
        float f;
        if(dungTich<100){
            f= (float) (giaTri*0.1);
        }
        else if (dungTich<200&&dungTich>100){
            f= (float) (giaTri*0.3);
        }
        else {
            f= (float) (giaTri*0.5);
        }
        return f;
    }

    public void nhap(Vehicle xe){
        Scanner scanStr = new Scanner(System.in);
        Scanner scanDou = new Scanner(System.in);
        Scanner scanInt = new Scanner(System.in);

        System.out.println("Nhap ten: ");
        xe.setTenChuXe(scanStr.nextLine());
        System.out.println("Nhap loai xe: ");
        xe.setLoaiXe(scanStr.nextLine());
        System.out.println("Nhap dung tich: ");
        xe.setDungTich(scanInt.nextInt());
        System.out.println("Nhap gia tri cua xe: ");
        xe.setGiaTri(scanDou.nextFloat());
    }

    @Override
    public String toString() {
        return tenChuXe+"\t\t\t\t"
                +loaiXe+"\t\t\t\t"
                +dungTich+"\t\t\t\t"
                +df.format(giaTri)+"\t\t\t\t"
                +thuePhaiNop(dungTich,giaTri);
    }

    public void xuat(){
        System.out.println("Chu xe\t\t\t\t"
                +"Loai xe\t\t\t\t"
                +"Dung tich\t\t\t\t"
                +"Gia tri\t\t\t\t"
                +"Thue phai nop");
        toString();
    }

}
