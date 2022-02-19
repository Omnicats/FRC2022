package frc.robot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.TimedRobot;
import frc.subsystems.Climb;
import frc.subsystems.Drivetrain;
import frc.subsystems.Intake;
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
    private Climb climb;
    private Intake intake;

    private DigitalInput limit;
    private DigitalInput optical;

    public Robot() {
        super(PERIODIC_INTERVAL / 1000);
    }

    /** Run when robot is started for initialization */
    @Override
    public void robotInit() {
        controller = new XboxController(RobotMap.XBOX_CONTROLLER);
        drivetrain = new Drivetrain();
        intake = new Intake();

        limit = new DigitalInput(RobotMap.LIMIT_SWITCH);
        optical = new DigitalInput(RobotMap.OPTICAL_SENSOR); 
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
<<<<<<< HEAD
        double speed = -Math.pow(controller.getLeftY(), 3) * 0.6;
=======
        // update drivetrain
        double speed = -Math.pow(controller.getRightY(), 3) * 0.6;
>>>>>>> e0b5c610d9f63b9d1b933b672523ee26e2605125
        double turn = Math.pow(controller.getLeftX(), 3);

        drivetrain.drive(speed, turn);

        // read motors
        System.out.println(drivetrain.getPosition());
        System.out.println("Limit switch: " + limit.get());
        System.out.println("Optical: " + optical.get());

        // update intake
        intake.update(controller);
    }

    @Override
    public void disabledInit() {
    }

    @Override
    public void disabledPeriodic() {
    }

    @Override
    public void testInit() {
        // CLIMB
        climb = new Climb(controller);
    }

    @Override
    public void testPeriodic() {
    }
}