class StringStarter{

	public static void main(String[] drinks)
	{
		String company=new String("ECS");
		System.out.println(company);
		
		String myName=new String("sindhu");
		System.out.println(myName);

		char[] product={'H','R','I','S'};
		String name=new String(product);
		System.out.println(name);
		
		String productName=new String("HRIS-ASIA");
		System.out.println(productName);
		
		int[] numbers={65,66,67,68,69};
		String codePoints=new String(numbers,2,3);
		System.out.println(codePoints);
		
		byte[] numbers2={70,71,72,74,75};
		String conversion=new String(numbers2);
		System.out.println(conversion);
		
		String conversion1=new String(numbers2,1,4);
		System.out.println(conversion1);
		
		StringBuffer place=new StringBuffer("chennai");
		String branch=new String(place);
		System.out.println(branch);
		
		char[] ceo={'R','a','j'};
		String ceoNameIs=new String(ceo);
		System.out.println(ceoNameIs);
		
		StringBuilder subBranch=new StringBuilder("Banglore");
		String builder=new String(subBranch);
		System.out.println(builder);

		if(company!=productName)
		{
			System.out.println("both strings are not pointing to same memory");
		}
		else
		{
			System.out.println("both pointing to same memory");
		}

		boolean contains=productName.contains("AS");
		System.out.println(contains);

		int codePoint=company.codePointAt(3);
		System.out.println(codePoint);

		int beforeChar=branch.codePointBefore(3);
		System.out.println(beforeChar);

		char Char=name.charAt(2);
		System.out.println(Char);

		boolean check=ceoNameIs.endsWith("A");
		System.out.println(check);

		String ref3=name.concat(company);
		System.out.println(ref3);

		String ref4=productName.replace('u','0');
		System.out.println(ref4);

		String ref5=ceoNameIs.toUpperCase();
		System.out.println(ref5);

		String ref6=name.toLowerCase();
		System.out.println(ref6);

		String ref7=productName.trim();
		System.out.println(ref7);

		int compare=company.compareTo(productName);
		System.out.println(compare);

		String ref8=String.copyValueOf(product);
		System.out.println(ref8);

		boolean ref9=productName.startsWith("A");
		System.out.println(ref9);





	}
}

