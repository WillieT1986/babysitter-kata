package babysitter;

public class Hours {
	
	private int work;
	private int nonWork;
	
	public Hours(int work, int nonWork) {
		this.work = work;
		this.nonWork = nonWork;
	}

	public int getWork(int workHour) {
			return work;
		}

	public int getNonWork() {
		return 0;
	}
	
	
	private int workHour(int workHour) {
		if (workHour == 1700 && workHour <= 1759);
		else if (workHour == 1800 && workHour <= 1859);
		else if (workHour == 1900 && workHour <= 1959);
		else if (workHour == 2000 && workHour <= 2059);
		else if (workHour == 2100 && workHour <= 2159);
		else if (workHour == 2200 && workHour <= 2259);
		else if (workHour == 2300 && workHour <= 2359);
//		else if (workHour == 0000 && workHour <= 0059L);
//		else if (workHour == 0100 && workHour <= 0159L);
//		else if (workHour == 0200 && workHour <= 0259L);
//		else if (workHour == 0300 && workHour <= 0359L);
		else if (workHour == 0400);
		
		return workHour;
	}


	
	

}
