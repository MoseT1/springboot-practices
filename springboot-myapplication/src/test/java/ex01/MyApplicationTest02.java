package ex01;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 
 * SpringBoot Test Integration
 * 
 * Error
 * SpringBoot Test Integration(@SpringBoot)에서는 
 * @Configuration을 달고있는 설정 클래스를 스캔하지 못한다.
 * @SpringBootConfiguration을 달고있어야 한다.
 */
@SpringBootTest
public class MyApplicationTest02 {
	@Autowired
	MyComponent myComponent;

	
	@Test
	public void testMymyComponentNotNull() {
		assertNotNull(myComponent);
	}
}
