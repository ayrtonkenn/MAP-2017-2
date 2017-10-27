package map.comport.template;

public class CapitalStrategyAdvisedLine extends CapitalStrategyTemplate {

	@Override
	protected double getCapitalSon(Loan loan, double pipetemp) {
		// TODO Auto-generated method stub
		return loan.getCommitment() * loan.getUnusedPackge() * pipetemp;
	}

}
