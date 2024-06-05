public class BitwiseOperations{
	public static void main(String[] args) {
		int num1=5;
		int num2=7;
		
		int resultAND= num1 & num2;
		System.out.println("Bitwise Operator AND:"+ resultAND);
		
		int resultOR= num1 | num2;
		System.out.println("Bitwise Operator OR:"+ resultOR);
		
		int resultXOR= num1 ^ num2;
		System.out.println("Bitwise Operator XOR:"+ resultXOR);
	}
}