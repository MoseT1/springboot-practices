package ex03;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ex03.component.MyComponent;

/**
 * 
 * SpringBoot Test Integration
 * 
 * @SpringBootTest는 자기 패키지 밑에거 자동으로 다 찾음.
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
