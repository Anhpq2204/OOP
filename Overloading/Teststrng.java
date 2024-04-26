package Bai4;

public class Teststrng {

    public static void main(String[] args){
        String s1=new String("test");
        String s2=new String("strng");
        String s3= new String("result");
        long st=System.currentTimeMillis();
        String t=s1+s2+s3;
        System.out.println(t);
        long sto=System.currentTimeMillis();
        long res1=sto-st;
        System.out.println(res1);
        StringBuffer stl=new StringBuffer();
        long st2=System.currentTimeMillis();
        stl.append("test");
        stl.append("strng");
        stl.append("result");
        long sto2=System.currentTimeMillis();
        long res2=sto2-st2;
        System.out.println(res2);
        System.out.println(stl);

    }

}
