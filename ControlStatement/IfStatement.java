package ControlStatement;


public class IfStatement {
public static void main(String[] args) {
		
	}

	public void ifThenElse() {//Ifแบบต่างๆ
		int score = 79;
		
		if (score >= 80) System.out.println("Grade A");
		
		if (score >= 80) {
			System.out.println("Grade A");
		}
		
		if(score >= 80) System.out.println("Grade A");
		else System.out.println("Grade F");
		
		if (score >= 80){ System.out.println("Grade A");
		}else if (score >= 70) {System.out.println("Grade B");
		}else if (score >= 60) {System.out.println("Grade C");
		}else if (score >= 50) {System.out.println("Grade D");
		}
	}
}
