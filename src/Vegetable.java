public class Vegetable extends Product{
    String texture;
    String season;//cooked/uncooked
    Vegetable(int id,String name,int quantity,double price,String texture,String season){
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
    public String toString(){
        return "Vegetable Name: "+this.pName+"  Vegetable id: "+this.pId+"  Vegetable Price per Item: "+this.pPrice+"  Vegetable Texture: "+this.texture+"  Vegetable Season: "+this.season;

    }
}
