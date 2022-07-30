package it.unibs.fp.mylib;
import java.util.*;

public class EstrazioniCasuali 
{	
	private static Random rand = new Random();	
	//ciao è una prova
	public static int estraiIntero(int min, int max)
	{
	 int range = max + 1 - min;
	 int casual = rand.nextInt(range);
	 return casual + min;
	}
	
}
