package sfgdi.others;

public class HealthInsuranceSurveyor extends InsuranceSurveyor {

	public HealthInsuranceSurveyor() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isValidClaim() {
		// TODO Auto-generated method stub
		System.out.println("Health Insurance Surveyor : Validating Health Insurance Claims...");
		return true;
	}

}
