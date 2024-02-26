import DAL.UserDataBase;
import entities.Order;
import entities.ProductFactory;
import entities.Products;
import entities.UserAccount;
import entities.UserAccount.userAccountBuilder;

import java.util.ArrayList;
import java.util.List;

public class ShopWorldApp {
    public static void main(String[] args) {
        //Create the user Database - Singeleton
        UserDataBase userDataBase=UserDataBase.getInstance();
        ProductFactory productFactory=new ProductFactory();
        Products electronicProd= productFactory.createProduct("electronics");
        electronicProd.displayInfo();

        Products clothingProd= productFactory.createProduct("clothing");
        clothingProd.displayInfo();
        //Build the user account
        userAccountBuilder userBuilder = new userAccountBuilder("username","pwd");
        UserAccount userAccount=userBuilder.build();
        System.out.println(userAccount);

        List<Products>products=new ArrayList<>();
        products.add(electronicProd);
        products.add(clothingProd);

        //Build the order
        Order.OrderBuilder orderbuilder =new Order.OrderBuilder("orderID",products);
        Order order=orderbuilder.build();



    }
}
