package Bai8;

import java.util.ArrayList;
import java.util.List;

public class PhongBan {
    private String tenPhongBan;
    private static int soNV;
    public static int SO_NV_MAX;
    public static List<NhanVien> DanhSach;

    public PhongBan(String tenPhongBan)
    {
        this.tenPhongBan=tenPhongBan;
        this.soNV=0;
        SO_NV_MAX=70;
        DanhSach=new ArrayList<>();
    }

    public static boolean themNV(NhanVien nv)
    {
        soNV++;
        DanhSach.add(nv);
        return (soNV>=SO_NV_MAX)?false:true;
    }
    public NhanVien xoaNV()
    {
        NhanVien nv=DanhSach.remove(soNV-1);
        soNV--;
        return nv;
    }
    public static double tinhTongLuong(){
        double tongluong=0;
        for(NhanVien nv: DanhSach)
        {
            tongluong+=nv.tinhLuong();
        }
        System.out.println("Tong luong:"+tongluong);
        return tongluong;
    }
    public void inTT()
    {
        System.out.println(tenPhongBan);
    }

}
