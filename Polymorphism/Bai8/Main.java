package Bai8;

public class Main {
    public static void main(String[] args)
    {
        NhanVien nv1= new NhanVienCoHuu("MK","NVA",7,1.2,3.3);
        NhanVien nv2=new NhanVienHopDong("IT","NVB",20,12);
        NhanVien nv3= new TruongPhong("R&D","NVC",30,12.4,3.4,4,5);
        PhongBan.themNV(nv1);
        PhongBan.themNV(nv2);
        PhongBan.themNV(nv3);
        PhongBan.tinhTongLuong();

    }
}
