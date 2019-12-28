package unit2;

public class Example2_7 {

	private static final String curretntHour = null;

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		long totalMilliseconds = System.currentTimeMillis();
		
		long totalSeconds=totalMilliseconds/1000;
		
		long currentSecond = totalSeconds%60;
		long totalMinutes = totalSeconds /60;
		long currentMinute= totalMinutes %60;
		long totalHours=totalMinutes/60;
		long currentHour =totalHours % 24;
		
		System.out.println("Current time is "+ currentHour + ":"
				+ currentMinute+":" + currentSecond+"GMT");
	}

}
