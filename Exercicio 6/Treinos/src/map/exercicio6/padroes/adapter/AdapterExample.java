package map.exercicio6.padroes.adapter;

import java.util.Vector;

class AdapterExample {
	/*
	 * anotacoes aula MAP de decorator / adapter
	 * o que fazer
	 * adapter para imagens, com o exemplo de vários tipos de imagem
	 * como gif, png, jpeg, svg, em um tamanho fixo, e opção para
	 * trabalho posterior, através da interface Adaptee de imagem.
	 * Daí com a mesma assinatura é possível
	 * 
	 * imagem implementa carregar() e desenhar()
	 * 
	 */
	public interface ImagemTarget {
		
		void carregarImagem();
		void desenharImagem(Vector elemento);
		
	}
	
	public class ImageAdapter implements ImagemTarget {
		Imagem imagem;
		String caminho;
		
		

		public ImageAdapter(String caminho) {
			super();
			
			this.caminho = caminho;
		}

		@Override
		public void carregarImagem() {
			// TODO Auto-generated method stub
			this.imagem.open();
		}

		@Override
		public void desenharImagem(Vector elemento) {
			// TODO Auto-generated method stub
			this.imagem.draw();
		}

		
		
	}
	
	public interface Imagem {
		short largura();
		short altura();
		void draw();
		String toString();
		void open();
	}
	
	public class ImagemJPEG implements Imagem {
		private Vector imagemcomp;
		
		
		@Override
		public short largura() {
			return 2544;
		}

		@Override
		public short altura() {
			return 1920;
		}

		@Override
		public void draw() {
			// TODO Auto-generated method stub
			System.out.println("Drawing a image PNG in:");
		}

		@Override
		public void open() {
			// TODO Auto-generated method stub
			
		}
	
		
		
	}
	public class ImagemGIF implements Imagem {
		private Vector imagemcomp;
		
		
		@Override
		public short largura() {
			return 256;
		}

		@Override
		public short altura() {
			return 256;
		}

		@Override
		public void draw() {
			// TODO Auto-generated method stub
			System.out.println("Drawing a image GIF in:");
		}

		@Override
		public void open() {
			// TODO Auto-generated method stub
			
		}
	
	}
	public class ImagemPNG implements Imagem {
		private Vector imagemcomp;
		
		
		@Override
		public short largura() {
			return 5192;
		}

		@Override
		public short altura() {
			return 5192;
		}

		@Override
		public void draw() {
			// TODO Auto-generated method stub
			System.out.println("Drawing a image GIF in:");
		}

		@Override
		public void open() {
			// TODO Auto-generated method stub
			
		}
	}
}
