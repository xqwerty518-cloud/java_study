package 토요일_다섯번째문제;

class PasswordChecker {

	/**
	 * 대문자 포함여부
	 * 
	 * @param pw
	 * @return
	 */
	static boolean hasUpperCase(String pw) {

		char[] pw1 = pw.toCharArray();

		for (int i = 0; i < pw1.length; i++) {
			if (pw1[i] >= ('A') && pw1[i] <= ('Z')) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 숫자 포함여부
	 * 
	 * @param pw
	 * @return
	 */
	static boolean hasNumber(String pw) {
		char[] pw1 = pw.toCharArray();
		for (int i = 0; i < pw1.length; i++) {
			if (pw1[i] >= '0' && pw1[i] <= '9') {
				return true;
			}
		}
		return false;
	}

	/**
	 * 길이 8이상 + 대문자 포함 + 숫자 포함
	 * 
	 * @param pw
	 * @return 모두 만족시에 true 반환
	 */
	static boolean isValid(String pw) {
		if (pw.length() >= 8 && hasUpperCase(pw) && hasNumber(pw))
			return true;
		else
			return false;
	}
}

public class 다섯번째문제 {

	public static void main(String[] args) {
		System.out.println(PasswordChecker.isValid("abc123"));
		System.out.println(PasswordChecker.isValid("Abcdefg1"));
	}

}
