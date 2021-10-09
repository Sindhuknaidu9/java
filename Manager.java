class Manager{
	public static void main(String[] args){
		System.out.println("This is a Manager class");
		ManagerDo.Meeting();
		ManagerDo.Monitor();
		ManagerDo.Planning();
		ManagerDo.Organizing();
		ManagerDo.DecideSalary();
		DeveloperDo.Testing();
		DeveloperDo.Debug();
	}
}

class ManagerDo{
	public static void Meeting(){
		System.out.println("Manager call meetings");
	}
	public static void Monitor(){
		System.out.println("Manager will moniter all the team members");
	}
	public static void Planning(){
		System.out.println("Manager will plan the events");
	}
	public static void Organizing(){
		System.out.println("Manager will organize the events");
	}
	public static void DecideSalary(){
		System.out.println("Manager will decide each employee salary");
	}
}

