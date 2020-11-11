/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR4_Lib;

import java.util.Date;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Nameless
 */
public class Device {
    private String Name;
    private boolean OnOff = false;

    public Device() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Input name");
            this.Name = in.nextLine();
            
            System.out.println("Input OnOff");
            this.OnOff = in.nextBoolean();
        }
    }
    
     public String StartDev(Date _newData)   throws InterruptedException {
        TimerTask task = new TimerTask() {
            public void run() {
                OnOff = true;
                System.out.println("Устройсвто "+ Name +" включено в " + new Date());
                cancel();
            }
        };

        Timer timer = new Timer("Timer");

        timer.schedule (task, _newData);
        return "Будет включен "+ _newData;
    }

    public String getName() {
        return Name;
    }

    public boolean isOnOff() {
        return OnOff;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setOnOff(boolean OnOff) {
        this.OnOff = OnOff;
    }
}
