package frc.robot;

/**
 * Data carrier to store points robot has to
 * go in Conner's (tentative?) auton routine
 */
public class AutonSequence {
    private final Position start;

    private final Location ball;
    private final Location terminal;

    public AutonSequence(Position start, Location ball, Location terminal) {
        this.ball = ball;
        this.start = start;
        this.terminal = terminal;
    }

    public Position getStart() { return start; }
    public Location getBall() { return ball; }
    public Location getTerminal() { return terminal; }
}
