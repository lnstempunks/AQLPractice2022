package frc.robot;
import frc.robot.Constants;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;

public class Drivetrain {
    CANSparkMax leftFront = new CANSparkMax(Constants.leftFront, CANSparkMaxLowLevel.MotorType.kBrushless);
    CANSparkMax rightFront = new CANSparkMax(Constants.rightFront, CANSparkMaxLowLevel.MotorType.kBrushless);    
    CANSparkMax leftBack = new CANSparkMax(Constants.leftBack, CANSparkMaxLowLevel.MotorType.kBrushless);
    CANSparkMax rightBack = new CANSparkMax(Constants.rightBack, CANSparkMaxLowLevel.MotorType.kBrushless);
    MotorControllerGroup leftController = new MotorControllerGroup(leftFront, leftBack);
    MotorControllerGroup rightController = new MotorControllerGroup(rightFront, rightBack);
    DifferentialDrive m_drive = new DifferentialDrive(leftController, rightController);
}
// differential drive
// arcade drive
