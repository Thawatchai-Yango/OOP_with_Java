public class Main {
	public static void main(String[] args) {
		//int score;
		//score = MyRandom.randomInteger(1, 9);
		MyRandom score =new MyRandom();
		int disPlayRandom = score.randomInteger(1, 9);
		System.out.print("My random number is : ");
		System.out.println(disPlayRandom);
		
		
		//Lottery myLotto = new Lottery();
		System.out.print("My lottery number are : ");
		Lottery.getNumber(000, 999);
		//int number = myLotto.getNumber(000,999);
		//System.out.println(myLotto);
	}
}