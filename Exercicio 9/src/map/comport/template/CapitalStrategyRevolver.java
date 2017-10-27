package map.comport.template;

public class CapitalStrategyRevolver extends CapitalStrategyTemplate {

	@Override
	protected double getCapitalSon(Loan loan, double pipetemp) {
		// TODO Auto-generated method stub
		return (loan.outstandingRiskAmount()*pipetemp)+(loan.unusedRiskAmount())*duration(loan)*unusedRiskFactor(loan);
	}

	private int unusedRiskFactor(Loan loan) {
		// TODO Auto-generated method stub
		return 0;
	}

}
