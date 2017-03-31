import java.util.Scanner;

public class Vendedor {

	public static String nome;
	public static int codigo;
	public float comissao;
	public static String endereco;
	private static Scanner leitor;
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		Vendedor.nome = nome;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		Vendedor.codigo = codigo;
	}
	
	public float getComissao() {
		return comissao;
	}
	
	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		Vendedor.endereco = endereco;
	}
	
	public static void main(String[] args) {
		leitor = new Scanner(System.in);
		System.out.println("Insira o nome:");
		nome = leitor.nextLine();
		System.out.println("Insira o Endereco:");
		endereco = leitor.nextLine();
		System.out.println("Insira o Codigo: ");
		codigo = leitor.nextInt();
		
		
		
	}
}
