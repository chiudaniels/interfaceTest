public class Circle extends Shape implements getArea{

    private double radius;

    public Circle(double radius, String name){
	super(name);
	this.radius = radius;
    }

    public double getRadius(){
	return radius;
    }
    
    public double getArea(){
	return radius* radius * 3.14159265;
    }

    public String toString(){
	return "Name: "+ name +" Radius: "+radius;
    }
}
