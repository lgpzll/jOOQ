/**
 * This class is generated by jOOQ
 */
package org.jooq.util.oracle.sys.tables.records;


import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.TableRecordImpl;
import org.jooq.util.oracle.sys.tables.AllTabComments;


/**
 * This class is generated by jOOQ.
 *
 * Comments on tables and views accessible to the user
 */
@Generated(value    = "http://jooq.sourceforge.net",
           comments = "This class is generated by jOOQ")
public class AllTabCommentsRecord extends TableRecordImpl<AllTabCommentsRecord> {

	private static final long serialVersionUID = -1190978387;

	/**
	 * Owner of the object
	 */
	public void setOwner(String value) {
		setValue(AllTabComments.OWNER, value);
	}

	/**
	 * Owner of the object
	 */
	public String getOwner() {
		return getValue(AllTabComments.OWNER);
	}

	/**
	 * Name of the object
	 */
	public void setTableName(String value) {
		setValue(AllTabComments.TABLE_NAME, value);
	}

	/**
	 * Name of the object
	 */
	public String getTableName() {
		return getValue(AllTabComments.TABLE_NAME);
	}

	/**
	 * Type of the object
	 */
	public void setTableType(String value) {
		setValue(AllTabComments.TABLE_TYPE, value);
	}

	/**
	 * Type of the object
	 */
	public String getTableType() {
		return getValue(AllTabComments.TABLE_TYPE);
	}

	/**
	 * Comment on the object
	 */
	public void setComments(String value) {
		setValue(AllTabComments.COMMENTS, value);
	}

	/**
	 * Comment on the object
	 */
	public String getComments() {
		return getValue(AllTabComments.COMMENTS);
	}

	public AllTabCommentsRecord(Configuration configuration) {
		super(configuration, AllTabComments.ALL_TAB_COMMENTS);
	}
}
