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
public class Bath extends Device{
    private int volume = 0;
    private int temperature = 0;
    
    public Bath(int volume, int temperature) {
        super();
        this.volume = volume;
        this.temperature = temperature;
    }

    @Override
    public String toString() { 
        return "volume = " + volume + " temprature = " + temperature; 
    } 
    
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        if(temperature > -20 && temperature < 50)
        this.temperature = temperature;
        else this.temperature = 0;
    }
    
}
