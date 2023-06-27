package OOP;
public class ObjectMembersByDotNotation {//เป็นการเข้าถึง attribute หรือ method ของ object นั้นๆ​
    
   
    
   
    public class Car{
        private String color;
        private String name;
        private int wheel;
        private String brand;

            public String getColor(){
              return color;
             }
            public void setColor(String color){
               this.color = color;
             }


             
    }
    public static void main(String[] args) { 
      
       car car = new car(); 
       car.setBrand("Honda");
       car.setColor("Red");
        
    }
    

}
 