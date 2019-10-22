package ar.com.ada.store.categories.toys;

import ar.com.ada.store.Products;

public class Toys extends Products {

    public Toys() {
    }

    public Toys(Double price, String productName) {
        super(price, productName);
    }

    @Override
    public Double calculateDiscount() {
        return discountPrice;
    }

    public Double calculateDiscount(int toyCounter) {
        if (toyCounter >= 3 || price >= 3000) {
            discountPrice = price * 0.75;
        }
        return discountPrice;
    }
}
