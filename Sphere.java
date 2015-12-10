public class Sphere extends Circle implements getVolume{

    public Sphere(double radius, String name){
	super(radius,name);
    }

    public double getVolume(){
	return (4.0/3.0)*3.14159265*radius*radius*radius;
    }

    public String toString(){
	return "Name: "+name+" Radius: "+radius;
    }
}
