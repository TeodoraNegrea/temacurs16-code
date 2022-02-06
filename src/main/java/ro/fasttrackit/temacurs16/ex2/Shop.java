package ro.fasttrackit.temacurs16.ex2;

import java.util.ArrayList;
import java.util.List;

public class Shop<T extends ShopItem> {
    private List<T> item;

    public Shop(List<T> item) {
        this.item = item;
    }

    public T addItem(T item) {
        return item;
    }

    public T findByCategory(Category cat) {
        List<T> elements = new ArrayList<>();
        for (Category category : cat) {
            elements.add(category);
        }
        return elements;

    }

}
