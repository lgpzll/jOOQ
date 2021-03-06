/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SakilaActorInfoRecord extends org.jooq.impl.TableRecordImpl<org.jooq.examples.mysql.sakila.tables.records.SakilaActorInfoRecord> implements org.jooq.Record4<java.lang.Short, java.lang.String, java.lang.String, java.lang.String> {

	private static final long serialVersionUID = 572759082;

	/**
	 * Setter for <code>sakila.actor_info.actor_id</code>. 
	 */
	public void setActorId(java.lang.Short value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>sakila.actor_info.actor_id</code>. 
	 */
	public java.lang.Short getActorId() {
		return (java.lang.Short) getValue(0);
	}

	/**
	 * Setter for <code>sakila.actor_info.first_name</code>. 
	 */
	public void setFirstName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>sakila.actor_info.first_name</code>. 
	 */
	public java.lang.String getFirstName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>sakila.actor_info.last_name</code>. 
	 */
	public void setLastName(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>sakila.actor_info.last_name</code>. 
	 */
	public java.lang.String getLastName() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>sakila.actor_info.film_info</code>. 
	 */
	public void setFilmInfo(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>sakila.actor_info.film_info</code>. 
	 */
	public java.lang.String getFilmInfo() {
		return (java.lang.String) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Short, java.lang.String, java.lang.String, java.lang.String> fieldsRow() {
		return (org.jooq.Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row4<java.lang.Short, java.lang.String, java.lang.String, java.lang.String> valuesRow() {
		return (org.jooq.Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field1() {
		return org.jooq.examples.mysql.sakila.tables.SakilaActorInfo.ACTOR_INFO.ACTOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.examples.mysql.sakila.tables.SakilaActorInfo.ACTOR_INFO.FIRST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.jooq.examples.mysql.sakila.tables.SakilaActorInfo.ACTOR_INFO.LAST_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.jooq.examples.mysql.sakila.tables.SakilaActorInfo.ACTOR_INFO.FILM_INFO;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value1() {
		return getActorId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getFirstName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getLastName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getFilmInfo();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SakilaActorInfoRecord value1(java.lang.Short value) {
		setActorId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SakilaActorInfoRecord value2(java.lang.String value) {
		setFirstName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SakilaActorInfoRecord value3(java.lang.String value) {
		setLastName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SakilaActorInfoRecord value4(java.lang.String value) {
		setFilmInfo(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public SakilaActorInfoRecord values(java.lang.Short value1, java.lang.String value2, java.lang.String value3, java.lang.String value4) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached SakilaActorInfoRecord
	 */
	public SakilaActorInfoRecord() {
		super(org.jooq.examples.mysql.sakila.tables.SakilaActorInfo.ACTOR_INFO);
	}

	/**
	 * Create a detached, initialised SakilaActorInfoRecord
	 */
	public SakilaActorInfoRecord(java.lang.Short actorId, java.lang.String firstName, java.lang.String lastName, java.lang.String filmInfo) {
		super(org.jooq.examples.mysql.sakila.tables.SakilaActorInfo.ACTOR_INFO);

		setValue(0, actorId);
		setValue(1, firstName);
		setValue(2, lastName);
		setValue(3, filmInfo);
	}
}
