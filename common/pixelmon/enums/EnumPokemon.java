package pixelmon.enums;

import pixelmon.config.IDListTrainer;
import pixelmon.config.PixelmonEntityList.ClassType;

public enum EnumPokemon {
	Abra("Abra", ClassType.Pixelmon),
	Arbok("Arbok", ClassType.Pixelmon),
	Blastoise("Blastoise", ClassType.Pixelmon),
	Bulbasaur("Bulbasaur", ClassType.Pixelmon),
	Butterfree("Butterfree", ClassType.Pixelmon),
	Caterpie("Caterpie", ClassType.Pixelmon),
	Charizard("Charizard", ClassType.Pixelmon),
	Charmander("Charmander", ClassType.Pixelmon),
	Charmeleon("Charmeleon", ClassType.Pixelmon),
	Cubone("Cubone", ClassType.Pixelmon),
	Diglett("Diglett", ClassType.Pixelmon),
	Dugtrio("Dugtrio", ClassType.Pixelmon),
	Eevee("Eevee", ClassType.Pixelmon),
	Ekans("Ekans", ClassType.Pixelmon),
	Electrode("Electrode", ClassType.Pixelmon),
	Flareon("Flareon", ClassType.Pixelmon),
	Gastly("Gastly", ClassType.Pixelmon),
	Geodude("Geodude", ClassType.Pixelmon),
	Goldeen("Goldeen", ClassType.WaterPixelmon),
	Growlithe("Growlithe", ClassType.Pixelmon),
	Gyarados("Gyarados", ClassType.WaterPixelmon),
	Horsea("Horsea", ClassType.WaterPixelmon),
	Ivysaur("Ivysaur", ClassType.Pixelmon),
	Jolteon("Jolteon", ClassType.Pixelmon),
	Jigglypuff("Jigglypuff", ClassType.Pixelmon),
	Magikarp("Magikarp", ClassType.WaterPixelmon),
	Magnemite("Magnemite", ClassType.Pixelmon),
	Mankey("Mankey", ClassType.Pixelmon),
	Metapod("Metapod", ClassType.Pixelmon),
	Mew("Mew", ClassType.Pixelmon),
	Sandile("Sandile", ClassType.Pixelmon),
	Krokorok("Krokorok", ClassType.Pixelmon),
	Miltank("Miltank", ClassType.Pixelmon),
	Pidgey("Pidgey", ClassType.Pixelmon),
	Pikachu("Pikachu", ClassType.Pixelmon),
	Pidgeotto("Pidgeotto", ClassType.Pixelmon),
	Pidgeot("Pidgeot", ClassType.Pixelmon),
	Ninetales("Ninetales", ClassType.Pixelmon),
	Oddish("Oddish", ClassType.Pixelmon),
	Omanyte("Omanyte", ClassType.WaterPixelmon),
	Omastar("Omastar", ClassType.WaterPixelmon),
	Psyduck("Psyduck", ClassType.Pixelmon),
	Rattata("Rattata", ClassType.Pixelmon),
	Seaking("Seaking", ClassType.WaterPixelmon),
	Shellder("Shellder", ClassType.Pixelmon),
	Snorlax("Snorlax", ClassType.Pixelmon),
	Squirtle("Squirtle", ClassType.Pixelmon),
	Staryu("Staryu", ClassType.WaterPixelmon),
	Starmie("Starmie", ClassType.WaterPixelmon),
	Trapinch("Trapinch", ClassType.Pixelmon),
	Venusaur("Venusaur", ClassType.Pixelmon),
	Voltorb("Voltorb", ClassType.Pixelmon),
	Vulpix("Vulpix", ClassType.Pixelmon),
	Wartortle("Wartortle", ClassType.Pixelmon),
	Wigglytuff("Wigglytuff", ClassType.Pixelmon),
	Zubat("Zubat", ClassType.Pixelmon),
	Magneton("Magneton", ClassType.Pixelmon),
	Vibrava("Vibrava", ClassType.Pixelmon),
	Mareep("Mareep", ClassType.Pixelmon),
	Tentacool("Tentacool", ClassType.WaterPixelmon),
	Solrock("Solrock", ClassType.Pixelmon),
	Lunatone("Lunatone", ClassType.Pixelmon),
	NidoranMale("NidoranMale", ClassType.Pixelmon),
	Vaporeon("Vaporeon", ClassType.Pixelmon),
	Gloom("Gloom", ClassType.Pixelmon),
	Krabby("Krabby", ClassType.Pixelmon),
	Weedle("Weedle", ClassType.Pixelmon),
	Kakuna("Kakuna", ClassType.Pixelmon),
	Koffing("Koffing", ClassType.Pixelmon),
	Weezing("Weezing", ClassType.Pixelmon),
	Primeape("Primeape", ClassType.Pixelmon),
	Arcanine("Arcanine", ClassType.Pixelmon),
	Paras("Paras", ClassType.Pixelmon),
	Golbat("Golbat", ClassType.Pixelmon),
	Drowzee("Drowzee", ClassType.Pixelmon),
	Dratini("Dratini", ClassType.WaterPixelmon),
	Numel("Numel", ClassType.Pixelmon);

	private EnumPokemon(String name, ClassType type){
		this.name = name; this.type = type;
	}
	public String name;
	public ClassType type;
	public static boolean hasPokemon(String evolveTo) {
		for (EnumPokemon e: values()){
			if (e.name.equalsIgnoreCase(evolveTo)) return true;
		}
		return false;
	}
}
