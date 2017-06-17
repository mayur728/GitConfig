package Durga.Declaration.Modifiers;

public abstract class Demo {
		public static void main(){
			
		}
		
		void print(){
			System.out.println("Hi");
			bye();
		}
		void bye(){
			System.out.println("bye");
			main();
		}

}
