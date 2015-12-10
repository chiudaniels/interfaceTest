public class Cylinder extends Circle implements Volume{

    private double height;

    public Cylinder(double radius, double height,String name){
	super(radius,name);
	this.height = height;
    }

    public double getHeight(){
	return height;
    }

    public double getVolume(){
	return getRadius() * getRadius() * 3.14159265 * height;
    }

    public String toString(){
	return "Name: "+getName()+" Radius: "+getRadius()+" Height: "+height;
    }
}
