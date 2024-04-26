package Bai3;

public class Nhanvien {
     private String tenNhanVien;
     private double luongCoBan;
     private double heSoLuong;
     public  double LUONG_MAX;
     public  String getten() {
    	 return this.tenNhanVien;
     }
     public void setten(String tenNhanVien) {
    	 this.tenNhanVien=tenNhanVien;
     }
     public double getluongCoBan()
     {
    	 return this.luongCoBan;
     }
     public void setluongCoBan(double luongCoBan) {
    	 this.luongCoBan=luongCoBan;
     }
     public double getheSoLuong()
     {
    	 return this.heSoLuong;
     }
     public void setheSoLuong(double heSoLuong ) {
    	 this.heSoLuong=heSoLuong;
     }
     public double tinhluong() {
    	 return this.luongCoBan*this.heSoLuong;
     }
     public boolean tangLuong(double tang) {
    	 if(tang+tinhluong()>LUONG_MAX) {
    		 System.out.println("Khong tang luong duoc");
    		 return false;
    	 }
    	 else {
    		 return true;
    	 }
     }
     public void inTTin()
     {
    	 System.out.println("Ten Nhan Vien: " + this.tenNhanVien);
    	 System.out.println("Luong Co Ban : " + this.luongCoBan);
    	 System.out.println("He So Luong: " + this.heSoLuong);
    	 System.out.println("Luong Max : " + this.LUONG_MAX);
    	 
     }
     
}
