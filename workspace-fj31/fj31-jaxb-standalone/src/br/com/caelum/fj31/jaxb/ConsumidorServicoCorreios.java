package br.com.caelum.fj31.jaxb;

import java.math.BigDecimal;
import java.util.List;

import br.com.caelum.correios.ws.ArrayOfCServico;
import br.com.caelum.correios.ws.CResultado;
import br.com.caelum.correios.ws.CServico;
import br.com.caelum.correios.ws.CalcPrecoPrazoWS;
import br.com.caelum.correios.ws.CalcPrecoPrazoWSSoap;

public class ConsumidorServicoCorreios {
	public static void main(String[] args) {
		CalcPrecoPrazoWSSoap servico = new CalcPrecoPrazoWS()
				.getCalcPrecoPrazoWSSoap();

		CResultado resultado = servico.calcPrecoPrazo("", "", "40010, 41106",
				"04101300", "20040030", "20", 2, new BigDecimal(19),
				new BigDecimal(10), new BigDecimal(15), new BigDecimal(10),
				"S", BigDecimal.ZERO, "S");
		
		List<CServico> servicosPesquisados = resultado.getServicos().getCServico() ;
		for (CServico s : servicosPesquisados) {
			System.out.println(s.getCodigo());
			System.out.println(s.getValor());
			
		}
	}
}
