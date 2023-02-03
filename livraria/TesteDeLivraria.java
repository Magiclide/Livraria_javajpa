package livraria;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import infra.DAO;

public class TesteDeLivraria {

	public static void main(String[] args) {
		Editoras editora1= new Editoras();
		List<Livro2> lista1 = new ArrayList<>();
		
		editora1.setCodigo("111-223");
		editora1.setEndereco("Pedro Lessa");
		editora1.setGerente("Carlos nobrega");
		editora1.setNome("Livros e Cia");
		editora1.setTelefone("32256798");
		Livro2 livro1 = new Livro2();
		livro1.setAssunto("Ficcao");
		livro1.setAutor("Stephen King");
		livro1.setData(new Date());
		livro1.setEditora(editora1);
		livro1.setQuantidadeEstoque(12);
		ClientesDaLivraria cliente1 = new ClientesDaLivraria();
				cliente1.setCPF("52790287899");
				cliente1.setEndereco("Pedro de toledo");
				cliente1.setCNPJ("1123");
				
			
				
				
			
			DAO<Object> dao= new DAO<>();
			cliente1.setLivros(lista1);
			for(Livro2 livro:cliente1.getLivros()) {
				System.out.println(livro.getAutor());
			}
			dao.abrirT().incluir(editora1).incluir(livro1).incluir(cliente1).fecharT().fechar();
			
	}

}
