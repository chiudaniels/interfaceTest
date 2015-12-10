public class Sphere extends Circle implements Volume{

    public Sphere(double radius, String name){
	super(radius,name);
    }

    public double getVolume(){
	return (4.0/3.0)*3.14159265*getRadius()*getRadius()*getRadius();
    }

    public String toString(){
	return "Sphere Name: "+getName()+" Radius: "+getRadius();
    }
}
