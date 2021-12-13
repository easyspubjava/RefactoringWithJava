package magicnumber.after;

public class RobotMain {

	public static void main(String[] args) {

		Robot robot = new Robot("Edward");
		robot.order(Robot.Command.WALK);
		robot.order(Robot.Command.STOP);
		robot.order(Robot.Command.JUMP);
	}

}
