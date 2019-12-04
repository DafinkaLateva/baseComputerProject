package baseComputer;

public class BaseComputer implements TempAndOilAlarm {
	double datchDegreeTemp;
	double overOilLevel;
	double bottomLine = 25.0;
	Boolean tempAlarm;
	Boolean oilAlarm;
	Boolean doorOpened;
	Boolean lightsOn;
	Boolean zoomerAlarm;

	public BaseComputer(double datchDegreeTemp, double overOilLevel, Boolean doorOpened, Boolean lightson) {
		// TODO Auto-generated constructor stub
		this.datchDegreeTemp = datchDegreeTemp;
		this.overOilLevel = overOilLevel;
		this.doorOpened = doorOpened;
		this.lightsOn = lightsOn;
	}

	@Override
	public void tempCheck(double datchDegreeTemp) {
		if (datchDegreeTemp > 120.0) {
			System.out.println(" ATTENTION! Temperature is over its normal degree.");

			tempAlarm = true;
		} else if (datchDegreeTemp < 120.0) {
			tempAlarm = false;
		}
	}

	@Override
	public void oilCheck(double overOilLevel) {
		if (overOilLevel < bottomLine) {
			System.out.println(" ATTENTION! Oil is under the bottom line.");
			oilAlarm = true;
		} else
			oilAlarm = false;

	}

	public void zoomerCheck(Boolean doorOpened, Boolean lightsOn) {
		if ((lightsOn = true) && (doorOpened = true)) {
			System.out.println("Alarm is activated");
			zoomerAlarm = true;
		} else
			zoomerAlarm = false;
	}

}
