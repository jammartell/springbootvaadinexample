package com.example;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

@SpringView(name = ViewScopedView.VIEW_NAME,ui={MyVaadinUI.class})//con ui={MyVaadinUI2.class} no entra pues estaria restringida a la otra vista
public class ViewScopedView extends VerticalLayout implements View{

	private static final long serialVersionUID = 1L;
	public static final String VIEW_NAME = "view";

	// a new instance will be created for every view instance
    @Autowired
    private ViewGreeter viewGreeter;
    // the same instance will be used by all views of the UI
    @Autowired
    private Greeter uiGreeter;
	
   @PostConstruct
    void init() {
       setMargin(true);
       setSpacing(true);         
	   addComponent(new Label("This is the ViewScopedView"));
       addComponent(new Label(uiGreeter.sayHello()));
       addComponent(new Label(viewGreeter.sayHello()));
    }
		
	@Override
	public void enter(ViewChangeEvent event) {
		// the view is constructed in the init() method()

	}
}
