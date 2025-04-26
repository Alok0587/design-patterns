package design.patterns.creational.builder.classic;

import java.util.Date;

public class OrderBuilderDirector {
    private final design.patterns.creational.builder.classic.ConcreteOrderBuilder orderBuilder;

    public OrderBuilderDirector(design.patterns.creational.builder.classic.ConcreteOrderBuilder orderBuilder) {
        this.orderBuilder = orderBuilder;
    }

    public Order construct() {
         orderBuilder.buildOrderDate(new Date(22081997));
         orderBuilder.buildId(1234567);
         orderBuilder.buildSku(12345670);
         orderBuilder.buildQuantity(12);
         return orderBuilder.build();
    }
}
