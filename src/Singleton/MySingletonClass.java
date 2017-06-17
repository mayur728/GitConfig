package Singleton;

public class MySingletonClass {
	private static volatile MySingletonClass instance=null;
	
	private MySingletonClass(){
		
	}
	public static MySingletonClass getInstance(){
		if(instance==null){
			synchronized(MySingletonClass.class){
				if(instance==null){
					instance =new MySingletonClass();
				}
			}
		}
		return instance;
	}
  
		public void finalize(){System.out.println("finalize called");}  
		public static void main(String[] args){  
			boolean b=false;
			try{
				if(b==false){
					
				}
			}
			catch(Exception e){
				
			}
			finally{
				System.out.println("HI");
			}
		}
	
}
