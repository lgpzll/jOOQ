/**
 * This class is generated by jOOQ
 */
package org.jooq.util.h2.information_schema.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.2"},
                            comments = "This class is generated by jOOQ")
public class TypeInfoRecord extends org.jooq.impl.TableRecordImpl<org.jooq.util.h2.information_schema.tables.records.TypeInfoRecord> {

	private static final long serialVersionUID = 995660642;

	/**
	 * An uncommented item
	 */
	public void setTypeName(java.lang.String value) {
		setValue(org.jooq.util.h2.information_schema.tables.TypeInfo.TYPE_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getTypeName() {
		return getValue(org.jooq.util.h2.information_schema.tables.TypeInfo.TYPE_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setDataType(java.lang.Integer value) {
		setValue(org.jooq.util.h2.information_schema.tables.TypeInfo.DATA_TYPE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getDataType() {
		return getValue(org.jooq.util.h2.information_schema.tables.TypeInfo.DATA_TYPE);
	}

	/**
	 * An uncommented item
	 */
	public void setPrecision(java.lang.Integer value) {
		setValue(org.jooq.util.h2.information_schema.tables.TypeInfo.PRECISION, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getPrecision() {
		return getValue(org.jooq.util.h2.information_schema.tables.TypeInfo.PRECISION);
	}

	/**
	 * An uncommented item
	 */
	public void setPrefix(java.lang.String value) {
		setValue(org.jooq.util.h2.information_schema.tables.TypeInfo.PREFIX, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getPrefix() {
		return getValue(org.jooq.util.h2.information_schema.tables.TypeInfo.PREFIX);
	}

	/**
	 * An uncommented item
	 */
	public void setSuffix(java.lang.String value) {
		setValue(org.jooq.util.h2.information_schema.tables.TypeInfo.SUFFIX, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getSuffix() {
		return getValue(org.jooq.util.h2.information_schema.tables.TypeInfo.SUFFIX);
	}

	/**
	 * An uncommented item
	 */
	public void setParams(java.lang.String value) {
		setValue(org.jooq.util.h2.information_schema.tables.TypeInfo.PARAMS, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getParams() {
		return getValue(org.jooq.util.h2.information_schema.tables.TypeInfo.PARAMS);
	}

	/**
	 * An uncommented item
	 */
	public void setAutoIncrement(java.lang.Boolean value) {
		setValue(org.jooq.util.h2.information_schema.tables.TypeInfo.AUTO_INCREMENT, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Boolean getAutoIncrement() {
		return getValue(org.jooq.util.h2.information_schema.tables.TypeInfo.AUTO_INCREMENT);
	}

	/**
	 * An uncommented item
	 */
	public void setMinimumScale(java.lang.Short value) {
		setValue(org.jooq.util.h2.information_schema.tables.TypeInfo.MINIMUM_SCALE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Short getMinimumScale() {
		return getValue(org.jooq.util.h2.information_schema.tables.TypeInfo.MINIMUM_SCALE);
	}

	/**
	 * An uncommented item
	 */
	public void setMaximumScale(java.lang.Short value) {
		setValue(org.jooq.util.h2.information_schema.tables.TypeInfo.MAXIMUM_SCALE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Short getMaximumScale() {
		return getValue(org.jooq.util.h2.information_schema.tables.TypeInfo.MAXIMUM_SCALE);
	}

	/**
	 * An uncommented item
	 */
	public void setRadix(java.lang.Integer value) {
		setValue(org.jooq.util.h2.information_schema.tables.TypeInfo.RADIX, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getRadix() {
		return getValue(org.jooq.util.h2.information_schema.tables.TypeInfo.RADIX);
	}

	/**
	 * An uncommented item
	 */
	public void setPos(java.lang.Integer value) {
		setValue(org.jooq.util.h2.information_schema.tables.TypeInfo.POS, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getPos() {
		return getValue(org.jooq.util.h2.information_schema.tables.TypeInfo.POS);
	}

	/**
	 * An uncommented item
	 */
	public void setCaseSensitive(java.lang.Boolean value) {
		setValue(org.jooq.util.h2.information_schema.tables.TypeInfo.CASE_SENSITIVE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Boolean getCaseSensitive() {
		return getValue(org.jooq.util.h2.information_schema.tables.TypeInfo.CASE_SENSITIVE);
	}

	/**
	 * An uncommented item
	 */
	public void setNullable(java.lang.Short value) {
		setValue(org.jooq.util.h2.information_schema.tables.TypeInfo.NULLABLE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Short getNullable() {
		return getValue(org.jooq.util.h2.information_schema.tables.TypeInfo.NULLABLE);
	}

	/**
	 * An uncommented item
	 */
	public void setSearchable(java.lang.Short value) {
		setValue(org.jooq.util.h2.information_schema.tables.TypeInfo.SEARCHABLE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Short getSearchable() {
		return getValue(org.jooq.util.h2.information_schema.tables.TypeInfo.SEARCHABLE);
	}

	/**
	 * Create a detached TypeInfoRecord
	 */
	public TypeInfoRecord() {
		super(org.jooq.util.h2.information_schema.tables.TypeInfo.TYPE_INFO);
	}
}
