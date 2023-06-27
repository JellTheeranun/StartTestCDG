package DataType;

public class AutomaticPromotionCasting​ {
	
	 public static void main(String[] args) {
	        byte byteValue1 = 1;
	        byte byteValue2 = 1;
	        byte plusByteValueToByte = (byte)(byteValue1 + byteValue2);//2.หากต้องการ data type byte ให้ใช้กระบวนการ Casting ให้เป็น byte​ให้เปลี่ยน data type ไปตาม type ที่ได้จากการ promote​
//	        1.byte plusByteValue = byteValue1 + byteValue2;ไม่สามารถกำหนด data type byte ได้เนื่องจากเกิดกระบวนการ automatic promotion​
	        int plusByteValue = byteValue1 + byteValue2;
	 }
	 
}
