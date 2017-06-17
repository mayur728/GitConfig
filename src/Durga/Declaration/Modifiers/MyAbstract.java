package Durga.Declaration.Modifiers;

public abstract  class MyAbstract {
	
	 public abstract void meh();
	 abstract void add();
	 public void sub(){
		 
	 }
	
}
class MyImplementation extends MyAbstract implements MyInterface{

	private int i;
	@Override
	public void meh() {
		// TODO Auto-generated method stub
		
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}
	MyAbstract abc=new MyImplementation();
	MyInterface mi=new MyImplementation();

}
