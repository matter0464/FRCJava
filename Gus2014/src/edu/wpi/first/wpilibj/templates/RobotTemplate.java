
package edu.wpi.first.wpilibj.templates;


import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Dashboard;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SimpleRobot;
import edu.wpi.first.wpilibj.Victor;

public class RobotTemplate extends SimpleRobot {
    RobotDrive drive;
    Victor SL1, SL2, SR1, SR2, IntakeLeft, IntakeRight;
    Compressor comp;
    Shooter shooter;
    DriverStation ds;
    Dashboard DS;
    
    public void robotInit() {
        //Drivetrain
        drive = new RobotDrive(1,2,3,4);
        //Compressor
        comp = new Compressor(8,1);
        //Intake victors
        IntakeLeft = new Victor(5);
        IntakeRight = new Victor(5);
        //Start Compressor
        comp.start();
        //Shooter Thread
        shooter = new Shooter();
        shooter.run();
        DS.addInt(50);
    }
    
    
    
    public void autonomous() {
      
    }

    /**
     * This function is called once each time the robot enters operator control.
     */
    public void operatorControl() {
            shooter.Fire();
            
    }
    
    /**
     * This function is called once each time the robot enters test mode.
     */
    public void test() {
    
    }
}
