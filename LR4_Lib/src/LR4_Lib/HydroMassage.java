/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR4_Lib;

import java.util.Scanner;

/**
 *
 * @author Nameless
 */
public class HydroMassage extends Device{
    private int power;
    private int quantity;

    public int getPower() {
        return power;
    }

    public HydroMassage(int power, int quantity) {
        super();
        this.power = power;
        this.quantity = quantity;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity > 0 && quantity < 5)
        this.quantity = quantity;
        else this.quantity = 1;
    }
    
}
