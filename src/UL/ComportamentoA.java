package UL;

public interface ComportamentoA {

	
	public void metodo();
	
	
	public default void metodoDefault() {
		System.out.println("faz algo ai");
	}
}
