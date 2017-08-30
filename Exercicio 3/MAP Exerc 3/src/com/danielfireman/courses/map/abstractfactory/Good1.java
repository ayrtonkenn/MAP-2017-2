package com.danielfireman.courses.map.abstractfactory;

import java.io.IOException;

/**
 * 
 * Another example of the abstract factory.
 * see: https://brizeno.wordpress.com/category/padroes-de-projeto/abstract-factory/
 */
class Good1 {
  interface FabricaDeCarro {
    CarroSedan criarCarroSedan();
    CarroPopular criarCarroPopular();
  }
  class FabricaFiat implements FabricaDeCarro {
 
    @Override
    public CarroSedan criarCarroSedan() {
        return new Siena();
    }
 
    @Override
    public CarroPopular criarCarroPopular() {
        return new Palio();
    }
  }
  
  interface CarroPopular {
    void exibirInfoPopular();
  }
  interface CarroSedan {
    void exibirInfoSedan();
  }
  /*
   * implementar carro da ford
   */
  class FabricaFord implements FabricaDeCarro {

	@Override
	public CarroSedan criarCarroSedan() {
		// TODO Auto-generated method stub
		return new FordFiesta();
	}

	@Override
	public CarroPopular criarCarroPopular() {
		// TODO Auto-generated method stub
		return new FordKa();
	}
	  
  }
  class Palio implements CarroPopular {
 
    @Override
    public void exibirInfoPopular() {
        System.out.println("Modelo: Palio\nFÃ¡brica: Fiat\nCategoria:Popular");
    }
  }
  class Siena implements CarroSedan {
 
    @Override
    public void exibirInfoSedan() {
        System.out.println("Modelo: Siena\nFÃ¡brica: Fiat\nCategoria:Sedan");
    }
  }
  
  class FordFiesta implements CarroSedan {

	@Override
	public void exibirInfoSedan() {
		// TODO Auto-generated method stub
		System.out.println("Modelo: Fiesta \n Fabrica: Ford \n Categoria: Sedan / Carroça");
	}
  }
  
  class FordKa implements CarroPopular {

	@Override
	public void exibirInfoPopular() {
		// TODO Auto-generated method stub
		System.out.println("Modelo: Ka \n Fabrica: Ford \n Categoria: Popular Compacto / Carroça");
	}
	  
  }
  
  public static void main(String[] args) {
	Good1 factory = new Good1();
	/*
	 * classes default dentro da classe principal, só podem instanciar
	 * pela instancia da principal.
	 */
    FabricaDeCarro fabrica = factory.new FabricaFiat();
    CarroSedan sedan = fabrica.criarCarroSedan();
    CarroPopular popular = fabrica.criarCarroPopular();
    sedan.exibirInfoSedan();
    System.out.println();
    popular.exibirInfoPopular();
    System.out.println();
 
    fabrica = factory.new FabricaFord();
    sedan = fabrica.criarCarroSedan();
    popular = fabrica.criarCarroPopular();
    sedan.exibirInfoSedan();
    System.out.println();
    popular.exibirInfoPopular();
  }
}
