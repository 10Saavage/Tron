package org.view;

import javax.swing.JOptionPane;

import org.model.BoolTime;

public class StartEnd {
	
	static boolean jouer = true;
	static String win;
	static long temps_début= System.currentTimeMillis();
	static long temps_jeu;
	// TODO Auto-generated constructor stub
	@SuppressWarnings("unused")
	public static BoolTime startEnd() {
		BoolTime tab = new BoolTime();
		if (jouer == true) {	
			if(Clavier.play == true && Clavier2.play2== false) {
				jouer = false;
				win = "joueur1";
				temps_jeu = Collision.temps - temps_début;
				JOptionPane.showMessageDialog(null, StartEnd.win,"Resultat", JOptionPane.PLAIN_MESSAGE);

				BDConnection envoi = new BDConnection();
				System.out.println(temps_jeu + " " + win);
				Thread.currentThread();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.exit(0);
				
			}
			if(Clavier.play == false && Clavier2.play2== true) {
				jouer = false;
				win ="joueur2";
				temps_jeu = Collision.temps - temps_début;
				JOptionPane.showMessageDialog(null, StartEnd.win,"Resultat", JOptionPane.PLAIN_MESSAGE);
				BDConnection envoi = new BDConnection();
				System.out.println(temps_jeu + " " + win);
				Thread.currentThread();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.exit(0);
			}
			if(Clavier.play == false && Clavier2.play2== false) {
				jouer = false;
				win = "Personne";
				temps_jeu = Collision.temps - temps_début;
				JOptionPane.showMessageDialog(null, StartEnd.win,"Resultat", JOptionPane.PLAIN_MESSAGE);
				BDConnection envoi = new BDConnection();
				System.out.println(temps_jeu + " " + win);
				Thread.currentThread();
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.exit(0);
				
			}
			else {
				jouer = true;
			}	
		
			for(int i = 0; i < Clavier.red.size(); i++) {
			//QUAND IL RENCONTRE SON PROPRE MUR	JOUEUR 1
				if(Clavier.red.get(i).getX() == Clavier.j1.getX() && Clavier.red.get(i).getY() == Clavier.j1.getY() ){
					jouer = false;
					win = "joueur2";
					temps_jeu = Collision.temps - temps_début;
					JOptionPane.showMessageDialog(null, StartEnd.win,"Resultat", JOptionPane.PLAIN_MESSAGE);

					BDConnection envoi = new BDConnection();
					System.out.println(temps_jeu + " " + win);
					Thread.currentThread();
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.exit(0);
				}
				else
					jouer = true;
			}
			
			for(int j=0; j < Clavier2.blue.size(); j++) {
			//QUAND IL RENCONTRE SON PROPRE MUR JOUEUR 2
				if(Clavier2.blue.get(j).getX() == Clavier2.j2.getX()  && Clavier2.blue.get(j).getY() == Clavier2.j2.getY()) {
					jouer = false;
					win = "joueur1";
					temps_jeu = Collision.temps - temps_début;
					JOptionPane.showMessageDialog(null, StartEnd.win,"Resultat", JOptionPane.PLAIN_MESSAGE);

					BDConnection envoi = new BDConnection();
					System.out.println(temps_jeu + " " + win);
					Thread.currentThread();
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.exit(0);	
					
				}
				else
					jouer = true;
				
			}
		
		}
		
		//JOptionPane.showMessageDialog(this, win,"Resultat", JOptionPane.PLAIN_MESSAGE);
		
		tab.setWinner(win);
		tab.setValeur(jouer);
		tab.setTime((int) temps_jeu);
		return tab;
	}
}
