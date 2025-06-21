public class Student {
	private int no;
	private String name;
	private Score score;		// Student has a Score (포함관계)

	public Student() {}

	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public Score getScore() {
		return score;
	}

	public void setNo(int no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setScore(Score score) {
		this.score = score;
	}
}
