public class EmployeeServiceApp {
	public static void main(String[] args) {
	
		EmployeeService service = new EmployeeService();

		// 모든 사원정보 출력해보기
		service.printAllEmployees();

		// 10번 사원 찾기
		Employee x = service.getEmployee(10);
		System.out.println(x.getNo() + ", " + x.getName());

		Employee y = service.getEmployee(20);
		System.out.println(y.getNo() + ", " + y.getName());
	}
}
