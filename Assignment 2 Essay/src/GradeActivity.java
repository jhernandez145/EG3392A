/*
 * Jesus Hernandez
 * EG3392A
 * Assignment 2 Question 1
 */
public class GradeActivity {
	private double score;

	public GradeActivity() {
		super();
	}

	public GradeActivity(double score) {
		super();
		this.score = score;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public char getGrade() {
		if (90 <= score && score <= 100) {
			return 'A';
		} else if (80 <= score && score <= 89) {
			return 'B';
		} else if (70 <= score && score <= 79) {
			return 'C';
		} else if (60 <= score && score <= 69) {
			return 'D';
		} else {
			return 'F';
		}

	}

}
