public class EmployeeApp {
	public static void main(String[] args) {
		// 객체 생성 <--- 기본생성자 활용
		Employee emp1 = new Employee();
		// setter를 활용해서 필드 초기화
		emp1.setNo(10);
		emp1.setName("홍길동");
		emp1.setDept("영업1팀");
		emp1.setSalary(3000000);
		emp1.setWorkingYear(4);
		emp1.setTel("010-1111-2222");
		
		// 객체 생성 <--- 매개변수를 전달받는 생성자를 이용해서 필드 초기화
		Employee emp2 = new Employee(20, "김유신", "인사팀", 2500000, 2, "010-3333-4444");

		// Employee객체 2개 담을 수 있는 배열객체를 생성해서 employees에 담기
		Employee[] employees = new Employee[2];
		// employees가 참조하는 배열의 0번째와 1번째에 위에서 생성한 객체를 담기
		employees[0] = emp1;
		employees[1] = emp2;

		// 배열에 저장된 사원들의 사원번호와 이름, 급여를 화면에 표시하기
		for (Employee emp : employees) {
			int 사번 = emp.getNo();
			String 이름 = emp.getName();
			int 급여 = emp.getSalary();

			System.out.println("사원번호 : " + 사번);
			System.out.println("사원이름 : " + 이름);
			System.out.println("실수령액 : " + 급여);
		
		}
	}
}
