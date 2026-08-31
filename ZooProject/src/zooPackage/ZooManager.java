package zooPackage;

public class ZooManager {
	
	//class wide variable 
	private Zoo myZoo;
	//constructor
	public ZooManager() {
		//CREATE instance of zoo
		myZoo = new Zoo();
		
		//GET total numbers of zoos
		System.out.println("total animals in zoo: " + myZoo.getZooTotal());
	}
}