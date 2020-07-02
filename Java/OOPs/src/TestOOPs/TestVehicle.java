package TestOOPs;

import OOPs.Vehicle;

public class TestVehicle {

    public static void main(String[] args) {
        Vehicle xe1 = new Vehicle("Nguyen Thi Quynh","Future Neo",100,15000000);
//        xe1.nhap(xe1);
        xe1.xuat();
        System.out.println(xe1.toString());
    }
}
