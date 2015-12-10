public class Prism extends Rectangle implements getVolume{

    private double height;

    public Prism(double length, double width, double height, String name){
	super(lenght,width,name);
	this.height = height;
    }

    public double getHeight(){
	return height;
    }

    public double getVolume(){
	return width*height*length;
    }

    public String toString(){
	return "Name: "+name+" Length: "+length+" Width: "+width+" Height: "+height;
    }
}
