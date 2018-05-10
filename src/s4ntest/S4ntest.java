/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s4ntest;

import app.NumberValidation;

/**
 *
 * @author danie
 */
public class S4ntest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer numberLimit = 100;
        NumberValidation validator = new NumberValidation();
        
        for (int i = 1; i <= numberLimit; i++) {
            System.out.println(validator.validateNumber(i));
        }
    }
    
}
