package OOP;
public class Inheritance {//การสืบทอดคุณสมบัติจาก Class แม่ ไปสู่ Class ลูก จากตัวอย่างคือ Employee ไปสู่ Manager
    public static void main(String[] args) {

    }
    public class Employee {
        public String name;
        public int salary;

        public String getDetails() {
               this.name = "Amarin Sangkarat";
               this.salary = 10000;
               return "Name ["+ name +"] Salary[" + salary +"]";
        }

        public void setDetails(String name, int salary ){
         this . name = name;
         this.salary = salary;   
        }
    }

    public class Manager extends Employee {
        public String department;

        public String getDetails(){
            this.name = "Jojo Jotaro";
            this.salary = 50000;
            this.department = "Application Development";
            return department + "Manager Name [" + name +"] Salary [" + salary +"]";
        }

        public void setDetails(String name, int salary, String department ) {
            this.name = name;
            this.salary = salary;
            this.department = department;
        }
    }

    
}
