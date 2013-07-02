/**
 * This class is generated by jOOQ
 */
package org.jooq.test.access.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TLanguageRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.access.generatedclasses.tables.records.TLanguageRecord> implements org.jooq.Record4<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> {

	private static final long serialVersionUID = 402008525;

	/**
	 * Setter for <code>T_LANGUAGE.CD</code>. 
	 */
	public void setCd(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>T_LANGUAGE.CD</code>. 
	 */
	public java.lang.String getCd() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>T_LANGUAGE.XDESCRIPTION</code>. 
	 */
	public void setXdescription(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>T_LANGUAGE.XDESCRIPTION</code>. 
	 */
	public java.lang.String getXdescription() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>T_LANGUAGE.DESCRIPTION_ENGLISH</code>. 
	 */
	public void setDescriptionEnglish(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>T_LANGUAGE.DESCRIPTION_ENGLISH</code>. 
	 */
	public java.lang.String getDescriptionEnglish() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>T_LANGUAGE.ID</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>T_LANGUAGE.ID</code>. 
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(3);
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
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.jooq.test.access.generatedclasses.tables.TLanguage.CD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.test.access.generatedclasses.tables.TLanguage.XDESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.test.access.generatedclasses.tables.TLanguage.DESCRIPTION_ENGLISH;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return org.jooq.test.access.generatedclasses.tables.TLanguage.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getCd();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getXdescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getDescriptionEnglish();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getId();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TLanguageRecord
	 */
	public TLanguageRecord() {
		super(org.jooq.test.access.generatedclasses.tables.TLanguage.T_LANGUAGE);
	}
}
