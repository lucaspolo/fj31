package br.com.caelum.webservices.publisher;

import javax.xml.ws.Endpoint;

import br.com.caelum.webservices.CalculadorDeParcela;

public class Publicador {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:10000/calculadorDeParcela", new CalculadorDeParcela());
	}
}
