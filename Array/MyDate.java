package Array;

public class MyDate {
	
	    private int day;
	    private int month;
	    private int year;
	    
	    
	    public void setDay(int day) {
	        this.day = day;
	    }
	    
	    public void setMonth(int month) {
	        this.month = month;
	    }
	    
	    public void setYear(int year) {
	        this.year = year;
	    }
	    
	    public int getDay() {
	        return day;
	    }
	    
	    public int getMonth() {
	        return month;
	    }
	    
	    public int getYear() {
	        return year;
	    }
	    
	    public void displayDate() {
	        System.out.println("Date: " + day + "/" + month + "/" + year);
	    }
	}


