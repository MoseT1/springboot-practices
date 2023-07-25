package ex03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import ex03.component.MyComponent;


@SpringBootConfiguration
@ComponentScan				// 패키지를 지정 안함. 그래도 성공함.  SpringBootConfiguration을 맨 위에 두고, ComponentScan하면 하부를 자동스캔한다.
public class MyApplication {

	public static void main(String[] args) {
		try (ConfigurableApplicationContext ac = SpringApplication.run(MyApplication.class, args)) {

		}
	}

}
