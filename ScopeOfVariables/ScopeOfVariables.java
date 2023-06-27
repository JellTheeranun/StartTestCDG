package ScopeOfVariables;

public class ScopeOfVariables {
public static void main(String[] args) {
		
	}
	private int sum;//MemberVariable(Class Level Scope
	private int max;//MemberVariable(Class Level Scope
	
	public void process() {
		int newMax = 50;//Local Variable(Method Level Scope)
		this.max = newMax;
		for(int i =0; i< max; i++) {
			sum =sum + i;
			
			String detail = "No. ";//Loop Variable(Loop Level Scope)
			detail = detail + i;//Loop Variable(Loop Level Scope)
			
			System.out.println("Loop " + detail);
		}
	}
	
	
	}



