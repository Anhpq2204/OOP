package Bai3;

public class Nhanvien {
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    private double LUONG_MAX;

    public Nhanvien(String tenNhanVien, double luongCoBan, double heSoLuong, double LUONG_MAX) {
        this.setTenNhanVien(tenNhanVien);
        this.setLuongCoBan(luongCoBan);
        this.setHeSoLuong(heSoLuong);
        this.setLUONG_MAX(LUONG_MAX);
    }

    public String getTenNhanVien() {
        return this.tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public double getLuongCoBan() {
        return this.luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return this.heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double getLUONG_MAX() {
        return this.LUONG_MAX;
    }

    public void setLUONG_MAX(double LUONG_MAX) {
        this.LUONG_MAX = LUONG_MAX;
    }

    public double tinhLuong() {
        return this.luongCoBan * this.heSoLuong;
    }

    public boolean tangLuong(double tang) {
        if (tang + tinhLuong() > LUONG_MAX) {
            System.out.println("Khong tang luong duoc");
            return false;
        } else {
            System.out.println("Duoc tang luong");
            return true;
        }
    }

    public void inThongTin() {
        System.out.println("Ten Nhan Vien: " + this.tenNhanVien);
        System.out.println("Luong Co Ban : " + this.luongCoBan);
        System.out.println("He So Luong: " + this.heSoLuong);
        System.out.println("Luong Max : " + this.LUONG_MAX);
    }
}
