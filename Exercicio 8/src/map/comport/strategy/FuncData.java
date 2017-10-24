package map.comport.strategy;

public class FuncData {
	private double salarioBase;
	private int nivel;
	private FuncEnum tipo;
	
	/*
	 * Implementacao com novo 3 enums
	 * Objetivo de eliminar completam as condicionais, que poderiam
	 * ter ao perceber o nivel.
	 * 
	 */
	
	
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
	}
	
	public double getGratif() throws Exception {
		return salarioBase * tipo.getTaxa(nivel);		
			
	}
}
