package ex05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

//@EnableAutoConfiguration은 자동으로 web 설정 해준다.

/**
 * @SpringBootApplication는 메타 어노테이션이다.(여러 어노테이션을 포함하는 어노테이션)
 * 
 * 	1. @SpringBootConfiguration : cf) ex01, ex02 참고
 * 	2. @ComponentScan 			: ex04패키지 하부를 스캐닝 한다. cf) ex03
 * 	3. @EnableAutoConfiguration :
 * 		(1) MVC, AOP, Security, JPA 등을 자동(default -> 꼭 미세설정을 참고하게 한다) 설정
 * 		(2) 발견된 Starter Dependency(Library) 기반으로 설정
 */
@SpringBootApplication
public class MyApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);
		
		System.out.println("hello world");
	}

}
