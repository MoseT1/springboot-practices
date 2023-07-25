package ex02;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 
 * SpringBoot Test Integration
 * 
 * 자기 패키지 밑에서 다 찾음.
 * 
 */
@SpringBootTest
public class MyApplicationTest {
	@Autowired
	MyComponent myComponent;

	
	@Test
	public void testMymyComponentNotNull() {
		assertNotNull(myComponent);
	}
}
