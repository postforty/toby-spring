package dandyspring.helloboot;

import java.util.Objects;

public class HelloController {
	public String hello(String name) {
		SimpleHelloService helloService = new SimpleHelloService();
		
		
		return helloService.sayHello(Objects.requireNonNull(name));
	}
}

// https://www.inflearn.com/course/lecture?courseSlug=%ED%86%A0%EB%B9%84-%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-%EC%9D%B4%ED%95%B4%EC%99%80%EC%9B%90%EB%A6%AC&unitId=138254&tab=curriculum