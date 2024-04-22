/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP 15ZBOOK G3
 */
import java.util.Scanner;

public class Ecommercesystem {

    public static void main(String[] args) {

        int[] product;

        Electronic_Product e = new Electronic_Product(1, "smartphone", 599.99f, 1, "samsung");

        clothing_product cloth = new clothing_product(2, "T-shirt", 19.99f, "cotton", "Meduim");

        book_product b = new book_product(3, "oop", 39.99f, "O'Reilly", "X Publisher");

        Scanner input = new Scanner(System.in);

        System.out.println("welcome to the E_commerce System !");
        System.out.println("please enter your id ");
        int id = input.nextInt();
        System.out.println("please enter your name");
        String nam = input.next();
        System.out.println("please enter your address");
        String adres = input.next();

        customer cust = new customer(id, nam, adres);

        System.out.println("How many products you want to add to your cart");
        int productnum = input.nextInt();

        cart1 c = new cart1(id, productnum);

        for (int i = 0; i < productnum; i++) {
            System.out.println("which product would you like ? 1-smartphone  2-T-shirt  3-oop ");
            int num = input.nextInt();
            c.addproducts(num, productnum);
        }
        float tot = c.calculatePrice();
        String[] pro = c.get_products();
        order o = new order(id, productnum, pro, tot);

        System.out.println("your total is :" + tot + "  would you like to place order ? 1-yes 2-no");
        int dic = input.nextInt();
        if (dic == 1) {
            o.orderinfo(id, pro, tot);
        } else {
            System.out.println("thank you for visiting our E_commerce System ");
        }

    }
}
