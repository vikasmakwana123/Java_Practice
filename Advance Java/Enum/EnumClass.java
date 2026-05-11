enum Laptop {
    Macbook (2000),XPS(4000),Surface(2223),ThinkPad(3342);
    private int price;
    private Laptop(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    } 
}
public class EnumClass {
    public static void main(String[] args) {
    Laptop lap = Laptop.Macbook;
    System.out.println(lap+ " : " + lap.getPrice());
    for (Laptop lap1 :Laptop.values()){
        System.out.println(lap1+ " : " + lap1.getPrice());
    }
}
}
