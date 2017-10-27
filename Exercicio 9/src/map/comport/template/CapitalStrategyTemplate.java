package map.comport.template;

public abstract class CapitalStrategyTemplate {
	
	public double getCapital(Loan loan) {
		double pipetemp = duration(loan)*riskfactorFor(loan);
		getCapitalSon(loan, pipetemp);
		return pipetemp;
	}
	
	protected double riskfactorFor(Loan loan) {
		// TODO Auto-generated method stub
		return 1;
	}

	protected abstract double getCapitalSon(Loan loan, double pipetemp);
	
	public double duration(Loan loan) {
		return 0.5;
		
	}
	

}

