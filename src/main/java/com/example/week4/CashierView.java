package com.example.week4;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route(value = "/index2")
public class CashierView extends VerticalLayout {
    private TextField change, b1000, b500, b100, b20, b10, b5, b1;
    private Button btnCompute;

    public CashierView() {
        change = new TextField();
        change.setLabel("เงินทอน");
        change.setPrefixComponent(new Div(new Text("$")));
        btnCompute = new Button("คำนวณเงินทอน");
        b1000 = new TextField();
        b1000.setPrefixComponent(new Div(new Text("$1000:")));
        b500 = new TextField();
        b500.setPrefixComponent(new Div(new Text("$500:")));
        b100 = new TextField();
        b100.setPrefixComponent(new Div(new Text("$100:")));
        b20 = new TextField();
        b20.setPrefixComponent(new Div(new Text("$20:")));
        b10 = new TextField();
        b10.setPrefixComponent(new Div(new Text("$10:")));
        b5 = new TextField();
        b5.setPrefixComponent(new Div(new Text("$5:")));
        b1 = new TextField();
        b1.setPrefixComponent(new Div(new Text("$1:")));
        add(change, btnCompute, b1000, b500, b100, b20, b10, b5, b1);

    }
}
