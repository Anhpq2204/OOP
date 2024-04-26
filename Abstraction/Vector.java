package Bai2;

public class Vector {
   private double x;
   private double y;
   private double z;
   public Vector(double x,double y, double z) {
	   this.x=x;
	   this.y=y;
	   this.z=z;
   }
   public double getx()
   {
	   return this.x;
   }
   public double gety() {
	   return this.y;
   }
   public double getz() {
	   return this.z;
   }
   public  Vector congvector(Vector O) {
	   return new Vector(this.x+O.getx(),this.y+O.gety(),this.z+O.getz());
   }
   public  Vector truvector(Vector O) {
	   return new Vector(this.x-O.getx(),this.y-O.gety(),this.z-O.getz());
   }
   public  Vector nhanhangso(double k) {
	   return  new Vector(this.x*k,this.y*k,this.z*k);
   }
   public  double tichvohuong(Vector O)
   {
	   return this.x*O.getx()+this.y*O.gety()+this.z+O.getz();
   }
   
}
