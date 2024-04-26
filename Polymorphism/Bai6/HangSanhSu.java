package Bai6;

import java.util.Date;

public class HangSanhSu extends HangHoa{


    String loaiNguyenLieu;
    HangSanhSu(String maHang,String tenHang,String nhaSanXuat,int gia,String loaiNguyenLieu){
        super(maHang, tenHang, nhaSanXuat, gia);
        this.loaiNguyenLieu=loaiNguyenLieu;

    }
    public void in() {
        System.out.println("Hang Dien May");
        System.out.println(maHang);
        System.out.println(tenHang);
        System.out.println(nhaSanXuat);
        System.out.println(gia);
        System.out.println(loaiNguyenLieu);
    }
}
