package br.com.treinamento.java.fluxo;

public class ParametrosInvalidosException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "O segundo par�metro deve ser maior que o primeiro.";
	}
}
