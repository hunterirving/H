import java.util.*;

public class H
{
	private final int TEXT = 40;
	private final int HANG = 1000;

	private Scanner kb;
	private String current;

	public H()
	{
		kb = new Scanner(System.in);
	}

	public void doot(String dooter)
	{
		hang();
		for(int i = 0; i < dooter.length(); i++)
		{
			System.out.print(dooter.charAt(i));
			try
			{
				Thread.sleep(TEXT);
			}
			catch(InterruptedException e)
			{
				System.out.println("Error or something");
			}
		}
		//hang();
		System.out.print("\n");
	}

	public void hang()
	{
		try
		{
			Thread.sleep(HANG);
		}
		catch(InterruptedException e)
		{
			System.out.println("Error or something");
		}
	}

	public void time()
	{
		doot("TYPE W TO WAIT");
		current = kb.nextLine();
		doot("Time passes.");
	}

	public void run()
	{
		doot("You are an ATOM OF HYDROGEN in a CLOUD OF SPACE DUST.");
		time();
		doot("The CLOUD begins to self-gravitate.");
		time();
		doot("The CLOUD becomes a STAR.");
		hang();
		doot("You are an ATOM OF HYDROGEN in the core of a DISTANT STAR.");
		doot("DUST settles into orbit around the STAR.");
		time();
		doot("The DUST condenses into synchronous masses. PLANETS are formed and orbit the STAR.");
		time();
		doot("The STAR'S warmth heats the INNER PLANETS.");
		doot("SUBTERRANEAN ICE melts to become WATER.");
		time();
		doot("A great OCEAN is formed.");
		doot("The OCEAN is full of LIFE.");
		time();
		doot("The LIFE evolves into simple SINGLE CELLED ORGANISMS.");
		time();
		doot("The SINGLE CELLED ORGANISMS evolve into MORE COMPLEX ORGANISMS and leave the OCEAN, spreading onto LAND.");
		time();
		doot("The ORGANISMS become SENTIENT. They craft simple TOOLS and develop AGRICULTURE.");
		time();
		doot("The ORGANISMS develop CIVILIZATION.");
		doot("NATIONS are formed, each with their own advances in SCIENCE and CULTURE.");
		time();
		doot("The ORGANISMS clash. A GREAT WAR breaks out.");
		time();
		doot("The ORGANISMS destroy each other.");
		doot("The PLANET is left a DESOLATE WASTELAND in the aftermath.");
		doot("What a pity.");
		hang();
		doot("TYPE W TO WAIT");
		current = kb.nextLine();
		doot("Billions of years pass.");
		doot("The STAR is dying.");
		doot("You are an ATOM OF HYDROGEN in a DYING STAR.");
		doot("TYPE W TO WAIT");
		current = kb.nextLine();
		doot("Billions of years pass.");
		doot("The STAR condenses into a super-dense STELLAR OBJECT.");
		doot("TYPE W TO WAIT");
		current = kb.nextLine();
		doot("Billions of years pass.");
		doot("The STAR goes SUPER NOVA.");
		doot("You are an ATOM OF HYDROGEN flying through SPACE.");
		time();
		doot("You enter an ATMOSPHERE.");
		doot("You bond with nearby OXYGEN and HYDROGEN ATOMS.");
		doot("You are a DROP of WATER in a CLOUD.");
		doot("PRESS F TO FALL FROM THE CLOUD. PRESS C TO CYCLE WITHIN THE CLOUD.");
		current = kb.nextLine();
		while (!current.equals("c") && !current.equals("C") && !current.equals("f") && !current.equals("F"))
		{
			doot("No.");
			doot("PRESS F TO FALL FROM THE CLOUD. PRESS C TO CYCLE IN THE CLOUD.");
			current = kb.nextLine();
		}
		while (current.equals("c") || current.equals("C"))
		{
			doot("You are a larger DROP of WATER in a CLOUD.");
			doot("PRESS F TO FALL FROM THE CLOUD. PRESS C TO CYCLE IN THE CLOUD.");
			current = kb.nextLine();

			while (!current.equals("c") && !current.equals("C") && !current.equals("f") && !current.equals("F"))
			{
				doot("No.");
				doot("PRESS F TO FALL FROM THE CLOUD. PRESS C TO CYCLE IN THE CLOUD.");
				current = kb.nextLine();
			}
		}
		doot("You fall from the CLOUD into a RIVER.");
		doot("A DEER drinks from the RIVER.");
		doot("You are a DEER in a VAST FOREST.");
		time();
		doot("A HUNTER shoots you.");
		doot("You are dying.");
		time();
		doot("You are dead.");
		doot("The HUNTER turns your CARCASS into MEAT.");
		doot("The HUNTER cooks your MEAT.");
		doot("The HUNTER eats your COOKED MEAT.");
		doot("You are a HUNTER living in a LOG CABIN in a VAST FOREST.");
		time();
		doot("The HUNTER bears a CHILD.");
		doot("You are a CHILD.");
		time();
		doot("The CHILD grows up.");
		doot("You are a student at APPALACHIAN STATE UNIVERSITY.");
		doot("You go to the IOTA OMICRON IOTA GAME JAM.");
		doot("There is a game here.");
		doot("PRESS Y TO PLAY THE GAME.");
		current = kb.nextLine();
		while (!current.equals("y") && !current.equals("Y"))
		{
			doot("But Thou Must!");
			doot("PRESS Y TO PLAY THE GAME.");
			current = kb.nextLine();
		}
		doot("You play the game.");
		run();
	}

	public static void main(String args[])
	{
		//System.out.println("Hello World");
		H h =  new H();
		h.run();
	}
}
