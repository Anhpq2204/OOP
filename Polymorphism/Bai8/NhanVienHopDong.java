package Bai8;

public class NhanVienHopDong extends NhanVien {
    private double luongHopDong;

    public NhanVienHopDong(String tenPhongBan, String tenNV, double LUONG_MAX,double luongHopDong) {
        super(tenPhongBan, tenNV, LUONG_MAX);
        this.luongHopDong=luongHopDong;
    }

    @Override
    public double tinhLuong() {
        return luongHopDong;
    }

    @Override
    public void inTT() {
        System.out.println(tenNV);
    }
}
