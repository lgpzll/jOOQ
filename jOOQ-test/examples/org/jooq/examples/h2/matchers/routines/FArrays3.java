/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.h2.matchers.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FArrays3 extends org.jooq.impl.AbstractRoutine<java.lang.Object[]> {

	private static final long serialVersionUID = -1544818126;

	/**
	 * The parameter <code>PUBLIC.F_ARRAYS3.RETURN_VALUE</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Object[]> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.OTHER.getArrayDataType());

	/**
	 * The parameter <code>PUBLIC.F_ARRAYS3.P1</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Object[]> P1 = createParameter("P1", org.jooq.impl.SQLDataType.OTHER.getArrayDataType());

	/**
	 * Create a new routine call instance
	 */
	public FArrays3() {
		super("F_ARRAYS3", org.jooq.examples.h2.matchers.NonPublic.NON_PUBLIC, org.jooq.impl.SQLDataType.OTHER.getArrayDataType());

		setReturnParameter(RETURN_VALUE);
		addInParameter(P1);
	}

	/**
	 * Set the <code>P1</code> parameter IN value to the routine
	 */
	public void setP1(java.lang.Object[] value) {
		setValue(org.jooq.examples.h2.matchers.routines.FArrays3.P1, value);
	}

	/**
	 * Set the <code>P1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setP1(org.jooq.Field<java.lang.Object[]> field) {
		setField(P1, field);
	}
}
