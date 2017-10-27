package map.comport.template;


public class CapitalStratergyTermLoan extends CapitalStrategyTemplate {

	@Override
	protected double getCapitalSon(Loan loan, double pipetemp) {
		// TODO Auto-generated method stub
		return loan.getCommitment() * pipetemp;
	}

}
