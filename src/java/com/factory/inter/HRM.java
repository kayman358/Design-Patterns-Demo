/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.factory.inter;

/**
 *
 * @author Kolade
 */
public class HRM implements Interview {

    @Override
    public void askQuestion() {
        System.out.println("What do you think you can take home as your least expected salary?");
    }

   @Override
    public void withdrawal(int balance) {
       
        if (balance <= 1000){
            System.out.println("Insufficient funds to perform this transaction");
        }else{
            System.out.println("You have successfully withdrawn from your account");
        }
    }
    
}
