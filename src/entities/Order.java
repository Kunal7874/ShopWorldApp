package entities;

import java.util.List;

public class Order {
    private String orderId;
    private List<Products> products;

    private Order(Order builder)
    {
        this.orderId=builder.orderId;
        this.products=builder.products;
    }
    public static  class OrderBuilder{
        private  final  String orderId;
        private  final List<Products>products;

        public OrderBuilder(String orderId, List<Products> products) {
            this.orderId = orderId;
            this.products = products;
        }
        public Order build()
        {

            return new Order(this.build());
        }
    }


}
