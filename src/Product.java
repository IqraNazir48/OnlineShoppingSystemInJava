public class Product {
    public int pId;
    public String  pName;
    public int pQuantity;
    public double pPrice;


    //constructor
    Product(){

    }
    public Product(int pId,String pName, int pQuantity, double pPrice) {
        this.pId = pId;
        this.pName = pName;
        this.pQuantity = pQuantity;
        this.pPrice = pPrice;
    }
    //setters and getters
    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getpQuantity() {
        return pQuantity;
    }

    public void setpQuantity(int pQuantity) {
        this.pQuantity = pQuantity;
    }

    public double getpPrice() {
        return pPrice;
    }

    public void setpPrice(double pPrice) {
        this.pPrice = pPrice;
    }



    @Override
    public String toString() {
        return "ProductId:" +
                pId +
                "  ProductName:" + pName  +
                "  ProductQuantity:" + pQuantity +
                "  ProductPrice:" + pPrice ;

    }
}
