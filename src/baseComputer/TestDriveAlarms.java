package baseComputer;

public class TestDriveAlarms {
	public static void main(String[] args) {
		EnchancedComputer audiComp = new EnchancedComputer(80.00, 30.00, 150, true, true);
		try {
			audiComp.ABS(150);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		audiComp.zoomerCheck(true, true);
		audiComp.oilCheck(10.0);
		audiComp.tempCheck(80.0);

	}
}