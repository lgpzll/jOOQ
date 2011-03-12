/**
 * This class is generated by jOOQ
 */
package org.jooq.util.oracle.sys.tables.records;


import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.TableRecordImpl;
import org.jooq.util.oracle.sys.tables.AllProcedures;


/**
 * This class is generated by jOOQ.
 *
 * Description of all procedures available to the user
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class AllProceduresRecord extends TableRecordImpl<AllProceduresRecord> {

	private static final long serialVersionUID = 916583036;

	/**
	 * An uncommented item
	 */
	public void setOwner(String value) {
		setValue(AllProcedures.OWNER, value);
	}

	/**
	 * An uncommented item
	 */
	public String getOwner() {
		return getValue(AllProcedures.OWNER);
	}

	/**
	 * Name of the object : top level function/procedure/package name
	 */
	public void setObjectName(String value) {
		setValue(AllProcedures.OBJECT_NAME, value);
	}

	/**
	 * Name of the object : top level function/procedure/package name
	 */
	public String getObjectName() {
		return getValue(AllProcedures.OBJECT_NAME);
	}

	/**
	 * Name of the procedure
	 */
	public void setProcedureName(String value) {
		setValue(AllProcedures.PROCEDURE_NAME, value);
	}

	/**
	 * Name of the procedure
	 */
	public String getProcedureName() {
		return getValue(AllProcedures.PROCEDURE_NAME);
	}

	/**
	 * Is it an aggregate function ?
	 */
	public void setAggregate(String value) {
		setValue(AllProcedures.AGGREGATE, value);
	}

	/**
	 * Is it an aggregate function ?
	 */
	public String getAggregate() {
		return getValue(AllProcedures.AGGREGATE);
	}

	/**
	 * Is it a pipelined table function ?
	 */
	public void setPipelined(String value) {
		setValue(AllProcedures.PIPELINED, value);
	}

	/**
	 * Is it a pipelined table function ?
	 */
	public String getPipelined() {
		return getValue(AllProcedures.PIPELINED);
	}

	/**
	 * Name of the owner of the implementation type (if any)
	 */
	public void setImpltypeowner(String value) {
		setValue(AllProcedures.IMPLTYPEOWNER, value);
	}

	/**
	 * Name of the owner of the implementation type (if any)
	 */
	public String getImpltypeowner() {
		return getValue(AllProcedures.IMPLTYPEOWNER);
	}

	/**
	 * Name of the implementation type (if any)
	 */
	public void setImpltypename(String value) {
		setValue(AllProcedures.IMPLTYPENAME, value);
	}

	/**
	 * Name of the implementation type (if any)
	 */
	public String getImpltypename() {
		return getValue(AllProcedures.IMPLTYPENAME);
	}

	/**
	 * Is the procedure parallel enabled ?
	 */
	public void setParallel(String value) {
		setValue(AllProcedures.PARALLEL, value);
	}

	/**
	 * Is the procedure parallel enabled ?
	 */
	public String getParallel() {
		return getValue(AllProcedures.PARALLEL);
	}

	/**
	 * An uncommented item
	 */
	public void setInterface(String value) {
		setValue(AllProcedures.INTERFACE, value);
	}

	/**
	 * An uncommented item
	 */
	public String getInterface() {
		return getValue(AllProcedures.INTERFACE);
	}

	/**
	 * An uncommented item
	 */
	public void setDeterministic(String value) {
		setValue(AllProcedures.DETERMINISTIC, value);
	}

	/**
	 * An uncommented item
	 */
	public String getDeterministic() {
		return getValue(AllProcedures.DETERMINISTIC);
	}

	/**
	 * An uncommented item
	 */
	public void setAuthid(String value) {
		setValue(AllProcedures.AUTHID, value);
	}

	/**
	 * An uncommented item
	 */
	public String getAuthid() {
		return getValue(AllProcedures.AUTHID);
	}

	public AllProceduresRecord(Configuration configuration) {
		super(configuration, AllProcedures.ALL_PROCEDURES);
	}
}
