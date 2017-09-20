package map.exercicio4msm.proxy;

public class BancoUsuarioRealSubject implements BancoUsersSubject {
	private int quantidadeDeUsuarios = (int) (Math.random() * 100);
	private int usuariosConectados = (int) (Math.random() * 10);
	
	@Override
	public String getNumeroDeUsuarios() {
		// TODO Auto-generated method stub
		return new String("Total de usuários: " + quantidadeDeUsuarios);
	}

	@Override
	public String getUsuariosConectados() {
		// TODO Auto-generated method stub
		return new String("Usuários conectados: " + usuariosConectados);
	}

	

}
