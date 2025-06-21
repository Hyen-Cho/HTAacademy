public class EmployeeService {

	Employee[] database = new Employee[3];

	public EmployeeService() {
		database[0] = new Employee(10, "김유신", "영업1팀", 250, 2, "010-1234-5678");
		database[1] = new Employee(20, "강감찬", "기술팀", 350, 3, "010-1111-1111");
		database[2] = new Employee(30, "이순신", "인사팀", 300, 2, "010-1234-2222");
	}
	
	// 새로운 사원정보를 전달받아서 등록하는 기능

	// 삭제할 사원번호를 전달받아서 그 번호에 해당하는 사원정보를 삭제하는 기능

	// 모든 사원정보를 출력하는 기능
	public void printAllEmployees() {
		for (Employee e : database) {
			int no = e.getNo();
			String name = e.getName();
			String dept = e.getDept();
			int salary = e.getSalary();
			int workingYear = e.getWorkingYear();
			String tel = e.getTel();

			System.out.println("사원번호 : " + no);
			System.out.println("사원이름 : " + name);
			System.out.println("소속부서 : " + dept);
			System.out.println("실수령액 : " + salary);
			System.out.println("근무년수 : " + workingYear);
			System.out.println("전화번호 : " + tel);
			System.out.println();
		}
	}

	// 조회할 사원번호를 전달받아서 그 번호에 해당하는 사원정보를 제공하는 기능
	public Employee getEmployee(int empNo) {
		Employee emp = null;
		
		for (Employee e : database) {
			if (empNo == e.getNo()) {		// 메소드 이용할땐 '()' 를 넣어준다.
				emp = e;
				break;
			}
		}
		return emp;
	}
}
