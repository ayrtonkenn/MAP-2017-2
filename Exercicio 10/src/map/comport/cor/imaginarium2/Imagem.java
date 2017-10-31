package map.comport.cor.imaginarium2;

public interface Imagem {
	void desenha();
	Cabecalho getCabecalho();
	String getPath();
	String getType();
	byte[] getConteudo();
	
}