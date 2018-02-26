/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.factory.impl;

import com.factory.inter.Interview;
import com.factory.inter.Developer;

/**
 *
 * @author Kolade
 */
public class MainImplementation {

    public static void main(String[] args) {
        FactoryClass factory = new FactoryClass();
        Interview question = factory.getInterviewer("HRM");
        question.askQuestion();
        
        Interview money = factory.withdrawCash("Current");
        money.withdrawal(1000);
    }

}
