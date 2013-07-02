/**
 * This class is generated by jOOQ
 */
package org.jooq.test.access.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_639NumbersTableRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.access.generatedclasses.tables.records.T_639NumbersTableRecord> implements org.jooq.Record13<java.lang.Integer, java.lang.Byte, java.lang.Short, java.lang.Integer, java.lang.Integer, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.lang.Double, java.lang.Double> {

	private static final long serialVersionUID = 853159645;

	/**
	 * Setter for <code>T_639_NUMBERS_TABLE.ID</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>T_639_NUMBERS_TABLE.ID</code>. 
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>T_639_NUMBERS_TABLE.TINYINT</code>. 
	 */
	public void setTinyint(java.lang.Byte value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>T_639_NUMBERS_TABLE.TINYINT</code>. 
	 */
	public java.lang.Byte getTinyint() {
		return (java.lang.Byte) getValue(1);
	}

	/**
	 * Setter for <code>T_639_NUMBERS_TABLE.XSHORT</code>. 
	 */
	public void setXshort(java.lang.Short value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>T_639_NUMBERS_TABLE.XSHORT</code>. 
	 */
	public java.lang.Short getXshort() {
		return (java.lang.Short) getValue(2);
	}

	/**
	 * Setter for <code>T_639_NUMBERS_TABLE.XINTEGER</code>. 
	 */
	public void setXinteger(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>T_639_NUMBERS_TABLE.XINTEGER</code>. 
	 */
	public java.lang.Integer getXinteger() {
		return (java.lang.Integer) getValue(3);
	}

	/**
	 * Setter for <code>T_639_NUMBERS_TABLE.XLONG</code>. 
	 */
	public void setXlong(java.lang.Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>T_639_NUMBERS_TABLE.XLONG</code>. 
	 */
	public java.lang.Integer getXlong() {
		return (java.lang.Integer) getValue(4);
	}

	/**
	 * Setter for <code>T_639_NUMBERS_TABLE.BYTE_DECIMAL</code>. 
	 */
	public void setByteDecimal(java.math.BigDecimal value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>T_639_NUMBERS_TABLE.BYTE_DECIMAL</code>. 
	 */
	public java.math.BigDecimal getByteDecimal() {
		return (java.math.BigDecimal) getValue(5);
	}

	/**
	 * Setter for <code>T_639_NUMBERS_TABLE.SHORT_DECIMAL</code>. 
	 */
	public void setShortDecimal(java.math.BigDecimal value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>T_639_NUMBERS_TABLE.SHORT_DECIMAL</code>. 
	 */
	public java.math.BigDecimal getShortDecimal() {
		return (java.math.BigDecimal) getValue(6);
	}

	/**
	 * Setter for <code>T_639_NUMBERS_TABLE.INTEGER_DECIMAL</code>. 
	 */
	public void setIntegerDecimal(java.math.BigDecimal value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>T_639_NUMBERS_TABLE.INTEGER_DECIMAL</code>. 
	 */
	public java.math.BigDecimal getIntegerDecimal() {
		return (java.math.BigDecimal) getValue(7);
	}

	/**
	 * Setter for <code>T_639_NUMBERS_TABLE.LONG_DECIMAL</code>. 
	 */
	public void setLongDecimal(java.math.BigDecimal value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>T_639_NUMBERS_TABLE.LONG_DECIMAL</code>. 
	 */
	public java.math.BigDecimal getLongDecimal() {
		return (java.math.BigDecimal) getValue(8);
	}

	/**
	 * Setter for <code>T_639_NUMBERS_TABLE.BIG_INTEGER</code>. 
	 */
	public void setBigInteger(java.math.BigDecimal value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>T_639_NUMBERS_TABLE.BIG_INTEGER</code>. 
	 */
	public java.math.BigDecimal getBigInteger() {
		return (java.math.BigDecimal) getValue(9);
	}

	/**
	 * Setter for <code>T_639_NUMBERS_TABLE.BIG_DECIMAL</code>. 
	 */
	public void setBigDecimal(java.math.BigDecimal value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>T_639_NUMBERS_TABLE.BIG_DECIMAL</code>. 
	 */
	public java.math.BigDecimal getBigDecimal() {
		return (java.math.BigDecimal) getValue(10);
	}

	/**
	 * Setter for <code>T_639_NUMBERS_TABLE.XFLOAT</code>. 
	 */
	public void setXfloat(java.lang.Double value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>T_639_NUMBERS_TABLE.XFLOAT</code>. 
	 */
	public java.lang.Double getXfloat() {
		return (java.lang.Double) getValue(11);
	}

	/**
	 * Setter for <code>T_639_NUMBERS_TABLE.XDOUBLE</code>. 
	 */
	public void setXdouble(java.lang.Double value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>T_639_NUMBERS_TABLE.XDOUBLE</code>. 
	 */
	public java.lang.Double getXdouble() {
		return (java.lang.Double) getValue(12);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record13 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row13<java.lang.Integer, java.lang.Byte, java.lang.Short, java.lang.Integer, java.lang.Integer, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.lang.Double, java.lang.Double> fieldsRow() {
		return (org.jooq.Row13) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row13<java.lang.Integer, java.lang.Byte, java.lang.Short, java.lang.Integer, java.lang.Integer, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.math.BigDecimal, java.lang.Double, java.lang.Double> valuesRow() {
		return (org.jooq.Row13) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.access.generatedclasses.tables.T_639NumbersTable.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Byte> field2() {
		return org.jooq.test.access.generatedclasses.tables.T_639NumbersTable.TINYINT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field3() {
		return org.jooq.test.access.generatedclasses.tables.T_639NumbersTable.XSHORT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return org.jooq.test.access.generatedclasses.tables.T_639NumbersTable.XINTEGER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return org.jooq.test.access.generatedclasses.tables.T_639NumbersTable.XLONG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field6() {
		return org.jooq.test.access.generatedclasses.tables.T_639NumbersTable.BYTE_DECIMAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field7() {
		return org.jooq.test.access.generatedclasses.tables.T_639NumbersTable.SHORT_DECIMAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field8() {
		return org.jooq.test.access.generatedclasses.tables.T_639NumbersTable.INTEGER_DECIMAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field9() {
		return org.jooq.test.access.generatedclasses.tables.T_639NumbersTable.LONG_DECIMAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field10() {
		return org.jooq.test.access.generatedclasses.tables.T_639NumbersTable.BIG_INTEGER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field11() {
		return org.jooq.test.access.generatedclasses.tables.T_639NumbersTable.BIG_DECIMAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field12() {
		return org.jooq.test.access.generatedclasses.tables.T_639NumbersTable.XFLOAT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field13() {
		return org.jooq.test.access.generatedclasses.tables.T_639NumbersTable.XDOUBLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Byte value2() {
		return getTinyint();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value3() {
		return getXshort();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getXinteger();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getXlong();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value6() {
		return getByteDecimal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value7() {
		return getShortDecimal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value8() {
		return getIntegerDecimal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value9() {
		return getLongDecimal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value10() {
		return getBigInteger();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value11() {
		return getBigDecimal();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value12() {
		return getXfloat();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value13() {
		return getXdouble();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached T_639NumbersTableRecord
	 */
	public T_639NumbersTableRecord() {
		super(org.jooq.test.access.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE);
	}
}
