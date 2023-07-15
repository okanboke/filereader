package com.qualifierannotation.filereader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FilereaderApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilereaderApplication.class, args);
	}

	@Bean("WORD") //Bean anotasyonu ile IoC içerisine atıyoruz Methot ismi Qualifier anotasyonu içerisine yazıldığında çalışır.
	//Parantez içerisinde WORD Qualifier anotasyonu içerisine yazılırsa yine çalışacaktır.
	public WordFileReader getWordFileReader() {
		return new WordFileReader();
	}
}
