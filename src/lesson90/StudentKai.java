package lesson90;

class StudentKai implements Comparable<StudentKai> {
	private String name;
	private int score;

	public StudentKai(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}

	@Override
	public int compareTo(StudentKai other) {
		
	}

}
