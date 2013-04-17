package br.com.caelum.loja.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CarrinhoFactoryBean extends UnicastRemoteObject implements
		CarrinhoFactory {

	protected CarrinhoFactoryBean() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Carrinho create() throws RemoteException {
		CarrinhoBean carrinhoBean = new CarrinhoBean();
		
		return carrinhoBean;
	}

}
