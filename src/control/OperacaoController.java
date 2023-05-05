package control;

import model.Cliente;
import model.Fila;

public class OperacaoController{
	
	public void caixa(Fila controle) {
		Cliente con = null;
		while(!controle.isEmpty()) {
			try {
				con = (Cliente) controle.remove();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int total = (int) (con.quantidadePecas * con.valorPecas);
			System.out.println("Valor a ser pago: "+total);
			System.out.println(con.nome);
		}
	}
}
