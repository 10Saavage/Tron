package org.main;

import org.controller.Jouer;
import org.model.Music;



/**
 * Hello world!
 *
 */
public class Main 
{
    @SuppressWarnings("unused")
	public static void main( String[] args ) throws InterruptedException
    {	
    	Jouer lancement = new Jouer();
    	while(true)
    		Music.Play("C:\\Users\\TOUSSI Manoel\\git\\Tron\\Tron\\Ressources\\music\\Daft Punk - The Son of Flynn (TRON LEGACY).wav");
   	}
}
