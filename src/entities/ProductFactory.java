package entities;
//Should have the control and logic to create product objects

public class ProductFactory {
    public Products createProduct(String category)
    {
        switch (category.toLowerCase()){
            case "electronics":
                return  new ElectronicProduct();
            case "clothing":
                return  new ClothingProduct();
                //In future if needed we can add more products
            default:
                throw new IllegalArgumentException("Invalid category asked :" + category);

        }
    }
}
