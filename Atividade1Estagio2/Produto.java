import java.util.Scanner;

public class Produto extends Vendedor{

	public String descricao;
	public static float valorVenda;
	public static float valorCusto;
	public static float promocao;
	private static Scanner leitor;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public static float getValorVenda() {
		return valorVenda;
	}

	public static void setValorVenda(float valorVenda) {
		Produto.valorVenda = valorVenda;
	}

	public static float getValorCusto() {
		return valorCusto;
	}

	public static void setValorCusto(float valorCusto) {
		Produto.valorCusto = valorCusto;
	}

	public static float getPromocao() {
		return promocao;
	}

	public static void setPromocao(float promocao) {
		Produto.promocao = promocao;
	}

	
		
		
	}

