package hoja9;
public class FactoryTree {

	public FactoryTree(){
		
	}
	
	public iTree choose(String comp){
		switch(comp){
		case "1":
			return new TwoThreeTree();
		case "2":
			return new SplayBST();
		}
		return null;

	}
}