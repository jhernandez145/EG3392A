/*
 * Jesus Hernandez
 * EG3392A
 * Assignment 2 Question 1
 */
import java.text.DecimalFormat;

public class Essay extends GradeActivity {
	DecimalFormat twoDecimals = new DecimalFormat("0.00");
	
	private final static int GRAMMAR_MAX_POINTS = 25;
	private final static int SPELLING_MAX_POINTS = 35;
	private final static int CONTETNT_MAX_POINTS = 40;

	private int grammarGrade;
	private int spellingGrade;
	private int contentGrade;

	public Essay(int grammarGrade, int spellingGrade, int contentGrade, double score) {
		super(score);

		this.grammarGrade = grammarGrade;
		this.spellingGrade = spellingGrade;
		this.contentGrade = contentGrade;

		if (grammarGrade > GRAMMAR_MAX_POINTS) {
			System.out.println("ERROR: Too many points for grammar section, setting to zero!");
			this.grammarGrade = 0;
			setScore(score - grammarGrade);
		}
		if (spellingGrade > SPELLING_MAX_POINTS) {
			System.out.println("ERROR: Too many points for spelling section, setting to zero!");
			this.spellingGrade = 0;
			setScore(score - spellingGrade);
		}
		if (contentGrade > CONTETNT_MAX_POINTS) {
			System.out.println("ERROR: Too many points for content section, setting to zero!");
			this.contentGrade = 0;
			setScore(score - contentGrade);
		}

	}

	public Essay() {
		super();
	}

	public int getGrammarGrade() {
		return grammarGrade;
	}

	public void setGrammarGrade(int grammarGrade) {
		this.grammarGrade = grammarGrade;
	}

	public int getSpellingGrade() {
		return spellingGrade;
	}

	public void setSpellingGrade(int spellingGrade) {
		this.spellingGrade = spellingGrade;
	}

	public int getContentGrade() {
		return contentGrade;
	}

	public void setContentGrade(int contentGrade) {
		this.contentGrade = contentGrade;
	}
	
	public String toString(){
		return "Score = " + getScore() + " Grade = " + getGrade() + "\n" + 
			   "\tGrammar = " + getGrammarGrade() + "/" + GRAMMAR_MAX_POINTS + "\n" +
			   "\tSpelling = " + getSpellingGrade() + "/" + SPELLING_MAX_POINTS + "\n" +
			   "\tContent = " + getContentGrade() + "/" + CONTETNT_MAX_POINTS;
	}
}
