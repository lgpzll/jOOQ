/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.mysql.enums;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.2"},
                            comments = "This class is generated by jOOQ")
public enum ProcType implements org.jooq.EnumType {
	FUNCTION("FUNCTION"),

	PROCEDURE("PROCEDURE"),

	;

	private final java.lang.String literal;

	private ProcType(java.lang.String literal) {
		this.literal = literal;
	}

	@Override
	public java.lang.String getName() {
		return "proc_type";
	}

	@Override
	public java.lang.String getLiteral() {
		return literal;
	}
}
