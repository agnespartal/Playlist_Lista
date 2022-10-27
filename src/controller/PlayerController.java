package controller;

import model.ListaObject;
import model.Musica;

public class PlayerController {

	public PlayerController() {
		super();
	}
	
	public void adicionaMusica (ListaObject lista, String musica) throws Exception{
		Object vetor[] = new Object[3];
		vetor = musica.split(";");
		Musica faixa = new Musica();
		faixa.nome = (String) vetor[0];
		faixa.nomeArtista = (String) vetor[1];
		faixa.duracao = Integer.parseInt((String) vetor[2]) ;
		if (lista.isEmpty()) {
			lista.addFirst(faixa);
		}else {
			lista.addLast(faixa);
		}
	}
	
	public void removeMusica (ListaObject lista, int posicao) throws Exception{
		if (lista.isEmpty()) {
			new Exception ("Lista vazia");
		}else {
			lista.remove(posicao);
		}
	}

	public void executaPlaylist (ListaObject lista) throws Exception{
		int tamanho = lista.size();
		int i = 0;
		Musica aux = new Musica(); 
		while (tamanho != 0 && i <= lista.size() ) {
			aux = (Musica) lista.get(i);
			int tempo = aux.duracao;
			System.out.println(lista.get(i).toString());
			i++;
			tamanho--;
			Thread.sleep(tempo);
		}
	}
}
