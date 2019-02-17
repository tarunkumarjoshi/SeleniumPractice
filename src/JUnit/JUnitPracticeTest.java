package JUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitPracticeTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Annotation call to @BeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Annotation call to @AfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Annotation call to @Before");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Annotation call to @After");
	}

	@Test
	public void test1() {
		System.out.println("\t1st Test Case");
	}
	
	@Test
	public void test2() {
		System.out.println("\t2nd Test Case");
	}

}
