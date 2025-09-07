interface Shape{
	double area();
	double peremeter();
}
class Circle implements Shape{
	int radius;
	Circle(int radius){
		this.radius=radius;
	}
	public double area() {
		double a=3.14*radius*radius;
		return a;
	}
	public double peremeter() {
		double p=3.14*2*radius;
		return p;
	}
}
class Triangle implements Shape{
	int s1;
	int s2;
	int s3;
	Triangle(int s1,int s2,int s3){
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
	}
	public double area() {
		double s=(s1+s2+s3)/2;
		double x=s*(s-s1)*(s-s2)*(s-s3);
		double a=Math.sqrt(x);
		return a;
	}
	public double peremeter() {
		double p=s1+s2+s3;
		return p;
	}
}
class Rectangle implements Shape{
	int l;
	int b;
	Rectangle(int l,int b){
		this.l=l;
		this.b=b;
	}
	public double area() {
		double a=l*b;
		return a;
	}
	public double peremeter() {
		double p=2*(l+b);
		return p;
	}
}
public class Area {
	public static void main(String args[]) {
		Circle c1=new Circle(17);
		double a1=c1.area();
		Circle c2=new Circle(11);
		double a2=c2.area();
		Triangle t1=new Triangle(4,7,9);
		double a3=t1.area();
		Rectangle r1=new Rectangle(7,5);
		double a4=r1.area();
		Rectangle r2=new Rectangle(18,6);
		double a5=r2.area();
		double area[]= {a1,a2,a3,a4,a5};
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5-i-1;j++) {
				if(area[j+1]<area[j]){
                    double temp=area[j];
				area[j]=area[j+1];
				area[j+1]=temp;
                }
			}
		}
		for(int i=0;i<area.length;i++) {
			System.out.println(area[i]);
		}
	}
	
}
