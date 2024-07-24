import java.util.ArrayList;
public class Cart {
    ArrayList<Product> products =new ArrayList<>();

    //adding product to cart
    public void addProductToCart(Product product){
        products.add(product);
    }
    //removing product from cart
    public void removeProductFromCart(Product product){
        products.remove(product);
    }
    public int getCartSize(){
        return products.size();
    }
    public void displayCart(){
        System.out.println("Your Cart contains following items:");
        int i=1;
        for(Product product:products){
            //will display the toString
            System.out.print("Product Name: "+product.getpName()+"   Product Price per item: "+product.getpPrice());
            System.out.println();
            i++;
        }
    }
}
