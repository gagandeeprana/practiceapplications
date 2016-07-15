package com.cloudsmartz;

import java.util.Date;

import com.vaadin.Application;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.Window;

public class MyUI extends Application {
	@Override
	public void init() {
		final Window mainWindow = new Window("Myproject Application");

		Label label = new Label("Hello Vaadin user");
		mainWindow.addComponent(label);

		mainWindow.addComponent(new Button("What is the time?",
				new Button.ClickListener() {
					public void buttonClick(ClickEvent event) {
						mainWindow
								.showNotification("The time is " + new Date());
					}
				}));
		setMainWindow(mainWindow);
	}
}
