
import primitives.*;
import static java.lang.System.out;

// @author Baruch Gehler 866256 		gehlerb@gmail.com
//		   Baruch Bichman 200844843		baruch913@gmail.com
public class Main {

	public static void main(String[] args) {
		
	out.println("*******************Coordinate****************");
	
	Coordinate coo1=new Coordinate(1);
	Coordinate coo2=new Coordinate(coo1);
	Coordinate coo3=new Coordinate(2);
	out.println("coo1: "+coo1);
	out.println("coo2: "+coo2);
	out.println("coo3: "+coo3);
	out.println("coo3.equals(coo2)? "+coo3.equals(coo2));
	out.println("coo2.equals(coo1)? "+coo2.equals(coo1));
	
	out.println("coo2.add(coo1): "+coo2.add(coo1));
	//out.println("coo2.substract(coo1): "+coo2.substract(coo1));
	
	
	out.println("*******************Point2D****************");	
	
	Point2D p2D1=new Point2D(coo1,coo3);
	Point2D p2D2=new Point2D(p2D1);
	Point2D p2D3=new Point2D(coo1,coo2);
	out.println("p2D1: "+p2D1);
	out.println("p2D2: "+p2D2);
	out.println("p2D3: "+p2D3);	
	out.println("p2D3.equals(p2D2)? "+p2D3.equals(p2D2));
	out.println("p2D2.equals(p2D1)? "+p2D2.equals(p2D1));
    
	out.println("*******************Point3D****************");
	
	Point3D p3D1=new Point3D(coo1,coo2,coo3);
	Point3D p3D2=new Point3D(p3D1);
	Point3D p3D3=new Point3D(coo3,coo2,coo1);
	
	out.println("p3D1: "+p3D1);
	out.println("p3D2: "+p3D2);
	out.println("p3D3: "+p3D3);	
	out.println("p3D3.equals(p3D2)? "+p3D3.equals(p3D2));
	out.println("p3D2.equals(p3D1)? "+p3D2.equals(p3D1));
	
	out.println("distance between p3D2 to p3D3: " +p3D2.distance(p3D3));
	
	out.println("p3D1.subVec(p3D3: )"+p3D1.subVec(p3D3));
	
	out.println("*******************Vector****************");
	
	Vector v1=new Vector(p3D1);
	Vector v2=new Vector(v1);
	Vector v3=new Vector(p3D3);
	
	out.println("p3D2.addVec(v1): "+p3D2.addVec(v1));
	out.println("p3D2.addVec(v1): "+p3D2.addVec(v1));
	
	
	out.println("v1: "+v1);
	out.println("v2: "+v2);
	out.println("v3: "+v3);	
	out.println("v3.equals(v2)? "+v3.equals(v2));
	out.println("v2.equals(v1)? "+v2.equals(v1));
	
	out.println("v1.add(v2): "+v1.add(v2));
	//out.println("v1.substract(v3): "+v1.substract(v3));
	out.println("v1.dotProduct(v3): "+v1.dotProduct(v3));
	out.println("v1.crossProduct(v3): "+v1.crossProduct(v3));
	out.println("v1.size(): "+v1.size());
	out.println("v1.normal(): "+v1.normalize());
	
	out.println("*******************Ray****************");
	
    Ray r1=new Ray(p3D1,v1);
    Ray r2=new Ray(r1);
    Ray r3=new Ray(p3D3,v3);
	
	out.println(r1);
	out.println(r2);
	out.println(r3);	
	out.println(r3.equals(r2));
	out.println(r2.equals(r1));
	
	//Triangle t1=new Triangle(p3D1,p3D2,p3D3);
	//Triangle t2=new Triangle(t1);
	//Triangle t3=new Triangle(p3D3,p3D2,p3D1);

	}
}
