class Product{
    private String name;
    private int price;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        if(price < 50){
            throw new RuntimeException();
        }
        this.price = price;
    }

    
}


public class ProductDemo{
    public static void main(String[] args) {
        Product p = new Product();
        // p.price = -99;
        p.setPrice(-99);
    }
}