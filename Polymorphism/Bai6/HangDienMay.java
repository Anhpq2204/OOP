package Bai6;

import java.util.Date;

public class HangDienMay extends HangHoa {

    int baoHanh;
    int dienAp;
    int congsuat;
    HangDienMay(String maHang,String tenHang,String nhaSanXuat,int gia,int baoHanh,int dienAp, int congsuat){
        super(maHang, tenHang, nhaSanXuat, gia);
        this.baoHanh=baoHanh;
        this.dienAp=dienAp;
        this.congsuat=congsuat;
    }
    public void in()
    {
        System.out.println("Hang Dien May");
        System.out.println(maHang);
        System.out.println(tenHang);
        System.out.println(nhaSanXuat);
        System.out.println(gia);
        System.out.println(baoHanh);
        System.out.println(dienAp);
        System.out.println(congsuat);
    }
}
