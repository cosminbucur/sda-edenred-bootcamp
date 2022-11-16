package com.sda.spring.boot;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyComponentTest {

	@Autowired
	private MyComponent myComponent;

	@Test
	void complexOperation() {
		String actual = myComponent.complexOperation();

		assertThat(actual).isEqualTo("ok");
	}
}