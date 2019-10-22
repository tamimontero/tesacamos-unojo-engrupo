package ar.com.ada.store.categories.clothes;

import ar.com.ada.store.Products;

public class Clothes extends Products {

    public Clothes() {
    }

    public Clothes(Double price, String productName, String departmentClothes) {
        super(price, productName, departmentClothes);
    }

    @Override
    public Double calculateDiscount() {
        if (departmentClothes.equals("Mujer") || departmentClothes.equals("Niño")) {
            discountPrice = price * 0.85;
        }
        return discountPrice;
    }
}
