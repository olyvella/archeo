package fr.babylone.archeo;

import fr.babylone.archeo.entites.Site;
import fr.babylone.archeo.entites.ZoneFouille;
import fr.babylone.archeo.entites.Objet;
import fr.babylone.archeo.entites.Conservation;
import fr.babylone.archeo.entites.AnneEtude;
import fr.babylone.archeo.entites.Archeologue;


public class AppArcheo {

	public static void main(String[] args) {
		
		ZoneFouille zof1 = new ZoneFouille( 1 , "Cramont" ) ; 
		
	// Afficher la zone de fouille n° 1 // 
		
		System.out.println( zof1 ) ;
		
	// Afficher le numéro de la zone de fouille n° 1. // 
		
		System.out.println(zof1.getNumero() ); 
		
	// Afficher le nom de la commune de la zone de fouille n° 1 //
		
		System.out.println( zof1.getVille());
		
	// Modifier le nom de la commune (nouvelle valeur : Prouville) de la zone de fouille n° 1 //
		
		zof1.setVille( "Prouville" );
		
	// Afficher la zone de fouille n° 1. //
		
		System.out.println( zof1 ) ; 
		
		
											//2- Sites //
		
	// Créer le site n° 1 de longueur 4 et de largeur 3 qui se situe dans la zone de fouille n° 1 //
		
		Site st1 = new Site( 1 , 4 , 3, zof1 ) ; 
		
	// Afficher le site n° 1 //
		
		System.out.println( st1 ) ; 
		
	// Afficher la longueur du site n° 1 //
		
		System.out.println( st1.getSuperficie()) ; 
	
	//  Afficher le nom de la commune de la zone de fouille à laquelle appartient le site n°1. // 
		
		System.out.println( st1.getZone().getVille() ); 
		
		
		
									//3- Objets //
		
	// Créer l'objet n° 1 qui est un pied de table complet et intact (instance référencée par la variable obj1). //

		Objet obj1 = new Objet( 1 , "Pied de table" , 1 , Conservation.INTACT) ; 
	
	// Afficher l'objet n° 1. //

		System.out.println( obj1 ) ; 

	// Afficher la désignation de l'objet n° 1 //
		
		System.out.println( obj1.getDesignation()) ; 
				
	// Afficher l'état de complétude de l'objet n° 1  //
		
		System.out.println( obj1.getCompletude()    ) ; 

	// Afficher l'état de conservation de l'objet n° 1  //
		
		System.out.println( obj1.getConservation()    ) ; 
		
		
		
	// Créer l'objet n° 2 qui est un nez de gargouille partiel et en très mauvais état  //
		
		Objet obj2 = new Objet( 2 , "nez de gargouille" , 2 , Conservation.TRES_MAUVAIS_ETAT) ; 
		
	// Afficher l'objet n°2 //

		System.out.println( obj2) ; 
		
	// Afficher l'état de complétude de l'objet n° 2  //
		
		System.out.println( obj2.getCompletude()    ) ; 
		
	// Modifier l'état de complétude de l'objet n° 2 (nouvelle valeur )   //
		
		obj1.setCompletude( 1 ) ; 
		
	// Afficher l'état de complétude de l'objet n° 2  //
		
		System.out.println( obj2.getCompletude()) ;
		
		
		
	
									// 4- Archéologues //
		
		
	// Créer l'archéologue n° 1, Harry OSBORN, étudiant en Licence  //
		
		Archeologue ark1 = new Archeologue( 1, "Harry" , "OSBORN" , ) ; 
		
		
		
				
		
		
	

		
	}

}
