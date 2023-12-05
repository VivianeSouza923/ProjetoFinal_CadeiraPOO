package questaoum;

public class MainDois {

	 public static void main(String[] args) {
	        // Criando objetos Livro e Pessoa
	        Livro livro = new Livro("O Hobbit", "J.R.R. Tolkien");
	        Pessoa pessoa = new Pessoa("Viviane", 27);

	        // Chamando o método imprimirDetalhes() para cada objeto
	        livro.imprimirDetalhes();
	        pessoa.imprimirDetalhes();

	        // Criando um array de objetos Imprimivel
	        Imprimivel[] objetos = {livro, pessoa};

	        // Chamando o método que aceita objetos Imprimivel
	        imprimirDetalhesImprimiveis(objetos);
	    }

	    // Método que aceita objetos Imprimivel e chama imprimirDetalhes()
	    static void imprimirDetalhesImprimiveis(Imprimivel[] objetos) {
	        for (Imprimivel objeto : objetos) {
	            objeto.imprimirDetalhes();
	        }
	    }

}
