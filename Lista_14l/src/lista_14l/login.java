package lista_14l;

import java.util.Scanner;

public class login {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String cpflog ="12345678912";
		String senhalog = "123456";
		
		String cpf;
		String senha;
		
		boolean cpfVerdadeiro = false;
		boolean senhaVerdadeiro = false;
		
		System.out.println("Digite seu cpf");
		cpf = scanner.next();
		System.out.println("Digite sua senha");
		senha = scanner.next();
		
		cpfVerdadeiro = validacao.validarCpf(cpf);
		validacao.imprimirMensagemCpf(cpfVerdadeiro);
		
		senhaVerdadeiro = validacao.validarSenha(senha);
		validacao.imprimirMensagemSenha(senhaVerdadeiro);
		
		scanner.close();
		
	}

}