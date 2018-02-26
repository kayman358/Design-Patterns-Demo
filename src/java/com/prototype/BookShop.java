/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kolade
 */
public class BookShop implements Cloneable{
    private String shopName;
    List<Book> books = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
    
    
    public void loadData(){
        
        for (int i = 1; i <= 10; i++){
            Book b = new Book();
            b.setBid(i);
            b.setbName("Book "+i);
            getBooks().add(b);
        }
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone(); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {
      BookShop shop = new BookShop();
      for(Book b : this.getBooks()){
          shop.getBooks().add(b);
      }
      return shop;
    }
    
    @Override
    public String toString() {
        return "BookShop{" + "shopName=" + shopName + ", books=" + books + '}';
    }
}
