package Bai8;

public class NhanVienCoHuu extends NhanVien{
    private double luongCoBan;
    private double heSoLuong;

    public NhanVienCoHuu(String tenPhongBan, String tenNV, double LUONG_MAX,double luongCoBan,double heSoLuong) {
        super(tenPhongBan, tenNV, LUONG_MAX);
        this.luongCoBan=luongCoBan;
        this.heSoLuong=heSoLuong;
    }

    @Override
    public double tinhLuong() {
        return luongCoBan*heSoLuong;
    }

    @Override
    public void inTT() {
        System.out.println(tenNV);
    }
}
