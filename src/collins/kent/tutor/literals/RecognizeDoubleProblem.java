package collins.kent.tutor.literals;

import java.util.Random;

import collins.kent.tutor.Problem;
import collins.kent.tutor.Skill;
@Skill(skill="Recognize literals of type double")
public class RecognizeDoubleProblem implements Problem, NumericExpression {

	private String displayString;

	@Override
	public RecognizeDoubleProblem generate(Random rng) {
		displayString = (rng.nextBoolean() ? "" : "-")
				+ rng.nextInt(100) + "." + rng.nextInt(100);
		return this;
	}

	@Override
	public String getStatement() {
		return "What is the type of the following literal value?\n  "
				+ displayString;
	}

	@Override
	public String getAnswer() {
		return "double";
	}

	@Override
	public String getNumericExpression() {
		return displayString;
	}

}