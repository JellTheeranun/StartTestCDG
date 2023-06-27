 package Array;

 import java.util.HashSet;

 public class SetDemo {

     public static void main(String[] args) {
         demoHashSet();
     }

     public static void demoHashSet() {
         HashSet<MyDate> myDates = new HashSet<MyDate>();
         MyDate date1 = new MyDate(); 
         date1.setYear(2018);
         
         MyDate date2 = new MyDate();
         date2.setYear(2019);
         MyDate date3 = date2;
         
         myDates.add(date1);
         myDates.add(date2);
         myDates.add(date3);//ใส่เข้าไปไม่ได้เพราะdate3ชี้ไปที่MyDateและที่เดียวกับdate2
         
         for (MyDate myDate : myDates) {
        	 System.out.println(myDate.getYear());
         }
     }
 }
