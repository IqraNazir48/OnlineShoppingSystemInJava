
import java.util.Scanner;

public class Costumer extends User {
    private Address address;
    Cart cart=new Cart();
    Scanner sc = new Scanner(System.in);
    double previous_shopping=0;
    Costumer(){

    }

    Costumer(int id,String name,String email,String password ,Address address) {
        super(id,name,email,password);
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    //dealing with file


    public void displayMenu() {
        System.out.println("------Welcome to Shopping Hub!----");
        System.out.println("Categories of items:");
        System.out.println("Fruits\nVegetables\nCosmetics\nBooks\nClothes");
        System.out.println("Enter 1 to go to Fruit Shop!");
        System.out.println("Enter 2 to go to Vegetables Shop!");
        System.out.println("Enter 3 to go to Cosmetics Shop!");
        System.out.println("Enter 4 to go to Books Shop!");
        System.out.println("Enter 5 to go to Clothes Shop!");
    }
    public Product[][] displayCatagories(int choice) {
        Product[][] store = new Product[5][];
        //int pId,String pName, int pQuantity, double pPrice, String pColor
        Fruit apple = new Fruit(110, "Apple", 1, 100.0,"Crunchy","Winter");
        Fruit banana = new Fruit(111, "Banana", 1, 200.0,"Soft","Autumn");
        Fruit mango = new Fruit(112, "Mango", 1, 300.0,"Fibrous","Summer");
        Fruit pineApple = new Fruit(113, "PineApple", 1, 400.0,"Fibrous","Summer");

        Vegetable onion = new Vegetable(210, "Onion", 1, 50,"Fibrous","Summer");
        Vegetable potato = new  Vegetable(211, "Potato", 1, 100,"Crunchy","Winter");
        Vegetable cucumber = new Vegetable(212, "Cucumber", 1, 150,"Fibrous","Summer");
        Vegetable carrot = new Vegetable(213, "Carrot", 1, 200,"Fibrous","Winter");

        Cosmetic lipstick = new  Cosmetic(310, "LipStick", 1, 2000,"Channel","Fibrous");
        Cosmetic mascara = new Cosmetic(311, "Mascara", 1, 1000,"Sky High","Soft");
        Cosmetic foundation = new Cosmetic(312, "Foundation", 1, 5000,"NARS","Soft");
        Cosmetic blush = new Cosmetic(313, "Blush", 1, 3000,"MUICIN","Crunchy");

        Book book1 = new Book(410, "Horror", 1, 3000,"The shining","Stephen King");
        Book book2 = new Book(411, "Science Fiction", 1, 3000,"Dune","Frank Herbert");
        Book book3 = new Book(412, "Biography", 1, 5000,"Into the Wild","John Krakaur");
        Book book4 = new Book(413, "History Book", 1, 5000,"1491","Charles C.Mann");

        Dress t_shirt = new Dress(510, "T-Shirt", 1, 5000,"Polyester","Nimra");
        Dress jeans = new Dress(511, "Jeans", 1, 9000,"Polyester","John");
        Dress dress = new Dress(512, "Dress", 1, 10000,"Silk","Arham");
        Dress skirt = new Dress(513, "Sneakers", 1, 20000,"Cotton","Ayesha");

        store[0] = new Product[]{apple, banana, mango, pineApple};
        store[1] = new Product[]{onion, potato, cucumber, carrot};
        store[2] = new Product[]{lipstick, mascara, foundation, blush};
        store[3] = new Product[]{book1, book2, book3, book4};
        store[4] = new Product[]{t_shirt, jeans, dress, skirt};

        if (choice < 1 || choice > 5) {
            throw new IllegalArgumentException();
        } else if (choice == 1) {
            for (Product product : store[0]) {
                Fruit fruit =(Fruit) product;
                System.out.println(fruit);
            }
        } else if (choice == 2) {
            for (Product product : store[1]) {
                Vegetable vegetable=(Vegetable) product;
                System.out.println(vegetable);
            }
        } else if (choice == 3) {
            for (Product product : store[2]) {
                Cosmetic cosmetic=(Cosmetic) product;
                System.out.println(cosmetic);
            }
        } else if (choice == 4) {
            for (Product product : store[3]) {
                Book book=(Book) product;
                System.out.println(book);
            }
        } else {
            for (Product product : store[4]) {
                Dress d=(Dress) product;
                System.out.println(d);
            }
        }
        return store;
    }

    public int getQuantity(){
        System.out.println("Enter the quantity you want to buy!");
        int quantity=sc.nextInt();
        //here the outofstock condition will be added
        while(quantity<0){
            System.out.println("Enter the quantity greater than 0!");
            quantity=sc.nextInt();
        }
        return quantity;
    }
    //getting price of the pro  duct b  uying
    public double getPrice(Product[][] products,int id,int quantity){
        for (Product[] p:products){
            for(Product product:p){
                if(product.getpId()==id){
                    return product.getpPrice()*quantity;
                }
            }

        }
        return 0.0;
    }
    //getting product on the basis of id
    public Product gettingProduct(Product[][] products,int id){
        for (Product[] p:products){
            for(Product product:p){
                if(product.getpId()==id){
                    return product;
                }
            }
        }
        return products[0][0];
    }

    public double method() {
        int goOn = 1;
        double total_price=0.0;
        while (goOn == 1) {
            displayMenu();
            int choice = 0;
            Product[][] products;
            System.out.println("Enter your choice: ");
            while (true) {
                try {
                    choice = sc.nextInt();
                    products=displayCatagories(choice);
                    break;
                }catch (IllegalArgumentException exp) {
                    System.out.println("Enter valid choice to continue!");
                }
            }

            int product_id=0;
            int product_quantity=0;
            switch(choice){
                case(1):
                {
                    System.out.println("Enter the product Id you want to buy: ");
                    product_id=sc.nextInt();
                    while(product_id<110 || product_id>113){
                        System.out.println("Enter the valid id!");
                        product_id=sc.nextInt();
                    }
                    product_quantity=getQuantity();
                    break;
                }
                case(2):
                {
                    System.out.println("Enter the product Id you want to buy: ");
                    product_id=sc.nextInt();
                    while(product_id<210 ||  product_id>213){
                        System.out.println("Enter the valid id!");
                        product_id=sc.nextInt();
                    }
                    product_quantity=getQuantity();
                    break;
                }
                case(3):
                {
                    System.out.println("Enter the product Id you want to buy: ");
                    product_id=sc.nextInt();
                    while(product_id<310 || product_id>313){
                        System.out.println("Enter the valid id!");
                        product_id=sc.nextInt();
                    }
                    product_quantity=getQuantity();
                    break;
                }
                case(4):
                {
                    System.out.println("Enter the product Id you want to buy: ");
                    product_id=sc.nextInt();
                    while(product_id<410 || product_id>413){
                        System.out.println("Enter the valid id!");
                        product_id=sc.nextInt();
                    }
                    product_quantity=getQuantity();
                    break;
                }
                case(5):
                {
                    System.out.println("Enter the product Id you want to buy: ");
                    product_id=sc.nextInt();
                    while(product_id<510 || product_id>513){
                        System.out.println("Enter the valid id!");
                        product_id=sc.nextInt();
                    }
                    product_quantity=getQuantity();
                    break;
                }
            }
            double price=getPrice(products,product_id,product_quantity);
            Product product_bought=gettingProduct(products,product_id);
            cart.addProductToCart(product_bought);
            System.out.println("Product details:");
            System.out.println("Id: "+product_bought.getpId());
            System.out.println("Name: "+product_bought.getpName());
            System.out.println("Price per Item: "+product_bought.getpPrice());
            System.out.println("Quantity you bought: "+product_quantity);
            System.out.println("Total Price: "+price);
            total_price+=price;
            System.out.println("Enter 1 to continue shopping and 2 to exit!");
            goOn=sc.nextInt();
            while (goOn<1 || goOn>2){
                goOn=sc.nextInt();
                if(goOn<1 || goOn>2){
                    System.out.println("Please enter the choice from 1 and 2!");
                    goOn=sc.nextInt();
                }
            }
        }
        cart.displayCart();
        previous_shopping=total_price;
        System.out.println("Your have done the shopping of: "+total_price);
        return total_price;
    }
}
