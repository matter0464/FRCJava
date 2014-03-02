package team.gus.robotcode;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Victor;
/**
 *
 * @author Matthew
 */
public class Shooter extends Thread {

    //Shooter Victors
    Joystick co = new Joystick(3);
    Victor SL1 = new Victor(7);
    Victor SL2 = new Victor(8);
    Victor SR1 = new Victor(9);
    Victor SR2 = new Victor(10);
    DoubleSolenoid Intake;
public Shooter(DoubleSolenoid Intake){
this.Intake = Intake;
}
//Full speed fire
    public void run() {
        try {
            
            SL1.set(0.2);
            SL2.set(0.2);
            SR1.set(-0.2);
            SR2.set(-0.2);
            Thread.sleep(25);
            SL1.set(0.4);
            SL2.set(0.4);
            SR1.set(-0.4);
            SR2.set(-0.4);
            Thread.sleep(15);
            SL1.set(0.6);
            SL2.set(0.6);
            SR1.set(-0.6);
            SR2.set(-0.6);
            Thread.sleep(10);
            SL1.set(0.8);
            SL2.set(0.8);
            SR1.set(-0.8);
            SR2.set(-0.8);
            Thread.sleep(5);
            SL1.set(1.0);
            SL2.set(1.0);
            SR1.set(-1.0);
            SR2.set(-1.0);
            Thread.sleep(400);
            SL1.set(0.0);
            SL2.set(0.0);
            SR1.set(0.0);
            SR2.set(0.0);
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
