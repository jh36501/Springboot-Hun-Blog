package com.hun.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller // 스프링이 com.hun.blog 패키지 이하를 스캔해서 모든 파일을 메모리에 new 하는 것은 아니다.
					// 특정 annotation(@)이 붙어있는 클래스 파일들을 new 하여(IoC, 제어의 역전) 스프링 컨테이너에 관리해준다.
@RestController
public class BlogControllerTest {
	
	//http://localhost:8080/test/hello
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hello spring boot</h1>";
	}
}
