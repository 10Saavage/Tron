package org.view;

public class StartEnd {
	
	static boolean jouer = true;
	static long temps_début= System.currentTimeMillis();
	static long temps_jeu;
	// TODO Auto-generated constructor stub
	public static boolean startEnd() throws InterruptedException {
		if (jouer == true) {			
			if(Clavier.play == true && Clavier2.play2== false) {
				jouer = false;
				temps_jeu = Collision.temps - temps_début;
				System.out.println(temps_jeu);
				Thread.currentThread();
				Thread.sleep(2000);
				System.exit(0);
				
			}
			if(Clavier.play == false && Clavier2.play2== true) {
				jouer = false;
				temps_jeu = Collision.temps - temps_début;
				System.out.println(temps_jeu);
				Thread.currentThread();
				Thread.sleep(2000);
				System.exit(0);
			}
			if(Clavier.play == false && Clavier2.play2== false) {
				jouer = false;
				temps_jeu = Collision.temps - temps_début;
				System.out.println(temps_jeu);
				Thread.currentThread();
				Thread.sleep(2000);
				System.exit(0);
				
			}
			else {
				jouer = true;
			}	
		
			for(int i = 0; i < Clavier.red.size(); i++) {
			//QUAND IL RENCONTRE SON PROPRE MUR	JOUEUR 1
				if(Clavier.red.get(i).getX() == Clavier.j1.getX() && Clavier.red.get(i).getY() == Clavier.j1.getY() ){
					jouer = false;
					temps_jeu = Collision.temps - temps_début;
					System.out.println(temps_jeu);
					Thread.currentThread();
					Thread.sleep(2000);
					System.exit(0);
				}
				else
					jouer = true;
			}
			
			for(int j=0; j < Clavier2.blue.size(); j++) {
			//QUAND IL RENCONTRE SON PROPRE MUR JOUEUR 2
				if(Clavier2.blue.get(j).getX() == Clavier2.j2.getX()  && Clavier2.blue.get(j).getY() == Clavier2.j2.getY()) {
					jouer = false;
					temps_jeu = Collision.temps - temps_début;
					System.out.println(temps_jeu);
					Thread.currentThread();
					Thread.sleep(2000);
					System.exit(0);	
					
				}
			else
				jouer = true;
				
			}
		
		}
		return jouer;
	}
}
