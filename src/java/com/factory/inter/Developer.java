/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.factory.inter;
import com.factory.inter.Interview;
/**
 *
 * @author Kolade
 */
public class Developer implements Interview {

    @Override
    public void askQuestion() {
        System.out.println("What is Design Pattern in OOP?");
    }
    
    @Override
    public void withdrawal(int balance) {
        
        if (balance != 0){
            System.out.println("Transaction successful");
        }
        else{
            System.out.println("Insufficient funds to perform this transaction, your balance is zero naira");
        }
    }
    
}
