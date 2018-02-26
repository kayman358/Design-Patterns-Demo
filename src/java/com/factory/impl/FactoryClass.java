/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.factory.impl;

import com.factory.inter.Developer;
import com.factory.inter.HRM;
import com.factory.inter.Interview;

/**
 *
 * @author Kolade
 */
public class FactoryClass {
    public Interview getInterviewer(String str){
        switch(str){
             case("Developer"):
                 return new Developer();
        
        default:
            return new HRM();
    }
    }
    public Interview withdrawCash(String accountType){
        if (accountType.equals("Current")){
            return new Developer();
        }else 
            return new HRM();
    }
}
