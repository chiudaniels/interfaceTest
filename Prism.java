public class Prism extends Rectangle implements Volume{

    private double height;

    public Prism(double length, double width, double height, String name){
	super(length,width,name);
	this.height = height;
    }

    public double getHeight(){
	return height;
    }

    public double getVolume(){
	return getWidth()*height*getLength();
    }

    public String toString(){
	return "Prism Name: "+getName()+" Length: "+getLength()+" Width: "+getWidth()+" Height: "+height;
    }
}
