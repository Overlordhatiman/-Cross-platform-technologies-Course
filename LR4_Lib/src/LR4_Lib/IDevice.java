/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LR4_Lib;

/**
 *
 * @author Nameless
 */
public interface IDevice {
    void Add(Device d);
    void Delete(int id);
    void Change(int id, Device d);
}
