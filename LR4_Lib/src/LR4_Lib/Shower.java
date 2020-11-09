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
public class Shower extends Device{
    private int temperature;
    private int power;

    @Override
    public String toString() {
        return "Shower{" + "temperature=" + temperature + ", power=" + power + '}';
    }

    public Shower(int temperature, int power) {
        super();
        this.temperature = temperature;
        this.power = power;
    }

    public void setTemperature(int temperature) {
        if(temperature > -20 && temperature < 50)
        this.temperature = temperature;
        else this.temperature = 0;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getPower() {
        return power;
    }
}
