class Developer{
	public static void main(String[] args){
		System.out.println("This is a developer class");
		DeveloperDo.WriteCode();
		DeveloperDo.DevelopApplication();
		DeveloperDo.compile();
		DeveloperDo.Run();
		DeveloperDo.Testing();
		DeveloperDo.Debug();
		ManagerDo.Organizing();
		ManagerDo.DecideSalary();
	}
}

class DeveloperDo{
	public static void WriteCode(){
		System.out.println("developer write code");
	}
	public static void DevelopApplication(){
		System.out.println("developer develop application");
	}
	public static void compile(){
		System.out.println("developer compile the code");
	}
	public static void Run(){
		System.out.println("developer run the code");
	}
	public static void Testing(){
		System.out.println("developer test the code");
	}
	public static void Debug(){
		System.out.println("developer debug the errors");
	}
}

