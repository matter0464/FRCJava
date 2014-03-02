package team.gus.robotcode;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SimpleRobot;
import edu.wpi.first.wpilibj.Victor;

public class Main extends SimpleRobot {

    RobotDrive drive;
    Victor SL1, SL2, SR1, SR2, IntakeLeft, IntakeRight;
    Compressor comp;
    Shooter shooter;
    DoubleSolenoid IntakeSolenoid;
    Joystick CoDriver, Left, Right;

    public void robotInit() {
        //Drivetrain
        drive = new RobotDrive(1, 2, 3, 4);
        //Compressor
        comp = new Compressor(8, 1);
        //Solenoids
        IntakeSolenoid = new DoubleSolenoid(3,4);
        //Intake victors
        IntakeLeft = new Victor(5);
        IntakeRight = new Victor(6);
        //Start Compressor
        comp.start();
        //Shooter Thread
        shooter = new Shooter(IntakeSolenoid); // Solenoid // *Top limit // *Bot limit // *- may add
        //Joysticks
        Left = new Joystick(1);
        Right = new Joystick(2);
        CoDriver = new Joystick(3);

    }

    public void autonomous() {
        //
        //
        //ToDo, Find a way to find the HOT ZONE and aim/shoot
        //
        //
    }

    /**
     * This function is called once each time the robot enters operator control.
     */
    public void operatorControl() {
        while (isOperatorControl() && isEnabled()) {
            drive.tankDrive(Left, Right);

            if (CoDriver.getRawButton(1)) {
                System.out.print("Fired!");
                shooter.start();

            }

        }

    }

    /**
     * This function is called once each time the robot enters test mode.
     */
    public void test() {

    }
}
