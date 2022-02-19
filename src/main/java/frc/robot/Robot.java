package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import frc.subsystems.Drivetrain;
import edu.wpi.first.wpilibj.XboxController;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the
 * name of this class or
 * the package after creating this project, you must also update the
 * build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
    // run periodic methods every 30ms
    private static final double PERIODIC_INTERVAL = 30;

    private XboxController controller;
    private Drivetrain drivetrain;

    public Robot() {
        super(PERIODIC_INTERVAL / 1000);
    }

    /** Run when robot is started for initialization */
    @Override
    public void robotInit() {
        controller = Controller.getInstance().getController();
        drivetrain = Drivetrain.getInstance();
    }

    /** Called every PERIODIC_INTERVAL */
    @Override
    public void robotPeriodic() {
    }

    @Override
    public void autonomousInit() {
    }

    /** This function is called periodically during autonomous. */
    @Override
    public void autonomousPeriodic() {
    }

    /** This function is called once when teleop is enabled. */
    @Override
    public void teleopInit() {
    }

    /** This function is called periodically during operator control. */
    @Override
    public void teleopPeriodic() {
        double speed = -Math.pow(controller.getRightY(), 3) * 0.6;
        double turn = Math.pow(controller.getLeftX(), 3);

        drivetrain.drive(speed, turn);
    }

    @Override
    public void disabledInit() {
    }

    @Override
    public void disabledPeriodic() {
    }

    @Override
    public void testInit() {
    }

    @Override
    public void testPeriodic() {
    }
}