package step_by_step;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.tws.refactoring.Driver;
import com.tws.refactoring.Police;

public class PoliceTest {
	private static Police police;
	@BeforeAll
	 public static void setPolice() {
		// TODO Auto-generated method stub
		police=new Police();
	}
	
	@Test
	void if_driver_age_under_18_should_return_false() {
		Driver driver=new Driver(12);
		//Police police=new Police();
		boolean checkedResult=police.checkDriver(driver);
		Assertions.assertFalse(checkedResult);
	}
	@Test
	void if_driver_age_over_18_should_return_true() {
		Driver driver=new Driver(18);
		//Police police=new Police();
		boolean checkedResult=police.checkDriver(driver);
		Assertions.assertTrue(checkedResult);
	}

}
