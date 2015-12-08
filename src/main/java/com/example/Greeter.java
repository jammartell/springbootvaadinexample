package com.example;

import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.UIScope;

@SpringComponent
@UIScope
public class Greeter {
	public String sayHello(){
		return "Hola desde el greeter "+toString();
	}
}
