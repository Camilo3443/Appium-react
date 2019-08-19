package br.com.estacio.utilities.enums;

public enum OS {
	ANDROID("Android"), IOS("IOS");

	private String valor;

	OS(String valor) {
		this.valor = valor;
	}

	public String getValor() {
		return valor;
	}

	public static OS valueOfIgnoreCase(String value) {
		return valueOf(value.toUpperCase());
	}
}
