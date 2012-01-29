/**
 * This class is generated by jOOQ
 */
package org.jooq.util.h2.information_schema;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.2"},
                            comments = "This class is generated by jOOQ")
public class InformationSchema extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = 42747060;

	/**
	 * The singleton instance of INFORMATION_SCHEMA
	 */
	public static final InformationSchema INFORMATION_SCHEMA = new InformationSchema();

	/**
	 * No further instances allowed
	 */
	private InformationSchema() {
		super("INFORMATION_SCHEMA");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			org.jooq.util.h2.information_schema.tables.FunctionColumns.FUNCTION_COLUMNS,
			org.jooq.util.h2.information_schema.tables.Constraints.CONSTRAINTS,
			org.jooq.util.h2.information_schema.tables.CrossReferences.CROSS_REFERENCES,
			org.jooq.util.h2.information_schema.tables.FunctionAliases.FUNCTION_ALIASES,
			org.jooq.util.h2.information_schema.tables.Sequences.SEQUENCES,
			org.jooq.util.h2.information_schema.tables.TypeInfo.TYPE_INFO,
			org.jooq.util.h2.information_schema.tables.Columns.COLUMNS,
			org.jooq.util.h2.information_schema.tables.Tables.TABLES);
	}
}
