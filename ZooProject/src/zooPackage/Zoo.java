package zooPackage;

import java.util.ArrayList;

public class Zoo {
	//class wide variable for animals in zoo
	private ArrayList tigers;
	private ArrayList birds;
	
	public Zoo() {
		
		tigers = new ArrayList();
		birds = new ArrayList();
		
		//create animals
		Tiger tiger1 = new Tiger();
		Tiger tiger2 = new Tiger();
		Tiger tiger3 = new Tiger();
		Tiger tiger4 = new Tiger();
	
		Bird bird1 = new Bird();
		Bird bird2 = new Bird();
		Bird bird3 = new Bird();
		
		tigers.add(tiger1);
		tigers.add(tiger2);
		tigers.add(tiger3);
		tigers.add(tiger4);
		
		birds.add(bird1);
		birds.add(bird2);
		birds.add(bird3);
	}
	
	public int getZooTotal() {
		//Return total animals 
		return  tigers.size() + birds.size();
	}
}
