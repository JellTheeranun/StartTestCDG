package Array;

import java.util.ArrayList;

public class ListDemo {

    public static void main(String[] args) {
        ArrayList<MyDate> myDates = new ArrayList<MyDate>();
        MyDate date1 = new MyDate();
        date1.setYear(2018);
        
        MyDate date2 = new MyDate();
        date2.setYear(2019);
        MyDate date3 = date2;
        
        myDates.add(date1); 
        myDates.add(date2);
        myDates.add(date3);
        
        for (MyDate myDate : myDates) {
        	System.out.println(myDate.getYear());
        }
        
    }

}
