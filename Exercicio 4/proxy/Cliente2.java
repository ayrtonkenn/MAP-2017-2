package map.exercicio4msm.proxy;


import br.padroes.proxy.BancoUsuarios;

public class Cliente2 {
	public static void main(String[] args) {
		System.out.println("Hacker acessando >(");
		BancoUsersProxy banco = new BancoUsersProxy("Hacker", "1234");
		System.out.println(banco.getNumeroDeUsuarios());
		System.out.println(banco.getUsuariosConectados());

		System.out.println("\nAdministrador acessando :)");
		banco = new BancoUsersProxy("admin", "admin");
		System.out.println(banco.getNumeroDeUsuarios());
		System.out.println(banco.getUsuariosConectados());
	}
}
