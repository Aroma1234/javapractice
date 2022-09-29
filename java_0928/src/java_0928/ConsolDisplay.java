package java_0928;

public class ConsolDisplay {

	public static void main(String[] args) {
		// 자신의 것을 출력하고 이어서 출력
		System.out.print("Hello");
		System.out.print("World");
		System.out.println();
		/*자신의 것을 출력하고 줄을 바꾼 후
		다음 내용을 출력*/
		System.out.println("Hello");
		System.out.println("World");
		System.out.println("3 + 5 = 8");
		System.out.println("3 + 5 = " +(-7 + 5));
		System.out.printf("%5d\n", 20);
		System.out.printf("%5d\n", 127);
		System.out.printf("%f\n", 14.9876);
		System.out.printf("%.3f\n", 14.9876);
	}

}
