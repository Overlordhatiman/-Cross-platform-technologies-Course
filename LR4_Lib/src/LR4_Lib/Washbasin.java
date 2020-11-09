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
public class Washbasin extends Device{
    private int temperature;
    private int power;

    @Override
    public String toString() {
        return "Washbasin{" + "temperature=" + temperature + ", power=" + power + '}';
    }

    public Washbasin(int temperature, int power) {
        super();
        this.temperature = temperature;
        this.power = power;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    
}
