package Bai4;

import static Bai4.Nhanvien.count;
import static Bai4.Nhanvien.luong;

public class TestNV {
    public static void main(String[] args) {
        Nhanvien nv1 = new Nhanvien("Minh", 4.5, 2.4, 11.8);
        Nhanvien nv2=new Nhanvien("Nam",5.7,1.2,8.6);
        nv1.inThongTin();
        System.out.println();
        nv2.inThongTin();
        System.out.println();
        System.out.println("Luong nv1 la:"+nv1.tinhLuong());
        System.out.println();
        System.out.println("Luong nv2 la:"+nv2.tinhLuong());
        System.out.println();
        nv1.tangLuong(0.8);
        System.out.println();
        nv2.tangLuong(7.6);
        System.out.println(count);
        System.out.println(luong);


    }
}
