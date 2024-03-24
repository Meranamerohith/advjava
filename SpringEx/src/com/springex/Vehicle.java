package com.springex;

public class Vehicle {
	public void makeVehicle()
	{
		SonySpeakers sonySpeakers = new SonySpeakers();
		System.out.println(sonySpeakers.makeSound());
		
		MichelinTyres michelinTyres = new MichelinTyres();
		System.out.println(michelinTyres.rotate());
	}
	
	public void makeVehicle2()
	{	SpeakerFactory speakerFactory = new SpeakerFactory();
		Speaker speaker = speakerFactory.getSpeaker("SONY");
		System.out.println(speaker.makeSound());
		
		TyresFactory tyresFactory = new TyresFactory();
		Tyres tyres = tyresFactory.getTyres("MICHELIN");
		System.out.println(tyres.rotate()); 
	}
}
