package ro.fasttrackit.temacurs16.ex2;

public class Fruits implements ShopItem{
    private final String name;
    private final int price;
    private final Category category;
    public Fruits(String name, int price, Category category){
        this.name = name;
        this.price = price;
        this.category = category;
    }
    public String name(){
        return name;
    }
    public int price(){
        return price;
    }
    public Category category(){
        return category;
    }
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }
}
