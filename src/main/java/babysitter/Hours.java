package babysitter;

public class Hours {

	private int work;
	private int nonWork;

	public Hours(int work, int nonWork) {
		this.work = work;
		this.nonWork = nonWork;
	}

	public int getWork(int i) {
		if (i >= 1700 && i <= 1759) {
		} else if (i >= 1800 && i <= 1859) {
		} else if (i >= 1900 && i <= 1959) {
		} else if (i >= 2000 && i <= 2059) {
		} else if (i >= 2100 && i <= 2159) {
		} else if (i >= 2200 && i <= 2259) {
		} else if (i >= 2300 && i <= 2359) {
		} else if (i >= 0000 && i <= 0059F) {
		} else if (i >= 0100 && i <= 0159F) {
		} else if (i >= 0200 && i <= 0259F) {
		} else if (i >= 0300 && i <= 0400) {
		}
		return work;
	}

	public int getNonWork(int i) {
		if (i >= 0401 && i <= 0459F)
			;
		else if (i >= 0500 && i <= 0559F)
			;
		else if (i >= 0600 && i <= 0659F)
			;
		else if (i >= 0700 && i <= 0759F)
			;
		else if (i >= 0800F && i <= 0859F)
			;
		else if (i >= 0900F && i <= 0959F)
			;
		else if (i >= 1000 && i <= 1059)
			;
		else if (i >= 1100 && i <= 1159)
			;
		else if (i == 1200 && i <= 1259)
			;
		else if (i == 1300 && i <= 1359)
			;
		else if (i == 1400 && i <= 1459)
			;
		else if (i == 1500 && i <= 1559)
			;
		else if (i == 1600 && i <= 1659)
			;
		return nonWork;
	}
}
