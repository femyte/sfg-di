package sfgdi.others;

public class ClaimApprovalManager {

	public ClaimApprovalManager() {
		// TODO Auto-generated constructor stub
	}
	
	public void processClaims(InsuranceSurveyor insuranceSurveyor) {
		
		if(insuranceSurveyor.isValidClaim()) {
			
			System.out.println("ClaimApprovalManager : Valid claims. Currently processing claim for approval...");
		}
		
	}

}
