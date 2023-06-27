package ControlStatement;

public class ForLoop {
public static void main(String[] args) {
		
	}
	public void forLoop() {
		int max = 10;
		
		for (int i = 0; i < max; i++) {
			System.out.println("No." + i);
		}
	}
	
	public void whileLoop() {
		int i = 10;
		
		while ( i <= 10) {
			System.out.println("No." + i);
			i++;
		}
	}
	
	public void dowhileLoop() {
		int y = 1;
		
		do{
			System.out.println("No." + y);
			y++;
		} while(y <= 10);
	}
	
	public void ForEachLoop() {
		int [] values = {1,2,3,4,5};
		
		for(int value : values){
			System.out.println("No." + value);
			
		} 
	}
	
	

}
