package myweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyWebApplication {
	
	
	public static void main(String[] args) {
		
		//Web에서는 쓰레드를 종료하면 안되므로 try~catch를 하지 않는다. 
		
		SpringApplication.run(MyWebApplication.class, args);
	}
}
