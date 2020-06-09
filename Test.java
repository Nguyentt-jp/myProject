
public class Test {

	public static void main(String[] args) {
		int[] in = { 16, 18, 23, 33 };
		int[] out = { 99, 28, 23, 99 };
		int[] result = count(in, out);
		System.out.println(result[0] + ":" + result[1]);
	}

	public static int[] count(int[] inYearArr, int[] outYearArr) {

		int count = 0;
		int year = 0;
		for (int i = 16; i <= 66; i++) {
			int num = 0;
			for (int j = 0; j < outYearArr.length; j++) {
				if (i >= inYearArr[j] && i <= outYearArr[j]) {
					num++;
				}
			}
			if (num > count) {
				count = num;
				year = i;
			}
		}
		return new int[] { count, year };
	}
}
