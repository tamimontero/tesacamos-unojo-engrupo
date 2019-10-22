package ar.com.ada.store;

import ar.com.ada.store.categories.toys.Toys;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Cart {
    int day;
    int toyCounter = 0;
    int productCounter = 0;
    int paymentMethod;
    Double totalDiscount;
    Double totalPaymentWithDiscount;
    Double totalPaymentWithOutDiscount;
    ArrayList<Products> arrayProductos = new ArrayList<Products>();

    public Cart() {
    }

    public static int getDay() {
        Calendar now = Calendar.getInstance();
        return now.get(Calendar.DAY_OF_WEEK);
    }

    public int getToyCounter() {
        return toyCounter;
    }

    public void addToToyCounter() {
        this.toyCounter++;
    }

    public int getProductCounter() {
        return productCounter;
    }

    public void addToProductCounter() {
        this.productCounter++;
    }

    public int getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod() {
        System.out.println("Elija el método de pago: 1- Efectivo 2-Tarjeta de Crédito 3-Tarjeta de Débito");
        Scanner keyboard = new Scanner(System.in);
        int userOption = keyboard.nextInt();
        if (userOption <= 1 || userOption >= 3) {
            System.out.println("La opción ingresada es inválida");
        setPaymentMethod();
        }
        this.paymentMethod = userOption;
    }

    public Double getTotalDiscount() {
        return totalDiscount;
    }

    public void setTotalDiscount(Double totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public Double getTotalPaymentWithDiscount() {
        return totalPaymentWithDiscount;
    }

    public void setTotalPaymentWithDiscount(Double totalPaymentWithDiscount) {
        this.totalPaymentWithDiscount = totalPaymentWithDiscount;
    }

    public Double getGetTotalPaymentWithOutDiscount() {
        return totalPaymentWithOutDiscount;
    }

    public void setGetTotalPaymentWithOutDiscount(Double getTotalPaymentWithOutDiscount) {
        this.totalPaymentWithOutDiscount = getTotalPaymentWithOutDiscount;
    }

    public void addToCart(Products prodToAdd) {
        this.arrayProductos.add(prodToAdd);
        addToProductCounter();
        if (prodToAdd instanceof Toys) {
            addToToyCounter();
        }
    }


}
