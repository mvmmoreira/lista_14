package lista_14l;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidacaoTeste {

	@Test
	void validarTamanhoCpf_ComSucesso () {
		String cpf = "03214567897";
		
		validacao validacao = new validacao();
		boolean resultadocpf = validacao.validarCpf(cpf);
		
		assertTrue(resultadocpf);

	}
	@Test
	void validarTamanhoSenha_ComSucesso () {
		String senha ="789456";
		
		validacao validacao = new validacao();
		boolean resultadosenha = validacao.validarSenha(senha); 
		
		assertTrue(resultadosenha);
	}
	@Test
	void validarTamanhoCpf_ComErro () {
		String cpf = "22";
		
		validacao validacao = new validacao();
		boolean resultadocpf = validacao.validarCpf(cpf);
		
		assertFalse(resultadocpf);
	}
	@Test
	void validarTamanhoSenha_ComErro () {
		String senha ="22";
		
		validacao validacao = new validacao();
		boolean resultadosenha = validacao.validarSenha(senha); 
		
		assertTrue(resultadosenha);
	}
	@Test
	void validarCpfCerto_ComSucesso () {
		String cpf = "12345678912";
		
		validacao validacao = new validacao();
		boolean resultadocpf = validacao.validarCpf(cpf);
		
		assertTrue(resultadocpf);

	}

}
