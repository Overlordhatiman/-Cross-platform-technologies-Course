/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lr4_app;

import LR4_Lib.Bath;
import LR4_Lib.IDevice;
import LR4_Lib.Device;
import LR4_Lib.HydroMassage;
import LR4_Lib.Shower;
import LR4_Lib.Toilet;
import LR4_Lib.Washbasin;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nameless
 */
public class Manager implements IDevice{
    ArrayList<Device> arrDevices;
    Scanner in;

    @Override
    public void Add(Device d) {
        arrDevices.add(d);
    }

    public Manager() {
        this.arrDevices = new ArrayList<>();
        this.in = new Scanner(System.in);
    }

    @Override
    public void Delete(int id) {
        arrDevices.remove(id);
    }

    @Override
    public void Change(int id, Device d) {
        arrDevices.set(id, d);
    }
    
    void Show()
    {
        for(int i = 0; i < arrDevices.size(); i++) {   
            System.out.println("Name = " + arrDevices.get(i).getName());
            System.out.println("OnOff = " + arrDevices.get(i).isOnOff());
            System.out.println(arrDevices.get(i).toString());
        }        
    }
    
    void MainMenu()
    {
        in = new Scanner(System.in);
        System.out.println("Input number 1 - Add 2 - Remove 3 - Change");
        int num;
        int device;
        num = in.nextInt();
        
        int a = 0;
        int b = 0;
        
        Device d = null;
        
        switch(num)
        {
            default:
            case 1:                
                System.out.println("Input number 1 - Bath 2 - Shower 3 - Toilet 4 - HydroMassage");
                device = in.nextInt();
                switch(device)
                {
                    default:
                    case 1:
                        System.out.println("Input volume");
                        a = in.nextInt();
                        System.out.println("Input temperature");
                        b = in.nextInt();
                        
                        d = new Bath(a,b);
                        Add(d);
                        break;
                    case 2:
                        System.out.println("Input power");
                        a = in.nextInt();
                        System.out.println("Input temperature");
                        b = in.nextInt();
                        
                        d = new Shower(b, a);
                        Add(d);
                        break;
                    case 3:
                        System.out.println("Input power");
                        a = in.nextInt();
                        System.out.println("Input temperature");
                        b = in.nextInt();
                        
                        d = new Toilet(b, a);
                        Add(d);
                        break;
                    case 4:                        
                        System.out.println("Input power");
                        a = in.nextInt();
                        System.out.println("Input quantity");
                        b = in.nextInt();
                        
                        d = new HydroMassage(a, b);
                        Add(d);
                        break;
                    case 5:
                        System.out.println("Input power");
                        a = in.nextInt();
                        System.out.println("Input quantity");
                        b = in.nextInt();
                        
                        d = new Washbasin(b, a);
                        Add(d);
                        break;
                }
                break;
            case 2:
                System.out.println("Intput deleting object");
                int delete = in.nextInt();
                Delete(delete);
                break;
            case 3:
                System.out.println("Input number 1 - Bath 2 - Shower 3 - Toilet 4 - HydroMassage");
                int device1 = in.nextInt();
                
                System.out.println("Input position");
                int pos = in.nextInt();
                
                switch(device1)
                {
                    default:
                    case 1:
                        System.out.println("Input volume");
                        a = in.nextInt();
                        System.out.println("Input temperature");
                        b = in.nextInt();
                        
                        d = new Bath(a, b);
                        Change(pos, d);
                        break;
                    case 2:
                        System.out.println("Input power");
                        a = in.nextInt();
                        System.out.println("Input temperature");
                        b = in.nextInt();
                        
                        d = new Shower(b,a);
                        Change(pos, d);
                        break;
                    case 3:
                        System.out.println("Input power");
                        a = in.nextInt();
                        System.out.println("Input temperature");
                        b = in.nextInt();
                        
                        d = new Toilet(b, a);
                        Change(pos, d);
                        break;
                    case 4:
                        System.out.println("Input power");
                        a = in.nextInt();
                        System.out.println("Input quantity");
                        b = in.nextInt();
                        
                        d = new HydroMassage(a, b);
                        Change(pos, d);
                        break;
                    case 5:
                        System.out.println("Input power");
                        a = in.nextInt();
                        System.out.println("Input quantity");
                        b = in.nextInt();
                        
                        d = new Washbasin(b, a);
                        Change(pos, d);
                        break;
                }
                break;
                
        }
        
        Show();
    }
}
