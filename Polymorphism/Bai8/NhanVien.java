package Bai8;

public abstract class NhanVien extends PhongBan {
    protected String tenNV;
    public double LUONG_MAX;

    public NhanVien(String tenPhongBan,String tenNV,double LUONG_MAX) {
        super(tenPhongBan);
        this.tenNV=tenNV;
        this.LUONG_MAX=LUONG_MAX;
    }

    public abstract double tinhLuong();
    public abstract void inTT();
}
