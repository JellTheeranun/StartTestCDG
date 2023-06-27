package Array;

import java.util.HashMap;
import java.util.Map.Entry;

public class DemoMap {

    public static void main(String[] args) {
        HashMap<Integer, MyDate> myDates = new HashMap<Integer, MyDate>();
        MyDate date1 = new MyDate();
        date1.setYear(2018);
        
        MyDate date2 = new MyDate();
        date2.setYear(2019);
        MyDate date3 = date2;
        
        
        myDates.put(1, date1);
        myDates.put(2, date2);
        myDates.put(3, date3);
        myDates.put(4, date1);
        for(Entry<Integer, MyDate> myDate : myDates.entrySet()) {
        	System.out.println("key["+ myDate.getKey() + "]year["+ myDate.getValue().getYear()+"]");
        }
        
        MyDate myDate = myDates.get(2);
        System.out.println("year[" + myDate.getYear() + "]");
        
        
    }

}