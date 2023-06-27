package OOP;

public class Information_Hiding { //การกำหนดprivate and public ให้กับชุดข้อมูลเพื่อไม่ให้เกิดการแก้ไขข้อมูลที่สำคัญสามารถแก้ไขโดยใส่เงื่อนไข
     
	public static void main(String[] args) {
		 MyDate date = new MyDate();
	        
		 date.setDay(32); //กำหนดวันที่ไม่เหมาะสม

	        date.setMonth(2);
	        date.setDay(31); //เดือนกับวันที่ไม่สัมพันกัน

	        date.setMonth(12);
	        date.setMonth(date.getMonth()+1);//ข้อมูลที่ไม่ควรแก้ไข 
	        
	        System.out.println();
	}
         
    
    
   
}
