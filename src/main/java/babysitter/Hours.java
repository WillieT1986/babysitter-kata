package babysitter;

public class Hours {

	private int work;
	private int nonWork;

	public Hours(int work, int nonWork) {
		this.work = work;
		this.nonWork = nonWork;
	}

	public int getWork(int i) {
		if (i == 1700 && i <= 1759 && i >= 1800 && i <= 1859 && i >= 1900 && i <= 1959 && i >= 2000 && i <= 2059
				&& i >= 2100 && i <= 2159 && i >= 2200 && i <= 2259 && i >= 2300 && i <= 2359 && i >= 0000 && i <= 0059F
				&& i >= 0100 && i <= 0159F && i >= 0200 && i <= 0259F && i >= 0300 && i <= 0400) {
		}
		return work;
	}

	public int getNonWork(int i) {
		if (i >= 0401 && i <= 0459F && i >= 0500 && i <= 0559F && i >= 0600 && i <= 0659F && i >= 0700 && i <= 0759F
				&& i >= 0800F && i <= 0859F && i >= 0900F && i <= 0959F && i >= 1000 && i <= 1059 && i >= 1100
				&& i <= 1159 && i == 1200 && i <= 1259 && i == 1300 && i <= 1359 && i == 1400 && i <= 1459 && i == 1500
				&& i <= 1559 && i == 1600 && i <= 1659) {
		}
		return nonWork;
	}
}