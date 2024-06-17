	package iphone;
	
	import interfaces.AparelhoTelefonico;
	import interfaces.NavegadorInternet;
	import interfaces.ReprodutorMusical;
	
	public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	
		public void atualizarPag() {
			System.out.print("Atualizando a pagina");
			
		}
	
		public void adicionarAba() {
			System.out.print("Nova aba adicionada");
			
		}
	
		public void exibirPag(String url) {
			System.out.print("Exibindo a pagina correspondente a url: " + url);
			
		}
	
		public void ligar(String numero) {
			System.out.print("Ligando para o numero: " + numero);
			
		}
	
		public void atender() {
			System.out.print("Ligacao atendida");
		}
	
		public void iniciarCorreioDeVoz() {
			System.out.print("Iniciando correio de voz, deixe seu recado:");
			
		}
	
		public void tocar() {
			System.out.print("Tocando musica");
			
		}
	
		public void pausar() {
			System.out.print("Musica pausada");
			
		}
	
		public void selecionarMusica(String musica) {
			System.out.print("A musica " + musica + " foi selecionada");
			
		}
	
	}
