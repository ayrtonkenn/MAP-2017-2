
package map.exercicio4msm.proxy;

public class BancoUsersProxy implements BancoUsersSubject {
	private BancoUsersSubject banco;
	
	
	public BancoUsersProxy(String usuario, String senha) {
		banco = new BancoUsuarioRealSubject();
		this.usuario = usuario;
		this.senha = senha;
	}

	protected String usuario, senha;

	@Override
	public String getNumeroDeUsuarios() {
		// TODO Auto-generated method stub
		if (temPermissao()) {
			return banco.getNumeroDeUsuarios();
		}
		return null;
	}

	private boolean temPermissao() {
		// TODO Auto-generated method stub
		
		return usuario.equals("admin")&&senha.equals("admin");
	}

	@Override
	public String getUsuariosConectados() {
		// TODO Auto-generated method stub
		if (temPermissao()) {
			return banco.getUsuariosConectados();
		}
		return null;
	}
	
	
}
