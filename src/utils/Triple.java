package utils;

/**
 * PJDCC - Summary for class responsabilities.
 *
 * @author fourplus <fourplus1718@gmail.com>
 * @since 1.0
 * @version 11 Changes done
 */
public class Triple {
    /**
     * This field sets the float variable
     */
	public float first;
    /**
     * This field sets the variable of class Pair
     */
	public Pair pair;

	public Triple(float first, Pair pair) {
		super();
		this.first = first;
		this.pair = pair;
	}

	public static Triple of(float home, Pair pair) {
		return new Triple(home, pair);
	}

	public String toString() {
		return first + " : " + pair;
	}
}