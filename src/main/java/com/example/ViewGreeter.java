package com.example;

import com.vaadin.spring.annotation.SpringComponent;
import com.vaadin.spring.annotation.ViewScope;

@SpringComponent
@ViewScope
public class ViewGreeter {
	public String sayHello(){
		return "Hola desde el ViewGreeter "+toString();
	}
}
