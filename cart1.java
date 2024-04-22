/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP 15ZBOOK G3
 */
public class cart1 {

    private int customerid;
    private int nproducts;
    private float totalprice = 0;
    private String[] products;

    public cart1() {
    }

    public cart1(int customerid, int nproduct) {
        this.customerid = customerid;
        this.nproducts = nproducts;
        products = new String[nproducts];

    }

    public cart1(int customerid, int nproduct, String[] products) {
    }

    public void set_customerid(int customerid) {
        this.customerid = Math.abs(customerid);
    }

    public int get_customerid() {
        return customerid;
    }

    public void set_nproduct(int nproducts) {
        this.nproducts = nproducts;
    }

    public int get_nproduct() {
        return nproducts;
    }
    
    public void set_products(int nproduct){
                products = new String[nproducts];

    }

    public void addproducts(int productnum,int indexnum) {
        products = new String[indexnum];

        if (productnum == 1) {
            products[0] = "smartphone";
            totalprice += 599.99;
        } else if (productnum == 2) {
            products[1] = "T-shirt";
            totalprice += 19.99;
        } else if (productnum == 3) {
            products[2] = "oop";
            totalprice += 39.99;
        } else {
            System.out.println("there isn't more product");
        }
    }
public String [] get_products(){return products;}
    
    public void removeproduct(int productnum) {
        for (int i = 1; productnum <= nproducts; i++) {
            if (productnum == 1) {
                products[i] = "null";
            } else if (productnum == 2) {
                products[i] = "null";
            } else if (productnum == 3) {
                products[i] = "null";
            } else {
                System.out.println("there isn't more product");
            }
        }
    }

    public float calculatePrice() {

        return totalprice;
    }

}
