/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP 15ZBOOK G3
 */
public class order {
    
    int customerid;
    int nproduct;
  String [] products  ;
 float totalprice; 
 
 public order(int id,int productnum,String [] prod,float totalpric){
   customerid= id;
     nproduct =productnum;
   products= prod ;
  totalprice=totalpric;
 }

public void orderinfo(int customerid,String []products,float totalprice ){
    System.out.println("order ID :1");
    System.out.println("customer ID"+customerid);
    System.out.println("products"+products);
    System.out.println("total price"+totalprice);


}



}
