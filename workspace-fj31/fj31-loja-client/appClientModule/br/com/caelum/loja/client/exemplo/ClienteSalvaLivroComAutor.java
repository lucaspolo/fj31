package br.com.caelum.loja.client.exemplo;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.caelum.loja.entity.Autor;
import br.com.caelum.loja.entity.Livro;
import br.com.caelum.loja.session.GerenciadorLoja;

public class ClienteSalvaLivroComAutor {
	public static void main(String[] args) throws NamingException {
		InitialContext ic = new InitialContext();

		GerenciadorLoja gerenciador = (GerenciadorLoja) ic
				.lookup("ejb:fj31-loja-ear/fj31-loja-ejb3/GerenciadorLivroBean!br.com.caelum.loja.session.GerenciadorLoja");

		Autor autor = new Autor();
		autor.setNome("Autor de Teste");

		Livro livro = new Livro();
		livro.setNome("Livro de Teste");
		livro.setPreco(100.0);

		autor = gerenciador.salva(autor);
		System.out.println("Id do Autor: " + autor.getId());

		livro.getAutores().add(autor);

		gerenciador.salva(livro);
	}
}
