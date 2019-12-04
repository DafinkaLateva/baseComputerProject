package baseComputer;

public class EnchancedComputer extends BaseComputer implements ABSAlarm {
	// break stands for current pressure on the wheel break
	int breaks;
	// slip shows if the car is wheel slipping
	Boolean slip;

	public EnchancedComputer(double datchDegreeTemp, double overOilLevel, int breaks, Boolean doorOpened,
			Boolean lightsOn) {
		super(datchDegreeTemp, overOilLevel, doorOpened, lightsOn);
		this.breaks = breaks;

		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean ABS(int breaks) throws InterruptedException {
		if (breaks > 100) {
			System.out.println(" CAUTION! ABS!");
			slip = true;
			Thread.sleep(500);
			slip = false;
		}
		return slip;
	}

}
