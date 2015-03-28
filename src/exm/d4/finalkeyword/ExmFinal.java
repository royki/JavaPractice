package exm.d4.finalkeyword;

public class ExmFinal {

	//final keyword can be applied to data, method & classes
	//final data is a constant. Can't be changed
	//final method can't be overridden
	//final classes can't be extended
	
	final double pi = 3.14;
	
	public void methodA(){
		//pi = 4.0; -> can't possible  
		System.out.println(pi);
	}	
}
