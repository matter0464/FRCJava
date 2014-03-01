/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Victor;

/**
 *
 * @author Jacob
 */
public class Shooter extends Thread {
    //Shooter Victors
    Joystick co = new Joystick(3);
    Victor SL1 = new Victor(7);
    Victor SL2 = new Victor(8);
    Victor SR1 = new Victor(9);
    Victor SR2 = new Victor(10);

//Full speed fire
    public void run() {
        
        
        
    }
 public void Fire() {
                
                SL1.set(0.2);
                SL2.set(0.2);
                SR1.set(-0.2);
                SR2.set(-0.2);
                Timer.delay(0.025);
                SL1.set(0.4);
                SL2.set(0.4);
                SR1.set(-0.4);
                SR2.set(-0.4);
                Timer.delay(0.015);
                SL1.set(0.6);
                SL2.set(0.6);
                SR1.set(-0.6);
                SR2.set(-0.6);
                Timer.delay(0.010);
                SL1.set(0.8);
                SL2.set(0.8);
                SR1.set(-0.8);
                SR2.set(-0.8);
                Timer.delay(0.005);
                SL1.set(1.0);
                SL2.set(1.0);
                SR1.set(-1.0);
                SR2.set(-1.0);
                Timer.delay(0.4);
                SL1.set(0.0);
                SL2.set(0.0);
                SR1.set(0.0);
                SR2.set(0.0);
                Timer.delay(1.0);
    }
}
