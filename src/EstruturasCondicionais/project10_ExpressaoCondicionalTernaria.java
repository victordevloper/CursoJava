package EstruturasCondicionais;

public class project10_ExpressaoCondicionalTernaria 
{
	public static void Executar()
	{
		double preco = 34.5;
		double desconto = (preco < 20)? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);
	}
}
