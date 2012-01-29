/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.oracle.sys.packages.dbms_xplan;

/**
 * This class is generated by jOOQ.
 */
public class DisplayPlan extends org.jooq.impl.AbstractRoutine<java.lang.String> {

	private static final long serialVersionUID = -850892877;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.CLOB);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> TABLE_NAME = createParameter("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> STATEMENT_ID = createParameter("STATEMENT_ID", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> FORMAT = createParameter("FORMAT", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> FILTER_PREDS = createParameter("FILTER_PREDS", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> TYPE = createParameter("TYPE", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * Create a new routine call instance
	 */
	public DisplayPlan() {
		super(org.jooq.SQLDialect.ORACLE, "DISPLAY_PLAN", org.jooq.examples.oracle.sys.Sys.SYS, org.jooq.examples.oracle.sys.packages.DbmsXplan.DBMS_XPLAN, org.jooq.impl.SQLDataType.CLOB);

		setReturnParameter(RETURN_VALUE);
		addInParameter(TABLE_NAME);
		addInParameter(STATEMENT_ID);
		addInParameter(FORMAT);
		addInParameter(FILTER_PREDS);
		addInParameter(TYPE);
	}

	/**
	 * Set the <code>TABLE_NAME</code> parameter to the routine
	 */
	public void setTableName(java.lang.String value) {
		setValue(TABLE_NAME, value);
	}

	/**
	 * Set the <code>TABLE_NAME</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setTableName(org.jooq.Field<java.lang.String> field) {
		setField(TABLE_NAME, field);
	}

	/**
	 * Set the <code>STATEMENT_ID</code> parameter to the routine
	 */
	public void setStatementId(java.lang.String value) {
		setValue(STATEMENT_ID, value);
	}

	/**
	 * Set the <code>STATEMENT_ID</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setStatementId(org.jooq.Field<java.lang.String> field) {
		setField(STATEMENT_ID, field);
	}

	/**
	 * Set the <code>FORMAT</code> parameter to the routine
	 */
	public void setFormat(java.lang.String value) {
		setValue(FORMAT, value);
	}

	/**
	 * Set the <code>FORMAT</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setFormat(org.jooq.Field<java.lang.String> field) {
		setField(FORMAT, field);
	}

	/**
	 * Set the <code>FILTER_PREDS</code> parameter to the routine
	 */
	public void setFilterPreds(java.lang.String value) {
		setValue(FILTER_PREDS, value);
	}

	/**
	 * Set the <code>FILTER_PREDS</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setFilterPreds(org.jooq.Field<java.lang.String> field) {
		setField(FILTER_PREDS, field);
	}

	/**
	 * Set the <code>TYPE</code> parameter to the routine
	 */
	public void setType(java.lang.String value) {
		setValue(TYPE, value);
	}

	/**
	 * Set the <code>TYPE</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setType(org.jooq.Field<java.lang.String> field) {
		setField(TYPE, field);
	}
}
