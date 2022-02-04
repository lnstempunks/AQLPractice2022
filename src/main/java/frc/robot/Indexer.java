package frc.robot;
// imports
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import frc.robot.Constants; 
import edu.wpi.first.wpilibj.DigitalInput;

public class Indexer {
    
    private Spark indexMotor = new Spark(Constants.indexMotor);
    private DigitalInput indexLimit = new DigitalInput(Constants.limitSwitch);
    
    public void index(boolean secondButon){
        if (secondButon && indexLimit.get()){
            indexMotor.set(1);
        } else {
            indexMotor.set(0);
        }


    }
    



}
