/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.mysql.enums;


import javax.annotation.Generated;

import org.jooq.EnumType;


/**
 * This class is generated by jOOQ.
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public enum ProcLanguage implements EnumType {

	SQL("SQL"),

	;

	private final String literal;

	private ProcLanguage(String literal) {
		this.literal = literal;
	}

	@Override
	public String getName() {
		return "proc_language";
	}

	@Override
	public String getLiteral() {
		return literal;
	}
}
