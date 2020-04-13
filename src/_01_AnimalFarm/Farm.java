package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm 
{
	public static void main(String[] args) 
	{
		ArrayList<Animal> farm = new ArrayList<Animal>();
		Duck Donald = new Duck();
		Duck Daisy = new Duck();
		Cow Clarabelle = new Cow();
		Pig MissPiggy = new Pig();
		Mouse Mickey = new Mouse();
		Mouse Minnie = new Mouse();
		
		farm.add(Donald);
		farm.add(Daisy);
		farm.add(Clarabelle);
		farm.add(MissPiggy);
		farm.add(Mickey);
		farm.add(Minnie);
		
		for (Animal animal : farm) {
			animal.eatFood();
			animal.makeNoise();
		}
		
	}
}
