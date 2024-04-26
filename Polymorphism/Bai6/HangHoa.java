package Bai6;

abstract public class HangHoa {
    String maHang;
    String tenHang;
    String nhaSanXuat;
    int gia;
    HangHoa(String maHang,String tenHang,String nhaSanXuat,int gia){
        this.maHang=maHang;
        this.tenHang=tenHang;
        this.nhaSanXuat=nhaSanXuat;
        this.gia=gia;}
    abstract public void in();
}
