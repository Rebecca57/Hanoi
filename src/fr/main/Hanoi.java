package fr.main;

public class Hanoi {
	
	
	/*
	//Attributs
	private int _nbr;
	private String _from;
	private String _to;
	private String _inter;
	
	//Constructeur
	public Hanoi(int n, String from, String to, String inter) {
		this.setNbr(n);
		this.setFrom(from);
		this.setTo(to);
		this.setInter(inter);
	}
	
	
	//getter and setter
	private int getNbr() {
		return _nbr;
	}
	private void setNbr(int _nbr) {
		this._nbr = _nbr;
	}
	private String getFrom() {
		return _from;
	}
	private void setFrom(String _from) {
		this._from = _from;
	}
	private String getTo() {
		return _to;
	}
	private void setTo(String _to) {
		this._to = _to;
	}
	private String getInter() {
		return _inter;
	}
	private void setInter(String _inter) {
		this._inter = _inter;
	}
	*/
	
	//Méthodes"
	public static void hanoi(int nbr, String from, String to, String inter) {
		if (nbr == 1) {
			//Point d'arrêt
			//S'il ne reste qu'un disque à déplacer, l'intermédiaire n'est pas utilisé 
			System.out.println("Le disque "+nbr+": "+from+" --> "+to);
		}
		else {
			//Le tas de n-1 disques est déplacé sur la pile intermediaire
			hanoi(nbr-1,from, inter, to);
			//Pour pouvoir déplacer le disque N sur la pile de destination 
			System.out.println("Le disque "+nbr+": "+from+" --> "+to);
			//Le tas de n-1 est ensuite déplacé sur la pile de destination
			hanoi(nbr-1, inter, to, from);
		}
	}
}
