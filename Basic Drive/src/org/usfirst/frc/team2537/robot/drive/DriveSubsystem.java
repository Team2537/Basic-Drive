package org.usfirst.frc.team2537.robot.drive;

import org.usfirst.frc.team2537.robot.input.HumanInput;
import org.usfirst.frc.team2537.robot.input.Ports;
import org.usfirst.frc.team2537.robot.resources.CANTalon;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveSubsystem extends Subsystem {
	
	private CANTalon backLeftMotor, backRightMotor;
	private Talon frontRightMotor, frontLeftMotor;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public DriveSubsystem() {
		backLeftMotor = new CANTalon(Ports.BACK_LEFT_MOTOR);
		backRightMotor = new CANTalon(Ports.BACK_RIGHT_MOTOR);
		frontRightMotor = new Talon(Ports.FRONT_RIGHT_MOTOR);
		frontLeftMotor = new Talon(Ports.FRONT_LEFT_MOTOR);
	}

    public void initDefaultCommand() {
        this.setDefaultCommand(new DriveCommand());
    }
    
    public void setMotors(double speed) {
    	backLeftMotor.set(speed);
    	backRightMotor.set(speed);
    	frontLeftMotor.set(speed);
    	frontRightMotor.set(speed);
    }
    
    public void setLeftMotors(double speed) {
    	backLeftMotor.set(-speed);
    	frontLeftMotor.set(-speed);
    }
    
    public void setRightMotors(double speed) {
    	backRightMotor.set(speed);
    	frontRightMotor.set(speed);
    }
    

    
    public double getLeftJoystick() {
    	return HumanInput.leftJoystick.getRawAxis(1);
    }
    
    public double getRightJoystick() {
    	return HumanInput.rightJoystick.getRawAxis(1);
    }
    
 
    
 
}

