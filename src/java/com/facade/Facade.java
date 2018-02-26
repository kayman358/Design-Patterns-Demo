/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.facade;

/**
 *
 * @author Kolade
 */
public class Facade {

    public static void main(String[] args) {
        FacadeImpl shapeMaker = new FacadeImpl();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
