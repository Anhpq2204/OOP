package Bai6;

import java.util.Date;

public class HangThucPham extends HangHoa {

    int ngaySanXuat;
    int ngayHetHan;
    HangThucPham(String maHang,String tenHang,String nhaSanXuat,int gia,int ngaySanXuat,int ngayHetHan){
        super(maHang, tenHang, nhaSanXuat, gia);
        this.ngaySanXuat=ngaySanXuat;
        this.ngayHetHan=ngayHetHan;
    }
    public void in() {
        System.out.println("Hang Dien May");
        System.out.println(maHang);
        System.out.println(tenHang);
        System.out.println(nhaSanXuat);
        System.out.println(gia);
        System.out.println(ngaySanXuat);
        System.out.println(ngayHetHan);
    }

}
