package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Stanza;

public class ComandoVai extends AbstractComando{
	private String direzione;

	public ComandoVai(){
	}
	
	@Override
	public void esegui(Partita partita) {
		// TODO Auto-generated method stub
		Stanza stanzaCorrente = partita.getStanzaCorrente();
		Stanza prossimaStanza = null;
		if(direzione == null){
			System.out.println("Specificare la Direzione");
			return;
		}
		prossimaStanza = stanzaCorrente.getStanzaAdiacente(this.direzione);
		if(prossimaStanza==null){
			System.out.println("direzione inesistente");
			return;
		}
		partita.setStanzaCorrente(prossimaStanza);
		System.out.println(partita.getStanzaCorrente().getDescrizione());
		partita.getGiocatore().setCfu(partita.getGiocatore().getCfu()-1);
	}

	@Override
	public void setParametro(String parametro) {
		// TODO Auto-generated method stub
		this.direzione = parametro;
	}

	@Override
	public String getParametro() {
		// TODO Auto-generated method stub
		return direzione;
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return "vai";
	}
	

}
