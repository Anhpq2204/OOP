package Bai6;

public class Main {
    public static void main(String[] args)
    {
        HangHoa hangDienMay=new HangDienMay("001","tivi","LG",3000000,12,220,30);
        hangDienMay.in();
        HangHoa hangSanhSu=new HangSanhSu("001","ly","LD",200000,"silic");
        hangSanhSu.in();
        HangHoa hangThucPham=new HangThucPham("001","cha","Dk",100000,15,29);
        hangThucPham.in();
    }
}
