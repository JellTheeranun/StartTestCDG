package OOP;
public class Information_Hiding1 {//กำหนดเงื่อนไขเพื่อจำกัดข้อมูลทำให้ข้อมูลมีความถูกต้องไม่ถูกเปลี่ยนเป็นค่าที่ผิด
    public static void main(String[] args) {
        
    }
    public class MyDate{
                private int day = 1;
                private int month = 1;
                private int year = 2562;
    
        public int getDay(){
            return day;
        }
        public void setDay(int day){
            if(day < 1 || day > 31)return;
            this.day = day;
        }
        public int getMonth(){
            return month;
        }
        public void setMonth(int month){
            if(month < 1 || month > 12)return;
            this.month = month;
        }
        public int getYear(){
            return year;
        }
        public void setYear(int year){
            if(year < 1 || year > 31)return;
            this.year = year;
        }


    }
}
