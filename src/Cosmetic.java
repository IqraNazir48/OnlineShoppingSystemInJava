public class Cosmetic extends Product{
    String brand;
    String texture;
    Cosmetic(int id,String name,int quantity,double price,String brand,String texture){
        super(id,name,quantity,price);
        this.brand=brand;
        this.texture=texture;
    }
    //setters and getters

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }
    public String toString(){
        return "Cosmetic Name: "+this.pName+"  Cosmetic id: "+this.pId+"  Cosmetic Price per Item: "+this.pPrice+"  Cosmetic Texture: "+this.texture+"  Cosmetic Brand: "+this.brand;

    }
}
