package Bai8;

public class TruongPhong extends NhanVienCoHuu{
    private double phuCap;
    private int soNamDuongChuc;

    public TruongPhong(String tenPhongBan, String tenNV, double LUONG_MAX, double luongCoBan, double heSoLuong,int phuCap,int soNamDuongChuc) {
        super(tenPhongBan,  tenNV, LUONG_MAX, luongCoBan, heSoLuong);
        this.phuCap=phuCap;
        this.soNamDuongChuc=soNamDuongChuc;
    }


    public double tinhLuong() {
        return super.tinhLuong()+phuCap;
    }

    @Override
    public void inTT() {
        super.inTT();
    }
}
