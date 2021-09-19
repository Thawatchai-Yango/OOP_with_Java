public class Lottery{
	static void getNumber(int minN,int maxN) {
		int random = (int)Math.floor(Math.random()*(maxN-minN)+minN);
		System.out.print(random);
		 //return (int)Math.floor(Math.random()*(maxN-minN)+minN);
	}
}
