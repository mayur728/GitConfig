package TutorialsPoint.Threading.Basic;

public class RunnableTest {
	public static void main(String args[]) {
	      RunnableDemo R1 = new RunnableDemo( "Thread-1");
	      R1.mayur();
	      
	      RunnableDemo R2 = new RunnableDemo( "Thread-2");
	      R2.mayur();
	   }  
}

