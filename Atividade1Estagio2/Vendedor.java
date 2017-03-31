import java.util.Scanner;

public class Vendedor {

	protected static String nome;
	public static int codigo;
	public float comissao;
	public static String endereco;
	
	Scanner leitor = new Scanner(System.in);
	
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
	
		
		
		
	}

