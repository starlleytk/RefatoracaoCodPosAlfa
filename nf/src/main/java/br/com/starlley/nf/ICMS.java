package br.com.starlley.nf;

public class ICMS implements Imposto {

	public Double getValor(Double fatura) {
		return fatura*0.11;
	}

}
