public class Fruit extends Product{

    String texture;
    String season;
    Fruit(int id,String name,int quantity,double price,String texture,String season){
        super(id,name,quantity,price);
        this.texture=texture;
        this.season=season;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    @Override
    public String toString() {
        return "FruitName: "+this.pName+"  Fruit id: "+this.pId+"  Fruit Price per Item: "+this.pPrice+"  Fruit Texture: "+this.texture+"  Fruit Season: "+this.season;
    }
}
