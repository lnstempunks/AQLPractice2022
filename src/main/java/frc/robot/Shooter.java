package frc.robot;

// Import Spark/Motor Module
import edu.wpi.first.wpilibj.motorcontrol.Spark;

// Import Constants
import frc.robot.Constants;

// Create Shooter Class
public class Shooter {
    // Define Motors
    Spark shooterMotor1 = new Spark(Constants.shooterMotor1);
    Spark shooterMotor2 = new Spark(Constants.shooterMotor2);

    // Create Shoot Method
    // This method is going to run the motors
    public void shoot(boolean button) {
        if(button){
            shooterMotor1.set(1);
            shooterMotor2.set(1);
        } else {
            shooterMotor1.set(0);
            shooterMotor2.set(0);
        }
        
    }

}
