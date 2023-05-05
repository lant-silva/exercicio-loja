package view;
import model.Cliente;
import model.Fila;
import control.OperacaoController;
public class Main {

	public static void main(String[] args) {
		
		OperacaoController a = new OperacaoController();
		Fila fila = new Fila();
		Cliente[] cliente = new Cliente[20];
		int total = cliente.length;
		
		
		for(int i = 1; i <= 20; i++) {
			String nome = "Cliente "+i;
			fila.insert(new Cliente(nome, (int) (Math.random()*31)+20, (int) (Math.random()*96)+5));
		}
		
		a.caixa(fila);
		
	}
}
