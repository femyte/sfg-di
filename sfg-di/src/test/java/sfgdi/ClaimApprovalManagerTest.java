package sfgdi;


import org.junit.jupiter.api.Test;

import sfgdi.others.ClaimApprovalManager;
import sfgdi.others.HealthInsuranceSurveyor;
import sfgdi.others.InsuranceSurveyor;
import sfgdi.others.VehicleInsuranceSurveyor;

class ClaimApprovalManagerTest {

	
	@Test
	void testProcessClaims() {
		ClaimApprovalManager claimApprovalManager = new ClaimApprovalManager();
		InsuranceSurveyor healthSurveyor = new HealthInsuranceSurveyor();
		InsuranceSurveyor vehicleSurveyor = new VehicleInsuranceSurveyor();
		
		claimApprovalManager.processClaims(healthSurveyor);
		claimApprovalManager.processClaims(vehicleSurveyor);
	}

}
