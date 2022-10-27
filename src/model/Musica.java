package model;

public class Musica {

	public String nome;
	public String nomeArtista;
	public int duracao;
	
	@Override
	public String toString() {
		String ret = "Musica: " + nome + " - Artista: "+ nomeArtista + " - Duracao: " + duracao;
		return ret;
	}
	
}
