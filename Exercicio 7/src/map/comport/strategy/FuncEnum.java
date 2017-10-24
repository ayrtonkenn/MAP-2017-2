package map.comport.strategy;

public enum FuncEnum {
	/*
	 * Por Ayrton Kennedy
	 * 
	 * 
	 * 
	 * Problema de valores m�gicos?
	 * Valores f�ceis de serem trocados, mas que repetem
	 * valores na memoria 
	 * Que s�o esses enums de gratif, inerentes ao tipo de
	 * funcionario, n�o s�o alterados, mas para n�o usar
	 * uma condicional foi preciso abstrair um get para
	 * associar gratif diferentes, e da� n�o inserir valores
	 * repetidos na memoria.
	 * 
	 */
	DESENVOLVEDOR {
		protected Gratif3Enum getTipoGratif() {
			return Gratif3Enum.DEV;
		}
	},
	DBA {
		
		protected Gratif3Enum getTipoGratif() {
			// TODO Auto-generated method stub
			return Gratif3Enum.DEV;
		}
	}, LIDER {

		@Override
		protected Gratif3Enum getTipoGratif() {
			// TODO Auto-generated method stub
			return Gratif3Enum.LIDER;
		}
		
	};
	
	// fim dos val magicos
	protected abstract Gratif3Enum getTipoGratif();
	
	FuncEnum() {
		}

	
	public double getTaxa(int nivel) throws Exception {
		return getTipoGratif().getTaxa(nivel);
	}
	
	
	}
