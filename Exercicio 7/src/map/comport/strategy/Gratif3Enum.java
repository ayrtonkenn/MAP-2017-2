package map.comport.strategy;

public enum Gratif3Enum {
	/*
	 * Valores p/ cada gratificacao, adapt. para guardar dois
	 * 
	 */
	DEV(1.15, 1.25), LIDER(1.25, 1.35), GERENTE(1.35, 1.45);
	
	private Double nivel1, nivel2;

	private Gratif3Enum(double nivel1, double nivel2) {
		this.nivel1 = nivel1;
		this.nivel2 = nivel2;
	}
	
	/*public double getGratif(FuncEnum func) {
		return func.getSalarioBase() * func.getNivel().getTaxa();		
	}*/
	
	public double getTaxa(int nivel) throws Exception {
		switch (nivel) {
		case 1:
			return nivel1;
		case 2:
			return nivel2;
		default:
			throw new Exception();
		}
	}
}
