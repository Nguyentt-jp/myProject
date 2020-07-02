package OOPs;

public class QuanLiSinhVien {
    private int maSV;
    private String ten;
    private double diemLT;
    private double diemTH;
    
    
	public QuanLiSinhVien() {
		super();
		this.maSV=0;
		this.ten="";
		this.diemLT=0;
		this.diemTH=0;
	}
	public QuanLiSinhVien(int maSV, String ten, double diemLT, double diemTH) {
		super();
		this.maSV = maSV;
		this.ten = ten;
		this.diemLT = diemLT;
		this.diemTH = diemTH;
	}
	public int getMaSV() {
		return maSV;
	}
	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public double getDiemLT() {
		return diemLT;
	}
	public void setDiemLT(double diemLT) {
		this.diemLT = diemLT;
	}
	public double getDiemTH() {
		return diemTH;
	}
	public void setDiemTH(double diemTH) {
		this.diemTH = diemTH;
	}
	@Override
	public String toString() {
		return "QuanLiSinhVien [maSV=" + maSV
				+ ", ten=" + ten
				+ ", diemLT= " + diemLT
				+ ", diemTH= " + diemTH + "]"
				+ "Diem TB: " + diemTrungBinh(this.diemLT,this.diemTH);
	}
	public double diemTrungBinh(double diemLT, double diemTH) {
		return (this.diemTH+this.diemLT)/2;
	}


}
