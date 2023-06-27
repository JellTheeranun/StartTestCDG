package DataType;

public class AutoboxingAndUnboxing {
	public static void main(String[] args) {
		
	}
		public void Autoboxing() { //การเปลี่ยนจากPrimitiveTypeเป็นWrapperClass
			
			Integer intValue = 1;
			Long longValue = 1l;
			
		}
		
		public void unboxing() {//การเปลี่ยนจากWrapperClassเป็นPrimitiveType
			Integer intValue = new Integer(1);
			Long longValue = new Long(1);
			
			int intValue2 = intValue;
			long longValue2 = longValue;
			
		}

}
