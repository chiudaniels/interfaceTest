public class Cylinder extends Circle implements getVolume{

    private double height;

    public Cylinder(double radius, double height,String name){
	super(radius,name);
	this.height = height;
    }

    public double getHeight(){
	return height;
    }

    public double getVolume(){
	return radius * radius * 3.14159265 * height;
    }

    public String toString(){
	return "Name: "+name+" Radius: "+radius+" Height: "+height;
    }
}
