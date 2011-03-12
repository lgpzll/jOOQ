/**
 * Copyright (c) 2009-2011, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * . Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * . Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * . Neither the name of the "jOOQ" nor the names of its contributors may be
 *   used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package org.jooq.util.sqlite.sqlite_master;


import org.jooq.Record;
import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.sqlite.SQLiteDataType;


/**
 * This class is NOT generated, as SQLite does not support meta-querying the
 * meta-model.
 *
 * @author Lukas Eder
 */
public class SQLiteMaster extends TableImpl<Record> {

    private static final long serialVersionUID = -823335201;

    /**
     * The singleton instance of tables
     */
    public static final SQLiteMaster SQLITE_MASTER = new SQLiteMaster();

    public static final TableField<Record, String> TYPE = new TableFieldImpl<Record, String>(SQLDialect.SQLITE, "type", SQLiteDataType.VARCHAR, SQLITE_MASTER);
    public static final TableField<Record, String> NAME = new TableFieldImpl<Record, String>(SQLDialect.SQLITE, "name", SQLiteDataType.VARCHAR, SQLITE_MASTER);
    public static final TableField<Record, String> TBL_NAME = new TableFieldImpl<Record, String>(SQLDialect.SQLITE, "tbl_name", SQLiteDataType.VARCHAR, SQLITE_MASTER);
    public static final TableField<Record, Integer> ROOTPAGE = new TableFieldImpl<Record, Integer>(SQLDialect.SQLITE, "rootpage", SQLiteDataType.INTEGER, SQLITE_MASTER);
    public static final TableField<Record, String> SQL = new TableFieldImpl<Record, String>(SQLDialect.SQLITE, "sql", SQLiteDataType.VARCHAR, SQLITE_MASTER);

    /**
     * No further instances allowed
     */
    private SQLiteMaster() {
        super(SQLDialect.SQLITE, "sqlite_master");
    }
}
