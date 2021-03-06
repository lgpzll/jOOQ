/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VLibraryRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.postgres.generatedclasses.tables.records.VLibraryRecord> implements org.jooq.Record2<java.lang.String, java.lang.String>, org.jooq.test.postgres.generatedclasses.tables.interfaces.IVLibrary {

	private static final long serialVersionUID = -741999613;

	/**
	 * Setter for <code>public.v_library.author</code>. 
	 */
	public VLibraryRecord setAuthor(java.lang.String value) {
		setValue(0, value);
		return this;
	}

	/**
	 * Getter for <code>public.v_library.author</code>. 
	 */
	@Override
	public java.lang.String getAuthor() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>public.v_library.title</code>. 
	 */
	public VLibraryRecord setTitle(java.lang.String value) {
		setValue(1, value);
		return this;
	}

	/**
	 * Getter for <code>public.v_library.title</code>. 
	 */
	@Override
	public java.lang.String getTitle() {
		return (java.lang.String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.jooq.test.postgres.generatedclasses.tables.VLibrary.V_LIBRARY.AUTHOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.test.postgres.generatedclasses.tables.VLibrary.V_LIBRARY.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getAuthor();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getTitle();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VLibraryRecord value1(java.lang.String value) {
		setAuthor(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VLibraryRecord value2(java.lang.String value) {
		setTitle(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public VLibraryRecord values(java.lang.String value1, java.lang.String value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached VLibraryRecord
	 */
	public VLibraryRecord() {
		super(org.jooq.test.postgres.generatedclasses.tables.VLibrary.V_LIBRARY);
	}

	/**
	 * Create a detached, initialised VLibraryRecord
	 */
	public VLibraryRecord(java.lang.String author, java.lang.String title) {
		super(org.jooq.test.postgres.generatedclasses.tables.VLibrary.V_LIBRARY);

		setValue(0, author);
		setValue(1, title);
	}
}
