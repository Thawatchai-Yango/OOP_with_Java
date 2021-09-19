public class MyRandom {
	
	
	
	public  int randomInteger(int minN,int maxN) 
	{
		return (int)Math.floor(Math.random()*(maxN-minN)+minN);//9-1+1
	}
	
}
