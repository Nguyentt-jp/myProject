package TestOOPs;

import OOPs.HinhChuNhat;

public class TestHinhChuNhat {
	
	public static void main(String[] args) {
		
		HinhChuNhat obj = new HinhChuNhat();
		obj.setChieuDai(10);
		obj.setChieuRong(6);
		double s=obj.dienTich(obj.getChieuDai(), obj.getChieuRong());
		System.out.println(obj.toString());
		System.out.println("dien tich: "+s);
		System.out.println("chu vi: "+obj.chuVi(obj.getChieuDai(), obj.getChieuRong()));
		
		
		HinhChuNhat obj1 = new HinhChuNhat(7,6);
	}

}
