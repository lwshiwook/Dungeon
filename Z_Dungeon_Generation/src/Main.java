
public class Main {

	public static void main(String[] args) {
		
		int i = 1;
		Main m = new Main();
		while(i<100){
			System.out.println(m.getRandomPointInCircle(50));
			i++;
		}

	}

	public class Location {

		private double x;
		private double y;

		Location(double x, double y) {
			this.x = x;
			this.y = y;
		}

		public double getX() {
			return x;
		}

		public double getY() {
			return y;
		}

		@Override
		public String toString() {
			return "x×ø±ê:"+x+"|y×ø±ê:"+y;
		}
	}

	public Location getRandomPointInCircle(int radius){
		double t = 2*Math.PI*Math.random();
		double u = Math.random()+Math.random();
		double r = 0;
		
		if(u>1){
			r = 2-u;
		}else{
			r = u;
		}
		return new Location(radius*r*Math.cos(t),radius*r*Math.sin(t));
	}

}
