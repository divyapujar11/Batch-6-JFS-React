
public class WrapperDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=5; //Primitive datatype
		
		Integer i1= new Integer(i); //Wrapper class (datatype is used as object) (wrapping)
		
		int j = i1.intValue(); //to convert object datatype to primitive datatype i,e assign object value to primitive value  (unwrapping)
		
		Integer value = i;  //assign primitve value to object value (autoboxing)
		
		int k = value;  //(autounboxing) assign object value to primitve value
	
		String str ="123";
		
		int n = Integer.parseInt(str); //assign object value to primitive value
		
		// Wrapping classes are used in frameworks for their specific use
		// wrapper classes are slower than primitive datatypes
		//primitive datatypes work faster than wrapper classes
		/* Wrapper class contains following datatypes:
		 * Integer - int
		 * Byte - byte
		 * Long - long
		 * Double - double
		 * Boolean - boolean
		 * Float - float
		 * Char - char
		 */
		
		 */
	}

}
