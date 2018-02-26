/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prototype;

/**
 *
 * @author Kolade
 */
public class Prototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bs = new BookShop();
        bs.setShopName("Holy BookShop");
        bs.loadData();
        
        
        
        BookShop bs1 = (BookShop) bs.clone(); 
        bs.getBooks().remove(2);
        bs1.setShopName("Lawal BookShop");
        System.out.println(bs);
        System.out.println(bs1);
    }
}
