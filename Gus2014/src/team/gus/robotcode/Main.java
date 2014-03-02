package team.gus.robotcode;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SimpleRobot;
import edu.wpi.first.wpilibj.Victor;

public class Main extends SimpleRobot {

    RobotDrive drive;
    Victor SL1, SL2, SR1, SR2, IntakeLeft, IntakeRight;
    Compressor comp;
    Shooter shooter;
    Joystick CoDriver, Left, Right;

    public void robotInit() {
        //Drivetrain
        drive = new RobotDrive(1, 2, 3, 4);
        //Compressor
        comp = new Compressor(8, 1);
        //Intake victors
        IntakeLeft = new Victor(5);
        IntakeRight = new Victor(6);
        //Start Compressor
        comp.start();
        //Shooter Thread
        shooter = new Shooter();
        Left = new Joystick(1);
        Right = new Joystick(2);
        CoDriver = new Joystick(3);
        //  shooter.start();
        ////////////////////////////////////
        //TEST/////////////////////////////
       // SL1 = new Victor(7);
       // SL2 = new Victor(8);
       // SR1 = new Victor(9);
       // SR2 = new Victor(10);

    }

    public void autonomous() {

    }

    /**
     * This function is called once each time the robot enters operator control.
     */
    public void operatorControl() {
        while (isOperatorControl() && isEnabled()) {
            drive.tankDrive(Left, Right);

            if (CoDriver.getRawButton(1)) {
                System.out.print("Pressed");
                shooter.Fire();
        
            }

        }

    }

    /**
     * This function is called once each time the robot enters test mode.
     */
    public void test() {

    }
}
