package ar.com.ada.store.categories.tools;

import ar.com.ada.store.Products;

public class Tools extends Products {

    public Tools() {
    }

    public Tools(Double price, String productName) {
        super(price, productName);
    }

    @Override
    public Double calculateDiscount() {
        return discountPrice;
    }

    public Double calculateDiscount(int paymentMethod) {
        if (paymentMethod == 2) {
            discountPrice = price * 0.95;
        }
        return discountPrice;
    }
}
