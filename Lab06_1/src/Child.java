public class Child extends Base{
		private int child_a;
		public Child() { 
		}
		public int getChild_a() {
			return child_a;
		}
		public void setChild_a(int child_a) {
			this.child_a = child_a;
		}
		//ภายในวัตถุนี้มี มีวัตถุ printInBase() ได้รับการสืบทอดมา
		//และมี private int a;
		//protected int b;
		//public int c;
		//int d; ได้รับสืบทอดมาเช่นเดียวกัน
}
