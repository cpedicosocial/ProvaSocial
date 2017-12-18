package main;

import java.util.Date;

/**
 * PJDCC - Summary for class responsabilities.
 *
 * @author fourplus <fourplus1718@gmail.com>
 * @since 1.0
 * @version 11 Changes done
 */

public class FullFixture extends ExtendedFixture {
    /**
     * This field sets the variable of class AsianLines
     */
	public AsianLines asianLines;
    /**
     * This field sets the float variable GoalLines
     */
	public GoalLines goalLines;

	public FullFixture(Date date, String homeTeam, String awayTeam, Result result, String competition) {
		super(date, homeTeam, awayTeam, result, competition);
		// TODO Auto-generated constructor stub
	}

	public FullFixture withLines(AsianLines asianLines, GoalLines goalLines) {
		this.asianLines = asianLines;
		this.goalLines = goalLines;
		return this;
	}
	
	public FullFixture withAsianLines(AsianLines asianLines) {
		this.asianLines = asianLines;
		return this;
	}
	
	public FullFixture withGoalLines(GoalLines goalLines) {
		this.goalLines = goalLines;
		return this;
	}

}
