import java.util.Objects;
import java.util.Scanner;
public class Hello {
	public static void main(String[] args) {
		Gato gato = new Gato("Lucas","Azul", 10);
		Pessoa pessoa = new Pessoa("Lucas", 24, 1.77, "XXX.XXX.XXX-XX");
		Livro livro = new Livro("As crônicas do matador do rei", 31);
		System.out.println("Digite uma frase:");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String frase = input.nextLine();
		System.out.printf("Eu ainda não sei o porquê de ter dito \'%s\', mas tá aí, você disse: \n%s\n",frase, frase);
		System.out.println(gato);
		System.out.println(livro);
		System.out.println(pessoa);
	}


}

class Livro{
	public String livro;
	public int num_Pag;
	public Livro(String livro, int num_Pag) {
		super();
		this.livro = livro;
		this.num_Pag = num_Pag;
	}
	public String getLivro() {
		return livro;
	}
	public void setLivro(String livro) {
		this.livro = livro;
	}
	public int getNum_Pag() {
		return num_Pag;
	}
	public void setNum_Pag(int num_Pag) {
		this.num_Pag = num_Pag;
	}
	@Override
	public int hashCode() {
		return Objects.hash(livro, num_Pag);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(livro, other.livro) && num_Pag == other.num_Pag;
	}
	@Override
	public String toString() {
		return "Livro [livro=" + livro + ", num_Pag=" + num_Pag + "]";
	}
	
	
	
}


class Pessoa{
	public String nome;
	public int idade;
	public double altura;
	public String cpf;
	public Pessoa(String nome, int idade, double altura, String cpf) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.cpf = cpf;
	}
	@Override
	public int hashCode() {
		return Objects.hash(altura, cpf, idade, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Double.doubleToLongBits(altura) == Double.doubleToLongBits(other.altura)
				&& Objects.equals(cpf, other.cpf) && idade == other.idade && Objects.equals(nome, other.nome);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	@Override
	public String toString() {
		return "Pessoa: " +  nome +", "+ idade +", "+ altura +", "+ cpf;
	}
	
	
}