public class ModulusAnimation
{
	public static void main( String[] args ) throws Exception
	{
		String frame = "";
		for ( int i=0; i<80; i++ )
		{
			if (i%10 == 0)
				frame = "<<<<<<<<";
			else if (i%10 == 1)
				frame = "><<<<<<<";
			else if (i%10 == 2)
				frame = ">><<<<<<";
			else if (i%10 == 3)
				frame = ">>><<<<<";
			else if (i%10 == 4)
				frame = ">>>><<<<";
			else if (i%10 == 5)
				frame = ">>>>><<<";
			else if (i%10 == 6)
				frame = ">>>>>><<";
			else if (i%10 == 7)
				frame = ">>>>>>><";
			else if (i%10 == 8)
				frame = ">>>>>>>>";
			else if (i%10 == 9)
				frame = "        ";

			System.out.print(frame + "\r");
			Thread.sleep(200);
		}

	}
}
