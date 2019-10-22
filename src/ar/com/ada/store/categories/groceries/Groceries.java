package ar.com.ada.store.categories.groceries;

import ar.com.ada.store.Cart;
import ar.com.ada.store.Products;

public class Groceries extends Products {

    public Groceries() {
    }

    public Groceries(Double price, String productName) {
        super(price, productName);
    }

    @Override
    public Double calculateDiscount() {
        int day = Cart.getDay();
        if (day == 2 || day == 4) {
            discountPrice = price * 0.9;
        }
        return discountPrice;
    }
}