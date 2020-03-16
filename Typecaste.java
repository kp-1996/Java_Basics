
public class Typecaste {
	
	public int bintodec(int binary) {
		int decimal = 0;
		int p = 0;
		while(true) {
			if(binary == 0) {
				break;
			}else {
				int temp = binary%10;
				decimal += temp*Math.pow(2, p);
				binary = binary/10;
				p++;
			}
		}
		return decimal;
	}
	
	public void Dectobin(int decimal) {
		
		int binary[] = new int[40];
		int index = 0;
		while(decimal > 0) {
			binary[index++] = decimal%2;
			decimal =decimal/2;
		}
		for (int i =  0; i<=index-1; i++) {
			System.out.print(binary[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Float to Int: "+(int)10.6);
		
		System.out.println("Int to Float: "+(float)5);
		
		System.out.println("Double to Int: "+(int)56.235689);
		
		System.out.println("Int to Double: "+(double)56);
		
		System.out.println("String To Int: "+Integer.parseInt("123456"));
		
		System.out.println("Int to String: "+String.valueOf(23));
		
		System.out.println("String to Double: "+Long.parseLong("256"));
		
		System.out.println("Binary to Decimal: "+Integer.parseInt("0101", 2));
		
		Typecaste obj = new Typecaste();
		System.out.println("Without parseInt: "+obj.bintodec(101));
		
		System.out.println("Decimal to Binary: "+Integer.toBinaryString(5));
		
		System.out.print("Without using Math func: ");
		obj.Dectobin(5);
	}

}
