public class Dress extends Product {
    String dressStuff;
    String dressDesigner;
    Dress(int id,String name,int quantity, double price,String dressStuff,String dressDesigner){
        super(id,name,quantity,price);
        this.dressStuff=dressStuff;
        this.dressDesigner=dressDesigner;
    }
    //SETTERS AND GETTERS

    public String getDressStuff() {
        return dressStuff;
    }

    public void setDressStuff(String dressStuff) {
        this.dressStuff = dressStuff;
    }

    public String getDressDesigner() {
        return dressDesigner;
    }

    public void setDressDesigner(String dressDesigner) {
        this.dressDesigner = dressDesigner;
    }
    public String toString(){
        return "Dress Name: "+this.pName+"  Dress id: "+this.pId+"  Dress Price per Item: "+this.pPrice+"  Dress stuff: "+this.dressStuff+"  Dress Designer: "+this.dressDesigner;

    }
}