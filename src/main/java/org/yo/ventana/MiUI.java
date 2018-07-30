/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yo.ventana;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

/**
 *
 * @author juan_
 */

@SpringUI
@Theme("valo")
public class MiUI extends UI{
 protected void init(VaadinRequest request) {
  Window subWindowExamen = new Window("Examen");
    subWindowExamen.setClosable(false);
    VerticalLayout subContentExamen = new VerticalLayout();
    subContentExamen.addComponent(new Label("hola"));
    subWindowExamen.setContent(subContentExamen);
    subWindowExamen.center();
    addWindow(subWindowExamen);
 }   
}
