package com.bitacademy.springboot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


/**
 * 
 * 1. 스프링 애플리케이션 부트스트래핑 역할 : Bootstrap Class
 * 2. 설정 클래스 역할: Configuration Class
 */

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		
		/**
		 * SpringApplication.run(...) 안에서 일어나는 일(Bootstrap)
		 * 
		 * 
		 * 1. 어플리케이션 컨텍스트 (ApplicationContext, Spring Container) 생성
		 * 2. 만약, 웹 애플리케이션이라면 웹 애플리케이션의 타입(SpringMVC(tomcat이 있음), Reactive(tomcat이 없음))
		 * 3. 어노테이션 스캐닝(auto) + Configuration Class를 통한  빈 생성/등록/와이어링 작업
		 * 4. 만약, Spring MVC 이라면
		 * 		(1) Auto Configuration
		 * 		(2) 내장(embed) 서버 (class이름 : TomcatEmbededServiceServletContainer) 인스턴스 생성
		 * 		(3) 서버 인스턴스에 웹 애플리케이션을 배포
		 * 		(4) 서버 인스턴스 실행
		 * 		(5) ApplicationRunner 인터페이스를 구현한 빈을 ApplicationContext에서 찾아 실행
		 *   
		 *
		 */
		
		/**
		 * run이 return하는 애는 container이다.  container는 close해주어야 한다.
		 * 
		 * 이게 완벽한 모습이다.
		 */
//		ConfigurableApplicationContext ac = null;
//		
//		try {
//			ac = SpringApplication.run(HelloWorldApplication.class, args);
//
//		} catch(Throwable ex) {
//			ex.printStackTrace();
//		} finally {
//			if(ac != null) {
//				ac.close();
//			}
//		}
		
		
		// try ~ with ~ resources 구문 (위의 코드와 같은 내용인데 좀 더 간소화). ac가 close됨.
		try(ConfigurableApplicationContext ac = SpringApplication.run(HelloWorldApplication.class, args)){
			
		}
	}

}
