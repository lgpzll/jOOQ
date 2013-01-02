/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 *
 * snapshot table for snapshot TEST.M_LIBRARY
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "M_LIBRARY", schema = "TEST")
public class M_LIBRARY_POJO extends java.lang.ThreadDeath implements java.lang.Cloneable, org.jooq.test.oracle3.generatedclasses.tables.interfaces.M_LIBRARY_INTERFACE {

	private static final long serialVersionUID = 127452035;

	private java.lang.String AUTHOR;
	private java.lang.String TITLE;

	@javax.persistence.Column(name = "AUTHOR", length = 101)
	@Override
	public java.lang.String getAUTHOR() {
		return this.AUTHOR;
	}

	@Override
	public void setAUTHOR(java.lang.String AUTHOR) {
		this.AUTHOR = AUTHOR;
	}

	@javax.persistence.Column(name = "TITLE", nullable = false, length = 400)
	@Override
	public java.lang.String getTITLE() {
		return this.TITLE;
	}

	@Override
	public void setTITLE(java.lang.String TITLE) {
		this.TITLE = TITLE;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.oracle3.generatedclasses.tables.interfaces.M_LIBRARY_INTERFACE from) {
		setAUTHOR(from.getAUTHOR());
		setTITLE(from.getTITLE());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.oracle3.generatedclasses.tables.interfaces.M_LIBRARY_INTERFACE> E into(E into) {
		into.from(this);
		return into;
	}
}