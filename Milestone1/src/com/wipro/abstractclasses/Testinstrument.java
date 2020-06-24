package com.wipro.abstractclasses;
import java.util.Random;
abstract class Instrument {
	abstract void play();
}
class Piano extends Instrument{
	@Override
	void play()
	{
		System.out.println("Piano is playing  tan tan tan tan");
	}
}
class Flute extends Instrument{
	@Override
	void play()
	{
		System.out.println("Flute is playing  toot toot toot toot");
	}
}
class Guitar extends Instrument{
	@Override
	void play()
	{
		System.out.println("Guitar is playing  tin  tin  tin");
	}
}

public class Testinstrument {
	public static void main(String[]args) {
		Instrument[] in=new Instrument [10];
		Random rand=new Random();
		for(int i=0;i<10;i++) {
			int r=rand.nextInt((3))+1;
			if(r==1)
				in[i]=new Piano();
			if(r==2)
				in[i]=new Flute();
			if(r==3)
				in[i]=new Guitar();
			in[i].play();
		}
		 for (int i = 0; i < 10; i++) {
		    	if (in[i] instanceof Piano) 
		    		System.out.println("Piano is stored at index " + i);
		    	else if (in[i] instanceof Flute) 
		    		System.out.println("Flute is stored at index " + i);
		    	else if (in[i] instanceof Guitar) 
		    		System.out.println("Guitar is stored at index " + i);
	}

}
}
