package interfaces;

public class InterfaceTest2 implements InterfaceTest, InterfaceTest3{

	@Override
	public void fliegen() {
		System.out.println("Ein Vogel fliegt");		
	}

	@Override
	public void tanken() {
		System.out.println("tank doch");
	}
	
	

}
