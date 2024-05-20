package lista_14l;

public class validacao {
	public static boolean validarCpf (String cpf) {
		if(cpf.length() == 11) 
			return true ;
		else 
			return false;
		
	}
	public static boolean validarSenha (String senha) {
		if(senha.length() == 6) 
			return true ;
		else 
			return false;
		
	}
	public static boolean imprimirMensagemCpf (boolean cpf) {
		if(cpf==true) {
			System.out.println("Cpf não existemte");
			return true;
		}
		else {
			System.out.println("cpf incorreto ");
			return false;
		}
	}
	public static boolean imprimirMensagemSenha (boolean senha) {
		if(senha==true) {
			System.out.println("Bem vindo");
			return true;
		}
		else {
			System.out.println("senha incorreto ");
			return false;
		}
	}
}
