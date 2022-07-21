package fr.main;

public class Hanoi {
	
	
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
