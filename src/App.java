import ar.com.ada.store.Cart;
import ar.com.ada.store.Products;
import ar.com.ada.store.categories.clothes.Jacket;
import ar.com.ada.store.categories.clothes.Pants;
import ar.com.ada.store.categories.clothes.Tshirt;
import ar.com.ada.store.categories.groceries.Bread;
import ar.com.ada.store.categories.groceries.Flour;
import ar.com.ada.store.categories.groceries.Groceries;
import ar.com.ada.store.categories.groceries.Milk;
import ar.com.ada.store.categories.tools.Hammer;
import ar.com.ada.store.categories.tools.Nails;
import ar.com.ada.store.categories.tools.Screwdriver;
import ar.com.ada.store.categories.toys.Ball;
import ar.com.ada.store.categories.toys.Car;
import ar.com.ada.store.categories.toys.Doll;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Cart carrito = new Cart();
        boolean salida = false;


        Products groceries1 = new Bread(250.00, "Pan duro como las rocas");
        Products groceries2 = new Milk(85.50, "Leche la vaca loca");
        Products groceries3 = new Flour(100.00, "Harina sin 0");

        Products clothes1 = new Jacket(6000.00, "Campera azul", "Niño");
        Products clothes2 = new Pants(1500.00, "Babucha roja", "Mujer");
        Products clothes3 = new Tshirt(2600.00, "Remera algodón negra", "Hombre");

        Products tools1 = new Screwdriver(960.99, "Destornillador");
        Products tools2 = new Nails(450.50, "Clavos");
        Products tools3 = new Hammer(5000.00, "Martillo");

        Products toys1 = new Ball(861.00, "Pelota");
        Products toys2 = new Car(2000.00, "Autito pequeño");
        Products toys3 = new Doll(6000.75, "Ken en bikini");

        ArrayList<Products> productsArrayList = new ArrayList<Products>();
        productsArrayList.add(groceries1);
        productsArrayList.add(groceries2);
        productsArrayList.add(groceries3);
        productsArrayList.add(clothes1);
        productsArrayList.add(clothes2);
        productsArrayList.add(clothes3);
        productsArrayList.add(tools1);
        productsArrayList.add(tools2);
        productsArrayList.add(tools3);
        productsArrayList.add(toys1);
        productsArrayList.add(toys2);
        productsArrayList.add(toys3);

        System.out.println("Bienvenido a la tienda 'Te sacamos los dos ojos'");
        System.out.println("Aquí encontrarás las ofertas más locas del mercado");

        do {
            System.out.println("Elija la opción deseada: 1-Alimentos 2-Indumentaria 3-Herramientas 4-Juguetes");
            Scanner keyboard = new Scanner(System.in);
            int userOption = keyboard.nextInt();

            switch (userOption) {
                case 1:
                    System.out.println("¿Qué Alimento de la lista deseas agregar al carrito?");
                    for (int i = 0; i < productsArrayList.size(); i++) {
                        if (productsArrayList.get(i) instanceof Groceries) {
                            System.out.println(i + " " + productsArrayList.get(i).getProductName() + " " + productsArrayList.get(i).getPrice());
                        }

                    }
                    int userOption1 = keyboard.nextInt();

                    break;
                default:
                    System.out.println("La opción ingresada no es válida");

            }
        } while (salida == false);

        carrito.setPaymentMethod();
    }
}
