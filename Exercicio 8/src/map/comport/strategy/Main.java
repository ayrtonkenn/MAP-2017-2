package map.comport.strategy;

public class Main {
	public static void main(String[] args) {
		/*
		 * Método errado de usar enum???
		 * 
		 */
		/*NiveisGratif nivel1 = NiveisGratif.NIVEL1.setTaxa(1.25);
		NiveisGratif nivel2 = NiveisGratif.NIVEL1.setTaxa(1.35);
		try {
			System.out.println(nivel1.getTaxa() + " " + nivel2.getTaxa());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		FuncData umfuncionario = new FuncData(FuncEnum.LIDER, 1402.4, 2);
		try {
			System.out.println(umfuncionario.getGratif());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*FuncEnum outroFuncionario = new FuncEnum(FuncEnum.DBA,
				1700, 2);
		System.out.println(outroFuncionario.calcularGratificacao());*/
	}
}
