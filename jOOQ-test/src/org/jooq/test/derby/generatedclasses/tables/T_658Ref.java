/**
 * This class is generated by jOOQ
 */
package org.jooq.test.derby.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class T_658Ref extends org.jooq.impl.TableImpl<org.jooq.test.derby.generatedclasses.tables.records.T_658RefRecord> {

	private static final long serialVersionUID = -1274174277;

	/**
	 * The singleton instance of TEST.T_658_REF
	 */
	public static final org.jooq.test.derby.generatedclasses.tables.T_658Ref T_658_REF = new org.jooq.test.derby.generatedclasses.tables.T_658Ref();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.derby.generatedclasses.tables.records.T_658RefRecord> getRecordType() {
		return org.jooq.test.derby.generatedclasses.tables.records.T_658RefRecord.class;
	}

	/**
	 * The table column <code>TEST.T_658_REF.REF_11</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_T_658_11
	 * FOREIGN KEY (REF_11)
	 * REFERENCES TEST.T_658_11 (ID)
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.T_658RefRecord, org.jooq.test.derby.generatedclasses.enums.T_658_11> REF_11 = createField("REF_11", org.jooq.impl.SQLDataType.CHAR.asMasterDataType(org.jooq.test.derby.generatedclasses.enums.T_658_11.class), T_658_REF);

	/**
	 * The table column <code>TEST.T_658_REF.REF_21</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_T_658_21
	 * FOREIGN KEY (REF_21)
	 * REFERENCES TEST.T_658_21 (ID)
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.T_658RefRecord, org.jooq.test.derby.generatedclasses.enums.T_658_21> REF_21 = createField("REF_21", org.jooq.impl.SQLDataType.INTEGER.asMasterDataType(org.jooq.test.derby.generatedclasses.enums.T_658_21.class), T_658_REF);

	/**
	 * The table column <code>TEST.T_658_REF.REF_31</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_T_658_31
	 * FOREIGN KEY (REF_31)
	 * REFERENCES TEST.T_658_31 (ID)
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.T_658RefRecord, org.jooq.test.derby.generatedclasses.enums.T_658_31> REF_31 = createField("REF_31", org.jooq.impl.SQLDataType.BIGINT.asMasterDataType(org.jooq.test.derby.generatedclasses.enums.T_658_31.class), T_658_REF);

	/**
	 * The table column <code>TEST.T_658_REF.REF_12</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_T_658_12
	 * FOREIGN KEY (REF_12)
	 * REFERENCES TEST.T_658_12 (ID)
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.T_658RefRecord, org.jooq.test.derby.generatedclasses.enums.T_658_12> REF_12 = createField("REF_12", org.jooq.impl.SQLDataType.CHAR.asMasterDataType(org.jooq.test.derby.generatedclasses.enums.T_658_12.class), T_658_REF);

	/**
	 * The table column <code>TEST.T_658_REF.REF_22</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_T_658_22
	 * FOREIGN KEY (REF_22)
	 * REFERENCES TEST.T_658_22 (ID)
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.T_658RefRecord, org.jooq.test.derby.generatedclasses.enums.T_658_22> REF_22 = createField("REF_22", org.jooq.impl.SQLDataType.INTEGER.asMasterDataType(org.jooq.test.derby.generatedclasses.enums.T_658_22.class), T_658_REF);

	/**
	 * The table column <code>TEST.T_658_REF.REF_32</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_T_658_32
	 * FOREIGN KEY (REF_32)
	 * REFERENCES TEST.T_658_32 (ID)
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.T_658RefRecord, org.jooq.test.derby.generatedclasses.enums.T_658_32> REF_32 = createField("REF_32", org.jooq.impl.SQLDataType.BIGINT.asMasterDataType(org.jooq.test.derby.generatedclasses.enums.T_658_32.class), T_658_REF);

	/**
	 * No further instances allowed
	 */
	private T_658Ref() {
		super("T_658_REF", org.jooq.test.derby.generatedclasses.Test.TEST);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.derby.generatedclasses.tables.records.T_658RefRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.derby.generatedclasses.tables.records.T_658RefRecord, ?>>asList();
	}
}