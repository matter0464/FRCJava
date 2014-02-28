/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Victor;

/**
 *
 * @author Jacob
 */
public class Shooter extends Thread {
    //Shooter Victors
    Victor SL1 = new Victor(5);
    Victor SL2 = new Victor(5);
    Victor SR1 = new Victor(5);
    Victor SR2 = new Victor(5);

//Full speed fire
    public void Fire() {
        SL1.set(0.25);
        Timer.delay(0.05);
    }

}
