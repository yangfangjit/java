package enums;

public enum Week {
	Sunday(0),
	Monday(1),
	Tuesday(2),
	Wednesday(3),
	Thursday(4),
	Friday(5),
	Saturday(6);
	
	private int digit;
	
	Week(int digit) {
		this.digit = digit;
	}

	public Week valueOf(int digit) {
		for (Week week : values()) {
			if (week.getDigit() == digit) {
				return week;
			}
		}
		return null;
	}
	
	public int getDigit() {
		return digit;
	}

	public void setDigit(int digit) {
		this.digit = digit;
	}

}
