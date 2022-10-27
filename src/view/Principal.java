package view;

import javax.swing.JOptionPane;

import controller.PlayerController;
import model.ListaObject;

public class Principal {

	public static void main(String[] args) throws Exception {
		ListaObject lista = new ListaObject();
		int opc = 0;
		PlayerController p = new PlayerController();
		
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog("Player\n1 - Adicionar musica \n2 - Remover musica \n3 - Executar Playlist \n9 - Finaliza"));
			switch (opc) {
			case 1: {
			String musica = JOptionPane.showInputDialog("Digite a musica, conforme modelo: \nModelo(nao colocar espaços): nome da musica ; nome do artista ; duracao");
			p.adicionaMusica(lista, musica);	
			JOptionPane.showMessageDialog(null, "Musica: " +musica+ " - Adicionada");	
			}
			break;
			case 2: {
				int posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da faixa"));
				int pos = posicao - 1;
				p.removeMusica(lista, pos);
			}
			break;
			case 3: {
				p.executaPlaylist(lista);
			}
			break;
			case 9: {
				System.out.println("Saindo do Player");
			}
			break;
			default:
				System.out.println("Opcao invalida");
				
			}
		}
	}

}
