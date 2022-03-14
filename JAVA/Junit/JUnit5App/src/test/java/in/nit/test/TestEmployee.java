package in.nit.test;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
@TestMethodOrder(OrderAnnotation.class)
public class TestEmployee {
////	@BeforeEach
////	public void setup() {
////		System.out.println("Setup Method");
////	}
////	
////	@AfterEach
////	public void clear() {
////		System.out.println("Clear method");
////	}
//	
//	@AfterAll
//	public static void setupOnce() {
//		System.out.println("setup once");
//	}
//	
//	@BeforeAll
//	public static void clearOnce() {
//		System.out.println("clear Once");
//	}
//	
//	//test method
//	@Test
//	//@Order(3)
//	//@DisplayName("Testing save method")
//	public void testSave() {
//		System.out.println("Save test case");
//	}
//	
//	@Test
//	//@Order(1)
//	//@Disabled
//	public void testUpdate() {
//		System.out.println("Update test case");
//	}
//	
//	@Test
//	//@Order(1)
//	public void testDelete() {
//		System.out.println("Delete test case");
//	}
//	@Test
//	//@RepeatedTest(value =4 )
//	public void testMultiple(TestInfo info) {
//		//System.out.println("print multiple"+info.getTestClass().get().getName());
//		//System.out.println("print multiple"+info.getTestMethod().get().getName());
//		assertEquals("A","A");
//	}
	
	@Test
	@Tag("dev")
	public void testA() {
		System.out.println("HELLO-TEST-A");
	}
	
	@Test
	@Tag("prod")
	public void testB() {
		System.out.println("HELLO-TEST-B");
	}
}
