/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author danie
 */
public class NumberValidation {

    public String validateNumber(Integer number) {
        String returnMessage = "";
        
        returnMessage += this.isMultipleOfThree(number) ? this.getMultipleOfThreeMessage() : "";
        returnMessage += this.isMultipleOfFive(number) ? this.getMultipleOfFiveMessage() : "";
        

        return returnMessage.equals("") ? number.toString() : returnMessage;
    }

    protected boolean isMultipleOfThree(Integer number) {
        return number % 3 == 0;
    }

    protected boolean isMultipleOfFive(Integer number) {
        return number % 5 == 0;
    }
    
    protected String getMultipleOfThreeMessage() {
        return "Fizz";
    }
    
    protected String getMultipleOfFiveMessage() {
        return "Buzz";
    }
}
