class CharacterType{
	public static void characterConverter()
	{	
		String section = "A";
		String initial = "K";
		String bloodgroup = "O";
		String grade = "B";
		
		char convertedSection = section.charAt(0);
		char convertedInitial= initial.charAt(0);
		char convertedBloodgroup = bloodgroup.charAt(0);
		char convertedGrade = grade.charAt(0);
		
		System.out.println("==================================================");
		System.out.println("section in school "+convertedSection);
		System.out.println("initial of Sindhu "+convertedInitial);
		System.out.println("Blood group is "+convertedBloodgroup);
		System.out.println("grade obtained in 10th "+convertedGrade);
	}
}