package ar.com.ada.store;

import java.util.Objects;

public abstract class Products {
    protected Double price;
    protected String productName;
    protected String departmentClothes;
    protected Double discountPrice;

    public Products() {
    }

    public Products(Double price, String productName) {
        this.price = price;
        this.productName = productName;
    }

    public Products(Double price, String productName, String departmentClothes) {
        this.price = price;
        this.productName = productName;
        this.departmentClothes = departmentClothes;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDepartmentClothes() {
        return departmentClothes;
    }

    public void setDepartmentClothes(String departmentClothes) {
        this.departmentClothes = departmentClothes;
    }

    public Double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(Double discountPrice) {
        this.discountPrice = discountPrice;
    }

    public abstract Double calculateDiscount();

}
