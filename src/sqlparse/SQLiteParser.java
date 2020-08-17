// Generated from D:/workspace/compiler-demo/src/sqlparse\SQLite.g4 by ANTLR 4.8
package sqlparse;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLiteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SCOL=1, DOT=2, OPEN_PAR=3, CLOSE_PAR=4, COMMA=5, ASSIGN=6, STAR=7, PLUS=8, 
		MINUS=9, TILDE=10, PIPE2=11, DIV=12, MOD=13, LT2=14, GT2=15, AMP=16, PIPE=17, 
		LT=18, LT_EQ=19, GT=20, GT_EQ=21, EQ=22, NOT_EQ1=23, NOT_EQ2=24, K_ABORT=25, 
		K_ACTION=26, K_ADD=27, K_AFTER=28, K_ALL=29, K_ALTER=30, K_ANALYZE=31, 
		K_AND=32, K_AS=33, K_ASC=34, K_ATTACH=35, K_AUTOINCREMENT=36, K_BEFORE=37, 
		K_BEGIN=38, K_BETWEEN=39, K_BY=40, K_CASCADE=41, K_CASE=42, K_CAST=43, 
		K_CHECK=44, K_COLLATE=45, K_COLUMN=46, K_COMMIT=47, K_CONFLICT=48, K_CONSTRAINT=49, 
		K_CREATE=50, K_CROSS=51, K_CURRENT_DATE=52, K_CURRENT_TIME=53, K_CURRENT_TIMESTAMP=54, 
		K_DATABASE=55, K_DEFAULT=56, K_DEFERRABLE=57, K_DEFERRED=58, K_DELETE=59, 
		K_DESC=60, K_DETACH=61, K_DISTINCT=62, K_DROP=63, K_EACH=64, K_ELSE=65, 
		K_END=66, K_ESCAPE=67, K_EXCEPT=68, K_EXCLUSIVE=69, K_EXISTS=70, K_EXPLAIN=71, 
		K_FAIL=72, K_FOR=73, K_FOREIGN=74, K_FROM=75, K_FULL=76, K_GLOB=77, K_GROUP=78, 
		K_HAVING=79, K_IF=80, K_IGNORE=81, K_IMMEDIATE=82, K_IN=83, K_INDEX=84, 
		K_INDEXED=85, K_INITIALLY=86, K_INNER=87, K_INSERT=88, K_INSTEAD=89, K_INTERSECT=90, 
		K_INTO=91, K_IS=92, K_ISNULL=93, K_JOIN=94, K_KEY=95, K_LEFT=96, K_LIKE=97, 
		K_LIMIT=98, K_MATCH=99, K_NATURAL=100, K_NO=101, K_NOT=102, K_NOTNULL=103, 
		K_NULL=104, K_OF=105, K_OFFSET=106, K_ON=107, K_OR=108, K_ORDER=109, K_OUTER=110, 
		K_PLAN=111, K_PRAGMA=112, K_PRIMARY=113, K_QUERY=114, K_RAISE=115, K_RECURSIVE=116, 
		K_REFERENCES=117, K_REGEXP=118, K_REINDEX=119, K_RELEASE=120, K_RENAME=121, 
		K_REPLACE=122, K_RESTRICT=123, K_RIGHT=124, K_ROLLBACK=125, K_ROW=126, 
		K_ROWS=127, K_SAVEPOINT=128, K_SELECT=129, K_SET=130, K_TABLE=131, K_TEMP=132, 
		K_TEMPORARY=133, K_THEN=134, K_TO=135, K_TRANSACTION=136, K_TRIGGER=137, 
		K_UNION=138, K_UNIQUE=139, K_UPDATE=140, K_USING=141, K_VACUUM=142, K_VALUES=143, 
		K_VIEW=144, K_VIRTUAL=145, K_WHEN=146, K_WHERE=147, K_WITH=148, K_WITHOUT=149, 
		K_FIRST_VALUE=150, K_OVER=151, K_PARTITION=152, K_RANGE=153, K_PRECEDING=154, 
		K_UBOUNDED=155, K_CURRENT=156, K_FOLLOWING=157, K_CUMEDIST=158, K_DENSERANK=159, 
		K_LAG=160, K_LASTVALUE=161, K_LEAD=162, K_NTHVALUE=163, K_NTILE=164, K_PERCENTRANK=165, 
		K_RANK=166, K_ROWNUMBER=167, IDENTIFIER=168, NUMERIC_LITERAL=169, BIND_PARAMETER=170, 
		STRING_LITERAL=171, BLOB_LITERAL=172, SINGLE_LINE_COMMENT=173, MULTILINE_COMMENT=174, 
		SPACES=175, UNEXPECTED_CHAR=176;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_sql_stmt = 3, 
		RULE_alter_table_stmt = 4, RULE_analyze_stmt = 5, RULE_attach_stmt = 6, 
		RULE_begin_stmt = 7, RULE_commit_stmt = 8, RULE_compound_select_stmt = 9, 
		RULE_create_index_stmt = 10, RULE_create_table_stmt = 11, RULE_create_trigger_stmt = 12, 
		RULE_create_view_stmt = 13, RULE_create_virtual_table_stmt = 14, RULE_delete_stmt = 15, 
		RULE_delete_stmt_limited = 16, RULE_detach_stmt = 17, RULE_drop_index_stmt = 18, 
		RULE_drop_table_stmt = 19, RULE_drop_trigger_stmt = 20, RULE_drop_view_stmt = 21, 
		RULE_factored_select_stmt = 22, RULE_insert_stmt = 23, RULE_pragma_stmt = 24, 
		RULE_reindex_stmt = 25, RULE_release_stmt = 26, RULE_rollback_stmt = 27, 
		RULE_savepoint_stmt = 28, RULE_simple_select_stmt = 29, RULE_select_stmt = 30, 
		RULE_select_or_values = 31, RULE_update_stmt = 32, RULE_update_stmt_limited = 33, 
		RULE_vacuum_stmt = 34, RULE_column_def = 35, RULE_type_name = 36, RULE_column_constraint = 37, 
		RULE_conflict_clause = 38, RULE_expr = 39, RULE_foreign_key_clause = 40, 
		RULE_raise_function = 41, RULE_indexed_column = 42, RULE_table_constraint = 43, 
		RULE_with_clause = 44, RULE_qualified_table_name = 45, RULE_ordering_term = 46, 
		RULE_pragma_value = 47, RULE_common_table_expression = 48, RULE_result_column = 49, 
		RULE_windowFunction = 50, RULE_offsetOptional = 51, RULE_defaultOptional = 52, 
		RULE_partitionbyOptional = 53, RULE_orderByOptional = 54, RULE_exprAscDescOptional = 55, 
		RULE_ascdescOption = 56, RULE_frameclauseOptional = 57, RULE_frame_start = 58, 
		RULE_frame_end = 59, RULE_table_or_subquery = 60, RULE_join_clause = 61, 
		RULE_join_operator = 62, RULE_join_constraint = 63, RULE_select_core = 64, 
		RULE_compound_operator = 65, RULE_cte_table_name = 66, RULE_signed_number = 67, 
		RULE_literal_value = 68, RULE_unary_operator = 69, RULE_error_message = 70, 
		RULE_module_argument = 71, RULE_column_alias = 72, RULE_keyword = 73, 
		RULE_name = 74, RULE_function_name = 75, RULE_database_name = 76, RULE_table_name = 77, 
		RULE_table_or_index_name = 78, RULE_new_table_name = 79, RULE_column_name = 80, 
		RULE_collation_name = 81, RULE_foreign_table = 82, RULE_index_name = 83, 
		RULE_trigger_name = 84, RULE_view_name = 85, RULE_module_name = 86, RULE_pragma_name = 87, 
		RULE_savepoint_name = 88, RULE_table_alias = 89, RULE_transaction_name = 90, 
		RULE_any_name = 91;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "error", "sql_stmt_list", "sql_stmt", "alter_table_stmt", "analyze_stmt", 
			"attach_stmt", "begin_stmt", "commit_stmt", "compound_select_stmt", "create_index_stmt", 
			"create_table_stmt", "create_trigger_stmt", "create_view_stmt", "create_virtual_table_stmt", 
			"delete_stmt", "delete_stmt_limited", "detach_stmt", "drop_index_stmt", 
			"drop_table_stmt", "drop_trigger_stmt", "drop_view_stmt", "factored_select_stmt", 
			"insert_stmt", "pragma_stmt", "reindex_stmt", "release_stmt", "rollback_stmt", 
			"savepoint_stmt", "simple_select_stmt", "select_stmt", "select_or_values", 
			"update_stmt", "update_stmt_limited", "vacuum_stmt", "column_def", "type_name", 
			"column_constraint", "conflict_clause", "expr", "foreign_key_clause", 
			"raise_function", "indexed_column", "table_constraint", "with_clause", 
			"qualified_table_name", "ordering_term", "pragma_value", "common_table_expression", 
			"result_column", "windowFunction", "offsetOptional", "defaultOptional", 
			"partitionbyOptional", "orderByOptional", "exprAscDescOptional", "ascdescOption", 
			"frameclauseOptional", "frame_start", "frame_end", "table_or_subquery", 
			"join_clause", "join_operator", "join_constraint", "select_core", "compound_operator", 
			"cte_table_name", "signed_number", "literal_value", "unary_operator", 
			"error_message", "module_argument", "column_alias", "keyword", "name", 
			"function_name", "database_name", "table_name", "table_or_index_name", 
			"new_table_name", "column_name", "collation_name", "foreign_table", "index_name", 
			"trigger_name", "view_name", "module_name", "pragma_name", "savepoint_name", 
			"table_alias", "transaction_name", "any_name"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'.'", "'('", "')'", "','", "'='", "'*'", "'+'", "'-'", 
			"'~'", "'||'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", 
			"'>'", "'>='", "'=='", "'!='", "'<>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "ASSIGN", "STAR", 
			"PLUS", "MINUS", "TILDE", "PIPE2", "DIV", "MOD", "LT2", "GT2", "AMP", 
			"PIPE", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", "NOT_EQ2", "K_ABORT", 
			"K_ACTION", "K_ADD", "K_AFTER", "K_ALL", "K_ALTER", "K_ANALYZE", "K_AND", 
			"K_AS", "K_ASC", "K_ATTACH", "K_AUTOINCREMENT", "K_BEFORE", "K_BEGIN", 
			"K_BETWEEN", "K_BY", "K_CASCADE", "K_CASE", "K_CAST", "K_CHECK", "K_COLLATE", 
			"K_COLUMN", "K_COMMIT", "K_CONFLICT", "K_CONSTRAINT", "K_CREATE", "K_CROSS", 
			"K_CURRENT_DATE", "K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", "K_DATABASE", 
			"K_DEFAULT", "K_DEFERRABLE", "K_DEFERRED", "K_DELETE", "K_DESC", "K_DETACH", 
			"K_DISTINCT", "K_DROP", "K_EACH", "K_ELSE", "K_END", "K_ESCAPE", "K_EXCEPT", 
			"K_EXCLUSIVE", "K_EXISTS", "K_EXPLAIN", "K_FAIL", "K_FOR", "K_FOREIGN", 
			"K_FROM", "K_FULL", "K_GLOB", "K_GROUP", "K_HAVING", "K_IF", "K_IGNORE", 
			"K_IMMEDIATE", "K_IN", "K_INDEX", "K_INDEXED", "K_INITIALLY", "K_INNER", 
			"K_INSERT", "K_INSTEAD", "K_INTERSECT", "K_INTO", "K_IS", "K_ISNULL", 
			"K_JOIN", "K_KEY", "K_LEFT", "K_LIKE", "K_LIMIT", "K_MATCH", "K_NATURAL", 
			"K_NO", "K_NOT", "K_NOTNULL", "K_NULL", "K_OF", "K_OFFSET", "K_ON", "K_OR", 
			"K_ORDER", "K_OUTER", "K_PLAN", "K_PRAGMA", "K_PRIMARY", "K_QUERY", "K_RAISE", 
			"K_RECURSIVE", "K_REFERENCES", "K_REGEXP", "K_REINDEX", "K_RELEASE", 
			"K_RENAME", "K_REPLACE", "K_RESTRICT", "K_RIGHT", "K_ROLLBACK", "K_ROW", 
			"K_ROWS", "K_SAVEPOINT", "K_SELECT", "K_SET", "K_TABLE", "K_TEMP", "K_TEMPORARY", 
			"K_THEN", "K_TO", "K_TRANSACTION", "K_TRIGGER", "K_UNION", "K_UNIQUE", 
			"K_UPDATE", "K_USING", "K_VACUUM", "K_VALUES", "K_VIEW", "K_VIRTUAL", 
			"K_WHEN", "K_WHERE", "K_WITH", "K_WITHOUT", "K_FIRST_VALUE", "K_OVER", 
			"K_PARTITION", "K_RANGE", "K_PRECEDING", "K_UBOUNDED", "K_CURRENT", "K_FOLLOWING", 
			"K_CUMEDIST", "K_DENSERANK", "K_LAG", "K_LASTVALUE", "K_LEAD", "K_NTHVALUE", 
			"K_NTILE", "K_PERCENTRANK", "K_RANK", "K_ROWNUMBER", "IDENTIFIER", "NUMERIC_LITERAL", 
			"BIND_PARAMETER", "STRING_LITERAL", "BLOB_LITERAL", "SINGLE_LINE_COMMENT", 
			"MULTILINE_COMMENT", "SPACES", "UNEXPECTED_CHAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SQLite.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLiteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SQLiteParser.EOF, 0); }
		public List<Sql_stmt_listContext> sql_stmt_list() {
			return getRuleContexts(Sql_stmt_listContext.class);
		}
		public Sql_stmt_listContext sql_stmt_list(int i) {
			return getRuleContext(Sql_stmt_listContext.class,i);
		}
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCOL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_ATTACH) | (1L << K_BEGIN) | (1L << K_COMMIT) | (1L << K_CREATE) | (1L << K_DELETE) | (1L << K_DETACH) | (1L << K_DROP))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (K_END - 66)) | (1L << (K_EXPLAIN - 66)) | (1L << (K_INSERT - 66)) | (1L << (K_PRAGMA - 66)) | (1L << (K_REINDEX - 66)) | (1L << (K_RELEASE - 66)) | (1L << (K_REPLACE - 66)) | (1L << (K_ROLLBACK - 66)) | (1L << (K_SAVEPOINT - 66)) | (1L << (K_SELECT - 66)))) != 0) || ((((_la - 140)) & ~0x3f) == 0 && ((1L << (_la - 140)) & ((1L << (K_UPDATE - 140)) | (1L << (K_VACUUM - 140)) | (1L << (K_VALUES - 140)) | (1L << (K_WITH - 140)) | (1L << (UNEXPECTED_CHAR - 140)))) != 0)) {
				{
				setState(186);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SCOL:
				case K_ALTER:
				case K_ANALYZE:
				case K_ATTACH:
				case K_BEGIN:
				case K_COMMIT:
				case K_CREATE:
				case K_DELETE:
				case K_DETACH:
				case K_DROP:
				case K_END:
				case K_EXPLAIN:
				case K_INSERT:
				case K_PRAGMA:
				case K_REINDEX:
				case K_RELEASE:
				case K_REPLACE:
				case K_ROLLBACK:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_UPDATE:
				case K_VACUUM:
				case K_VALUES:
				case K_WITH:
					{
					setState(184);
					sql_stmt_list();
					}
					break;
				case UNEXPECTED_CHAR:
					{
					setState(185);
					error();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorContext extends ParserRuleContext {
		public Token UNEXPECTED_CHAR;
		public TerminalNode UNEXPECTED_CHAR() { return getToken(SQLiteParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			((ErrorContext)_localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);

			     throw new RuntimeException("UNEXPECTED_CHAR=" + (((ErrorContext)_localctx).UNEXPECTED_CHAR!=null?((ErrorContext)_localctx).UNEXPECTED_CHAR.getText():null));
			   
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_stmt_listContext extends ParserRuleContext {
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLiteParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLiteParser.SCOL, i);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSql_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSql_stmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSql_stmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmt_listContext sql_stmt_list() throws RecognitionException {
		Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(196);
				match(SCOL);
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			sql_stmt();
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(204); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(203);
						match(SCOL);
						}
						}
						setState(206); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(208);
					sql_stmt();
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(214);
					match(SCOL);
					}
					} 
				}
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_stmtContext extends ParserRuleContext {
		public Alter_table_stmtContext alter_table_stmt() {
			return getRuleContext(Alter_table_stmtContext.class,0);
		}
		public Analyze_stmtContext analyze_stmt() {
			return getRuleContext(Analyze_stmtContext.class,0);
		}
		public Attach_stmtContext attach_stmt() {
			return getRuleContext(Attach_stmtContext.class,0);
		}
		public Begin_stmtContext begin_stmt() {
			return getRuleContext(Begin_stmtContext.class,0);
		}
		public Commit_stmtContext commit_stmt() {
			return getRuleContext(Commit_stmtContext.class,0);
		}
		public Compound_select_stmtContext compound_select_stmt() {
			return getRuleContext(Compound_select_stmtContext.class,0);
		}
		public Create_index_stmtContext create_index_stmt() {
			return getRuleContext(Create_index_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Create_trigger_stmtContext create_trigger_stmt() {
			return getRuleContext(Create_trigger_stmtContext.class,0);
		}
		public Create_view_stmtContext create_view_stmt() {
			return getRuleContext(Create_view_stmtContext.class,0);
		}
		public Create_virtual_table_stmtContext create_virtual_table_stmt() {
			return getRuleContext(Create_virtual_table_stmtContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public Delete_stmt_limitedContext delete_stmt_limited() {
			return getRuleContext(Delete_stmt_limitedContext.class,0);
		}
		public Detach_stmtContext detach_stmt() {
			return getRuleContext(Detach_stmtContext.class,0);
		}
		public Drop_index_stmtContext drop_index_stmt() {
			return getRuleContext(Drop_index_stmtContext.class,0);
		}
		public Drop_table_stmtContext drop_table_stmt() {
			return getRuleContext(Drop_table_stmtContext.class,0);
		}
		public Drop_trigger_stmtContext drop_trigger_stmt() {
			return getRuleContext(Drop_trigger_stmtContext.class,0);
		}
		public Drop_view_stmtContext drop_view_stmt() {
			return getRuleContext(Drop_view_stmtContext.class,0);
		}
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Pragma_stmtContext pragma_stmt() {
			return getRuleContext(Pragma_stmtContext.class,0);
		}
		public Reindex_stmtContext reindex_stmt() {
			return getRuleContext(Reindex_stmtContext.class,0);
		}
		public Release_stmtContext release_stmt() {
			return getRuleContext(Release_stmtContext.class,0);
		}
		public Rollback_stmtContext rollback_stmt() {
			return getRuleContext(Rollback_stmtContext.class,0);
		}
		public Savepoint_stmtContext savepoint_stmt() {
			return getRuleContext(Savepoint_stmtContext.class,0);
		}
		public Simple_select_stmtContext simple_select_stmt() {
			return getRuleContext(Simple_select_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public Update_stmt_limitedContext update_stmt_limited() {
			return getRuleContext(Update_stmt_limitedContext.class,0);
		}
		public Vacuum_stmtContext vacuum_stmt() {
			return getRuleContext(Vacuum_stmtContext.class,0);
		}
		public TerminalNode K_EXPLAIN() { return getToken(SQLiteParser.K_EXPLAIN, 0); }
		public TerminalNode K_QUERY() { return getToken(SQLiteParser.K_QUERY, 0); }
		public TerminalNode K_PLAN() { return getToken(SQLiteParser.K_PLAN, 0); }
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_EXPLAIN) {
				{
				setState(220);
				match(K_EXPLAIN);
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_QUERY) {
					{
					setState(221);
					match(K_QUERY);
					setState(222);
					match(K_PLAN);
					}
				}

				}
			}

			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(227);
				alter_table_stmt();
				}
				break;
			case 2:
				{
				setState(228);
				analyze_stmt();
				}
				break;
			case 3:
				{
				setState(229);
				attach_stmt();
				}
				break;
			case 4:
				{
				setState(230);
				begin_stmt();
				}
				break;
			case 5:
				{
				setState(231);
				commit_stmt();
				}
				break;
			case 6:
				{
				setState(232);
				compound_select_stmt();
				}
				break;
			case 7:
				{
				setState(233);
				create_index_stmt();
				}
				break;
			case 8:
				{
				setState(234);
				create_table_stmt();
				}
				break;
			case 9:
				{
				setState(235);
				create_trigger_stmt();
				}
				break;
			case 10:
				{
				setState(236);
				create_view_stmt();
				}
				break;
			case 11:
				{
				setState(237);
				create_virtual_table_stmt();
				}
				break;
			case 12:
				{
				setState(238);
				delete_stmt();
				}
				break;
			case 13:
				{
				setState(239);
				delete_stmt_limited();
				}
				break;
			case 14:
				{
				setState(240);
				detach_stmt();
				}
				break;
			case 15:
				{
				setState(241);
				drop_index_stmt();
				}
				break;
			case 16:
				{
				setState(242);
				drop_table_stmt();
				}
				break;
			case 17:
				{
				setState(243);
				drop_trigger_stmt();
				}
				break;
			case 18:
				{
				setState(244);
				drop_view_stmt();
				}
				break;
			case 19:
				{
				setState(245);
				factored_select_stmt();
				}
				break;
			case 20:
				{
				setState(246);
				insert_stmt();
				}
				break;
			case 21:
				{
				setState(247);
				pragma_stmt();
				}
				break;
			case 22:
				{
				setState(248);
				reindex_stmt();
				}
				break;
			case 23:
				{
				setState(249);
				release_stmt();
				}
				break;
			case 24:
				{
				setState(250);
				rollback_stmt();
				}
				break;
			case 25:
				{
				setState(251);
				savepoint_stmt();
				}
				break;
			case 26:
				{
				setState(252);
				simple_select_stmt();
				}
				break;
			case 27:
				{
				setState(253);
				select_stmt();
				}
				break;
			case 28:
				{
				setState(254);
				update_stmt();
				}
				break;
			case 29:
				{
				setState(255);
				update_stmt_limited();
				}
				break;
			case 30:
				{
				setState(256);
				vacuum_stmt();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_ALTER() { return getToken(SQLiteParser.K_ALTER, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLiteParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_RENAME() { return getToken(SQLiteParser.K_RENAME, 0); }
		public TerminalNode K_TO() { return getToken(SQLiteParser.K_TO, 0); }
		public New_table_nameContext new_table_name() {
			return getRuleContext(New_table_nameContext.class,0);
		}
		public TerminalNode K_ADD() { return getToken(SQLiteParser.K_ADD, 0); }
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode K_COLUMN() { return getToken(SQLiteParser.K_COLUMN, 0); }
		public Alter_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterAlter_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitAlter_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitAlter_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_stmtContext alter_table_stmt() throws RecognitionException {
		Alter_table_stmtContext _localctx = new Alter_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_alter_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(K_ALTER);
			setState(260);
			match(K_TABLE);
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(261);
				database_name();
				setState(262);
				match(DOT);
				}
				break;
			}
			setState(266);
			table_name();
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_RENAME:
				{
				setState(267);
				match(K_RENAME);
				setState(268);
				match(K_TO);
				setState(269);
				new_table_name();
				}
				break;
			case K_ADD:
				{
				setState(270);
				match(K_ADD);
				setState(272);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(271);
					match(K_COLUMN);
					}
					break;
				}
				setState(274);
				column_def();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Analyze_stmtContext extends ParserRuleContext {
		public TerminalNode K_ANALYZE() { return getToken(SQLiteParser.K_ANALYZE, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Table_or_index_nameContext table_or_index_name() {
			return getRuleContext(Table_or_index_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Analyze_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analyze_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterAnalyze_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitAnalyze_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitAnalyze_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Analyze_stmtContext analyze_stmt() throws RecognitionException {
		Analyze_stmtContext _localctx = new Analyze_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_analyze_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(K_ANALYZE);
			setState(284);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(278);
				database_name();
				}
				break;
			case 2:
				{
				setState(279);
				table_or_index_name();
				}
				break;
			case 3:
				{
				setState(280);
				database_name();
				setState(281);
				match(DOT);
				setState(282);
				table_or_index_name();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attach_stmtContext extends ParserRuleContext {
		public TerminalNode K_ATTACH() { return getToken(SQLiteParser.K_ATTACH, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_DATABASE() { return getToken(SQLiteParser.K_DATABASE, 0); }
		public Attach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attach_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterAttach_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitAttach_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitAttach_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attach_stmtContext attach_stmt() throws RecognitionException {
		Attach_stmtContext _localctx = new Attach_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(K_ATTACH);
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(287);
				match(K_DATABASE);
				}
				break;
			}
			setState(290);
			expr(0);
			setState(291);
			match(K_AS);
			setState(292);
			database_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Begin_stmtContext extends ParserRuleContext {
		public TerminalNode K_BEGIN() { return getToken(SQLiteParser.K_BEGIN, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SQLiteParser.K_TRANSACTION, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SQLiteParser.K_DEFERRED, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SQLiteParser.K_IMMEDIATE, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(SQLiteParser.K_EXCLUSIVE, 0); }
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public Begin_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_begin_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterBegin_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitBegin_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitBegin_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Begin_stmtContext begin_stmt() throws RecognitionException {
		Begin_stmtContext _localctx = new Begin_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_begin_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(K_BEGIN);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (K_DEFERRED - 58)) | (1L << (K_EXCLUSIVE - 58)) | (1L << (K_IMMEDIATE - 58)))) != 0)) {
				{
				setState(295);
				_la = _input.LA(1);
				if ( !(((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (K_DEFERRED - 58)) | (1L << (K_EXCLUSIVE - 58)) | (1L << (K_IMMEDIATE - 58)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(298);
				match(K_TRANSACTION);
				setState(300);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(299);
					transaction_name();
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Commit_stmtContext extends ParserRuleContext {
		public TerminalNode K_COMMIT() { return getToken(SQLiteParser.K_COMMIT, 0); }
		public TerminalNode K_END() { return getToken(SQLiteParser.K_END, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SQLiteParser.K_TRANSACTION, 0); }
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public Commit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCommit_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCommit_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCommit_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Commit_stmtContext commit_stmt() throws RecognitionException {
		Commit_stmtContext _localctx = new Commit_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_commit_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_la = _input.LA(1);
			if ( !(_la==K_COMMIT || _la==K_END) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(305);
				match(K_TRANSACTION);
				setState(307);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(306);
					transaction_name();
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_select_stmtContext extends ParserRuleContext {
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> K_UNION() { return getTokens(SQLiteParser.K_UNION); }
		public TerminalNode K_UNION(int i) {
			return getToken(SQLiteParser.K_UNION, i);
		}
		public List<TerminalNode> K_INTERSECT() { return getTokens(SQLiteParser.K_INTERSECT); }
		public TerminalNode K_INTERSECT(int i) {
			return getToken(SQLiteParser.K_INTERSECT, i);
		}
		public List<TerminalNode> K_EXCEPT() { return getTokens(SQLiteParser.K_EXCEPT); }
		public TerminalNode K_EXCEPT(int i) {
			return getToken(SQLiteParser.K_EXCEPT, i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public List<TerminalNode> K_ALL() { return getTokens(SQLiteParser.K_ALL); }
		public TerminalNode K_ALL(int i) {
			return getToken(SQLiteParser.K_ALL, i);
		}
		public Compound_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCompound_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCompound_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCompound_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_select_stmtContext compound_select_stmt() throws RecognitionException {
		Compound_select_stmtContext _localctx = new Compound_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_compound_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(311);
				match(K_WITH);
				setState(313);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(312);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(315);
				common_table_expression();
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(316);
					match(COMMA);
					setState(317);
					common_table_expression();
					}
					}
					setState(322);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(325);
			select_core();
			setState(335); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(332);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_UNION:
					{
					setState(326);
					match(K_UNION);
					setState(328);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_ALL) {
						{
						setState(327);
						match(K_ALL);
						}
					}

					}
					break;
				case K_INTERSECT:
					{
					setState(330);
					match(K_INTERSECT);
					}
					break;
				case K_EXCEPT:
					{
					setState(331);
					match(K_EXCEPT);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(334);
				select_core();
				}
				}
				setState(337); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION );
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(339);
				match(K_ORDER);
				setState(340);
				match(K_BY);
				setState(341);
				ordering_term();
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(342);
					match(COMMA);
					setState(343);
					ordering_term();
					}
					}
					setState(348);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(351);
				match(K_LIMIT);
				setState(352);
				expr(0);
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(353);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(354);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_index_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_INDEX() { return getToken(SQLiteParser.K_INDEX, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_ON() { return getToken(SQLiteParser.K_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SQLiteParser.K_UNIQUE, 0); }
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Create_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCreate_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCreate_index_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCreate_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_index_stmtContext create_index_stmt() throws RecognitionException {
		Create_index_stmtContext _localctx = new Create_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			match(K_CREATE);
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_UNIQUE) {
				{
				setState(360);
				match(K_UNIQUE);
				}
			}

			setState(363);
			match(K_INDEX);
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(364);
				match(K_IF);
				setState(365);
				match(K_NOT);
				setState(366);
				match(K_EXISTS);
				}
				break;
			}
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(369);
				database_name();
				setState(370);
				match(DOT);
				}
				break;
			}
			setState(374);
			index_name();
			setState(375);
			match(K_ON);
			setState(376);
			table_name();
			setState(377);
			match(OPEN_PAR);
			setState(378);
			indexed_column();
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(379);
				match(COMMA);
				setState(380);
				indexed_column();
				}
				}
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(386);
			match(CLOSE_PAR);
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(387);
				match(K_WHERE);
				setState(388);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLiteParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode K_TEMP() { return getToken(SQLiteParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SQLiteParser.K_TEMPORARY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
		}
		public TerminalNode K_WITHOUT() { return getToken(SQLiteParser.K_WITHOUT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SQLiteParser.IDENTIFIER, 0); }
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCreate_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCreate_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCreate_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_create_table_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(K_CREATE);
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(392);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(395);
			match(K_TABLE);
			setState(399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(396);
				match(K_IF);
				setState(397);
				match(K_NOT);
				setState(398);
				match(K_EXISTS);
				}
				break;
			}
			setState(404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(401);
				database_name();
				setState(402);
				match(DOT);
				}
				break;
			}
			setState(406);
			table_name();
			setState(430);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(407);
				match(OPEN_PAR);
				setState(408);
				column_def();
				setState(413);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(409);
						match(COMMA);
						setState(410);
						column_def();
						}
						} 
					}
					setState(415);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(416);
					match(COMMA);
					setState(417);
					table_constraint();
					}
					}
					setState(422);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(423);
				match(CLOSE_PAR);
				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WITHOUT) {
					{
					setState(424);
					match(K_WITHOUT);
					setState(425);
					match(IDENTIFIER);
					}
				}

				}
				break;
			case K_AS:
				{
				setState(428);
				match(K_AS);
				setState(429);
				select_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_trigger_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SQLiteParser.K_TRIGGER, 0); }
		public Trigger_nameContext trigger_name() {
			return getRuleContext(Trigger_nameContext.class,0);
		}
		public TerminalNode K_ON() { return getToken(SQLiteParser.K_ON, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_BEGIN() { return getToken(SQLiteParser.K_BEGIN, 0); }
		public TerminalNode K_END() { return getToken(SQLiteParser.K_END, 0); }
		public TerminalNode K_DELETE() { return getToken(SQLiteParser.K_DELETE, 0); }
		public TerminalNode K_INSERT() { return getToken(SQLiteParser.K_INSERT, 0); }
		public TerminalNode K_UPDATE() { return getToken(SQLiteParser.K_UPDATE, 0); }
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public List<Database_nameContext> database_name() {
			return getRuleContexts(Database_nameContext.class);
		}
		public Database_nameContext database_name(int i) {
			return getRuleContext(Database_nameContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SQLiteParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SQLiteParser.DOT, i);
		}
		public TerminalNode K_BEFORE() { return getToken(SQLiteParser.K_BEFORE, 0); }
		public TerminalNode K_AFTER() { return getToken(SQLiteParser.K_AFTER, 0); }
		public TerminalNode K_INSTEAD() { return getToken(SQLiteParser.K_INSTEAD, 0); }
		public List<TerminalNode> K_OF() { return getTokens(SQLiteParser.K_OF); }
		public TerminalNode K_OF(int i) {
			return getToken(SQLiteParser.K_OF, i);
		}
		public TerminalNode K_FOR() { return getToken(SQLiteParser.K_FOR, 0); }
		public TerminalNode K_EACH() { return getToken(SQLiteParser.K_EACH, 0); }
		public TerminalNode K_ROW() { return getToken(SQLiteParser.K_ROW, 0); }
		public TerminalNode K_WHEN() { return getToken(SQLiteParser.K_WHEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLiteParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLiteParser.SCOL, i);
		}
		public TerminalNode K_TEMP() { return getToken(SQLiteParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SQLiteParser.K_TEMPORARY, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<Update_stmtContext> update_stmt() {
			return getRuleContexts(Update_stmtContext.class);
		}
		public Update_stmtContext update_stmt(int i) {
			return getRuleContext(Update_stmtContext.class,i);
		}
		public List<Insert_stmtContext> insert_stmt() {
			return getRuleContexts(Insert_stmtContext.class);
		}
		public Insert_stmtContext insert_stmt(int i) {
			return getRuleContext(Insert_stmtContext.class,i);
		}
		public List<Delete_stmtContext> delete_stmt() {
			return getRuleContexts(Delete_stmtContext.class);
		}
		public Delete_stmtContext delete_stmt(int i) {
			return getRuleContext(Delete_stmtContext.class,i);
		}
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Create_trigger_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_trigger_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCreate_trigger_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCreate_trigger_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCreate_trigger_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_trigger_stmtContext create_trigger_stmt() throws RecognitionException {
		Create_trigger_stmtContext _localctx = new Create_trigger_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_create_trigger_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(K_CREATE);
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(433);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(436);
			match(K_TRIGGER);
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(437);
				match(K_IF);
				setState(438);
				match(K_NOT);
				setState(439);
				match(K_EXISTS);
				}
				break;
			}
			setState(445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(442);
				database_name();
				setState(443);
				match(DOT);
				}
				break;
			}
			setState(447);
			trigger_name();
			setState(452);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_BEFORE:
				{
				setState(448);
				match(K_BEFORE);
				}
				break;
			case K_AFTER:
				{
				setState(449);
				match(K_AFTER);
				}
				break;
			case K_INSTEAD:
				{
				setState(450);
				match(K_INSTEAD);
				setState(451);
				match(K_OF);
				}
				break;
			case K_DELETE:
			case K_INSERT:
			case K_UPDATE:
				break;
			default:
				break;
			}
			setState(468);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_DELETE:
				{
				setState(454);
				match(K_DELETE);
				}
				break;
			case K_INSERT:
				{
				setState(455);
				match(K_INSERT);
				}
				break;
			case K_UPDATE:
				{
				setState(456);
				match(K_UPDATE);
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_OF) {
					{
					setState(457);
					match(K_OF);
					setState(458);
					column_name();
					setState(463);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(459);
						match(COMMA);
						setState(460);
						column_name();
						}
						}
						setState(465);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(470);
			match(K_ON);
			setState(474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(471);
				database_name();
				setState(472);
				match(DOT);
				}
				break;
			}
			setState(476);
			table_name();
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_FOR) {
				{
				setState(477);
				match(K_FOR);
				setState(478);
				match(K_EACH);
				setState(479);
				match(K_ROW);
				}
			}

			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHEN) {
				{
				setState(482);
				match(K_WHEN);
				setState(483);
				expr(0);
				}
			}

			setState(486);
			match(K_BEGIN);
			setState(495); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(491);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(487);
					update_stmt();
					}
					break;
				case 2:
					{
					setState(488);
					insert_stmt();
					}
					break;
				case 3:
					{
					setState(489);
					delete_stmt();
					}
					break;
				case 4:
					{
					setState(490);
					select_stmt();
					}
					break;
				}
				setState(493);
				match(SCOL);
				}
				}
				setState(497); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==K_DELETE || ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (K_INSERT - 88)) | (1L << (K_REPLACE - 88)) | (1L << (K_SELECT - 88)) | (1L << (K_UPDATE - 88)) | (1L << (K_VALUES - 88)) | (1L << (K_WITH - 88)))) != 0) );
			setState(499);
			match(K_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_view_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_VIEW() { return getToken(SQLiteParser.K_VIEW, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode K_TEMP() { return getToken(SQLiteParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SQLiteParser.K_TEMPORARY, 0); }
		public Create_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_view_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCreate_view_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCreate_view_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCreate_view_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_view_stmtContext create_view_stmt() throws RecognitionException {
		Create_view_stmtContext _localctx = new Create_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_create_view_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(K_CREATE);
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TEMP || _la==K_TEMPORARY) {
				{
				setState(502);
				_la = _input.LA(1);
				if ( !(_la==K_TEMP || _la==K_TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(505);
			match(K_VIEW);
			setState(509);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(506);
				match(K_IF);
				setState(507);
				match(K_NOT);
				setState(508);
				match(K_EXISTS);
				}
				break;
			}
			setState(514);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(511);
				database_name();
				setState(512);
				match(DOT);
				}
				break;
			}
			setState(516);
			view_name();
			setState(517);
			match(K_AS);
			setState(518);
			select_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_virtual_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(SQLiteParser.K_VIRTUAL, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLiteParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_USING() { return getToken(SQLiteParser.K_USING, 0); }
		public Module_nameContext module_name() {
			return getRuleContext(Module_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Module_argumentContext> module_argument() {
			return getRuleContexts(Module_argumentContext.class);
		}
		public Module_argumentContext module_argument(int i) {
			return getRuleContext(Module_argumentContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Create_virtual_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_virtual_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCreate_virtual_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCreate_virtual_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCreate_virtual_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_virtual_table_stmtContext create_virtual_table_stmt() throws RecognitionException {
		Create_virtual_table_stmtContext _localctx = new Create_virtual_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_create_virtual_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(K_CREATE);
			setState(521);
			match(K_VIRTUAL);
			setState(522);
			match(K_TABLE);
			setState(526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(523);
				match(K_IF);
				setState(524);
				match(K_NOT);
				setState(525);
				match(K_EXISTS);
				}
				break;
			}
			setState(531);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(528);
				database_name();
				setState(529);
				match(DOT);
				}
				break;
			}
			setState(533);
			table_name();
			setState(534);
			match(K_USING);
			setState(535);
			module_name();
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(536);
				match(OPEN_PAR);
				setState(537);
				module_argument();
				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(538);
					match(COMMA);
					setState(539);
					module_argument();
					}
					}
					setState(544);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(545);
				match(CLOSE_PAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_stmtContext extends ParserRuleContext {
		public TerminalNode K_DELETE() { return getToken(SQLiteParser.K_DELETE, 0); }
		public TerminalNode K_FROM() { return getToken(SQLiteParser.K_FROM, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDelete_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDelete_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDelete_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(549);
				with_clause();
				}
			}

			setState(552);
			match(K_DELETE);
			setState(553);
			match(K_FROM);
			setState(554);
			qualified_table_name();
			setState(557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(555);
				match(K_WHERE);
				setState(556);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_stmt_limitedContext extends ParserRuleContext {
		public TerminalNode K_DELETE() { return getToken(SQLiteParser.K_DELETE, 0); }
		public TerminalNode K_FROM() { return getToken(SQLiteParser.K_FROM, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Delete_stmt_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt_limited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDelete_stmt_limited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDelete_stmt_limited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDelete_stmt_limited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmt_limitedContext delete_stmt_limited() throws RecognitionException {
		Delete_stmt_limitedContext _localctx = new Delete_stmt_limitedContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_delete_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(559);
				with_clause();
				}
			}

			setState(562);
			match(K_DELETE);
			setState(563);
			match(K_FROM);
			setState(564);
			qualified_table_name();
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(565);
				match(K_WHERE);
				setState(566);
				expr(0);
				}
			}

			setState(587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(569);
					match(K_ORDER);
					setState(570);
					match(K_BY);
					setState(571);
					ordering_term();
					setState(576);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(572);
						match(COMMA);
						setState(573);
						ordering_term();
						}
						}
						setState(578);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(581);
				match(K_LIMIT);
				setState(582);
				expr(0);
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(583);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(584);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Detach_stmtContext extends ParserRuleContext {
		public TerminalNode K_DETACH() { return getToken(SQLiteParser.K_DETACH, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode K_DATABASE() { return getToken(SQLiteParser.K_DATABASE, 0); }
		public Detach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_detach_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDetach_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDetach_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDetach_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Detach_stmtContext detach_stmt() throws RecognitionException {
		Detach_stmtContext _localctx = new Detach_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_detach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			match(K_DETACH);
			setState(591);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(590);
				match(K_DATABASE);
				}
				break;
			}
			setState(593);
			database_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_index_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SQLiteParser.K_DROP, 0); }
		public TerminalNode K_INDEX() { return getToken(SQLiteParser.K_INDEX, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Drop_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDrop_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDrop_index_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDrop_index_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_index_stmtContext drop_index_stmt() throws RecognitionException {
		Drop_index_stmtContext _localctx = new Drop_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_drop_index_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			match(K_DROP);
			setState(596);
			match(K_INDEX);
			setState(599);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(597);
				match(K_IF);
				setState(598);
				match(K_EXISTS);
				}
				break;
			}
			setState(604);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(601);
				database_name();
				setState(602);
				match(DOT);
				}
				break;
			}
			setState(606);
			index_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SQLiteParser.K_DROP, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLiteParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Drop_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDrop_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDrop_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDrop_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_table_stmtContext drop_table_stmt() throws RecognitionException {
		Drop_table_stmtContext _localctx = new Drop_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_drop_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			match(K_DROP);
			setState(609);
			match(K_TABLE);
			setState(612);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(610);
				match(K_IF);
				setState(611);
				match(K_EXISTS);
				}
				break;
			}
			setState(617);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(614);
				database_name();
				setState(615);
				match(DOT);
				}
				break;
			}
			setState(619);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_trigger_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SQLiteParser.K_DROP, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SQLiteParser.K_TRIGGER, 0); }
		public Trigger_nameContext trigger_name() {
			return getRuleContext(Trigger_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Drop_trigger_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_trigger_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDrop_trigger_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDrop_trigger_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDrop_trigger_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_trigger_stmtContext drop_trigger_stmt() throws RecognitionException {
		Drop_trigger_stmtContext _localctx = new Drop_trigger_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_drop_trigger_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			match(K_DROP);
			setState(622);
			match(K_TRIGGER);
			setState(625);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(623);
				match(K_IF);
				setState(624);
				match(K_EXISTS);
				}
				break;
			}
			setState(630);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(627);
				database_name();
				setState(628);
				match(DOT);
				}
				break;
			}
			setState(632);
			trigger_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_view_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SQLiteParser.K_DROP, 0); }
		public TerminalNode K_VIEW() { return getToken(SQLiteParser.K_VIEW, 0); }
		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Drop_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_view_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDrop_view_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDrop_view_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDrop_view_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_view_stmtContext drop_view_stmt() throws RecognitionException {
		Drop_view_stmtContext _localctx = new Drop_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_drop_view_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			match(K_DROP);
			setState(635);
			match(K_VIEW);
			setState(638);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(636);
				match(K_IF);
				setState(637);
				match(K_EXISTS);
				}
				break;
			}
			setState(643);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(640);
				database_name();
				setState(641);
				match(DOT);
				}
				break;
			}
			setState(645);
			view_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factored_select_stmtContext extends ParserRuleContext {
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}
		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public Factored_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factored_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterFactored_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitFactored_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitFactored_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factored_select_stmtContext factored_select_stmt() throws RecognitionException {
		Factored_select_stmtContext _localctx = new Factored_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_factored_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(647);
				match(K_WITH);
				setState(649);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(648);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(651);
				common_table_expression();
				setState(656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(652);
					match(COMMA);
					setState(653);
					common_table_expression();
					}
					}
					setState(658);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(661);
			select_core();
			setState(667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(662);
				compound_operator();
				setState(663);
				select_core();
				}
				}
				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(670);
				match(K_ORDER);
				setState(671);
				match(K_BY);
				setState(672);
				ordering_term();
				setState(677);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(673);
					match(COMMA);
					setState(674);
					ordering_term();
					}
					}
					setState(679);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(682);
				match(K_LIMIT);
				setState(683);
				expr(0);
				setState(686);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(684);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(685);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_stmtContext extends ParserRuleContext {
		public TerminalNode K_INTO() { return getToken(SQLiteParser.K_INTO, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_INSERT() { return getToken(SQLiteParser.K_INSERT, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLiteParser.K_REPLACE, 0); }
		public TerminalNode K_OR() { return getToken(SQLiteParser.K_OR, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLiteParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLiteParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLiteParser.OPEN_PAR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLiteParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLiteParser.CLOSE_PAR, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_DEFAULT() { return getToken(SQLiteParser.K_DEFAULT, 0); }
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterInsert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitInsert_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitInsert_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(690);
				with_clause();
				}
			}

			setState(710);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(693);
				match(K_INSERT);
				}
				break;
			case 2:
				{
				setState(694);
				match(K_REPLACE);
				}
				break;
			case 3:
				{
				setState(695);
				match(K_INSERT);
				setState(696);
				match(K_OR);
				setState(697);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(698);
				match(K_INSERT);
				setState(699);
				match(K_OR);
				setState(700);
				match(K_ROLLBACK);
				}
				break;
			case 5:
				{
				setState(701);
				match(K_INSERT);
				setState(702);
				match(K_OR);
				setState(703);
				match(K_ABORT);
				}
				break;
			case 6:
				{
				setState(704);
				match(K_INSERT);
				setState(705);
				match(K_OR);
				setState(706);
				match(K_FAIL);
				}
				break;
			case 7:
				{
				setState(707);
				match(K_INSERT);
				setState(708);
				match(K_OR);
				setState(709);
				match(K_IGNORE);
				}
				break;
			}
			setState(712);
			match(K_INTO);
			setState(716);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(713);
				database_name();
				setState(714);
				match(DOT);
				}
				break;
			}
			setState(718);
			table_name();
			setState(730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(719);
				match(OPEN_PAR);
				setState(720);
				column_name();
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(721);
					match(COMMA);
					setState(722);
					column_name();
					}
					}
					setState(727);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(728);
				match(CLOSE_PAR);
				}
			}

			setState(763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(732);
				match(K_VALUES);
				setState(733);
				match(OPEN_PAR);
				setState(734);
				expr(0);
				setState(739);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(735);
					match(COMMA);
					setState(736);
					expr(0);
					}
					}
					setState(741);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(742);
				match(CLOSE_PAR);
				setState(757);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(743);
					match(COMMA);
					setState(744);
					match(OPEN_PAR);
					setState(745);
					expr(0);
					setState(750);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(746);
						match(COMMA);
						setState(747);
						expr(0);
						}
						}
						setState(752);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(753);
					match(CLOSE_PAR);
					}
					}
					setState(759);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(760);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(761);
				match(K_DEFAULT);
				setState(762);
				match(K_VALUES);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pragma_stmtContext extends ParserRuleContext {
		public TerminalNode K_PRAGMA() { return getToken(SQLiteParser.K_PRAGMA, 0); }
		public Pragma_nameContext pragma_name() {
			return getRuleContext(Pragma_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLiteParser.ASSIGN, 0); }
		public Pragma_valueContext pragma_value() {
			return getRuleContext(Pragma_valueContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public Pragma_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterPragma_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitPragma_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitPragma_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_stmtContext pragma_stmt() throws RecognitionException {
		Pragma_stmtContext _localctx = new Pragma_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_pragma_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			match(K_PRAGMA);
			setState(769);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(766);
				database_name();
				setState(767);
				match(DOT);
				}
				break;
			}
			setState(771);
			pragma_name();
			setState(778);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(772);
				match(ASSIGN);
				setState(773);
				pragma_value();
				}
				break;
			case OPEN_PAR:
				{
				setState(774);
				match(OPEN_PAR);
				setState(775);
				pragma_value();
				setState(776);
				match(CLOSE_PAR);
				}
				break;
			case EOF:
			case SCOL:
			case K_ALTER:
			case K_ANALYZE:
			case K_ATTACH:
			case K_BEGIN:
			case K_COMMIT:
			case K_CREATE:
			case K_DELETE:
			case K_DETACH:
			case K_DROP:
			case K_END:
			case K_EXPLAIN:
			case K_INSERT:
			case K_PRAGMA:
			case K_REINDEX:
			case K_RELEASE:
			case K_REPLACE:
			case K_ROLLBACK:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_UPDATE:
			case K_VACUUM:
			case K_VALUES:
			case K_WITH:
			case UNEXPECTED_CHAR:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Reindex_stmtContext extends ParserRuleContext {
		public TerminalNode K_REINDEX() { return getToken(SQLiteParser.K_REINDEX, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Reindex_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reindex_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterReindex_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitReindex_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitReindex_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reindex_stmtContext reindex_stmt() throws RecognitionException {
		Reindex_stmtContext _localctx = new Reindex_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_reindex_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			match(K_REINDEX);
			setState(791);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(781);
				collation_name();
				}
				break;
			case 2:
				{
				setState(785);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(782);
					database_name();
					setState(783);
					match(DOT);
					}
					break;
				}
				setState(789);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(787);
					table_name();
					}
					break;
				case 2:
					{
					setState(788);
					index_name();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Release_stmtContext extends ParserRuleContext {
		public TerminalNode K_RELEASE() { return getToken(SQLiteParser.K_RELEASE, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public TerminalNode K_SAVEPOINT() { return getToken(SQLiteParser.K_SAVEPOINT, 0); }
		public Release_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_release_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterRelease_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitRelease_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitRelease_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Release_stmtContext release_stmt() throws RecognitionException {
		Release_stmtContext _localctx = new Release_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_release_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			match(K_RELEASE);
			setState(795);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(794);
				match(K_SAVEPOINT);
				}
				break;
			}
			setState(797);
			savepoint_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rollback_stmtContext extends ParserRuleContext {
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SQLiteParser.K_TRANSACTION, 0); }
		public TerminalNode K_TO() { return getToken(SQLiteParser.K_TO, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class,0);
		}
		public TerminalNode K_SAVEPOINT() { return getToken(SQLiteParser.K_SAVEPOINT, 0); }
		public Rollback_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterRollback_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitRollback_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitRollback_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rollback_stmtContext rollback_stmt() throws RecognitionException {
		Rollback_stmtContext _localctx = new Rollback_stmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_rollback_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			match(K_ROLLBACK);
			setState(804);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TRANSACTION) {
				{
				setState(800);
				match(K_TRANSACTION);
				setState(802);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(801);
					transaction_name();
					}
					break;
				}
				}
			}

			setState(811);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_TO) {
				{
				setState(806);
				match(K_TO);
				setState(808);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(807);
					match(K_SAVEPOINT);
					}
					break;
				}
				setState(810);
				savepoint_name();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Savepoint_stmtContext extends ParserRuleContext {
		public TerminalNode K_SAVEPOINT() { return getToken(SQLiteParser.K_SAVEPOINT, 0); }
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class,0);
		}
		public Savepoint_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSavepoint_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSavepoint_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSavepoint_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Savepoint_stmtContext savepoint_stmt() throws RecognitionException {
		Savepoint_stmtContext _localctx = new Savepoint_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_savepoint_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			match(K_SAVEPOINT);
			setState(814);
			savepoint_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_select_stmtContext extends ParserRuleContext {
		public Select_coreContext select_core() {
			return getRuleContext(Select_coreContext.class,0);
		}
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public Simple_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSimple_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSimple_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSimple_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_select_stmtContext simple_select_stmt() throws RecognitionException {
		Simple_select_stmtContext _localctx = new Simple_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_simple_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(816);
				match(K_WITH);
				setState(818);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(817);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(820);
				common_table_expression();
				setState(825);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(821);
					match(COMMA);
					setState(822);
					common_table_expression();
					}
					}
					setState(827);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(830);
			select_core();
			setState(841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(831);
				match(K_ORDER);
				setState(832);
				match(K_BY);
				setState(833);
				ordering_term();
				setState(838);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(834);
					match(COMMA);
					setState(835);
					ordering_term();
					}
					}
					setState(840);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(843);
				match(K_LIMIT);
				setState(844);
				expr(0);
				setState(847);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(845);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(846);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_stmtContext extends ParserRuleContext {
		public List<Select_or_valuesContext> select_or_values() {
			return getRuleContexts(Select_or_valuesContext.class);
		}
		public Select_or_valuesContext select_or_values(int i) {
			return getRuleContext(Select_or_valuesContext.class,i);
		}
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}
		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class,i);
		}
		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}
		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class,i);
		}
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(851);
				match(K_WITH);
				setState(853);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(852);
					match(K_RECURSIVE);
					}
					break;
				}
				setState(855);
				common_table_expression();
				setState(860);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(856);
					match(COMMA);
					setState(857);
					common_table_expression();
					}
					}
					setState(862);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(865);
			select_or_values();
			setState(871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_EXCEPT || _la==K_INTERSECT || _la==K_UNION) {
				{
				{
				setState(866);
				compound_operator();
				setState(867);
				select_or_values();
				}
				}
				setState(873);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(884);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(874);
				match(K_ORDER);
				setState(875);
				match(K_BY);
				setState(876);
				ordering_term();
				setState(881);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(877);
					match(COMMA);
					setState(878);
					ordering_term();
					}
					}
					setState(883);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(892);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(886);
				match(K_LIMIT);
				setState(887);
				expr(0);
				setState(890);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(888);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(889);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_or_valuesContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SQLiteParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_FROM() { return getToken(SQLiteParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(SQLiteParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLiteParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SQLiteParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(SQLiteParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLiteParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLiteParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLiteParser.OPEN_PAR, i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLiteParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLiteParser.CLOSE_PAR, i);
		}
		public Select_or_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_or_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSelect_or_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSelect_or_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSelect_or_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_or_valuesContext select_or_values() throws RecognitionException {
		Select_or_valuesContext _localctx = new Select_or_valuesContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_select_or_values);
		int _la;
		try {
			setState(968);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(894);
				match(K_SELECT);
				setState(896);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(895);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(898);
				result_column();
				setState(903);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(899);
					match(COMMA);
					setState(900);
					result_column();
					}
					}
					setState(905);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(918);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(906);
					match(K_FROM);
					setState(916);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
					case 1:
						{
						setState(907);
						table_or_subquery();
						setState(912);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(908);
							match(COMMA);
							setState(909);
							table_or_subquery();
							}
							}
							setState(914);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(915);
						join_clause();
						}
						break;
					}
					}
				}

				setState(922);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(920);
					match(K_WHERE);
					setState(921);
					expr(0);
					}
				}

				setState(938);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(924);
					match(K_GROUP);
					setState(925);
					match(K_BY);
					setState(926);
					expr(0);
					setState(931);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(927);
						match(COMMA);
						setState(928);
						expr(0);
						}
						}
						setState(933);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(936);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(934);
						match(K_HAVING);
						setState(935);
						expr(0);
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(940);
				match(K_VALUES);
				setState(941);
				match(OPEN_PAR);
				setState(942);
				expr(0);
				setState(947);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(943);
					match(COMMA);
					setState(944);
					expr(0);
					}
					}
					setState(949);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(950);
				match(CLOSE_PAR);
				setState(965);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(951);
					match(COMMA);
					setState(952);
					match(OPEN_PAR);
					setState(953);
					expr(0);
					setState(958);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(954);
						match(COMMA);
						setState(955);
						expr(0);
						}
						}
						setState(960);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(961);
					match(CLOSE_PAR);
					}
					}
					setState(967);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_stmtContext extends ParserRuleContext {
		public TerminalNode K_UPDATE() { return getToken(SQLiteParser.K_UPDATE, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(SQLiteParser.K_SET, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SQLiteParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLiteParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_OR() { return getToken(SQLiteParser.K_OR, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLiteParser.K_REPLACE, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterUpdate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitUpdate_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitUpdate_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(971);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(970);
				with_clause();
				}
			}

			setState(973);
			match(K_UPDATE);
			setState(984);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(974);
				match(K_OR);
				setState(975);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(976);
				match(K_OR);
				setState(977);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(978);
				match(K_OR);
				setState(979);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(980);
				match(K_OR);
				setState(981);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(982);
				match(K_OR);
				setState(983);
				match(K_IGNORE);
				}
				break;
			}
			setState(986);
			qualified_table_name();
			setState(987);
			match(K_SET);
			setState(988);
			column_name();
			setState(989);
			match(ASSIGN);
			setState(990);
			expr(0);
			setState(998);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(991);
				match(COMMA);
				setState(992);
				column_name();
				setState(993);
				match(ASSIGN);
				setState(994);
				expr(0);
				}
				}
				setState(1000);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1003);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1001);
				match(K_WHERE);
				setState(1002);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_stmt_limitedContext extends ParserRuleContext {
		public TerminalNode K_UPDATE() { return getToken(SQLiteParser.K_UPDATE, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(SQLiteParser.K_SET, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SQLiteParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLiteParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class,0);
		}
		public TerminalNode K_OR() { return getToken(SQLiteParser.K_OR, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLiteParser.K_REPLACE, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public Update_stmt_limitedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt_limited; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterUpdate_stmt_limited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitUpdate_stmt_limited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitUpdate_stmt_limited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmt_limitedContext update_stmt_limited() throws RecognitionException {
		Update_stmt_limitedContext _localctx = new Update_stmt_limitedContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_update_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WITH) {
				{
				setState(1005);
				with_clause();
				}
			}

			setState(1008);
			match(K_UPDATE);
			setState(1019);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1009);
				match(K_OR);
				setState(1010);
				match(K_ROLLBACK);
				}
				break;
			case 2:
				{
				setState(1011);
				match(K_OR);
				setState(1012);
				match(K_ABORT);
				}
				break;
			case 3:
				{
				setState(1013);
				match(K_OR);
				setState(1014);
				match(K_REPLACE);
				}
				break;
			case 4:
				{
				setState(1015);
				match(K_OR);
				setState(1016);
				match(K_FAIL);
				}
				break;
			case 5:
				{
				setState(1017);
				match(K_OR);
				setState(1018);
				match(K_IGNORE);
				}
				break;
			}
			setState(1021);
			qualified_table_name();
			setState(1022);
			match(K_SET);
			setState(1023);
			column_name();
			setState(1024);
			match(ASSIGN);
			setState(1025);
			expr(0);
			setState(1033);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1026);
				match(COMMA);
				setState(1027);
				column_name();
				setState(1028);
				match(ASSIGN);
				setState(1029);
				expr(0);
				}
				}
				setState(1035);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1038);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1036);
				match(K_WHERE);
				setState(1037);
				expr(0);
				}
			}

			setState(1058);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT || _la==K_ORDER) {
				{
				setState(1050);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(1040);
					match(K_ORDER);
					setState(1041);
					match(K_BY);
					setState(1042);
					ordering_term();
					setState(1047);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1043);
						match(COMMA);
						setState(1044);
						ordering_term();
						}
						}
						setState(1049);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1052);
				match(K_LIMIT);
				setState(1053);
				expr(0);
				setState(1056);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(1054);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1055);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Vacuum_stmtContext extends ParserRuleContext {
		public TerminalNode K_VACUUM() { return getToken(SQLiteParser.K_VACUUM, 0); }
		public Vacuum_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vacuum_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterVacuum_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitVacuum_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitVacuum_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vacuum_stmtContext vacuum_stmt() throws RecognitionException {
		Vacuum_stmtContext _localctx = new Vacuum_stmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_vacuum_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1060);
			match(K_VACUUM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_defContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}
		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class,i);
		}
		public Column_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterColumn_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitColumn_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitColumn_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1062);
			column_name();
			setState(1064);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(1063);
				type_name();
				}
				break;
			}
			setState(1069);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_CONSTRAINT) | (1L << K_DEFAULT))) != 0) || ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (K_NOT - 102)) | (1L << (K_NULL - 102)) | (1L << (K_PRIMARY - 102)) | (1L << (K_REFERENCES - 102)) | (1L << (K_UNIQUE - 102)))) != 0)) {
				{
				{
				setState(1066);
				column_constraint();
				}
				}
				setState(1071);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_nameContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}
		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode COMMA() { return getToken(SQLiteParser.COMMA, 0); }
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_type_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1073); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1072);
					name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1075); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1087);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				setState(1077);
				match(OPEN_PAR);
				setState(1078);
				signed_number();
				setState(1079);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(1081);
				match(OPEN_PAR);
				setState(1082);
				signed_number();
				setState(1083);
				match(COMMA);
				setState(1084);
				signed_number();
				setState(1085);
				match(CLOSE_PAR);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraintContext extends ParserRuleContext {
		public TerminalNode K_PRIMARY() { return getToken(SQLiteParser.K_PRIMARY, 0); }
		public TerminalNode K_KEY() { return getToken(SQLiteParser.K_KEY, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode K_NULL() { return getToken(SQLiteParser.K_NULL, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SQLiteParser.K_UNIQUE, 0); }
		public TerminalNode K_CHECK() { return getToken(SQLiteParser.K_CHECK, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode K_DEFAULT() { return getToken(SQLiteParser.K_DEFAULT, 0); }
		public TerminalNode K_COLLATE() { return getToken(SQLiteParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SQLiteParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode K_AUTOINCREMENT() { return getToken(SQLiteParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_ASC() { return getToken(SQLiteParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLiteParser.K_DESC, 0); }
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterColumn_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitColumn_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitColumn_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1091);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1089);
				match(K_CONSTRAINT);
				setState(1090);
				name();
				}
			}

			setState(1126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1093);
				match(K_PRIMARY);
				setState(1094);
				match(K_KEY);
				setState(1096);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ASC || _la==K_DESC) {
					{
					setState(1095);
					_la = _input.LA(1);
					if ( !(_la==K_ASC || _la==K_DESC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1098);
				conflict_clause();
				setState(1100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AUTOINCREMENT) {
					{
					setState(1099);
					match(K_AUTOINCREMENT);
					}
				}

				}
				break;
			case K_NOT:
			case K_NULL:
				{
				setState(1103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1102);
					match(K_NOT);
					}
				}

				setState(1105);
				match(K_NULL);
				setState(1106);
				conflict_clause();
				}
				break;
			case K_UNIQUE:
				{
				setState(1107);
				match(K_UNIQUE);
				setState(1108);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1109);
				match(K_CHECK);
				setState(1110);
				match(OPEN_PAR);
				setState(1111);
				expr(0);
				setState(1112);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(1114);
				match(K_DEFAULT);
				setState(1121);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
				case 1:
					{
					setState(1115);
					signed_number();
					}
					break;
				case 2:
					{
					setState(1116);
					literal_value();
					}
					break;
				case 3:
					{
					setState(1117);
					match(OPEN_PAR);
					setState(1118);
					expr(0);
					setState(1119);
					match(CLOSE_PAR);
					}
					break;
				}
				}
				break;
			case K_COLLATE:
				{
				setState(1123);
				match(K_COLLATE);
				setState(1124);
				collation_name();
				}
				break;
			case K_REFERENCES:
				{
				setState(1125);
				foreign_key_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conflict_clauseContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(SQLiteParser.K_ON, 0); }
		public TerminalNode K_CONFLICT() { return getToken(SQLiteParser.K_CONFLICT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLiteParser.K_REPLACE, 0); }
		public Conflict_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conflict_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterConflict_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitConflict_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitConflict_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conflict_clauseContext conflict_clause() throws RecognitionException {
		Conflict_clauseContext _localctx = new Conflict_clauseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_conflict_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(1128);
				match(K_ON);
				setState(1129);
				match(K_CONFLICT);
				setState(1130);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (K_FAIL - 72)) | (1L << (K_IGNORE - 72)) | (1L << (K_REPLACE - 72)) | (1L << (K_ROLLBACK - 72)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode BIND_PARAMETER() { return getToken(SQLiteParser.BIND_PARAMETER, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(SQLiteParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SQLiteParser.DOT, i);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode STAR() { return getToken(SQLiteParser.STAR, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLiteParser.K_DISTINCT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_CAST() { return getToken(SQLiteParser.K_CAST, 0); }
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_CASE() { return getToken(SQLiteParser.K_CASE, 0); }
		public TerminalNode K_END() { return getToken(SQLiteParser.K_END, 0); }
		public List<TerminalNode> K_WHEN() { return getTokens(SQLiteParser.K_WHEN); }
		public TerminalNode K_WHEN(int i) {
			return getToken(SQLiteParser.K_WHEN, i);
		}
		public List<TerminalNode> K_THEN() { return getTokens(SQLiteParser.K_THEN); }
		public TerminalNode K_THEN(int i) {
			return getToken(SQLiteParser.K_THEN, i);
		}
		public TerminalNode K_ELSE() { return getToken(SQLiteParser.K_ELSE, 0); }
		public Raise_functionContext raise_function() {
			return getRuleContext(Raise_functionContext.class,0);
		}
		public WindowFunctionContext windowFunction() {
			return getRuleContext(WindowFunctionContext.class,0);
		}
		public TerminalNode PIPE2() { return getToken(SQLiteParser.PIPE2, 0); }
		public TerminalNode DIV() { return getToken(SQLiteParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SQLiteParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(SQLiteParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLiteParser.MINUS, 0); }
		public TerminalNode LT2() { return getToken(SQLiteParser.LT2, 0); }
		public TerminalNode GT2() { return getToken(SQLiteParser.GT2, 0); }
		public TerminalNode AMP() { return getToken(SQLiteParser.AMP, 0); }
		public TerminalNode PIPE() { return getToken(SQLiteParser.PIPE, 0); }
		public TerminalNode LT() { return getToken(SQLiteParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(SQLiteParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(SQLiteParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(SQLiteParser.GT_EQ, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLiteParser.ASSIGN, 0); }
		public TerminalNode EQ() { return getToken(SQLiteParser.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(SQLiteParser.NOT_EQ1, 0); }
		public TerminalNode NOT_EQ2() { return getToken(SQLiteParser.NOT_EQ2, 0); }
		public TerminalNode K_IS() { return getToken(SQLiteParser.K_IS, 0); }
		public TerminalNode K_IN() { return getToken(SQLiteParser.K_IN, 0); }
		public TerminalNode K_LIKE() { return getToken(SQLiteParser.K_LIKE, 0); }
		public TerminalNode K_GLOB() { return getToken(SQLiteParser.K_GLOB, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLiteParser.K_MATCH, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLiteParser.K_REGEXP, 0); }
		public TerminalNode K_AND() { return getToken(SQLiteParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(SQLiteParser.K_OR, 0); }
		public TerminalNode K_BETWEEN() { return getToken(SQLiteParser.K_BETWEEN, 0); }
		public TerminalNode K_COLLATE() { return getToken(SQLiteParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ESCAPE() { return getToken(SQLiteParser.K_ESCAPE, 0); }
		public TerminalNode K_ISNULL() { return getToken(SQLiteParser.K_ISNULL, 0); }
		public TerminalNode K_NOTNULL() { return getToken(SQLiteParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLiteParser.K_NULL, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				{
				setState(1134);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1135);
				match(BIND_PARAMETER);
				}
				break;
			case 3:
				{
				setState(1144);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
				case 1:
					{
					setState(1139);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
					case 1:
						{
						setState(1136);
						database_name();
						setState(1137);
						match(DOT);
						}
						break;
					}
					setState(1141);
					table_name();
					setState(1142);
					match(DOT);
					}
					break;
				}
				setState(1146);
				column_name();
				}
				break;
			case 4:
				{
				setState(1147);
				unary_operator();
				setState(1148);
				expr(22);
				}
				break;
			case 5:
				{
				setState(1150);
				function_name();
				setState(1151);
				match(OPEN_PAR);
				setState(1164);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case TILDE:
				case K_ABORT:
				case K_ACTION:
				case K_ADD:
				case K_AFTER:
				case K_ALL:
				case K_ALTER:
				case K_ANALYZE:
				case K_AND:
				case K_AS:
				case K_ASC:
				case K_ATTACH:
				case K_AUTOINCREMENT:
				case K_BEFORE:
				case K_BEGIN:
				case K_BETWEEN:
				case K_BY:
				case K_CASCADE:
				case K_CASE:
				case K_CAST:
				case K_CHECK:
				case K_COLLATE:
				case K_COLUMN:
				case K_COMMIT:
				case K_CONFLICT:
				case K_CONSTRAINT:
				case K_CREATE:
				case K_CROSS:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_DATABASE:
				case K_DEFAULT:
				case K_DEFERRABLE:
				case K_DEFERRED:
				case K_DELETE:
				case K_DESC:
				case K_DETACH:
				case K_DISTINCT:
				case K_DROP:
				case K_EACH:
				case K_ELSE:
				case K_END:
				case K_ESCAPE:
				case K_EXCEPT:
				case K_EXCLUSIVE:
				case K_EXISTS:
				case K_EXPLAIN:
				case K_FAIL:
				case K_FOR:
				case K_FOREIGN:
				case K_FROM:
				case K_FULL:
				case K_GLOB:
				case K_GROUP:
				case K_HAVING:
				case K_IF:
				case K_IGNORE:
				case K_IMMEDIATE:
				case K_IN:
				case K_INDEX:
				case K_INDEXED:
				case K_INITIALLY:
				case K_INNER:
				case K_INSERT:
				case K_INSTEAD:
				case K_INTERSECT:
				case K_INTO:
				case K_IS:
				case K_ISNULL:
				case K_JOIN:
				case K_KEY:
				case K_LEFT:
				case K_LIKE:
				case K_LIMIT:
				case K_MATCH:
				case K_NATURAL:
				case K_NO:
				case K_NOT:
				case K_NOTNULL:
				case K_NULL:
				case K_OF:
				case K_OFFSET:
				case K_ON:
				case K_OR:
				case K_ORDER:
				case K_OUTER:
				case K_PLAN:
				case K_PRAGMA:
				case K_PRIMARY:
				case K_QUERY:
				case K_RAISE:
				case K_RECURSIVE:
				case K_REFERENCES:
				case K_REGEXP:
				case K_REINDEX:
				case K_RELEASE:
				case K_RENAME:
				case K_REPLACE:
				case K_RESTRICT:
				case K_RIGHT:
				case K_ROLLBACK:
				case K_ROW:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_SET:
				case K_TABLE:
				case K_TEMP:
				case K_TEMPORARY:
				case K_THEN:
				case K_TO:
				case K_TRANSACTION:
				case K_TRIGGER:
				case K_UNION:
				case K_UNIQUE:
				case K_UPDATE:
				case K_USING:
				case K_VACUUM:
				case K_VALUES:
				case K_VIEW:
				case K_VIRTUAL:
				case K_WHEN:
				case K_WHERE:
				case K_WITH:
				case K_WITHOUT:
				case K_FIRST_VALUE:
				case K_CUMEDIST:
				case K_DENSERANK:
				case K_LAG:
				case K_LASTVALUE:
				case K_LEAD:
				case K_NTHVALUE:
				case K_NTILE:
				case K_PERCENTRANK:
				case K_RANK:
				case K_ROWNUMBER:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case BIND_PARAMETER:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					setState(1153);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
					case 1:
						{
						setState(1152);
						match(K_DISTINCT);
						}
						break;
					}
					setState(1155);
					expr(0);
					setState(1160);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1156);
						match(COMMA);
						setState(1157);
						expr(0);
						}
						}
						setState(1162);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(1163);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(1166);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				setState(1168);
				match(OPEN_PAR);
				setState(1169);
				expr(0);
				setState(1170);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				setState(1172);
				match(K_CAST);
				setState(1173);
				match(OPEN_PAR);
				setState(1174);
				expr(0);
				setState(1175);
				match(K_AS);
				setState(1176);
				type_name();
				setState(1177);
				match(CLOSE_PAR);
				}
				break;
			case 8:
				{
				setState(1183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_EXISTS || _la==K_NOT) {
					{
					setState(1180);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_NOT) {
						{
						setState(1179);
						match(K_NOT);
						}
					}

					setState(1182);
					match(K_EXISTS);
					}
				}

				setState(1185);
				match(OPEN_PAR);
				setState(1186);
				select_stmt();
				setState(1187);
				match(CLOSE_PAR);
				}
				break;
			case 9:
				{
				setState(1189);
				match(K_CASE);
				setState(1191);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
				case 1:
					{
					setState(1190);
					expr(0);
					}
					break;
				}
				setState(1198); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1193);
					match(K_WHEN);
					setState(1194);
					expr(0);
					setState(1195);
					match(K_THEN);
					setState(1196);
					expr(0);
					}
					}
					setState(1200); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(1204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(1202);
					match(K_ELSE);
					setState(1203);
					expr(0);
					}
				}

				setState(1206);
				match(K_END);
				}
				break;
			case 10:
				{
				setState(1208);
				raise_function();
				}
				break;
			case 11:
				{
				setState(1209);
				windowFunction();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1312);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1310);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1212);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1213);
						match(PIPE2);
						setState(1214);
						expr(22);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1215);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1216);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1217);
						expr(21);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1218);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(1219);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1220);
						expr(20);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1221);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1222);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1223);
						expr(19);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1224);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1225);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1226);
						expr(18);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1227);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1240);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
						case 1:
							{
							setState(1228);
							match(ASSIGN);
							}
							break;
						case 2:
							{
							setState(1229);
							match(EQ);
							}
							break;
						case 3:
							{
							setState(1230);
							match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(1231);
							match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(1232);
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(1233);
							match(K_IS);
							setState(1234);
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(1235);
							match(K_IN);
							}
							break;
						case 8:
							{
							setState(1236);
							match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(1237);
							match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(1238);
							match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(1239);
							match(K_REGEXP);
							}
							break;
						}
						setState(1242);
						expr(17);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1243);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(1244);
						match(K_AND);
						setState(1245);
						expr(16);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1246);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(1247);
						match(K_OR);
						setState(1248);
						expr(15);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1249);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1250);
						match(K_IS);
						setState(1252);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
						case 1:
							{
							setState(1251);
							match(K_NOT);
							}
							break;
						}
						setState(1254);
						expr(8);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1255);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1257);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1256);
							match(K_NOT);
							}
						}

						setState(1259);
						match(K_BETWEEN);
						setState(1260);
						expr(0);
						setState(1261);
						match(K_AND);
						setState(1262);
						expr(7);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1264);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1265);
						match(K_COLLATE);
						setState(1266);
						collation_name();
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1267);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1269);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1268);
							match(K_NOT);
							}
						}

						setState(1271);
						_la = _input.LA(1);
						if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (K_GLOB - 77)) | (1L << (K_LIKE - 77)) | (1L << (K_MATCH - 77)) | (1L << (K_REGEXP - 77)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1272);
						expr(0);
						setState(1275);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
						case 1:
							{
							setState(1273);
							match(K_ESCAPE);
							setState(1274);
							expr(0);
							}
							break;
						}
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1277);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1282);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(1278);
							match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(1279);
							match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(1280);
							match(K_NOT);
							setState(1281);
							match(K_NULL);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1284);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1286);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(1285);
							match(K_NOT);
							}
						}

						setState(1288);
						match(K_IN);
						setState(1308);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
						case 1:
							{
							setState(1289);
							match(OPEN_PAR);
							setState(1299);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
							case 1:
								{
								setState(1290);
								select_stmt();
								}
								break;
							case 2:
								{
								setState(1291);
								expr(0);
								setState(1296);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la==COMMA) {
									{
									{
									setState(1292);
									match(COMMA);
									setState(1293);
									expr(0);
									}
									}
									setState(1298);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								}
								break;
							}
							setState(1301);
							match(CLOSE_PAR);
							}
							break;
						case 2:
							{
							setState(1305);
							_errHandler.sync(this);
							switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
							case 1:
								{
								setState(1302);
								database_name();
								setState(1303);
								match(DOT);
								}
								break;
							}
							setState(1307);
							table_name();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(1314);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Foreign_key_clauseContext extends ParserRuleContext {
		public TerminalNode K_REFERENCES() { return getToken(SQLiteParser.K_REFERENCES, 0); }
		public Foreign_tableContext foreign_table() {
			return getRuleContext(Foreign_tableContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(SQLiteParser.K_DEFERRABLE, 0); }
		public List<TerminalNode> K_ON() { return getTokens(SQLiteParser.K_ON); }
		public TerminalNode K_ON(int i) {
			return getToken(SQLiteParser.K_ON, i);
		}
		public List<TerminalNode> K_MATCH() { return getTokens(SQLiteParser.K_MATCH); }
		public TerminalNode K_MATCH(int i) {
			return getToken(SQLiteParser.K_MATCH, i);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public List<TerminalNode> K_DELETE() { return getTokens(SQLiteParser.K_DELETE); }
		public TerminalNode K_DELETE(int i) {
			return getToken(SQLiteParser.K_DELETE, i);
		}
		public List<TerminalNode> K_UPDATE() { return getTokens(SQLiteParser.K_UPDATE); }
		public TerminalNode K_UPDATE(int i) {
			return getToken(SQLiteParser.K_UPDATE, i);
		}
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SQLiteParser.K_INITIALLY, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SQLiteParser.K_DEFERRED, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SQLiteParser.K_IMMEDIATE, 0); }
		public List<TerminalNode> K_SET() { return getTokens(SQLiteParser.K_SET); }
		public TerminalNode K_SET(int i) {
			return getToken(SQLiteParser.K_SET, i);
		}
		public List<TerminalNode> K_NULL() { return getTokens(SQLiteParser.K_NULL); }
		public TerminalNode K_NULL(int i) {
			return getToken(SQLiteParser.K_NULL, i);
		}
		public List<TerminalNode> K_DEFAULT() { return getTokens(SQLiteParser.K_DEFAULT); }
		public TerminalNode K_DEFAULT(int i) {
			return getToken(SQLiteParser.K_DEFAULT, i);
		}
		public List<TerminalNode> K_CASCADE() { return getTokens(SQLiteParser.K_CASCADE); }
		public TerminalNode K_CASCADE(int i) {
			return getToken(SQLiteParser.K_CASCADE, i);
		}
		public List<TerminalNode> K_RESTRICT() { return getTokens(SQLiteParser.K_RESTRICT); }
		public TerminalNode K_RESTRICT(int i) {
			return getToken(SQLiteParser.K_RESTRICT, i);
		}
		public List<TerminalNode> K_NO() { return getTokens(SQLiteParser.K_NO); }
		public TerminalNode K_NO(int i) {
			return getToken(SQLiteParser.K_NO, i);
		}
		public List<TerminalNode> K_ACTION() { return getTokens(SQLiteParser.K_ACTION); }
		public TerminalNode K_ACTION(int i) {
			return getToken(SQLiteParser.K_ACTION, i);
		}
		public Foreign_key_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_key_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterForeign_key_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitForeign_key_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitForeign_key_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_key_clauseContext foreign_key_clause() throws RecognitionException {
		Foreign_key_clauseContext _localctx = new Foreign_key_clauseContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1315);
			match(K_REFERENCES);
			setState(1316);
			foreign_table();
			setState(1328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1317);
				match(OPEN_PAR);
				setState(1318);
				column_name();
				setState(1323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1319);
					match(COMMA);
					setState(1320);
					column_name();
					}
					}
					setState(1325);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1326);
				match(CLOSE_PAR);
				}
			}

			setState(1348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
				setState(1344);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_ON:
					{
					setState(1330);
					match(K_ON);
					setState(1331);
					_la = _input.LA(1);
					if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1340);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
					case 1:
						{
						setState(1332);
						match(K_SET);
						setState(1333);
						match(K_NULL);
						}
						break;
					case 2:
						{
						setState(1334);
						match(K_SET);
						setState(1335);
						match(K_DEFAULT);
						}
						break;
					case 3:
						{
						setState(1336);
						match(K_CASCADE);
						}
						break;
					case 4:
						{
						setState(1337);
						match(K_RESTRICT);
						}
						break;
					case 5:
						{
						setState(1338);
						match(K_NO);
						setState(1339);
						match(K_ACTION);
						}
						break;
					}
					}
					break;
				case K_MATCH:
					{
					setState(1342);
					match(K_MATCH);
					setState(1343);
					name();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(1350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1361);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1352);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1351);
					match(K_NOT);
					}
				}

				setState(1354);
				match(K_DEFERRABLE);
				setState(1359);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
				case 1:
					{
					setState(1355);
					match(K_INITIALLY);
					setState(1356);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(1357);
					match(K_INITIALLY);
					setState(1358);
					match(K_IMMEDIATE);
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raise_functionContext extends ParserRuleContext {
		public TerminalNode K_RAISE() { return getToken(SQLiteParser.K_RAISE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public TerminalNode COMMA() { return getToken(SQLiteParser.COMMA, 0); }
		public Error_messageContext error_message() {
			return getRuleContext(Error_messageContext.class,0);
		}
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public Raise_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterRaise_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitRaise_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitRaise_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raise_functionContext raise_function() throws RecognitionException {
		Raise_functionContext _localctx = new Raise_functionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_raise_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1363);
			match(K_RAISE);
			setState(1364);
			match(OPEN_PAR);
			setState(1369);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_IGNORE:
				{
				setState(1365);
				match(K_IGNORE);
				}
				break;
			case K_ABORT:
			case K_FAIL:
			case K_ROLLBACK:
				{
				setState(1366);
				_la = _input.LA(1);
				if ( !(_la==K_ABORT || _la==K_FAIL || _la==K_ROLLBACK) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1367);
				match(COMMA);
				setState(1368);
				error_message();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1371);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Indexed_columnContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLiteParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SQLiteParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLiteParser.K_DESC, 0); }
		public Indexed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexed_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterIndexed_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitIndexed_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitIndexed_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Indexed_columnContext indexed_column() throws RecognitionException {
		Indexed_columnContext _localctx = new Indexed_columnContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1373);
			column_name();
			setState(1376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1374);
				match(K_COLLATE);
				setState(1375);
				collation_name();
				}
			}

			setState(1379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1378);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraintContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class,0);
		}
		public TerminalNode K_CHECK() { return getToken(SQLiteParser.K_CHECK, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_FOREIGN() { return getToken(SQLiteParser.K_FOREIGN, 0); }
		public TerminalNode K_KEY() { return getToken(SQLiteParser.K_KEY, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SQLiteParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode K_PRIMARY() { return getToken(SQLiteParser.K_PRIMARY, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SQLiteParser.K_UNIQUE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTable_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTable_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitTable_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1381);
				match(K_CONSTRAINT);
				setState(1382);
				name();
				}
			}

			setState(1421);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
			case K_UNIQUE:
				{
				setState(1388);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_PRIMARY:
					{
					setState(1385);
					match(K_PRIMARY);
					setState(1386);
					match(K_KEY);
					}
					break;
				case K_UNIQUE:
					{
					setState(1387);
					match(K_UNIQUE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1390);
				match(OPEN_PAR);
				setState(1391);
				indexed_column();
				setState(1396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1392);
					match(COMMA);
					setState(1393);
					indexed_column();
					}
					}
					setState(1398);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1399);
				match(CLOSE_PAR);
				setState(1400);
				conflict_clause();
				}
				break;
			case K_CHECK:
				{
				setState(1402);
				match(K_CHECK);
				setState(1403);
				match(OPEN_PAR);
				setState(1404);
				expr(0);
				setState(1405);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(1407);
				match(K_FOREIGN);
				setState(1408);
				match(K_KEY);
				setState(1409);
				match(OPEN_PAR);
				setState(1410);
				column_name();
				setState(1415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1411);
					match(COMMA);
					setState(1412);
					column_name();
					}
					}
					setState(1417);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1418);
				match(CLOSE_PAR);
				setState(1419);
				foreign_key_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class With_clauseContext extends ParserRuleContext {
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public List<Cte_table_nameContext> cte_table_name() {
			return getRuleContexts(Cte_table_nameContext.class);
		}
		public Cte_table_nameContext cte_table_name(int i) {
			return getRuleContext(Cte_table_nameContext.class,i);
		}
		public List<TerminalNode> K_AS() { return getTokens(SQLiteParser.K_AS); }
		public TerminalNode K_AS(int i) {
			return getToken(SQLiteParser.K_AS, i);
		}
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLiteParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLiteParser.OPEN_PAR, i);
		}
		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}
		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLiteParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLiteParser.CLOSE_PAR, i);
		}
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public With_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterWith_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitWith_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitWith_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final With_clauseContext with_clause() throws RecognitionException {
		With_clauseContext _localctx = new With_clauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_with_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1423);
			match(K_WITH);
			setState(1425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				{
				setState(1424);
				match(K_RECURSIVE);
				}
				break;
			}
			setState(1427);
			cte_table_name();
			setState(1428);
			match(K_AS);
			setState(1429);
			match(OPEN_PAR);
			setState(1430);
			select_stmt();
			setState(1431);
			match(CLOSE_PAR);
			setState(1441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1432);
				match(COMMA);
				setState(1433);
				cte_table_name();
				setState(1434);
				match(K_AS);
				setState(1435);
				match(OPEN_PAR);
				setState(1436);
				select_stmt();
				setState(1437);
				match(CLOSE_PAR);
				}
				}
				setState(1443);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualified_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public TerminalNode K_INDEXED() { return getToken(SQLiteParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public Qualified_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterQualified_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitQualified_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitQualified_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_table_nameContext qualified_table_name() throws RecognitionException {
		Qualified_table_nameContext _localctx = new Qualified_table_nameContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				{
				setState(1444);
				database_name();
				setState(1445);
				match(DOT);
				}
				break;
			}
			setState(1449);
			table_name();
			setState(1455);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1450);
				match(K_INDEXED);
				setState(1451);
				match(K_BY);
				setState(1452);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(1453);
				match(K_NOT);
				setState(1454);
				match(K_INDEXED);
				}
				break;
			case EOF:
			case SCOL:
			case K_ALTER:
			case K_ANALYZE:
			case K_ATTACH:
			case K_BEGIN:
			case K_COMMIT:
			case K_CREATE:
			case K_DELETE:
			case K_DETACH:
			case K_DROP:
			case K_END:
			case K_EXPLAIN:
			case K_INSERT:
			case K_LIMIT:
			case K_ORDER:
			case K_PRAGMA:
			case K_REINDEX:
			case K_RELEASE:
			case K_REPLACE:
			case K_ROLLBACK:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_SET:
			case K_UPDATE:
			case K_VACUUM:
			case K_VALUES:
			case K_WHERE:
			case K_WITH:
			case UNEXPECTED_CHAR:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ordering_termContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLiteParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SQLiteParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLiteParser.K_DESC, 0); }
		public Ordering_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterOrdering_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitOrdering_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitOrdering_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ordering_termContext ordering_term() throws RecognitionException {
		Ordering_termContext _localctx = new Ordering_termContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1457);
			expr(0);
			setState(1460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1458);
				match(K_COLLATE);
				setState(1459);
				collation_name();
				}
			}

			setState(1463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1462);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pragma_valueContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public Pragma_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterPragma_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitPragma_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitPragma_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_valueContext pragma_value() throws RecognitionException {
		Pragma_valueContext _localctx = new Pragma_valueContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_pragma_value);
		try {
			setState(1468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1465);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1466);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1467);
				match(STRING_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Common_table_expressionContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLiteParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLiteParser.OPEN_PAR, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLiteParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLiteParser.CLOSE_PAR, i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Common_table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCommon_table_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCommon_table_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCommon_table_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_table_expressionContext common_table_expression() throws RecognitionException {
		Common_table_expressionContext _localctx = new Common_table_expressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1470);
			table_name();
			setState(1482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1471);
				match(OPEN_PAR);
				setState(1472);
				column_name();
				setState(1477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1473);
					match(COMMA);
					setState(1474);
					column_name();
					}
					}
					setState(1479);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1480);
				match(CLOSE_PAR);
				}
			}

			setState(1484);
			match(K_AS);
			setState(1485);
			match(OPEN_PAR);
			setState(1486);
			select_stmt();
			setState(1487);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Result_columnContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(SQLiteParser.STAR, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WindowFunctionContext windowFunction() {
			return getRuleContext(WindowFunctionContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterResult_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitResult_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitResult_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_result_column);
		int _la;
		try {
			setState(1504);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1489);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1490);
				table_name();
				setState(1491);
				match(DOT);
				setState(1492);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1496);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
				case 1:
					{
					setState(1494);
					expr(0);
					}
					break;
				case 2:
					{
					setState(1495);
					windowFunction();
					}
					break;
				}
				setState(1502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_AS || _la==IDENTIFIER || _la==STRING_LITERAL) {
					{
					setState(1499);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1498);
						match(K_AS);
						}
					}

					setState(1501);
					column_alias();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowFunctionContext extends ParserRuleContext {
		public TerminalNode K_FIRST_VALUE() { return getToken(SQLiteParser.K_FIRST_VALUE, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLiteParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLiteParser.OPEN_PAR, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLiteParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLiteParser.CLOSE_PAR, i);
		}
		public TerminalNode K_OVER() { return getToken(SQLiteParser.K_OVER, 0); }
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public ExprAscDescOptionalContext exprAscDescOptional() {
			return getRuleContext(ExprAscDescOptionalContext.class,0);
		}
		public PartitionbyOptionalContext partitionbyOptional() {
			return getRuleContext(PartitionbyOptionalContext.class,0);
		}
		public FrameclauseOptionalContext frameclauseOptional() {
			return getRuleContext(FrameclauseOptionalContext.class,0);
		}
		public TerminalNode K_CUMEDIST() { return getToken(SQLiteParser.K_CUMEDIST, 0); }
		public OrderByOptionalContext orderByOptional() {
			return getRuleContext(OrderByOptionalContext.class,0);
		}
		public TerminalNode K_DENSERANK() { return getToken(SQLiteParser.K_DENSERANK, 0); }
		public TerminalNode K_LAG() { return getToken(SQLiteParser.K_LAG, 0); }
		public OffsetOptionalContext offsetOptional() {
			return getRuleContext(OffsetOptionalContext.class,0);
		}
		public DefaultOptionalContext defaultOptional() {
			return getRuleContext(DefaultOptionalContext.class,0);
		}
		public TerminalNode K_LASTVALUE() { return getToken(SQLiteParser.K_LASTVALUE, 0); }
		public TerminalNode K_LEAD() { return getToken(SQLiteParser.K_LEAD, 0); }
		public TerminalNode K_NTHVALUE() { return getToken(SQLiteParser.K_NTHVALUE, 0); }
		public TerminalNode COMMA() { return getToken(SQLiteParser.COMMA, 0); }
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public TerminalNode K_NTILE() { return getToken(SQLiteParser.K_NTILE, 0); }
		public TerminalNode K_PERCENTRANK() { return getToken(SQLiteParser.K_PERCENTRANK, 0); }
		public TerminalNode K_RANK() { return getToken(SQLiteParser.K_RANK, 0); }
		public TerminalNode K_ROWNUMBER() { return getToken(SQLiteParser.K_ROWNUMBER, 0); }
		public WindowFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterWindowFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitWindowFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitWindowFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFunctionContext windowFunction() throws RecognitionException {
		WindowFunctionContext _localctx = new WindowFunctionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_windowFunction);
		int _la;
		try {
			setState(1676);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_FIRST_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1506);
				match(K_FIRST_VALUE);
				setState(1507);
				match(OPEN_PAR);
				setState(1508);
				expr(0);
				setState(1509);
				match(CLOSE_PAR);
				setState(1510);
				match(K_OVER);
				setState(1511);
				match(OPEN_PAR);
				setState(1513);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_PARTITION) {
					{
					setState(1512);
					partitionbyOptional();
					}
				}

				setState(1515);
				match(K_ORDER);
				setState(1516);
				match(K_BY);
				setState(1517);
				exprAscDescOptional();
				setState(1519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ROWS || _la==K_RANGE) {
					{
					setState(1518);
					frameclauseOptional();
					}
				}

				setState(1521);
				match(CLOSE_PAR);
				}
				break;
			case K_CUMEDIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(1523);
				match(K_CUMEDIST);
				setState(1524);
				match(OPEN_PAR);
				setState(1525);
				match(CLOSE_PAR);
				setState(1526);
				match(K_OVER);
				setState(1527);
				match(OPEN_PAR);
				setState(1529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_PARTITION) {
					{
					setState(1528);
					partitionbyOptional();
					}
				}

				setState(1532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(1531);
					orderByOptional();
					}
				}

				setState(1534);
				match(CLOSE_PAR);
				}
				break;
			case K_DENSERANK:
				enterOuterAlt(_localctx, 3);
				{
				setState(1535);
				match(K_DENSERANK);
				setState(1536);
				match(OPEN_PAR);
				setState(1537);
				match(CLOSE_PAR);
				setState(1538);
				match(K_OVER);
				setState(1539);
				match(OPEN_PAR);
				setState(1541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_PARTITION) {
					{
					setState(1540);
					partitionbyOptional();
					}
				}

				setState(1543);
				match(K_ORDER);
				setState(1544);
				match(K_BY);
				setState(1545);
				exprAscDescOptional();
				setState(1546);
				match(CLOSE_PAR);
				}
				break;
			case K_LAG:
				enterOuterAlt(_localctx, 4);
				{
				setState(1548);
				match(K_LAG);
				setState(1549);
				match(OPEN_PAR);
				setState(1550);
				expr(0);
				setState(1552);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
				case 1:
					{
					setState(1551);
					offsetOptional();
					}
					break;
				}
				setState(1555);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1554);
					defaultOptional();
					}
				}

				setState(1557);
				match(CLOSE_PAR);
				setState(1558);
				match(K_OVER);
				setState(1559);
				match(OPEN_PAR);
				setState(1561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_PARTITION) {
					{
					setState(1560);
					partitionbyOptional();
					}
				}

				setState(1563);
				match(K_ORDER);
				setState(1564);
				match(K_BY);
				setState(1565);
				exprAscDescOptional();
				setState(1566);
				match(CLOSE_PAR);
				}
				break;
			case K_LASTVALUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1568);
				match(K_LASTVALUE);
				setState(1569);
				match(OPEN_PAR);
				setState(1570);
				expr(0);
				setState(1571);
				match(CLOSE_PAR);
				setState(1572);
				match(K_OVER);
				setState(1573);
				match(OPEN_PAR);
				setState(1575);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_PARTITION) {
					{
					setState(1574);
					partitionbyOptional();
					}
				}

				setState(1577);
				match(K_ORDER);
				setState(1578);
				match(K_BY);
				setState(1579);
				exprAscDescOptional();
				setState(1581);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ROWS || _la==K_RANGE) {
					{
					setState(1580);
					frameclauseOptional();
					}
				}

				setState(1583);
				match(CLOSE_PAR);
				}
				break;
			case K_LEAD:
				enterOuterAlt(_localctx, 6);
				{
				setState(1585);
				match(K_LEAD);
				setState(1586);
				match(OPEN_PAR);
				setState(1587);
				expr(0);
				setState(1589);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
				case 1:
					{
					setState(1588);
					offsetOptional();
					}
					break;
				}
				setState(1592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(1591);
					defaultOptional();
					}
				}

				setState(1594);
				match(CLOSE_PAR);
				setState(1595);
				match(K_OVER);
				setState(1596);
				match(OPEN_PAR);
				setState(1598);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_PARTITION) {
					{
					setState(1597);
					partitionbyOptional();
					}
				}

				setState(1600);
				match(K_ORDER);
				setState(1601);
				match(K_BY);
				setState(1602);
				exprAscDescOptional();
				setState(1603);
				match(CLOSE_PAR);
				}
				break;
			case K_NTHVALUE:
				enterOuterAlt(_localctx, 7);
				{
				setState(1605);
				match(K_NTHVALUE);
				setState(1606);
				match(OPEN_PAR);
				setState(1607);
				expr(0);
				setState(1608);
				match(COMMA);
				setState(1609);
				signed_number();
				setState(1610);
				match(CLOSE_PAR);
				setState(1611);
				match(K_OVER);
				setState(1612);
				match(OPEN_PAR);
				setState(1614);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_PARTITION) {
					{
					setState(1613);
					partitionbyOptional();
					}
				}

				setState(1616);
				match(K_ORDER);
				setState(1617);
				match(K_BY);
				setState(1618);
				exprAscDescOptional();
				setState(1620);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ROWS || _la==K_RANGE) {
					{
					setState(1619);
					frameclauseOptional();
					}
				}

				setState(1622);
				match(CLOSE_PAR);
				}
				break;
			case K_NTILE:
				enterOuterAlt(_localctx, 8);
				{
				setState(1624);
				match(K_NTILE);
				setState(1625);
				match(OPEN_PAR);
				setState(1626);
				expr(0);
				setState(1627);
				match(CLOSE_PAR);
				setState(1628);
				match(K_OVER);
				setState(1629);
				match(OPEN_PAR);
				setState(1631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_PARTITION) {
					{
					setState(1630);
					partitionbyOptional();
					}
				}

				setState(1633);
				match(K_ORDER);
				setState(1634);
				match(K_BY);
				setState(1635);
				exprAscDescOptional();
				setState(1636);
				match(CLOSE_PAR);
				}
				break;
			case K_PERCENTRANK:
				enterOuterAlt(_localctx, 9);
				{
				setState(1638);
				match(K_PERCENTRANK);
				setState(1639);
				match(OPEN_PAR);
				setState(1640);
				match(CLOSE_PAR);
				setState(1641);
				match(K_OVER);
				setState(1642);
				match(OPEN_PAR);
				setState(1644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_PARTITION) {
					{
					setState(1643);
					partitionbyOptional();
					}
				}

				setState(1647);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ORDER) {
					{
					setState(1646);
					orderByOptional();
					}
				}

				setState(1649);
				match(CLOSE_PAR);
				}
				break;
			case K_RANK:
				enterOuterAlt(_localctx, 10);
				{
				setState(1650);
				match(K_RANK);
				setState(1651);
				match(OPEN_PAR);
				setState(1652);
				match(CLOSE_PAR);
				setState(1653);
				match(K_OVER);
				setState(1654);
				match(OPEN_PAR);
				setState(1656);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_PARTITION) {
					{
					setState(1655);
					partitionbyOptional();
					}
				}

				setState(1658);
				match(K_ORDER);
				setState(1659);
				match(K_BY);
				setState(1660);
				exprAscDescOptional();
				setState(1661);
				match(CLOSE_PAR);
				}
				break;
			case K_ROWNUMBER:
				enterOuterAlt(_localctx, 11);
				{
				setState(1663);
				match(K_ROWNUMBER);
				setState(1664);
				match(OPEN_PAR);
				setState(1665);
				match(CLOSE_PAR);
				setState(1666);
				match(K_OVER);
				setState(1667);
				match(OPEN_PAR);
				setState(1669);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_PARTITION) {
					{
					setState(1668);
					partitionbyOptional();
					}
				}

				setState(1671);
				match(K_ORDER);
				setState(1672);
				match(K_BY);
				setState(1673);
				exprAscDescOptional();
				setState(1674);
				match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OffsetOptionalContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SQLiteParser.COMMA, 0); }
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public OffsetOptionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offsetOptional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterOffsetOptional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitOffsetOptional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitOffsetOptional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OffsetOptionalContext offsetOptional() throws RecognitionException {
		OffsetOptionalContext _localctx = new OffsetOptionalContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_offsetOptional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1678);
			match(COMMA);
			setState(1679);
			signed_number();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultOptionalContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SQLiteParser.COMMA, 0); }
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public DefaultOptionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultOptional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDefaultOptional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDefaultOptional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDefaultOptional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultOptionalContext defaultOptional() throws RecognitionException {
		DefaultOptionalContext _localctx = new DefaultOptionalContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_defaultOptional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1681);
			match(COMMA);
			setState(1682);
			signed_number();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionbyOptionalContext extends ParserRuleContext {
		public TerminalNode K_PARTITION() { return getToken(SQLiteParser.K_PARTITION, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PartitionbyOptionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionbyOptional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterPartitionbyOptional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitPartitionbyOptional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitPartitionbyOptional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionbyOptionalContext partitionbyOptional() throws RecognitionException {
		PartitionbyOptionalContext _localctx = new PartitionbyOptionalContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_partitionbyOptional);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1684);
			match(K_PARTITION);
			setState(1685);
			match(K_BY);
			setState(1687); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1686);
					expr(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1689); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByOptionalContext extends ParserRuleContext {
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OrderByOptionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByOptional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterOrderByOptional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitOrderByOptional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitOrderByOptional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByOptionalContext orderByOptional() throws RecognitionException {
		OrderByOptionalContext _localctx = new OrderByOptionalContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_orderByOptional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1691);
			match(K_ORDER);
			setState(1692);
			match(K_BY);
			setState(1694); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1693);
				expr(0);
				}
				}
				setState(1696); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE) | (1L << K_COLUMN) | (1L << K_COMMIT) | (1L << K_CONFLICT) | (1L << K_CONSTRAINT) | (1L << K_CREATE) | (1L << K_CROSS) | (1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP) | (1L << K_DATABASE) | (1L << K_DEFAULT) | (1L << K_DEFERRABLE) | (1L << K_DEFERRED) | (1L << K_DELETE) | (1L << K_DESC) | (1L << K_DETACH) | (1L << K_DISTINCT) | (1L << K_DROP))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)) | (1L << (K_OFFSET - 64)) | (1L << (K_ON - 64)) | (1L << (K_OR - 64)) | (1L << (K_ORDER - 64)) | (1L << (K_OUTER - 64)) | (1L << (K_PLAN - 64)) | (1L << (K_PRAGMA - 64)) | (1L << (K_PRIMARY - 64)) | (1L << (K_QUERY - 64)) | (1L << (K_RAISE - 64)) | (1L << (K_RECURSIVE - 64)) | (1L << (K_REFERENCES - 64)) | (1L << (K_REGEXP - 64)) | (1L << (K_REINDEX - 64)) | (1L << (K_RELEASE - 64)) | (1L << (K_RENAME - 64)) | (1L << (K_REPLACE - 64)) | (1L << (K_RESTRICT - 64)) | (1L << (K_RIGHT - 64)) | (1L << (K_ROLLBACK - 64)) | (1L << (K_ROW - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_FIRST_VALUE - 128)) | (1L << (K_CUMEDIST - 128)) | (1L << (K_DENSERANK - 128)) | (1L << (K_LAG - 128)) | (1L << (K_LASTVALUE - 128)) | (1L << (K_LEAD - 128)) | (1L << (K_NTHVALUE - 128)) | (1L << (K_NTILE - 128)) | (1L << (K_PERCENTRANK - 128)) | (1L << (K_RANK - 128)) | (1L << (K_ROWNUMBER - 128)) | (1L << (IDENTIFIER - 128)) | (1L << (NUMERIC_LITERAL - 128)) | (1L << (BIND_PARAMETER - 128)) | (1L << (STRING_LITERAL - 128)) | (1L << (BLOB_LITERAL - 128)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprAscDescOptionalContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<AscdescOptionContext> ascdescOption() {
			return getRuleContexts(AscdescOptionContext.class);
		}
		public AscdescOptionContext ascdescOption(int i) {
			return getRuleContext(AscdescOptionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public ExprAscDescOptionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAscDescOptional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterExprAscDescOptional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitExprAscDescOptional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitExprAscDescOptional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAscDescOptionalContext exprAscDescOptional() throws RecognitionException {
		ExprAscDescOptionalContext _localctx = new ExprAscDescOptionalContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_exprAscDescOptional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1698);
			expr(0);
			setState(1700);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1699);
				ascdescOption();
				}
			}

			setState(1709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1702);
				match(COMMA);
				setState(1703);
				expr(0);
				setState(1705);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ASC || _la==K_DESC) {
					{
					setState(1704);
					ascdescOption();
					}
				}

				}
				}
				setState(1711);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AscdescOptionContext extends ParserRuleContext {
		public TerminalNode K_ASC() { return getToken(SQLiteParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLiteParser.K_DESC, 0); }
		public AscdescOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ascdescOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterAscdescOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitAscdescOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitAscdescOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AscdescOptionContext ascdescOption() throws RecognitionException {
		AscdescOptionContext _localctx = new AscdescOptionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_ascdescOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1712);
			_la = _input.LA(1);
			if ( !(_la==K_ASC || _la==K_DESC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameclauseOptionalContext extends ParserRuleContext {
		public TerminalNode K_RANGE() { return getToken(SQLiteParser.K_RANGE, 0); }
		public TerminalNode K_ROWS() { return getToken(SQLiteParser.K_ROWS, 0); }
		public Frame_startContext frame_start() {
			return getRuleContext(Frame_startContext.class,0);
		}
		public TerminalNode K_BETWEEN() { return getToken(SQLiteParser.K_BETWEEN, 0); }
		public TerminalNode K_AND() { return getToken(SQLiteParser.K_AND, 0); }
		public Frame_endContext frame_end() {
			return getRuleContext(Frame_endContext.class,0);
		}
		public FrameclauseOptionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameclauseOptional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterFrameclauseOptional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitFrameclauseOptional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitFrameclauseOptional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameclauseOptionalContext frameclauseOptional() throws RecognitionException {
		FrameclauseOptionalContext _localctx = new FrameclauseOptionalContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_frameclauseOptional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1714);
			_la = _input.LA(1);
			if ( !(_la==K_ROWS || _la==K_RANGE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1721);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case K_UBOUNDED:
			case K_CURRENT:
			case NUMERIC_LITERAL:
				{
				setState(1715);
				frame_start();
				}
				break;
			case K_BETWEEN:
				{
				setState(1716);
				match(K_BETWEEN);
				setState(1717);
				frame_start();
				setState(1718);
				match(K_AND);
				setState(1719);
				frame_end();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Frame_startContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public TerminalNode K_PRECEDING() { return getToken(SQLiteParser.K_PRECEDING, 0); }
		public TerminalNode K_UBOUNDED() { return getToken(SQLiteParser.K_UBOUNDED, 0); }
		public TerminalNode K_CURRENT() { return getToken(SQLiteParser.K_CURRENT, 0); }
		public TerminalNode K_ROW() { return getToken(SQLiteParser.K_ROW, 0); }
		public Frame_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frame_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterFrame_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitFrame_start(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitFrame_start(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Frame_startContext frame_start() throws RecognitionException {
		Frame_startContext _localctx = new Frame_startContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_frame_start);
		try {
			setState(1730);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1723);
				signed_number();
				setState(1724);
				match(K_PRECEDING);
				}
				break;
			case K_UBOUNDED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1726);
				match(K_UBOUNDED);
				setState(1727);
				match(K_PRECEDING);
				}
				break;
			case K_CURRENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1728);
				match(K_CURRENT);
				setState(1729);
				match(K_ROW);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Frame_endContext extends ParserRuleContext {
		public TerminalNode K_CURRENT() { return getToken(SQLiteParser.K_CURRENT, 0); }
		public TerminalNode K_ROW() { return getToken(SQLiteParser.K_ROW, 0); }
		public TerminalNode K_UBOUNDED() { return getToken(SQLiteParser.K_UBOUNDED, 0); }
		public TerminalNode K_FOLLOWING() { return getToken(SQLiteParser.K_FOLLOWING, 0); }
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Frame_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frame_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterFrame_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitFrame_end(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitFrame_end(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Frame_endContext frame_end() throws RecognitionException {
		Frame_endContext _localctx = new Frame_endContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_frame_end);
		try {
			setState(1739);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_CURRENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1732);
				match(K_CURRENT);
				setState(1733);
				match(K_ROW);
				}
				break;
			case K_UBOUNDED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1734);
				match(K_UBOUNDED);
				setState(1735);
				match(K_FOLLOWING);
				}
				break;
			case PLUS:
			case MINUS:
			case NUMERIC_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1736);
				signed_number();
				setState(1737);
				match(K_FOLLOWING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_or_subqueryContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLiteParser.DOT, 0); }
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode K_INDEXED() { return getToken(SQLiteParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Table_or_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTable_or_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTable_or_subquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitTable_or_subquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_subqueryContext table_or_subquery() throws RecognitionException {
		Table_or_subqueryContext _localctx = new Table_or_subqueryContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_table_or_subquery);
		int _la;
		try {
			setState(1788);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1744);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
				case 1:
					{
					setState(1741);
					database_name();
					setState(1742);
					match(DOT);
					}
					break;
				}
				setState(1746);
				table_name();
				setState(1751);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
				case 1:
					{
					setState(1748);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
					case 1:
						{
						setState(1747);
						match(K_AS);
						}
						break;
					}
					setState(1750);
					table_alias();
					}
					break;
				}
				setState(1758);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_INDEXED:
					{
					setState(1753);
					match(K_INDEXED);
					setState(1754);
					match(K_BY);
					setState(1755);
					index_name();
					}
					break;
				case K_NOT:
					{
					setState(1756);
					match(K_NOT);
					setState(1757);
					match(K_INDEXED);
					}
					break;
				case EOF:
				case SCOL:
				case CLOSE_PAR:
				case COMMA:
				case K_ALTER:
				case K_ANALYZE:
				case K_ATTACH:
				case K_BEGIN:
				case K_COMMIT:
				case K_CREATE:
				case K_CROSS:
				case K_DELETE:
				case K_DETACH:
				case K_DROP:
				case K_END:
				case K_EXCEPT:
				case K_EXPLAIN:
				case K_GROUP:
				case K_INNER:
				case K_INSERT:
				case K_INTERSECT:
				case K_JOIN:
				case K_LEFT:
				case K_LIMIT:
				case K_NATURAL:
				case K_ON:
				case K_ORDER:
				case K_PRAGMA:
				case K_REINDEX:
				case K_RELEASE:
				case K_REPLACE:
				case K_ROLLBACK:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_UNION:
				case K_UPDATE:
				case K_USING:
				case K_VACUUM:
				case K_VALUES:
				case K_WHERE:
				case K_WITH:
				case UNEXPECTED_CHAR:
					break;
				default:
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1760);
				match(OPEN_PAR);
				setState(1770);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
				case 1:
					{
					setState(1761);
					table_or_subquery();
					setState(1766);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1762);
						match(COMMA);
						setState(1763);
						table_or_subquery();
						}
						}
						setState(1768);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1769);
					join_clause();
					}
					break;
				}
				setState(1772);
				match(CLOSE_PAR);
				setState(1777);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
				case 1:
					{
					setState(1774);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
					case 1:
						{
						setState(1773);
						match(K_AS);
						}
						break;
					}
					setState(1776);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1779);
				match(OPEN_PAR);
				setState(1780);
				select_stmt();
				setState(1781);
				match(CLOSE_PAR);
				setState(1786);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
				case 1:
					{
					setState(1783);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,245,_ctx) ) {
					case 1:
						{
						setState(1782);
						match(K_AS);
						}
						break;
					}
					setState(1785);
					table_alias();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_clauseContext extends ParserRuleContext {
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public List<Join_operatorContext> join_operator() {
			return getRuleContexts(Join_operatorContext.class);
		}
		public Join_operatorContext join_operator(int i) {
			return getRuleContext(Join_operatorContext.class,i);
		}
		public List<Join_constraintContext> join_constraint() {
			return getRuleContexts(Join_constraintContext.class);
		}
		public Join_constraintContext join_constraint(int i) {
			return getRuleContext(Join_constraintContext.class,i);
		}
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitJoin_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitJoin_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1790);
			table_or_subquery();
			setState(1797);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==K_CROSS || ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (K_INNER - 87)) | (1L << (K_JOIN - 87)) | (1L << (K_LEFT - 87)) | (1L << (K_NATURAL - 87)))) != 0)) {
				{
				{
				setState(1791);
				join_operator();
				setState(1792);
				table_or_subquery();
				setState(1793);
				join_constraint();
				}
				}
				setState(1799);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_operatorContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SQLiteParser.COMMA, 0); }
		public TerminalNode K_JOIN() { return getToken(SQLiteParser.K_JOIN, 0); }
		public TerminalNode K_NATURAL() { return getToken(SQLiteParser.K_NATURAL, 0); }
		public TerminalNode K_LEFT() { return getToken(SQLiteParser.K_LEFT, 0); }
		public TerminalNode K_INNER() { return getToken(SQLiteParser.K_INNER, 0); }
		public TerminalNode K_CROSS() { return getToken(SQLiteParser.K_CROSS, 0); }
		public TerminalNode K_OUTER() { return getToken(SQLiteParser.K_OUTER, 0); }
		public Join_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterJoin_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitJoin_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitJoin_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_operatorContext join_operator() throws RecognitionException {
		Join_operatorContext _localctx = new Join_operatorContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_join_operator);
		int _la;
		try {
			setState(1813);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(1800);
				match(COMMA);
				}
				break;
			case K_CROSS:
			case K_INNER:
			case K_JOIN:
			case K_LEFT:
			case K_NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1802);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NATURAL) {
					{
					setState(1801);
					match(K_NATURAL);
					}
				}

				setState(1810);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_LEFT:
					{
					setState(1804);
					match(K_LEFT);
					setState(1806);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_OUTER) {
						{
						setState(1805);
						match(K_OUTER);
						}
					}

					}
					break;
				case K_INNER:
					{
					setState(1808);
					match(K_INNER);
					}
					break;
				case K_CROSS:
					{
					setState(1809);
					match(K_CROSS);
					}
					break;
				case K_JOIN:
					break;
				default:
					break;
				}
				setState(1812);
				match(K_JOIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_constraintContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(SQLiteParser.K_ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_USING() { return getToken(SQLiteParser.K_USING, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Join_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterJoin_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitJoin_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitJoin_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_constraintContext join_constraint() throws RecognitionException {
		Join_constraintContext _localctx = new Join_constraintContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1829);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ON:
				{
				setState(1815);
				match(K_ON);
				setState(1816);
				expr(0);
				}
				break;
			case K_USING:
				{
				setState(1817);
				match(K_USING);
				setState(1818);
				match(OPEN_PAR);
				setState(1819);
				column_name();
				setState(1824);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1820);
					match(COMMA);
					setState(1821);
					column_name();
					}
					}
					setState(1826);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1827);
				match(CLOSE_PAR);
				}
				break;
			case EOF:
			case SCOL:
			case CLOSE_PAR:
			case COMMA:
			case K_ALTER:
			case K_ANALYZE:
			case K_ATTACH:
			case K_BEGIN:
			case K_COMMIT:
			case K_CREATE:
			case K_CROSS:
			case K_DELETE:
			case K_DETACH:
			case K_DROP:
			case K_END:
			case K_EXCEPT:
			case K_EXPLAIN:
			case K_GROUP:
			case K_INNER:
			case K_INSERT:
			case K_INTERSECT:
			case K_JOIN:
			case K_LEFT:
			case K_LIMIT:
			case K_NATURAL:
			case K_ORDER:
			case K_PRAGMA:
			case K_REINDEX:
			case K_RELEASE:
			case K_REPLACE:
			case K_ROLLBACK:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_UNION:
			case K_UPDATE:
			case K_VACUUM:
			case K_VALUES:
			case K_WHERE:
			case K_WITH:
			case UNEXPECTED_CHAR:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_coreContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SQLiteParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public TerminalNode K_FROM() { return getToken(SQLiteParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(SQLiteParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLiteParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SQLiteParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(SQLiteParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLiteParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLiteParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLiteParser.OPEN_PAR, i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLiteParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLiteParser.CLOSE_PAR, i);
		}
		public Select_coreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_core; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSelect_core(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSelect_core(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSelect_core(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_coreContext select_core() throws RecognitionException {
		Select_coreContext _localctx = new Select_coreContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_select_core);
		int _la;
		try {
			setState(1905);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1831);
				match(K_SELECT);
				setState(1833);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,255,_ctx) ) {
				case 1:
					{
					setState(1832);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(1835);
				result_column();
				setState(1840);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1836);
					match(COMMA);
					setState(1837);
					result_column();
					}
					}
					setState(1842);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1855);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1843);
					match(K_FROM);
					setState(1853);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
					case 1:
						{
						setState(1844);
						table_or_subquery();
						setState(1849);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1845);
							match(COMMA);
							setState(1846);
							table_or_subquery();
							}
							}
							setState(1851);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(1852);
						join_clause();
						}
						break;
					}
					}
				}

				setState(1859);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1857);
					match(K_WHERE);
					setState(1858);
					expr(0);
					}
				}

				setState(1875);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1861);
					match(K_GROUP);
					setState(1862);
					match(K_BY);
					setState(1863);
					expr(0);
					setState(1868);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1864);
						match(COMMA);
						setState(1865);
						expr(0);
						}
						}
						setState(1870);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1873);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1871);
						match(K_HAVING);
						setState(1872);
						expr(0);
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1877);
				match(K_VALUES);
				setState(1878);
				match(OPEN_PAR);
				setState(1879);
				expr(0);
				setState(1884);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1880);
					match(COMMA);
					setState(1881);
					expr(0);
					}
					}
					setState(1886);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1887);
				match(CLOSE_PAR);
				setState(1902);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1888);
					match(COMMA);
					setState(1889);
					match(OPEN_PAR);
					setState(1890);
					expr(0);
					setState(1895);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1891);
						match(COMMA);
						setState(1892);
						expr(0);
						}
						}
						setState(1897);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1898);
					match(CLOSE_PAR);
					}
					}
					setState(1904);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_operatorContext extends ParserRuleContext {
		public TerminalNode K_UNION() { return getToken(SQLiteParser.K_UNION, 0); }
		public TerminalNode K_ALL() { return getToken(SQLiteParser.K_ALL, 0); }
		public TerminalNode K_INTERSECT() { return getToken(SQLiteParser.K_INTERSECT, 0); }
		public TerminalNode K_EXCEPT() { return getToken(SQLiteParser.K_EXCEPT, 0); }
		public Compound_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCompound_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCompound_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCompound_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compound_operatorContext compound_operator() throws RecognitionException {
		Compound_operatorContext _localctx = new Compound_operatorContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_compound_operator);
		try {
			setState(1912);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1907);
				match(K_UNION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1908);
				match(K_UNION);
				setState(1909);
				match(K_ALL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1910);
				match(K_INTERSECT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1911);
				match(K_EXCEPT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cte_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLiteParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLiteParser.COMMA, i);
		}
		public Cte_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCte_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCte_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCte_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_table_nameContext cte_table_name() throws RecognitionException {
		Cte_table_nameContext _localctx = new Cte_table_nameContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1914);
			table_name();
			setState(1926);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1915);
				match(OPEN_PAR);
				setState(1916);
				column_name();
				setState(1921);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1917);
					match(COMMA);
					setState(1918);
					column_name();
					}
					}
					setState(1923);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1924);
				match(CLOSE_PAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLiteParser.NUMERIC_LITERAL, 0); }
		public TerminalNode PLUS() { return getToken(SQLiteParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLiteParser.MINUS, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSigned_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSigned_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1929);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1928);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1931);
			match(NUMERIC_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLiteParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public TerminalNode BLOB_LITERAL() { return getToken(SQLiteParser.BLOB_LITERAL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLiteParser.K_NULL, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SQLiteParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SQLiteParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SQLiteParser.K_CURRENT_TIMESTAMP, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitLiteral_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1933);
			_la = _input.LA(1);
			if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (K_CURRENT_DATE - 52)) | (1L << (K_CURRENT_TIME - 52)) | (1L << (K_CURRENT_TIMESTAMP - 52)) | (1L << (K_NULL - 52)))) != 0) || ((((_la - 169)) & ~0x3f) == 0 && ((1L << (_la - 169)) & ((1L << (NUMERIC_LITERAL - 169)) | (1L << (STRING_LITERAL - 169)) | (1L << (BLOB_LITERAL - 169)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(SQLiteParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SQLiteParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SQLiteParser.TILDE, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1935);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TILDE))) != 0) || _la==K_NOT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Error_messageContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public Error_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterError_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitError_message(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitError_message(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_messageContext error_message() throws RecognitionException {
		Error_messageContext _localctx = new Error_messageContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1937);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_argumentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Module_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterModule_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitModule_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitModule_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_argumentContext module_argument() throws RecognitionException {
		Module_argumentContext _localctx = new Module_argumentContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_module_argument);
		try {
			setState(1941);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1939);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1940);
				column_def();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_aliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLiteParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterColumn_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitColumn_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitColumn_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1943);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode K_ABORT() { return getToken(SQLiteParser.K_ABORT, 0); }
		public TerminalNode K_ACTION() { return getToken(SQLiteParser.K_ACTION, 0); }
		public TerminalNode K_ADD() { return getToken(SQLiteParser.K_ADD, 0); }
		public TerminalNode K_AFTER() { return getToken(SQLiteParser.K_AFTER, 0); }
		public TerminalNode K_ALL() { return getToken(SQLiteParser.K_ALL, 0); }
		public TerminalNode K_ALTER() { return getToken(SQLiteParser.K_ALTER, 0); }
		public TerminalNode K_ANALYZE() { return getToken(SQLiteParser.K_ANALYZE, 0); }
		public TerminalNode K_AND() { return getToken(SQLiteParser.K_AND, 0); }
		public TerminalNode K_AS() { return getToken(SQLiteParser.K_AS, 0); }
		public TerminalNode K_ASC() { return getToken(SQLiteParser.K_ASC, 0); }
		public TerminalNode K_ATTACH() { return getToken(SQLiteParser.K_ATTACH, 0); }
		public TerminalNode K_AUTOINCREMENT() { return getToken(SQLiteParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_BEFORE() { return getToken(SQLiteParser.K_BEFORE, 0); }
		public TerminalNode K_BEGIN() { return getToken(SQLiteParser.K_BEGIN, 0); }
		public TerminalNode K_BETWEEN() { return getToken(SQLiteParser.K_BETWEEN, 0); }
		public TerminalNode K_BY() { return getToken(SQLiteParser.K_BY, 0); }
		public TerminalNode K_CASCADE() { return getToken(SQLiteParser.K_CASCADE, 0); }
		public TerminalNode K_CASE() { return getToken(SQLiteParser.K_CASE, 0); }
		public TerminalNode K_CAST() { return getToken(SQLiteParser.K_CAST, 0); }
		public TerminalNode K_CHECK() { return getToken(SQLiteParser.K_CHECK, 0); }
		public TerminalNode K_COLLATE() { return getToken(SQLiteParser.K_COLLATE, 0); }
		public TerminalNode K_COLUMN() { return getToken(SQLiteParser.K_COLUMN, 0); }
		public TerminalNode K_COMMIT() { return getToken(SQLiteParser.K_COMMIT, 0); }
		public TerminalNode K_CONFLICT() { return getToken(SQLiteParser.K_CONFLICT, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SQLiteParser.K_CONSTRAINT, 0); }
		public TerminalNode K_CREATE() { return getToken(SQLiteParser.K_CREATE, 0); }
		public TerminalNode K_CROSS() { return getToken(SQLiteParser.K_CROSS, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SQLiteParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SQLiteParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SQLiteParser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_DATABASE() { return getToken(SQLiteParser.K_DATABASE, 0); }
		public TerminalNode K_DEFAULT() { return getToken(SQLiteParser.K_DEFAULT, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(SQLiteParser.K_DEFERRABLE, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SQLiteParser.K_DEFERRED, 0); }
		public TerminalNode K_DELETE() { return getToken(SQLiteParser.K_DELETE, 0); }
		public TerminalNode K_DESC() { return getToken(SQLiteParser.K_DESC, 0); }
		public TerminalNode K_DETACH() { return getToken(SQLiteParser.K_DETACH, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLiteParser.K_DISTINCT, 0); }
		public TerminalNode K_DROP() { return getToken(SQLiteParser.K_DROP, 0); }
		public TerminalNode K_EACH() { return getToken(SQLiteParser.K_EACH, 0); }
		public TerminalNode K_ELSE() { return getToken(SQLiteParser.K_ELSE, 0); }
		public TerminalNode K_END() { return getToken(SQLiteParser.K_END, 0); }
		public TerminalNode K_ESCAPE() { return getToken(SQLiteParser.K_ESCAPE, 0); }
		public TerminalNode K_EXCEPT() { return getToken(SQLiteParser.K_EXCEPT, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(SQLiteParser.K_EXCLUSIVE, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLiteParser.K_EXISTS, 0); }
		public TerminalNode K_EXPLAIN() { return getToken(SQLiteParser.K_EXPLAIN, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLiteParser.K_FAIL, 0); }
		public TerminalNode K_FOR() { return getToken(SQLiteParser.K_FOR, 0); }
		public TerminalNode K_FOREIGN() { return getToken(SQLiteParser.K_FOREIGN, 0); }
		public TerminalNode K_FROM() { return getToken(SQLiteParser.K_FROM, 0); }
		public TerminalNode K_FULL() { return getToken(SQLiteParser.K_FULL, 0); }
		public TerminalNode K_GLOB() { return getToken(SQLiteParser.K_GLOB, 0); }
		public TerminalNode K_GROUP() { return getToken(SQLiteParser.K_GROUP, 0); }
		public TerminalNode K_HAVING() { return getToken(SQLiteParser.K_HAVING, 0); }
		public TerminalNode K_IF() { return getToken(SQLiteParser.K_IF, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLiteParser.K_IGNORE, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SQLiteParser.K_IMMEDIATE, 0); }
		public TerminalNode K_IN() { return getToken(SQLiteParser.K_IN, 0); }
		public TerminalNode K_INDEX() { return getToken(SQLiteParser.K_INDEX, 0); }
		public TerminalNode K_INDEXED() { return getToken(SQLiteParser.K_INDEXED, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SQLiteParser.K_INITIALLY, 0); }
		public TerminalNode K_INNER() { return getToken(SQLiteParser.K_INNER, 0); }
		public TerminalNode K_INSERT() { return getToken(SQLiteParser.K_INSERT, 0); }
		public TerminalNode K_INSTEAD() { return getToken(SQLiteParser.K_INSTEAD, 0); }
		public TerminalNode K_INTERSECT() { return getToken(SQLiteParser.K_INTERSECT, 0); }
		public TerminalNode K_INTO() { return getToken(SQLiteParser.K_INTO, 0); }
		public TerminalNode K_IS() { return getToken(SQLiteParser.K_IS, 0); }
		public TerminalNode K_ISNULL() { return getToken(SQLiteParser.K_ISNULL, 0); }
		public TerminalNode K_JOIN() { return getToken(SQLiteParser.K_JOIN, 0); }
		public TerminalNode K_KEY() { return getToken(SQLiteParser.K_KEY, 0); }
		public TerminalNode K_LEFT() { return getToken(SQLiteParser.K_LEFT, 0); }
		public TerminalNode K_LIKE() { return getToken(SQLiteParser.K_LIKE, 0); }
		public TerminalNode K_LIMIT() { return getToken(SQLiteParser.K_LIMIT, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLiteParser.K_MATCH, 0); }
		public TerminalNode K_NATURAL() { return getToken(SQLiteParser.K_NATURAL, 0); }
		public TerminalNode K_NO() { return getToken(SQLiteParser.K_NO, 0); }
		public TerminalNode K_NOT() { return getToken(SQLiteParser.K_NOT, 0); }
		public TerminalNode K_NOTNULL() { return getToken(SQLiteParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLiteParser.K_NULL, 0); }
		public TerminalNode K_OF() { return getToken(SQLiteParser.K_OF, 0); }
		public TerminalNode K_OFFSET() { return getToken(SQLiteParser.K_OFFSET, 0); }
		public TerminalNode K_ON() { return getToken(SQLiteParser.K_ON, 0); }
		public TerminalNode K_OR() { return getToken(SQLiteParser.K_OR, 0); }
		public TerminalNode K_ORDER() { return getToken(SQLiteParser.K_ORDER, 0); }
		public TerminalNode K_OUTER() { return getToken(SQLiteParser.K_OUTER, 0); }
		public TerminalNode K_PLAN() { return getToken(SQLiteParser.K_PLAN, 0); }
		public TerminalNode K_PRAGMA() { return getToken(SQLiteParser.K_PRAGMA, 0); }
		public TerminalNode K_PRIMARY() { return getToken(SQLiteParser.K_PRIMARY, 0); }
		public TerminalNode K_QUERY() { return getToken(SQLiteParser.K_QUERY, 0); }
		public TerminalNode K_RAISE() { return getToken(SQLiteParser.K_RAISE, 0); }
		public TerminalNode K_RECURSIVE() { return getToken(SQLiteParser.K_RECURSIVE, 0); }
		public TerminalNode K_REFERENCES() { return getToken(SQLiteParser.K_REFERENCES, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLiteParser.K_REGEXP, 0); }
		public TerminalNode K_REINDEX() { return getToken(SQLiteParser.K_REINDEX, 0); }
		public TerminalNode K_RELEASE() { return getToken(SQLiteParser.K_RELEASE, 0); }
		public TerminalNode K_RENAME() { return getToken(SQLiteParser.K_RENAME, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLiteParser.K_REPLACE, 0); }
		public TerminalNode K_RESTRICT() { return getToken(SQLiteParser.K_RESTRICT, 0); }
		public TerminalNode K_RIGHT() { return getToken(SQLiteParser.K_RIGHT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLiteParser.K_ROLLBACK, 0); }
		public TerminalNode K_ROW() { return getToken(SQLiteParser.K_ROW, 0); }
		public TerminalNode K_SAVEPOINT() { return getToken(SQLiteParser.K_SAVEPOINT, 0); }
		public TerminalNode K_SELECT() { return getToken(SQLiteParser.K_SELECT, 0); }
		public TerminalNode K_SET() { return getToken(SQLiteParser.K_SET, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLiteParser.K_TABLE, 0); }
		public TerminalNode K_TEMP() { return getToken(SQLiteParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SQLiteParser.K_TEMPORARY, 0); }
		public TerminalNode K_THEN() { return getToken(SQLiteParser.K_THEN, 0); }
		public TerminalNode K_TO() { return getToken(SQLiteParser.K_TO, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SQLiteParser.K_TRANSACTION, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SQLiteParser.K_TRIGGER, 0); }
		public TerminalNode K_UNION() { return getToken(SQLiteParser.K_UNION, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SQLiteParser.K_UNIQUE, 0); }
		public TerminalNode K_UPDATE() { return getToken(SQLiteParser.K_UPDATE, 0); }
		public TerminalNode K_USING() { return getToken(SQLiteParser.K_USING, 0); }
		public TerminalNode K_VACUUM() { return getToken(SQLiteParser.K_VACUUM, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLiteParser.K_VALUES, 0); }
		public TerminalNode K_VIEW() { return getToken(SQLiteParser.K_VIEW, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(SQLiteParser.K_VIRTUAL, 0); }
		public TerminalNode K_WHEN() { return getToken(SQLiteParser.K_WHEN, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLiteParser.K_WHERE, 0); }
		public TerminalNode K_WITH() { return getToken(SQLiteParser.K_WITH, 0); }
		public TerminalNode K_WITHOUT() { return getToken(SQLiteParser.K_WITHOUT, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1945);
			_la = _input.LA(1);
			if ( !(((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (K_ABORT - 25)) | (1L << (K_ACTION - 25)) | (1L << (K_ADD - 25)) | (1L << (K_AFTER - 25)) | (1L << (K_ALL - 25)) | (1L << (K_ALTER - 25)) | (1L << (K_ANALYZE - 25)) | (1L << (K_AND - 25)) | (1L << (K_AS - 25)) | (1L << (K_ASC - 25)) | (1L << (K_ATTACH - 25)) | (1L << (K_AUTOINCREMENT - 25)) | (1L << (K_BEFORE - 25)) | (1L << (K_BEGIN - 25)) | (1L << (K_BETWEEN - 25)) | (1L << (K_BY - 25)) | (1L << (K_CASCADE - 25)) | (1L << (K_CASE - 25)) | (1L << (K_CAST - 25)) | (1L << (K_CHECK - 25)) | (1L << (K_COLLATE - 25)) | (1L << (K_COLUMN - 25)) | (1L << (K_COMMIT - 25)) | (1L << (K_CONFLICT - 25)) | (1L << (K_CONSTRAINT - 25)) | (1L << (K_CREATE - 25)) | (1L << (K_CROSS - 25)) | (1L << (K_CURRENT_DATE - 25)) | (1L << (K_CURRENT_TIME - 25)) | (1L << (K_CURRENT_TIMESTAMP - 25)) | (1L << (K_DATABASE - 25)) | (1L << (K_DEFAULT - 25)) | (1L << (K_DEFERRABLE - 25)) | (1L << (K_DEFERRED - 25)) | (1L << (K_DELETE - 25)) | (1L << (K_DESC - 25)) | (1L << (K_DETACH - 25)) | (1L << (K_DISTINCT - 25)) | (1L << (K_DROP - 25)) | (1L << (K_EACH - 25)) | (1L << (K_ELSE - 25)) | (1L << (K_END - 25)) | (1L << (K_ESCAPE - 25)) | (1L << (K_EXCEPT - 25)) | (1L << (K_EXCLUSIVE - 25)) | (1L << (K_EXISTS - 25)) | (1L << (K_EXPLAIN - 25)) | (1L << (K_FAIL - 25)) | (1L << (K_FOR - 25)) | (1L << (K_FOREIGN - 25)) | (1L << (K_FROM - 25)) | (1L << (K_FULL - 25)) | (1L << (K_GLOB - 25)) | (1L << (K_GROUP - 25)) | (1L << (K_HAVING - 25)) | (1L << (K_IF - 25)) | (1L << (K_IGNORE - 25)) | (1L << (K_IMMEDIATE - 25)) | (1L << (K_IN - 25)) | (1L << (K_INDEX - 25)) | (1L << (K_INDEXED - 25)) | (1L << (K_INITIALLY - 25)) | (1L << (K_INNER - 25)) | (1L << (K_INSERT - 25)))) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (K_INSTEAD - 89)) | (1L << (K_INTERSECT - 89)) | (1L << (K_INTO - 89)) | (1L << (K_IS - 89)) | (1L << (K_ISNULL - 89)) | (1L << (K_JOIN - 89)) | (1L << (K_KEY - 89)) | (1L << (K_LEFT - 89)) | (1L << (K_LIKE - 89)) | (1L << (K_LIMIT - 89)) | (1L << (K_MATCH - 89)) | (1L << (K_NATURAL - 89)) | (1L << (K_NO - 89)) | (1L << (K_NOT - 89)) | (1L << (K_NOTNULL - 89)) | (1L << (K_NULL - 89)) | (1L << (K_OF - 89)) | (1L << (K_OFFSET - 89)) | (1L << (K_ON - 89)) | (1L << (K_OR - 89)) | (1L << (K_ORDER - 89)) | (1L << (K_OUTER - 89)) | (1L << (K_PLAN - 89)) | (1L << (K_PRAGMA - 89)) | (1L << (K_PRIMARY - 89)) | (1L << (K_QUERY - 89)) | (1L << (K_RAISE - 89)) | (1L << (K_RECURSIVE - 89)) | (1L << (K_REFERENCES - 89)) | (1L << (K_REGEXP - 89)) | (1L << (K_REINDEX - 89)) | (1L << (K_RELEASE - 89)) | (1L << (K_RENAME - 89)) | (1L << (K_REPLACE - 89)) | (1L << (K_RESTRICT - 89)) | (1L << (K_RIGHT - 89)) | (1L << (K_ROLLBACK - 89)) | (1L << (K_ROW - 89)) | (1L << (K_SAVEPOINT - 89)) | (1L << (K_SELECT - 89)) | (1L << (K_SET - 89)) | (1L << (K_TABLE - 89)) | (1L << (K_TEMP - 89)) | (1L << (K_TEMPORARY - 89)) | (1L << (K_THEN - 89)) | (1L << (K_TO - 89)) | (1L << (K_TRANSACTION - 89)) | (1L << (K_TRIGGER - 89)) | (1L << (K_UNION - 89)) | (1L << (K_UNIQUE - 89)) | (1L << (K_UPDATE - 89)) | (1L << (K_USING - 89)) | (1L << (K_VACUUM - 89)) | (1L << (K_VALUES - 89)) | (1L << (K_VIEW - 89)) | (1L << (K_VIRTUAL - 89)) | (1L << (K_WHEN - 89)) | (1L << (K_WHERE - 89)) | (1L << (K_WITH - 89)) | (1L << (K_WITHOUT - 89)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1947);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1949);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Database_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterDatabase_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitDatabase_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitDatabase_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1951);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1953);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_or_index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_or_index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTable_or_index_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTable_or_index_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitTable_or_index_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_index_nameContext table_or_index_name() throws RecognitionException {
		Table_or_index_nameContext _localctx = new Table_or_index_nameContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1955);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class New_table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public New_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterNew_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitNew_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitNew_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_table_nameContext new_table_name() throws RecognitionException {
		New_table_nameContext _localctx = new New_table_nameContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1957);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1959);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collation_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterCollation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitCollation_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitCollation_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1961);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreign_tableContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Foreign_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterForeign_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitForeign_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitForeign_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_tableContext foreign_table() throws RecognitionException {
		Foreign_tableContext _localctx = new Foreign_tableContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1963);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitIndex_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitIndex_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1965);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Trigger_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Trigger_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTrigger_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTrigger_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitTrigger_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trigger_nameContext trigger_name() throws RecognitionException {
		Trigger_nameContext _localctx = new Trigger_nameContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1967);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class View_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public View_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterView_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitView_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitView_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1969);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Module_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterModule_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitModule_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitModule_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_nameContext module_name() throws RecognitionException {
		Module_nameContext _localctx = new Module_nameContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1971);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pragma_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Pragma_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterPragma_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitPragma_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitPragma_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_nameContext pragma_name() throws RecognitionException {
		Pragma_nameContext _localctx = new Pragma_nameContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1973);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Savepoint_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Savepoint_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterSavepoint_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitSavepoint_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitSavepoint_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Savepoint_nameContext savepoint_name() throws RecognitionException {
		Savepoint_nameContext _localctx = new Savepoint_nameContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1975);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_aliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTable_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitTable_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1977);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Transaction_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Transaction_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaction_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterTransaction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitTransaction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitTransaction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Transaction_nameContext transaction_name() throws RecognitionException {
		Transaction_nameContext _localctx = new Transaction_nameContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1979);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLiteParser.IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SQLiteParser.STRING_LITERAL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLiteParser.OPEN_PAR, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLiteParser.CLOSE_PAR, 0); }
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).enterAny_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLiteListener ) ((SQLiteListener)listener).exitAny_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLiteVisitor ) return ((SQLiteVisitor<? extends T>)visitor).visitAny_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_any_name);
		try {
			setState(1988);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1981);
				match(IDENTIFIER);
				}
				break;
			case K_ABORT:
			case K_ACTION:
			case K_ADD:
			case K_AFTER:
			case K_ALL:
			case K_ALTER:
			case K_ANALYZE:
			case K_AND:
			case K_AS:
			case K_ASC:
			case K_ATTACH:
			case K_AUTOINCREMENT:
			case K_BEFORE:
			case K_BEGIN:
			case K_BETWEEN:
			case K_BY:
			case K_CASCADE:
			case K_CASE:
			case K_CAST:
			case K_CHECK:
			case K_COLLATE:
			case K_COLUMN:
			case K_COMMIT:
			case K_CONFLICT:
			case K_CONSTRAINT:
			case K_CREATE:
			case K_CROSS:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DATABASE:
			case K_DEFAULT:
			case K_DEFERRABLE:
			case K_DEFERRED:
			case K_DELETE:
			case K_DESC:
			case K_DETACH:
			case K_DISTINCT:
			case K_DROP:
			case K_EACH:
			case K_ELSE:
			case K_END:
			case K_ESCAPE:
			case K_EXCEPT:
			case K_EXCLUSIVE:
			case K_EXISTS:
			case K_EXPLAIN:
			case K_FAIL:
			case K_FOR:
			case K_FOREIGN:
			case K_FROM:
			case K_FULL:
			case K_GLOB:
			case K_GROUP:
			case K_HAVING:
			case K_IF:
			case K_IGNORE:
			case K_IMMEDIATE:
			case K_IN:
			case K_INDEX:
			case K_INDEXED:
			case K_INITIALLY:
			case K_INNER:
			case K_INSERT:
			case K_INSTEAD:
			case K_INTERSECT:
			case K_INTO:
			case K_IS:
			case K_ISNULL:
			case K_JOIN:
			case K_KEY:
			case K_LEFT:
			case K_LIKE:
			case K_LIMIT:
			case K_MATCH:
			case K_NATURAL:
			case K_NO:
			case K_NOT:
			case K_NOTNULL:
			case K_NULL:
			case K_OF:
			case K_OFFSET:
			case K_ON:
			case K_OR:
			case K_ORDER:
			case K_OUTER:
			case K_PLAN:
			case K_PRAGMA:
			case K_PRIMARY:
			case K_QUERY:
			case K_RAISE:
			case K_RECURSIVE:
			case K_REFERENCES:
			case K_REGEXP:
			case K_REINDEX:
			case K_RELEASE:
			case K_RENAME:
			case K_REPLACE:
			case K_RESTRICT:
			case K_RIGHT:
			case K_ROLLBACK:
			case K_ROW:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_SET:
			case K_TABLE:
			case K_TEMP:
			case K_TEMPORARY:
			case K_THEN:
			case K_TO:
			case K_TRANSACTION:
			case K_TRIGGER:
			case K_UNION:
			case K_UNIQUE:
			case K_UPDATE:
			case K_USING:
			case K_VACUUM:
			case K_VALUES:
			case K_VIEW:
			case K_VIRTUAL:
			case K_WHEN:
			case K_WHERE:
			case K_WITH:
			case K_WITHOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1982);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1983);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1984);
				match(OPEN_PAR);
				setState(1985);
				any_name();
				setState(1986);
				match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 39:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 21);
		case 1:
			return precpred(_ctx, 20);
		case 2:
			return precpred(_ctx, 19);
		case 3:
			return precpred(_ctx, 18);
		case 4:
			return precpred(_ctx, 17);
		case 5:
			return precpred(_ctx, 16);
		case 6:
			return precpred(_ctx, 15);
		case 7:
			return precpred(_ctx, 14);
		case 8:
			return precpred(_ctx, 7);
		case 9:
			return precpred(_ctx, 6);
		case 10:
			return precpred(_ctx, 10);
		case 11:
			return precpred(_ctx, 9);
		case 12:
			return precpred(_ctx, 8);
		case 13:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00b2\u07c9\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\3\2\3\2\7\2\u00bd"+
		"\n\2\f\2\16\2\u00c0\13\2\3\2\3\2\3\3\3\3\3\3\3\4\7\4\u00c8\n\4\f\4\16"+
		"\4\u00cb\13\4\3\4\3\4\6\4\u00cf\n\4\r\4\16\4\u00d0\3\4\7\4\u00d4\n\4\f"+
		"\4\16\4\u00d7\13\4\3\4\7\4\u00da\n\4\f\4\16\4\u00dd\13\4\3\5\3\5\3\5\5"+
		"\5\u00e2\n\5\5\5\u00e4\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5\u0104\n\5\3\6\3\6\3\6\3\6\3\6\5\6\u010b\n\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6\u0113\n\6\3\6\5\6\u0116\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7\u011f\n\7\3\b\3\b\5\b\u0123\n\b\3\b\3\b\3\b\3\b\3\t\3\t\5\t\u012b\n"+
		"\t\3\t\3\t\5\t\u012f\n\t\5\t\u0131\n\t\3\n\3\n\3\n\5\n\u0136\n\n\5\n\u0138"+
		"\n\n\3\13\3\13\5\13\u013c\n\13\3\13\3\13\3\13\7\13\u0141\n\13\f\13\16"+
		"\13\u0144\13\13\5\13\u0146\n\13\3\13\3\13\3\13\5\13\u014b\n\13\3\13\3"+
		"\13\5\13\u014f\n\13\3\13\6\13\u0152\n\13\r\13\16\13\u0153\3\13\3\13\3"+
		"\13\3\13\3\13\7\13\u015b\n\13\f\13\16\13\u015e\13\13\5\13\u0160\n\13\3"+
		"\13\3\13\3\13\3\13\5\13\u0166\n\13\5\13\u0168\n\13\3\f\3\f\5\f\u016c\n"+
		"\f\3\f\3\f\3\f\3\f\5\f\u0172\n\f\3\f\3\f\3\f\5\f\u0177\n\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\7\f\u0180\n\f\f\f\16\f\u0183\13\f\3\f\3\f\3\f\5\f\u0188"+
		"\n\f\3\r\3\r\5\r\u018c\n\r\3\r\3\r\3\r\3\r\5\r\u0192\n\r\3\r\3\r\3\r\5"+
		"\r\u0197\n\r\3\r\3\r\3\r\3\r\3\r\7\r\u019e\n\r\f\r\16\r\u01a1\13\r\3\r"+
		"\3\r\7\r\u01a5\n\r\f\r\16\r\u01a8\13\r\3\r\3\r\3\r\5\r\u01ad\n\r\3\r\3"+
		"\r\5\r\u01b1\n\r\3\16\3\16\5\16\u01b5\n\16\3\16\3\16\3\16\3\16\5\16\u01bb"+
		"\n\16\3\16\3\16\3\16\5\16\u01c0\n\16\3\16\3\16\3\16\3\16\3\16\5\16\u01c7"+
		"\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u01d0\n\16\f\16\16\16\u01d3"+
		"\13\16\5\16\u01d5\n\16\5\16\u01d7\n\16\3\16\3\16\3\16\3\16\5\16\u01dd"+
		"\n\16\3\16\3\16\3\16\3\16\5\16\u01e3\n\16\3\16\3\16\5\16\u01e7\n\16\3"+
		"\16\3\16\3\16\3\16\3\16\5\16\u01ee\n\16\3\16\3\16\6\16\u01f2\n\16\r\16"+
		"\16\16\u01f3\3\16\3\16\3\17\3\17\5\17\u01fa\n\17\3\17\3\17\3\17\3\17\5"+
		"\17\u0200\n\17\3\17\3\17\3\17\5\17\u0205\n\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u0211\n\20\3\20\3\20\3\20\5\20\u0216\n"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u021f\n\20\f\20\16\20\u0222"+
		"\13\20\3\20\3\20\5\20\u0226\n\20\3\21\5\21\u0229\n\21\3\21\3\21\3\21\3"+
		"\21\3\21\5\21\u0230\n\21\3\22\5\22\u0233\n\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u023a\n\22\3\22\3\22\3\22\3\22\3\22\7\22\u0241\n\22\f\22\16\22\u0244"+
		"\13\22\5\22\u0246\n\22\3\22\3\22\3\22\3\22\5\22\u024c\n\22\5\22\u024e"+
		"\n\22\3\23\3\23\5\23\u0252\n\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u025a"+
		"\n\24\3\24\3\24\3\24\5\24\u025f\n\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25"+
		"\u0267\n\25\3\25\3\25\3\25\5\25\u026c\n\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\5\26\u0274\n\26\3\26\3\26\3\26\5\26\u0279\n\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\5\27\u0281\n\27\3\27\3\27\3\27\5\27\u0286\n\27\3\27\3\27\3"+
		"\30\3\30\5\30\u028c\n\30\3\30\3\30\3\30\7\30\u0291\n\30\f\30\16\30\u0294"+
		"\13\30\5\30\u0296\n\30\3\30\3\30\3\30\3\30\7\30\u029c\n\30\f\30\16\30"+
		"\u029f\13\30\3\30\3\30\3\30\3\30\3\30\7\30\u02a6\n\30\f\30\16\30\u02a9"+
		"\13\30\5\30\u02ab\n\30\3\30\3\30\3\30\3\30\5\30\u02b1\n\30\5\30\u02b3"+
		"\n\30\3\31\5\31\u02b6\n\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u02c9\n\31\3\31\3\31\3\31"+
		"\3\31\5\31\u02cf\n\31\3\31\3\31\3\31\3\31\3\31\7\31\u02d6\n\31\f\31\16"+
		"\31\u02d9\13\31\3\31\3\31\5\31\u02dd\n\31\3\31\3\31\3\31\3\31\3\31\7\31"+
		"\u02e4\n\31\f\31\16\31\u02e7\13\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31"+
		"\u02ef\n\31\f\31\16\31\u02f2\13\31\3\31\3\31\7\31\u02f6\n\31\f\31\16\31"+
		"\u02f9\13\31\3\31\3\31\3\31\5\31\u02fe\n\31\3\32\3\32\3\32\3\32\5\32\u0304"+
		"\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u030d\n\32\3\33\3\33\3\33"+
		"\3\33\3\33\5\33\u0314\n\33\3\33\3\33\5\33\u0318\n\33\5\33\u031a\n\33\3"+
		"\34\3\34\5\34\u031e\n\34\3\34\3\34\3\35\3\35\3\35\5\35\u0325\n\35\5\35"+
		"\u0327\n\35\3\35\3\35\5\35\u032b\n\35\3\35\5\35\u032e\n\35\3\36\3\36\3"+
		"\36\3\37\3\37\5\37\u0335\n\37\3\37\3\37\3\37\7\37\u033a\n\37\f\37\16\37"+
		"\u033d\13\37\5\37\u033f\n\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0347"+
		"\n\37\f\37\16\37\u034a\13\37\5\37\u034c\n\37\3\37\3\37\3\37\3\37\5\37"+
		"\u0352\n\37\5\37\u0354\n\37\3 \3 \5 \u0358\n \3 \3 \3 \7 \u035d\n \f "+
		"\16 \u0360\13 \5 \u0362\n \3 \3 \3 \3 \7 \u0368\n \f \16 \u036b\13 \3"+
		" \3 \3 \3 \3 \7 \u0372\n \f \16 \u0375\13 \5 \u0377\n \3 \3 \3 \3 \5 "+
		"\u037d\n \5 \u037f\n \3!\3!\5!\u0383\n!\3!\3!\3!\7!\u0388\n!\f!\16!\u038b"+
		"\13!\3!\3!\3!\3!\7!\u0391\n!\f!\16!\u0394\13!\3!\5!\u0397\n!\5!\u0399"+
		"\n!\3!\3!\5!\u039d\n!\3!\3!\3!\3!\3!\7!\u03a4\n!\f!\16!\u03a7\13!\3!\3"+
		"!\5!\u03ab\n!\5!\u03ad\n!\3!\3!\3!\3!\3!\7!\u03b4\n!\f!\16!\u03b7\13!"+
		"\3!\3!\3!\3!\3!\3!\7!\u03bf\n!\f!\16!\u03c2\13!\3!\3!\7!\u03c6\n!\f!\16"+
		"!\u03c9\13!\5!\u03cb\n!\3\"\5\"\u03ce\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\5\"\u03db\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\7\"\u03e7\n\"\f\"\16\"\u03ea\13\"\3\"\3\"\5\"\u03ee\n\"\3#\5#\u03f1\n"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u03fe\n#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\7#\u040a\n#\f#\16#\u040d\13#\3#\3#\5#\u0411\n#\3#\3#\3#\3#\3#"+
		"\7#\u0418\n#\f#\16#\u041b\13#\5#\u041d\n#\3#\3#\3#\3#\5#\u0423\n#\5#\u0425"+
		"\n#\3$\3$\3%\3%\5%\u042b\n%\3%\7%\u042e\n%\f%\16%\u0431\13%\3&\6&\u0434"+
		"\n&\r&\16&\u0435\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0442\n&\3\'\3\'\5\'"+
		"\u0446\n\'\3\'\3\'\3\'\5\'\u044b\n\'\3\'\3\'\5\'\u044f\n\'\3\'\5\'\u0452"+
		"\n\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5"+
		"\'\u0464\n\'\3\'\3\'\3\'\5\'\u0469\n\'\3(\3(\3(\5(\u046e\n(\3)\3)\3)\3"+
		")\3)\3)\5)\u0476\n)\3)\3)\3)\5)\u047b\n)\3)\3)\3)\3)\3)\3)\3)\5)\u0484"+
		"\n)\3)\3)\3)\7)\u0489\n)\f)\16)\u048c\13)\3)\5)\u048f\n)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u049f\n)\3)\5)\u04a2\n)\3)\3)\3)\3)\3"+
		")\3)\5)\u04aa\n)\3)\3)\3)\3)\3)\6)\u04b1\n)\r)\16)\u04b2\3)\3)\5)\u04b7"+
		"\n)\3)\3)\3)\3)\5)\u04bd\n)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u04db\n)\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\5)\u04e7\n)\3)\3)\3)\5)\u04ec\n)\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\5)\u04f8\n)\3)\3)\3)\3)\5)\u04fe\n)\3)\3)\3)\3)\3)\5)\u0505"+
		"\n)\3)\3)\5)\u0509\n)\3)\3)\3)\3)\3)\3)\7)\u0511\n)\f)\16)\u0514\13)\5"+
		")\u0516\n)\3)\3)\3)\3)\5)\u051c\n)\3)\5)\u051f\n)\7)\u0521\n)\f)\16)\u0524"+
		"\13)\3*\3*\3*\3*\3*\3*\7*\u052c\n*\f*\16*\u052f\13*\3*\3*\5*\u0533\n*"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u053f\n*\3*\3*\5*\u0543\n*\7*\u0545"+
		"\n*\f*\16*\u0548\13*\3*\5*\u054b\n*\3*\3*\3*\3*\3*\5*\u0552\n*\5*\u0554"+
		"\n*\3+\3+\3+\3+\3+\3+\5+\u055c\n+\3+\3+\3,\3,\3,\5,\u0563\n,\3,\5,\u0566"+
		"\n,\3-\3-\5-\u056a\n-\3-\3-\3-\5-\u056f\n-\3-\3-\3-\3-\7-\u0575\n-\f-"+
		"\16-\u0578\13-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\7-\u0588\n-\f"+
		"-\16-\u058b\13-\3-\3-\3-\5-\u0590\n-\3.\3.\5.\u0594\n.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\7.\u05a2\n.\f.\16.\u05a5\13.\3/\3/\3/\5/\u05aa\n"+
		"/\3/\3/\3/\3/\3/\3/\5/\u05b2\n/\3\60\3\60\3\60\5\60\u05b7\n\60\3\60\5"+
		"\60\u05ba\n\60\3\61\3\61\3\61\5\61\u05bf\n\61\3\62\3\62\3\62\3\62\3\62"+
		"\7\62\u05c6\n\62\f\62\16\62\u05c9\13\62\3\62\3\62\5\62\u05cd\n\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u05db\n\63"+
		"\3\63\5\63\u05de\n\63\3\63\5\63\u05e1\n\63\5\63\u05e3\n\63\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\5\64\u05ec\n\64\3\64\3\64\3\64\3\64\5\64\u05f2"+
		"\n\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u05fc\n\64\3\64\5\64"+
		"\u05ff\n\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0608\n\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0613\n\64\3\64\5\64\u0616"+
		"\n\64\3\64\3\64\3\64\3\64\5\64\u061c\n\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u062a\n\64\3\64\3\64\3\64\3\64\5\64"+
		"\u0630\n\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0638\n\64\3\64\5\64\u063b"+
		"\n\64\3\64\3\64\3\64\3\64\5\64\u0641\n\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u0651\n\64\3\64\3\64\3\64"+
		"\3\64\5\64\u0657\n\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64"+
		"\u0662\n\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64"+
		"\u066f\n\64\3\64\5\64\u0672\n\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5"+
		"\64\u067b\n\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\5\64\u0688\n\64\3\64\3\64\3\64\3\64\3\64\5\64\u068f\n\64\3\65\3\65\3"+
		"\65\3\66\3\66\3\66\3\67\3\67\3\67\6\67\u069a\n\67\r\67\16\67\u069b\38"+
		"\38\38\68\u06a1\n8\r8\168\u06a2\39\39\59\u06a7\n9\39\39\39\59\u06ac\n"+
		"9\79\u06ae\n9\f9\169\u06b1\139\3:\3:\3;\3;\3;\3;\3;\3;\3;\5;\u06bc\n;"+
		"\3<\3<\3<\3<\3<\3<\3<\5<\u06c5\n<\3=\3=\3=\3=\3=\3=\3=\5=\u06ce\n=\3>"+
		"\3>\3>\5>\u06d3\n>\3>\3>\5>\u06d7\n>\3>\5>\u06da\n>\3>\3>\3>\3>\3>\5>"+
		"\u06e1\n>\3>\3>\3>\3>\7>\u06e7\n>\f>\16>\u06ea\13>\3>\5>\u06ed\n>\3>\3"+
		">\5>\u06f1\n>\3>\5>\u06f4\n>\3>\3>\3>\3>\5>\u06fa\n>\3>\5>\u06fd\n>\5"+
		">\u06ff\n>\3?\3?\3?\3?\3?\7?\u0706\n?\f?\16?\u0709\13?\3@\3@\5@\u070d"+
		"\n@\3@\3@\5@\u0711\n@\3@\3@\5@\u0715\n@\3@\5@\u0718\n@\3A\3A\3A\3A\3A"+
		"\3A\3A\7A\u0721\nA\fA\16A\u0724\13A\3A\3A\5A\u0728\nA\3B\3B\5B\u072c\n"+
		"B\3B\3B\3B\7B\u0731\nB\fB\16B\u0734\13B\3B\3B\3B\3B\7B\u073a\nB\fB\16"+
		"B\u073d\13B\3B\5B\u0740\nB\5B\u0742\nB\3B\3B\5B\u0746\nB\3B\3B\3B\3B\3"+
		"B\7B\u074d\nB\fB\16B\u0750\13B\3B\3B\5B\u0754\nB\5B\u0756\nB\3B\3B\3B"+
		"\3B\3B\7B\u075d\nB\fB\16B\u0760\13B\3B\3B\3B\3B\3B\3B\7B\u0768\nB\fB\16"+
		"B\u076b\13B\3B\3B\7B\u076f\nB\fB\16B\u0772\13B\5B\u0774\nB\3C\3C\3C\3"+
		"C\3C\5C\u077b\nC\3D\3D\3D\3D\3D\7D\u0782\nD\fD\16D\u0785\13D\3D\3D\5D"+
		"\u0789\nD\3E\5E\u078c\nE\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\5I\u0798\nI\3J"+
		"\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U"+
		"\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3]\3]\3]\3]\3]\5]\u07c7"+
		"\n]\3]\2\3P^\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\2\25\5\2<<GGTT\4\2\61\61DD\4\2\7\7ll\3\2\u0086\u0087\4\2\37\37@@\4\2"+
		"$$>>\7\2\33\33JJSS||\177\177\4\2\t\t\16\17\3\2\n\13\3\2\20\23\3\2\24\27"+
		"\6\2OOcceexx\4\2==\u008e\u008e\5\2\33\33JJ\177\177\4\2\u0081\u0081\u009b"+
		"\u009b\6\2\668jj\u00ab\u00ab\u00ad\u00ae\4\2\n\fhh\4\2\u00aa\u00aa\u00ad"+
		"\u00ad\4\2\33\u0080\u0082\u0097\2\u08f6\2\u00be\3\2\2\2\4\u00c3\3\2\2"+
		"\2\6\u00c9\3\2\2\2\b\u00e3\3\2\2\2\n\u0105\3\2\2\2\f\u0117\3\2\2\2\16"+
		"\u0120\3\2\2\2\20\u0128\3\2\2\2\22\u0132\3\2\2\2\24\u0145\3\2\2\2\26\u0169"+
		"\3\2\2\2\30\u0189\3\2\2\2\32\u01b2\3\2\2\2\34\u01f7\3\2\2\2\36\u020a\3"+
		"\2\2\2 \u0228\3\2\2\2\"\u0232\3\2\2\2$\u024f\3\2\2\2&\u0255\3\2\2\2(\u0262"+
		"\3\2\2\2*\u026f\3\2\2\2,\u027c\3\2\2\2.\u0295\3\2\2\2\60\u02b5\3\2\2\2"+
		"\62\u02ff\3\2\2\2\64\u030e\3\2\2\2\66\u031b\3\2\2\28\u0321\3\2\2\2:\u032f"+
		"\3\2\2\2<\u033e\3\2\2\2>\u0361\3\2\2\2@\u03ca\3\2\2\2B\u03cd\3\2\2\2D"+
		"\u03f0\3\2\2\2F\u0426\3\2\2\2H\u0428\3\2\2\2J\u0433\3\2\2\2L\u0445\3\2"+
		"\2\2N\u046d\3\2\2\2P\u04bc\3\2\2\2R\u0525\3\2\2\2T\u0555\3\2\2\2V\u055f"+
		"\3\2\2\2X\u0569\3\2\2\2Z\u0591\3\2\2\2\\\u05a9\3\2\2\2^\u05b3\3\2\2\2"+
		"`\u05be\3\2\2\2b\u05c0\3\2\2\2d\u05e2\3\2\2\2f\u068e\3\2\2\2h\u0690\3"+
		"\2\2\2j\u0693\3\2\2\2l\u0696\3\2\2\2n\u069d\3\2\2\2p\u06a4\3\2\2\2r\u06b2"+
		"\3\2\2\2t\u06b4\3\2\2\2v\u06c4\3\2\2\2x\u06cd\3\2\2\2z\u06fe\3\2\2\2|"+
		"\u0700\3\2\2\2~\u0717\3\2\2\2\u0080\u0727\3\2\2\2\u0082\u0773\3\2\2\2"+
		"\u0084\u077a\3\2\2\2\u0086\u077c\3\2\2\2\u0088\u078b\3\2\2\2\u008a\u078f"+
		"\3\2\2\2\u008c\u0791\3\2\2\2\u008e\u0793\3\2\2\2\u0090\u0797\3\2\2\2\u0092"+
		"\u0799\3\2\2\2\u0094\u079b\3\2\2\2\u0096\u079d\3\2\2\2\u0098\u079f\3\2"+
		"\2\2\u009a\u07a1\3\2\2\2\u009c\u07a3\3\2\2\2\u009e\u07a5\3\2\2\2\u00a0"+
		"\u07a7\3\2\2\2\u00a2\u07a9\3\2\2\2\u00a4\u07ab\3\2\2\2\u00a6\u07ad\3\2"+
		"\2\2\u00a8\u07af\3\2\2\2\u00aa\u07b1\3\2\2\2\u00ac\u07b3\3\2\2\2\u00ae"+
		"\u07b5\3\2\2\2\u00b0\u07b7\3\2\2\2\u00b2\u07b9\3\2\2\2\u00b4\u07bb\3\2"+
		"\2\2\u00b6\u07bd\3\2\2\2\u00b8\u07c6\3\2\2\2\u00ba\u00bd\5\6\4\2\u00bb"+
		"\u00bd\5\4\3\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2"+
		"\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c1\u00c2\7\2\2\3\u00c2\3\3\2\2\2\u00c3\u00c4\7\u00b2"+
		"\2\2\u00c4\u00c5\b\3\1\2\u00c5\5\3\2\2\2\u00c6\u00c8\7\3\2\2\u00c7\u00c6"+
		"\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00d5\5\b\5\2\u00cd\u00cf\7\3"+
		"\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\5\b\5\2\u00d3\u00ce\3\2"+
		"\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00db\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00da\7\3\2\2\u00d9\u00d8\3\2"+
		"\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\7\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00e1\7I\2\2\u00df\u00e0\7t\2\2\u00e0"+
		"\u00e2\7q\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2"+
		"\2\2\u00e3\u00de\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u0103\3\2\2\2\u00e5"+
		"\u0104\5\n\6\2\u00e6\u0104\5\f\7\2\u00e7\u0104\5\16\b\2\u00e8\u0104\5"+
		"\20\t\2\u00e9\u0104\5\22\n\2\u00ea\u0104\5\24\13\2\u00eb\u0104\5\26\f"+
		"\2\u00ec\u0104\5\30\r\2\u00ed\u0104\5\32\16\2\u00ee\u0104\5\34\17\2\u00ef"+
		"\u0104\5\36\20\2\u00f0\u0104\5 \21\2\u00f1\u0104\5\"\22\2\u00f2\u0104"+
		"\5$\23\2\u00f3\u0104\5&\24\2\u00f4\u0104\5(\25\2\u00f5\u0104\5*\26\2\u00f6"+
		"\u0104\5,\27\2\u00f7\u0104\5.\30\2\u00f8\u0104\5\60\31\2\u00f9\u0104\5"+
		"\62\32\2\u00fa\u0104\5\64\33\2\u00fb\u0104\5\66\34\2\u00fc\u0104\58\35"+
		"\2\u00fd\u0104\5:\36\2\u00fe\u0104\5<\37\2\u00ff\u0104\5> \2\u0100\u0104"+
		"\5B\"\2\u0101\u0104\5D#\2\u0102\u0104\5F$\2\u0103\u00e5\3\2\2\2\u0103"+
		"\u00e6\3\2\2\2\u0103\u00e7\3\2\2\2\u0103\u00e8\3\2\2\2\u0103\u00e9\3\2"+
		"\2\2\u0103\u00ea\3\2\2\2\u0103\u00eb\3\2\2\2\u0103\u00ec\3\2\2\2\u0103"+
		"\u00ed\3\2\2\2\u0103\u00ee\3\2\2\2\u0103\u00ef\3\2\2\2\u0103\u00f0\3\2"+
		"\2\2\u0103\u00f1\3\2\2\2\u0103\u00f2\3\2\2\2\u0103\u00f3\3\2\2\2\u0103"+
		"\u00f4\3\2\2\2\u0103\u00f5\3\2\2\2\u0103\u00f6\3\2\2\2\u0103\u00f7\3\2"+
		"\2\2\u0103\u00f8\3\2\2\2\u0103\u00f9\3\2\2\2\u0103\u00fa\3\2\2\2\u0103"+
		"\u00fb\3\2\2\2\u0103\u00fc\3\2\2\2\u0103\u00fd\3\2\2\2\u0103\u00fe\3\2"+
		"\2\2\u0103\u00ff\3\2\2\2\u0103\u0100\3\2\2\2\u0103\u0101\3\2\2\2\u0103"+
		"\u0102\3\2\2\2\u0104\t\3\2\2\2\u0105\u0106\7 \2\2\u0106\u010a\7\u0085"+
		"\2\2\u0107\u0108\5\u009aN\2\u0108\u0109\7\4\2\2\u0109\u010b\3\2\2\2\u010a"+
		"\u0107\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u0115\5\u009c"+
		"O\2\u010d\u010e\7{\2\2\u010e\u010f\7\u0089\2\2\u010f\u0116\5\u00a0Q\2"+
		"\u0110\u0112\7\35\2\2\u0111\u0113\7\60\2\2\u0112\u0111\3\2\2\2\u0112\u0113"+
		"\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\5H%\2\u0115\u010d\3\2\2\2\u0115"+
		"\u0110\3\2\2\2\u0116\13\3\2\2\2\u0117\u011e\7!\2\2\u0118\u011f\5\u009a"+
		"N\2\u0119\u011f\5\u009eP\2\u011a\u011b\5\u009aN\2\u011b\u011c\7\4\2\2"+
		"\u011c\u011d\5\u009eP\2\u011d\u011f\3\2\2\2\u011e\u0118\3\2\2\2\u011e"+
		"\u0119\3\2\2\2\u011e\u011a\3\2\2\2\u011e\u011f\3\2\2\2\u011f\r\3\2\2\2"+
		"\u0120\u0122\7%\2\2\u0121\u0123\79\2\2\u0122\u0121\3\2\2\2\u0122\u0123"+
		"\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\5P)\2\u0125\u0126\7#\2\2\u0126"+
		"\u0127\5\u009aN\2\u0127\17\3\2\2\2\u0128\u012a\7(\2\2\u0129\u012b\t\2"+
		"\2\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0130\3\2\2\2\u012c"+
		"\u012e\7\u008a\2\2\u012d\u012f\5\u00b6\\\2\u012e\u012d\3\2\2\2\u012e\u012f"+
		"\3\2\2\2\u012f\u0131\3\2\2\2\u0130\u012c\3\2\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\21\3\2\2\2\u0132\u0137\t\3\2\2\u0133\u0135\7\u008a\2\2\u0134\u0136\5"+
		"\u00b6\\\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0138\3\2\2\2"+
		"\u0137\u0133\3\2\2\2\u0137\u0138\3\2\2\2\u0138\23\3\2\2\2\u0139\u013b"+
		"\7\u0096\2\2\u013a\u013c\7v\2\2\u013b\u013a\3\2\2\2\u013b\u013c\3\2\2"+
		"\2\u013c\u013d\3\2\2\2\u013d\u0142\5b\62\2\u013e\u013f\7\7\2\2\u013f\u0141"+
		"\5b\62\2\u0140\u013e\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0139\3\2"+
		"\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0151\5\u0082B\2\u0148"+
		"\u014a\7\u008c\2\2\u0149\u014b\7\37\2\2\u014a\u0149\3\2\2\2\u014a\u014b"+
		"\3\2\2\2\u014b\u014f\3\2\2\2\u014c\u014f\7\\\2\2\u014d\u014f\7F\2\2\u014e"+
		"\u0148\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014d\3\2\2\2\u014f\u0150\3\2"+
		"\2\2\u0150\u0152\5\u0082B\2\u0151\u014e\3\2\2\2\u0152\u0153\3\2\2\2\u0153"+
		"\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u015f\3\2\2\2\u0155\u0156\7o"+
		"\2\2\u0156\u0157\7*\2\2\u0157\u015c\5^\60\2\u0158\u0159\7\7\2\2\u0159"+
		"\u015b\5^\60\2\u015a\u0158\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2"+
		"\2\2\u015c\u015d\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015f"+
		"\u0155\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0167\3\2\2\2\u0161\u0162\7d"+
		"\2\2\u0162\u0165\5P)\2\u0163\u0164\t\4\2\2\u0164\u0166\5P)\2\u0165\u0163"+
		"\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0168\3\2\2\2\u0167\u0161\3\2\2\2\u0167"+
		"\u0168\3\2\2\2\u0168\25\3\2\2\2\u0169\u016b\7\64\2\2\u016a\u016c\7\u008d"+
		"\2\2\u016b\u016a\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\3\2\2\2\u016d"+
		"\u0171\7V\2\2\u016e\u016f\7R\2\2\u016f\u0170\7h\2\2\u0170\u0172\7H\2\2"+
		"\u0171\u016e\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0176\3\2\2\2\u0173\u0174"+
		"\5\u009aN\2\u0174\u0175\7\4\2\2\u0175\u0177\3\2\2\2\u0176\u0173\3\2\2"+
		"\2\u0176\u0177\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\5\u00a8U\2\u0179"+
		"\u017a\7m\2\2\u017a\u017b\5\u009cO\2\u017b\u017c\7\5\2\2\u017c\u0181\5"+
		"V,\2\u017d\u017e\7\7\2\2\u017e\u0180\5V,\2\u017f\u017d\3\2\2\2\u0180\u0183"+
		"\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184\3\2\2\2\u0183"+
		"\u0181\3\2\2\2\u0184\u0187\7\6\2\2\u0185\u0186\7\u0095\2\2\u0186\u0188"+
		"\5P)\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\27\3\2\2\2\u0189"+
		"\u018b\7\64\2\2\u018a\u018c\t\5\2\2\u018b\u018a\3\2\2\2\u018b\u018c\3"+
		"\2\2\2\u018c\u018d\3\2\2\2\u018d\u0191\7\u0085\2\2\u018e\u018f\7R\2\2"+
		"\u018f\u0190\7h\2\2\u0190\u0192\7H\2\2\u0191\u018e\3\2\2\2\u0191\u0192"+
		"\3\2\2\2\u0192\u0196\3\2\2\2\u0193\u0194\5\u009aN\2\u0194\u0195\7\4\2"+
		"\2\u0195\u0197\3\2\2\2\u0196\u0193\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198"+
		"\3\2\2\2\u0198\u01b0\5\u009cO\2\u0199\u019a\7\5\2\2\u019a\u019f\5H%\2"+
		"\u019b\u019c\7\7\2\2\u019c\u019e\5H%\2\u019d\u019b\3\2\2\2\u019e\u01a1"+
		"\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a6\3\2\2\2\u01a1"+
		"\u019f\3\2\2\2\u01a2\u01a3\7\7\2\2\u01a3\u01a5\5X-\2\u01a4\u01a2\3\2\2"+
		"\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a9"+
		"\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01ac\7\6\2\2\u01aa\u01ab\7\u0097\2"+
		"\2\u01ab\u01ad\7\u00aa\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad"+
		"\u01b1\3\2\2\2\u01ae\u01af\7#\2\2\u01af\u01b1\5> \2\u01b0\u0199\3\2\2"+
		"\2\u01b0\u01ae\3\2\2\2\u01b1\31\3\2\2\2\u01b2\u01b4\7\64\2\2\u01b3\u01b5"+
		"\t\5\2\2\u01b4\u01b3\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"\u01ba\7\u008b\2\2\u01b7\u01b8\7R\2\2\u01b8\u01b9\7h\2\2\u01b9\u01bb\7"+
		"H\2\2\u01ba\u01b7\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bf\3\2\2\2\u01bc"+
		"\u01bd\5\u009aN\2\u01bd\u01be\7\4\2\2\u01be\u01c0\3\2\2\2\u01bf\u01bc"+
		"\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c6\5\u00aaV"+
		"\2\u01c2\u01c7\7\'\2\2\u01c3\u01c7\7\36\2\2\u01c4\u01c5\7[\2\2\u01c5\u01c7"+
		"\7k\2\2\u01c6\u01c2\3\2\2\2\u01c6\u01c3\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6"+
		"\u01c7\3\2\2\2\u01c7\u01d6\3\2\2\2\u01c8\u01d7\7=\2\2\u01c9\u01d7\7Z\2"+
		"\2\u01ca\u01d4\7\u008e\2\2\u01cb\u01cc\7k\2\2\u01cc\u01d1\5\u00a2R\2\u01cd"+
		"\u01ce\7\7\2\2\u01ce\u01d0\5\u00a2R\2\u01cf\u01cd\3\2\2\2\u01d0\u01d3"+
		"\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3"+
		"\u01d1\3\2\2\2\u01d4\u01cb\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d7\3\2"+
		"\2\2\u01d6\u01c8\3\2\2\2\u01d6\u01c9\3\2\2\2\u01d6\u01ca\3\2\2\2\u01d7"+
		"\u01d8\3\2\2\2\u01d8\u01dc\7m\2\2\u01d9\u01da\5\u009aN\2\u01da\u01db\7"+
		"\4\2\2\u01db\u01dd\3\2\2\2\u01dc\u01d9\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd"+
		"\u01de\3\2\2\2\u01de\u01e2\5\u009cO\2\u01df\u01e0\7K\2\2\u01e0\u01e1\7"+
		"B\2\2\u01e1\u01e3\7\u0080\2\2\u01e2\u01df\3\2\2\2\u01e2\u01e3\3\2\2\2"+
		"\u01e3\u01e6\3\2\2\2\u01e4\u01e5\7\u0094\2\2\u01e5\u01e7\5P)\2\u01e6\u01e4"+
		"\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01f1\7(\2\2\u01e9"+
		"\u01ee\5B\"\2\u01ea\u01ee\5\60\31\2\u01eb\u01ee\5 \21\2\u01ec\u01ee\5"+
		"> \2\u01ed\u01e9\3\2\2\2\u01ed\u01ea\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed"+
		"\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\7\3\2\2\u01f0\u01f2\3\2"+
		"\2\2\u01f1\u01ed\3\2\2\2\u01f2\u01f3\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3"+
		"\u01f4\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\7D\2\2\u01f6\33\3\2\2\2"+
		"\u01f7\u01f9\7\64\2\2\u01f8\u01fa\t\5\2\2\u01f9\u01f8\3\2\2\2\u01f9\u01fa"+
		"\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01ff\7\u0092\2\2\u01fc\u01fd\7R\2"+
		"\2\u01fd\u01fe\7h\2\2\u01fe\u0200\7H\2\2\u01ff\u01fc\3\2\2\2\u01ff\u0200"+
		"\3\2\2\2\u0200\u0204\3\2\2\2\u0201\u0202\5\u009aN\2\u0202\u0203\7\4\2"+
		"\2\u0203\u0205\3\2\2\2\u0204\u0201\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0206"+
		"\3\2\2\2\u0206\u0207\5\u00acW\2\u0207\u0208\7#\2\2\u0208\u0209\5> \2\u0209"+
		"\35\3\2\2\2\u020a\u020b\7\64\2\2\u020b\u020c\7\u0093\2\2\u020c\u0210\7"+
		"\u0085\2\2\u020d\u020e\7R\2\2\u020e\u020f\7h\2\2\u020f\u0211\7H\2\2\u0210"+
		"\u020d\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0215\3\2\2\2\u0212\u0213\5\u009a"+
		"N\2\u0213\u0214\7\4\2\2\u0214\u0216\3\2\2\2\u0215\u0212\3\2\2\2\u0215"+
		"\u0216\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0218\5\u009cO\2\u0218\u0219"+
		"\7\u008f\2\2\u0219\u0225\5\u00aeX\2\u021a\u021b\7\5\2\2\u021b\u0220\5"+
		"\u0090I\2\u021c\u021d\7\7\2\2\u021d\u021f\5\u0090I\2\u021e\u021c\3\2\2"+
		"\2\u021f\u0222\3\2\2\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0223"+
		"\3\2\2\2\u0222\u0220\3\2\2\2\u0223\u0224\7\6\2\2\u0224\u0226\3\2\2\2\u0225"+
		"\u021a\3\2\2\2\u0225\u0226\3\2\2\2\u0226\37\3\2\2\2\u0227\u0229\5Z.\2"+
		"\u0228\u0227\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022b"+
		"\7=\2\2\u022b\u022c\7M\2\2\u022c\u022f\5\\/\2\u022d\u022e\7\u0095\2\2"+
		"\u022e\u0230\5P)\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230!\3\2"+
		"\2\2\u0231\u0233\5Z.\2\u0232\u0231\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0234"+
		"\3\2\2\2\u0234\u0235\7=\2\2\u0235\u0236\7M\2\2\u0236\u0239\5\\/\2\u0237"+
		"\u0238\7\u0095\2\2\u0238\u023a\5P)\2\u0239\u0237\3\2\2\2\u0239\u023a\3"+
		"\2\2\2\u023a\u024d\3\2\2\2\u023b\u023c\7o\2\2\u023c\u023d\7*\2\2\u023d"+
		"\u0242\5^\60\2\u023e\u023f\7\7\2\2\u023f\u0241\5^\60\2\u0240\u023e\3\2"+
		"\2\2\u0241\u0244\3\2\2\2\u0242\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243"+
		"\u0246\3\2\2\2\u0244\u0242\3\2\2\2\u0245\u023b\3\2\2\2\u0245\u0246\3\2"+
		"\2\2\u0246\u0247\3\2\2\2\u0247\u0248\7d\2\2\u0248\u024b\5P)\2\u0249\u024a"+
		"\t\4\2\2\u024a\u024c\5P)\2\u024b\u0249\3\2\2\2\u024b\u024c\3\2\2\2\u024c"+
		"\u024e\3\2\2\2\u024d\u0245\3\2\2\2\u024d\u024e\3\2\2\2\u024e#\3\2\2\2"+
		"\u024f\u0251\7?\2\2\u0250\u0252\79\2\2\u0251\u0250\3\2\2\2\u0251\u0252"+
		"\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0254\5\u009aN\2\u0254%\3\2\2\2\u0255"+
		"\u0256\7A\2\2\u0256\u0259\7V\2\2\u0257\u0258\7R\2\2\u0258\u025a\7H\2\2"+
		"\u0259\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025e\3\2\2\2\u025b\u025c"+
		"\5\u009aN\2\u025c\u025d\7\4\2\2\u025d\u025f\3\2\2\2\u025e\u025b\3\2\2"+
		"\2\u025e\u025f\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0261\5\u00a8U\2\u0261"+
		"\'\3\2\2\2\u0262\u0263\7A\2\2\u0263\u0266\7\u0085\2\2\u0264\u0265\7R\2"+
		"\2\u0265\u0267\7H\2\2\u0266\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u026b"+
		"\3\2\2\2\u0268\u0269\5\u009aN\2\u0269\u026a\7\4\2\2\u026a\u026c\3\2\2"+
		"\2\u026b\u0268\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026e"+
		"\5\u009cO\2\u026e)\3\2\2\2\u026f\u0270\7A\2\2\u0270\u0273\7\u008b\2\2"+
		"\u0271\u0272\7R\2\2\u0272\u0274\7H\2\2\u0273\u0271\3\2\2\2\u0273\u0274"+
		"\3\2\2\2\u0274\u0278\3\2\2\2\u0275\u0276\5\u009aN\2\u0276\u0277\7\4\2"+
		"\2\u0277\u0279\3\2\2\2\u0278\u0275\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027a"+
		"\3\2\2\2\u027a\u027b\5\u00aaV\2\u027b+\3\2\2\2\u027c\u027d\7A\2\2\u027d"+
		"\u0280\7\u0092\2\2\u027e\u027f\7R\2\2\u027f\u0281\7H\2\2\u0280\u027e\3"+
		"\2\2\2\u0280\u0281\3\2\2\2\u0281\u0285\3\2\2\2\u0282\u0283\5\u009aN\2"+
		"\u0283\u0284\7\4\2\2\u0284\u0286\3\2\2\2\u0285\u0282\3\2\2\2\u0285\u0286"+
		"\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0288\5\u00acW\2\u0288-\3\2\2\2\u0289"+
		"\u028b\7\u0096\2\2\u028a\u028c\7v\2\2\u028b\u028a\3\2\2\2\u028b\u028c"+
		"\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u0292\5b\62\2\u028e\u028f\7\7\2\2\u028f"+
		"\u0291\5b\62\2\u0290\u028e\3\2\2\2\u0291\u0294\3\2\2\2\u0292\u0290\3\2"+
		"\2\2\u0292\u0293\3\2\2\2\u0293\u0296\3\2\2\2\u0294\u0292\3\2\2\2\u0295"+
		"\u0289\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u029d\5\u0082"+
		"B\2\u0298\u0299\5\u0084C\2\u0299\u029a\5\u0082B\2\u029a\u029c\3\2\2\2"+
		"\u029b\u0298\3\2\2\2\u029c\u029f\3\2\2\2\u029d\u029b\3\2\2\2\u029d\u029e"+
		"\3\2\2\2\u029e\u02aa\3\2\2\2\u029f\u029d\3\2\2\2\u02a0\u02a1\7o\2\2\u02a1"+
		"\u02a2\7*\2\2\u02a2\u02a7\5^\60\2\u02a3\u02a4\7\7\2\2\u02a4\u02a6\5^\60"+
		"\2\u02a5\u02a3\3\2\2\2\u02a6\u02a9\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a7\u02a8"+
		"\3\2\2\2\u02a8\u02ab\3\2\2\2\u02a9\u02a7\3\2\2\2\u02aa\u02a0\3\2\2\2\u02aa"+
		"\u02ab\3\2\2\2\u02ab\u02b2\3\2\2\2\u02ac\u02ad\7d\2\2\u02ad\u02b0\5P)"+
		"\2\u02ae\u02af\t\4\2\2\u02af\u02b1\5P)\2\u02b0\u02ae\3\2\2\2\u02b0\u02b1"+
		"\3\2\2\2\u02b1\u02b3\3\2\2\2\u02b2\u02ac\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3"+
		"/\3\2\2\2\u02b4\u02b6\5Z.\2\u02b5\u02b4\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6"+
		"\u02c8\3\2\2\2\u02b7\u02c9\7Z\2\2\u02b8\u02c9\7|\2\2\u02b9\u02ba\7Z\2"+
		"\2\u02ba\u02bb\7n\2\2\u02bb\u02c9\7|\2\2\u02bc\u02bd\7Z\2\2\u02bd\u02be"+
		"\7n\2\2\u02be\u02c9\7\177\2\2\u02bf\u02c0\7Z\2\2\u02c0\u02c1\7n\2\2\u02c1"+
		"\u02c9\7\33\2\2\u02c2\u02c3\7Z\2\2\u02c3\u02c4\7n\2\2\u02c4\u02c9\7J\2"+
		"\2\u02c5\u02c6\7Z\2\2\u02c6\u02c7\7n\2\2\u02c7\u02c9\7S\2\2\u02c8\u02b7"+
		"\3\2\2\2\u02c8\u02b8\3\2\2\2\u02c8\u02b9\3\2\2\2\u02c8\u02bc\3\2\2\2\u02c8"+
		"\u02bf\3\2\2\2\u02c8\u02c2\3\2\2\2\u02c8\u02c5\3\2\2\2\u02c9\u02ca\3\2"+
		"\2\2\u02ca\u02ce\7]\2\2\u02cb\u02cc\5\u009aN\2\u02cc\u02cd\7\4\2\2\u02cd"+
		"\u02cf\3\2\2\2\u02ce\u02cb\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d0\3\2"+
		"\2\2\u02d0\u02dc\5\u009cO\2\u02d1\u02d2\7\5\2\2\u02d2\u02d7\5\u00a2R\2"+
		"\u02d3\u02d4\7\7\2\2\u02d4\u02d6\5\u00a2R\2\u02d5\u02d3\3\2\2\2\u02d6"+
		"\u02d9\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8\u02da\3\2"+
		"\2\2\u02d9\u02d7\3\2\2\2\u02da\u02db\7\6\2\2\u02db\u02dd\3\2\2\2\u02dc"+
		"\u02d1\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02fd\3\2\2\2\u02de\u02df\7\u0091"+
		"\2\2\u02df\u02e0\7\5\2\2\u02e0\u02e5\5P)\2\u02e1\u02e2\7\7\2\2\u02e2\u02e4"+
		"\5P)\2\u02e3\u02e1\3\2\2\2\u02e4\u02e7\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e5"+
		"\u02e6\3\2\2\2\u02e6\u02e8\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e8\u02f7\7\6"+
		"\2\2\u02e9\u02ea\7\7\2\2\u02ea\u02eb\7\5\2\2\u02eb\u02f0\5P)\2\u02ec\u02ed"+
		"\7\7\2\2\u02ed\u02ef\5P)\2\u02ee\u02ec\3\2\2\2\u02ef\u02f2\3\2\2\2\u02f0"+
		"\u02ee\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f3\3\2\2\2\u02f2\u02f0\3\2"+
		"\2\2\u02f3\u02f4\7\6\2\2\u02f4\u02f6\3\2\2\2\u02f5\u02e9\3\2\2\2\u02f6"+
		"\u02f9\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02fe\3\2"+
		"\2\2\u02f9\u02f7\3\2\2\2\u02fa\u02fe\5> \2\u02fb\u02fc\7:\2\2\u02fc\u02fe"+
		"\7\u0091\2\2\u02fd\u02de\3\2\2\2\u02fd\u02fa\3\2\2\2\u02fd\u02fb\3\2\2"+
		"\2\u02fe\61\3\2\2\2\u02ff\u0303\7r\2\2\u0300\u0301\5\u009aN\2\u0301\u0302"+
		"\7\4\2\2\u0302\u0304\3\2\2\2\u0303\u0300\3\2\2\2\u0303\u0304\3\2\2\2\u0304"+
		"\u0305\3\2\2\2\u0305\u030c\5\u00b0Y\2\u0306\u0307\7\b\2\2\u0307\u030d"+
		"\5`\61\2\u0308\u0309\7\5\2\2\u0309\u030a\5`\61\2\u030a\u030b\7\6\2\2\u030b"+
		"\u030d\3\2\2\2\u030c\u0306\3\2\2\2\u030c\u0308\3\2\2\2\u030c\u030d\3\2"+
		"\2\2\u030d\63\3\2\2\2\u030e\u0319\7y\2\2\u030f\u031a\5\u00a4S\2\u0310"+
		"\u0311\5\u009aN\2\u0311\u0312\7\4\2\2\u0312\u0314\3\2\2\2\u0313\u0310"+
		"\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0317\3\2\2\2\u0315\u0318\5\u009cO"+
		"\2\u0316\u0318\5\u00a8U\2\u0317\u0315\3\2\2\2\u0317\u0316\3\2\2\2\u0318"+
		"\u031a\3\2\2\2\u0319\u030f\3\2\2\2\u0319\u0313\3\2\2\2\u0319\u031a\3\2"+
		"\2\2\u031a\65\3\2\2\2\u031b\u031d\7z\2\2\u031c\u031e\7\u0082\2\2\u031d"+
		"\u031c\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0320\5\u00b2"+
		"Z\2\u0320\67\3\2\2\2\u0321\u0326\7\177\2\2\u0322\u0324\7\u008a\2\2\u0323"+
		"\u0325\5\u00b6\\\2\u0324\u0323\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0327"+
		"\3\2\2\2\u0326\u0322\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u032d\3\2\2\2\u0328"+
		"\u032a\7\u0089\2\2\u0329\u032b\7\u0082\2\2\u032a\u0329\3\2\2\2\u032a\u032b"+
		"\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u032e\5\u00b2Z\2\u032d\u0328\3\2\2"+
		"\2\u032d\u032e\3\2\2\2\u032e9\3\2\2\2\u032f\u0330\7\u0082\2\2\u0330\u0331"+
		"\5\u00b2Z\2\u0331;\3\2\2\2\u0332\u0334\7\u0096\2\2\u0333\u0335\7v\2\2"+
		"\u0334\u0333\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u033b"+
		"\5b\62\2\u0337\u0338\7\7\2\2\u0338\u033a\5b\62\2\u0339\u0337\3\2\2\2\u033a"+
		"\u033d\3\2\2\2\u033b\u0339\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u033f\3\2"+
		"\2\2\u033d\u033b\3\2\2\2\u033e\u0332\3\2\2\2\u033e\u033f\3\2\2\2\u033f"+
		"\u0340\3\2\2\2\u0340\u034b\5\u0082B\2\u0341\u0342\7o\2\2\u0342\u0343\7"+
		"*\2\2\u0343\u0348\5^\60\2\u0344\u0345\7\7\2\2\u0345\u0347\5^\60\2\u0346"+
		"\u0344\3\2\2\2\u0347\u034a\3\2\2\2\u0348\u0346\3\2\2\2\u0348\u0349\3\2"+
		"\2\2\u0349\u034c\3\2\2\2\u034a\u0348\3\2\2\2\u034b\u0341\3\2\2\2\u034b"+
		"\u034c\3\2\2\2\u034c\u0353\3\2\2\2\u034d\u034e\7d\2\2\u034e\u0351\5P)"+
		"\2\u034f\u0350\t\4\2\2\u0350\u0352\5P)\2\u0351\u034f\3\2\2\2\u0351\u0352"+
		"\3\2\2\2\u0352\u0354\3\2\2\2\u0353\u034d\3\2\2\2\u0353\u0354\3\2\2\2\u0354"+
		"=\3\2\2\2\u0355\u0357\7\u0096\2\2\u0356\u0358\7v\2\2\u0357\u0356\3\2\2"+
		"\2\u0357\u0358\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u035e\5b\62\2\u035a\u035b"+
		"\7\7\2\2\u035b\u035d\5b\62\2\u035c\u035a\3\2\2\2\u035d\u0360\3\2\2\2\u035e"+
		"\u035c\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u0362\3\2\2\2\u0360\u035e\3\2"+
		"\2\2\u0361\u0355\3\2\2\2\u0361\u0362\3\2\2\2\u0362\u0363\3\2\2\2\u0363"+
		"\u0369\5@!\2\u0364\u0365\5\u0084C\2\u0365\u0366\5@!\2\u0366\u0368\3\2"+
		"\2\2\u0367\u0364\3\2\2\2\u0368\u036b\3\2\2\2\u0369\u0367\3\2\2\2\u0369"+
		"\u036a\3\2\2\2\u036a\u0376\3\2\2\2\u036b\u0369\3\2\2\2\u036c\u036d\7o"+
		"\2\2\u036d\u036e\7*\2\2\u036e\u0373\5^\60\2\u036f\u0370\7\7\2\2\u0370"+
		"\u0372\5^\60\2\u0371\u036f\3\2\2\2\u0372\u0375\3\2\2\2\u0373\u0371\3\2"+
		"\2\2\u0373\u0374\3\2\2\2\u0374\u0377\3\2\2\2\u0375\u0373\3\2\2\2\u0376"+
		"\u036c\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u037e\3\2\2\2\u0378\u0379\7d"+
		"\2\2\u0379\u037c\5P)\2\u037a\u037b\t\4\2\2\u037b\u037d\5P)\2\u037c\u037a"+
		"\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u037f\3\2\2\2\u037e\u0378\3\2\2\2\u037e"+
		"\u037f\3\2\2\2\u037f?\3\2\2\2\u0380\u0382\7\u0083\2\2\u0381\u0383\t\6"+
		"\2\2\u0382\u0381\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u0384\3\2\2\2\u0384"+
		"\u0389\5d\63\2\u0385\u0386\7\7\2\2\u0386\u0388\5d\63\2\u0387\u0385\3\2"+
		"\2\2\u0388\u038b\3\2\2\2\u0389\u0387\3\2\2\2\u0389\u038a\3\2\2\2\u038a"+
		"\u0398\3\2\2\2\u038b\u0389\3\2\2\2\u038c\u0396\7M\2\2\u038d\u0392\5z>"+
		"\2\u038e\u038f\7\7\2\2\u038f\u0391\5z>\2\u0390\u038e\3\2\2\2\u0391\u0394"+
		"\3\2\2\2\u0392\u0390\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u0397\3\2\2\2\u0394"+
		"\u0392\3\2\2\2\u0395\u0397\5|?\2\u0396\u038d\3\2\2\2\u0396\u0395\3\2\2"+
		"\2\u0397\u0399\3\2\2\2\u0398\u038c\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u039c"+
		"\3\2\2\2\u039a\u039b\7\u0095\2\2\u039b\u039d\5P)\2\u039c\u039a\3\2\2\2"+
		"\u039c\u039d\3\2\2\2\u039d\u03ac\3\2\2\2\u039e\u039f\7P\2\2\u039f\u03a0"+
		"\7*\2\2\u03a0\u03a5\5P)\2\u03a1\u03a2\7\7\2\2\u03a2\u03a4\5P)\2\u03a3"+
		"\u03a1\3\2\2\2\u03a4\u03a7\3\2\2\2\u03a5\u03a3\3\2\2\2\u03a5\u03a6\3\2"+
		"\2\2\u03a6\u03aa\3\2\2\2\u03a7\u03a5\3\2\2\2\u03a8\u03a9\7Q\2\2\u03a9"+
		"\u03ab\5P)\2\u03aa\u03a8\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03ad\3\2\2"+
		"\2\u03ac\u039e\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad\u03cb\3\2\2\2\u03ae\u03af"+
		"\7\u0091\2\2\u03af\u03b0\7\5\2\2\u03b0\u03b5\5P)\2\u03b1\u03b2\7\7\2\2"+
		"\u03b2\u03b4\5P)\2\u03b3\u03b1\3\2\2\2\u03b4\u03b7\3\2\2\2\u03b5\u03b3"+
		"\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03b8\3\2\2\2\u03b7\u03b5\3\2\2\2\u03b8"+
		"\u03c7\7\6\2\2\u03b9\u03ba\7\7\2\2\u03ba\u03bb\7\5\2\2\u03bb\u03c0\5P"+
		")\2\u03bc\u03bd\7\7\2\2\u03bd\u03bf\5P)\2\u03be\u03bc\3\2\2\2\u03bf\u03c2"+
		"\3\2\2\2\u03c0\u03be\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03c3\3\2\2\2\u03c2"+
		"\u03c0\3\2\2\2\u03c3\u03c4\7\6\2\2\u03c4\u03c6\3\2\2\2\u03c5\u03b9\3\2"+
		"\2\2\u03c6\u03c9\3\2\2\2\u03c7\u03c5\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8"+
		"\u03cb\3\2\2\2\u03c9\u03c7\3\2\2\2\u03ca\u0380\3\2\2\2\u03ca\u03ae\3\2"+
		"\2\2\u03cbA\3\2\2\2\u03cc\u03ce\5Z.\2\u03cd\u03cc\3\2\2\2\u03cd\u03ce"+
		"\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03da\7\u008e\2\2\u03d0\u03d1\7n\2"+
		"\2\u03d1\u03db\7\177\2\2\u03d2\u03d3\7n\2\2\u03d3\u03db\7\33\2\2\u03d4"+
		"\u03d5\7n\2\2\u03d5\u03db\7|\2\2\u03d6\u03d7\7n\2\2\u03d7\u03db\7J\2\2"+
		"\u03d8\u03d9\7n\2\2\u03d9\u03db\7S\2\2\u03da\u03d0\3\2\2\2\u03da\u03d2"+
		"\3\2\2\2\u03da\u03d4\3\2\2\2\u03da\u03d6\3\2\2\2\u03da\u03d8\3\2\2\2\u03da"+
		"\u03db\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u03dd\5\\/\2\u03dd\u03de\7\u0084"+
		"\2\2\u03de\u03df\5\u00a2R\2\u03df\u03e0\7\b\2\2\u03e0\u03e8\5P)\2\u03e1"+
		"\u03e2\7\7\2\2\u03e2\u03e3\5\u00a2R\2\u03e3\u03e4\7\b\2\2\u03e4\u03e5"+
		"\5P)\2\u03e5\u03e7\3\2\2\2\u03e6\u03e1\3\2\2\2\u03e7\u03ea\3\2\2\2\u03e8"+
		"\u03e6\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u03ed\3\2\2\2\u03ea\u03e8\3\2"+
		"\2\2\u03eb\u03ec\7\u0095\2\2\u03ec\u03ee\5P)\2\u03ed\u03eb\3\2\2\2\u03ed"+
		"\u03ee\3\2\2\2\u03eeC\3\2\2\2\u03ef\u03f1\5Z.\2\u03f0\u03ef\3\2\2\2\u03f0"+
		"\u03f1\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03fd\7\u008e\2\2\u03f3\u03f4"+
		"\7n\2\2\u03f4\u03fe\7\177\2\2\u03f5\u03f6\7n\2\2\u03f6\u03fe\7\33\2\2"+
		"\u03f7\u03f8\7n\2\2\u03f8\u03fe\7|\2\2\u03f9\u03fa\7n\2\2\u03fa\u03fe"+
		"\7J\2\2\u03fb\u03fc\7n\2\2\u03fc\u03fe\7S\2\2\u03fd\u03f3\3\2\2\2\u03fd"+
		"\u03f5\3\2\2\2\u03fd\u03f7\3\2\2\2\u03fd\u03f9\3\2\2\2\u03fd\u03fb\3\2"+
		"\2\2\u03fd\u03fe\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u0400\5\\/\2\u0400"+
		"\u0401\7\u0084\2\2\u0401\u0402\5\u00a2R\2\u0402\u0403\7\b\2\2\u0403\u040b"+
		"\5P)\2\u0404\u0405\7\7\2\2\u0405\u0406\5\u00a2R\2\u0406\u0407\7\b\2\2"+
		"\u0407\u0408\5P)\2\u0408\u040a\3\2\2\2\u0409\u0404\3\2\2\2\u040a\u040d"+
		"\3\2\2\2\u040b\u0409\3\2\2\2\u040b\u040c\3\2\2\2\u040c\u0410\3\2\2\2\u040d"+
		"\u040b\3\2\2\2\u040e\u040f\7\u0095\2\2\u040f\u0411\5P)\2\u0410\u040e\3"+
		"\2\2\2\u0410\u0411\3\2\2\2\u0411\u0424\3\2\2\2\u0412\u0413\7o\2\2\u0413"+
		"\u0414\7*\2\2\u0414\u0419\5^\60\2\u0415\u0416\7\7\2\2\u0416\u0418\5^\60"+
		"\2\u0417\u0415\3\2\2\2\u0418\u041b\3\2\2\2\u0419\u0417\3\2\2\2\u0419\u041a"+
		"\3\2\2\2\u041a\u041d\3\2\2\2\u041b\u0419\3\2\2\2\u041c\u0412\3\2\2\2\u041c"+
		"\u041d\3\2\2\2\u041d\u041e\3\2\2\2\u041e\u041f\7d\2\2\u041f\u0422\5P)"+
		"\2\u0420\u0421\t\4\2\2\u0421\u0423\5P)\2\u0422\u0420\3\2\2\2\u0422\u0423"+
		"\3\2\2\2\u0423\u0425\3\2\2\2\u0424\u041c\3\2\2\2\u0424\u0425\3\2\2\2\u0425"+
		"E\3\2\2\2\u0426\u0427\7\u0090\2\2\u0427G\3\2\2\2\u0428\u042a\5\u00a2R"+
		"\2\u0429\u042b\5J&\2\u042a\u0429\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u042f"+
		"\3\2\2\2\u042c\u042e\5L\'\2\u042d\u042c\3\2\2\2\u042e\u0431\3\2\2\2\u042f"+
		"\u042d\3\2\2\2\u042f\u0430\3\2\2\2\u0430I\3\2\2\2\u0431\u042f\3\2\2\2"+
		"\u0432\u0434\5\u0096L\2\u0433\u0432\3\2\2\2\u0434\u0435\3\2\2\2\u0435"+
		"\u0433\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u0441\3\2\2\2\u0437\u0438\7\5"+
		"\2\2\u0438\u0439\5\u0088E\2\u0439\u043a\7\6\2\2\u043a\u0442\3\2\2\2\u043b"+
		"\u043c\7\5\2\2\u043c\u043d\5\u0088E\2\u043d\u043e\7\7\2\2\u043e\u043f"+
		"\5\u0088E\2\u043f\u0440\7\6\2\2\u0440\u0442\3\2\2\2\u0441\u0437\3\2\2"+
		"\2\u0441\u043b\3\2\2\2\u0441\u0442\3\2\2\2\u0442K\3\2\2\2\u0443\u0444"+
		"\7\63\2\2\u0444\u0446\5\u0096L\2\u0445\u0443\3\2\2\2\u0445\u0446\3\2\2"+
		"\2\u0446\u0468\3\2\2\2\u0447\u0448\7s\2\2\u0448\u044a\7a\2\2\u0449\u044b"+
		"\t\7\2\2\u044a\u0449\3\2\2\2\u044a\u044b\3\2\2\2\u044b\u044c\3\2\2\2\u044c"+
		"\u044e\5N(\2\u044d\u044f\7&\2\2\u044e\u044d\3\2\2\2\u044e\u044f\3\2\2"+
		"\2\u044f\u0469\3\2\2\2\u0450\u0452\7h\2\2\u0451\u0450\3\2\2\2\u0451\u0452"+
		"\3\2\2\2\u0452\u0453\3\2\2\2\u0453\u0454\7j\2\2\u0454\u0469\5N(\2\u0455"+
		"\u0456\7\u008d\2\2\u0456\u0469\5N(\2\u0457\u0458\7.\2\2\u0458\u0459\7"+
		"\5\2\2\u0459\u045a\5P)\2\u045a\u045b\7\6\2\2\u045b\u0469\3\2\2\2\u045c"+
		"\u0463\7:\2\2\u045d\u0464\5\u0088E\2\u045e\u0464\5\u008aF\2\u045f\u0460"+
		"\7\5\2\2\u0460\u0461\5P)\2\u0461\u0462\7\6\2\2\u0462\u0464\3\2\2\2\u0463"+
		"\u045d\3\2\2\2\u0463\u045e\3\2\2\2\u0463\u045f\3\2\2\2\u0464\u0469\3\2"+
		"\2\2\u0465\u0466\7/\2\2\u0466\u0469\5\u00a4S\2\u0467\u0469\5R*\2\u0468"+
		"\u0447\3\2\2\2\u0468\u0451\3\2\2\2\u0468\u0455\3\2\2\2\u0468\u0457\3\2"+
		"\2\2\u0468\u045c\3\2\2\2\u0468\u0465\3\2\2\2\u0468\u0467\3\2\2\2\u0469"+
		"M\3\2\2\2\u046a\u046b\7m\2\2\u046b\u046c\7\62\2\2\u046c\u046e\t\b\2\2"+
		"\u046d\u046a\3\2\2\2\u046d\u046e\3\2\2\2\u046eO\3\2\2\2\u046f\u0470\b"+
		")\1\2\u0470\u04bd\5\u008aF\2\u0471\u04bd\7\u00ac\2\2\u0472\u0473\5\u009a"+
		"N\2\u0473\u0474\7\4\2\2\u0474\u0476\3\2\2\2\u0475\u0472\3\2\2\2\u0475"+
		"\u0476\3\2\2\2\u0476\u0477\3\2\2\2\u0477\u0478\5\u009cO\2\u0478\u0479"+
		"\7\4\2\2\u0479\u047b\3\2\2\2\u047a\u0475\3\2\2\2\u047a\u047b\3\2\2\2\u047b"+
		"\u047c\3\2\2\2\u047c\u04bd\5\u00a2R\2\u047d\u047e\5\u008cG\2\u047e\u047f"+
		"\5P)\30\u047f\u04bd\3\2\2\2\u0480\u0481\5\u0098M\2\u0481\u048e\7\5\2\2"+
		"\u0482\u0484\7@\2\2\u0483\u0482\3\2\2\2\u0483\u0484\3\2\2\2\u0484\u0485"+
		"\3\2\2\2\u0485\u048a\5P)\2\u0486\u0487\7\7\2\2\u0487\u0489\5P)\2\u0488"+
		"\u0486\3\2\2\2\u0489\u048c\3\2\2\2\u048a\u0488\3\2\2\2\u048a\u048b\3\2"+
		"\2\2\u048b\u048f\3\2\2\2\u048c\u048a\3\2\2\2\u048d\u048f\7\t\2\2\u048e"+
		"\u0483\3\2\2\2\u048e\u048d\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u0490\3\2"+
		"\2\2\u0490\u0491\7\6\2\2\u0491\u04bd\3\2\2\2\u0492\u0493\7\5\2\2\u0493"+
		"\u0494\5P)\2\u0494\u0495\7\6\2\2\u0495\u04bd\3\2\2\2\u0496\u0497\7-\2"+
		"\2\u0497\u0498\7\5\2\2\u0498\u0499\5P)\2\u0499\u049a\7#\2\2\u049a\u049b"+
		"\5J&\2\u049b\u049c\7\6\2\2\u049c\u04bd\3\2\2\2\u049d\u049f\7h\2\2\u049e"+
		"\u049d\3\2\2\2\u049e\u049f\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0\u04a2\7H"+
		"\2\2\u04a1\u049e\3\2\2\2\u04a1\u04a2\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3"+
		"\u04a4\7\5\2\2\u04a4\u04a5\5> \2\u04a5\u04a6\7\6\2\2\u04a6\u04bd\3\2\2"+
		"\2\u04a7\u04a9\7,\2\2\u04a8\u04aa\5P)\2\u04a9\u04a8\3\2\2\2\u04a9\u04aa"+
		"\3\2\2\2\u04aa\u04b0\3\2\2\2\u04ab\u04ac\7\u0094\2\2\u04ac\u04ad\5P)\2"+
		"\u04ad\u04ae\7\u0088\2\2\u04ae\u04af\5P)\2\u04af\u04b1\3\2\2\2\u04b0\u04ab"+
		"\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04b0\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3"+
		"\u04b6\3\2\2\2\u04b4\u04b5\7C\2\2\u04b5\u04b7\5P)\2\u04b6\u04b4\3\2\2"+
		"\2\u04b6\u04b7\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8\u04b9\7D\2\2\u04b9\u04bd"+
		"\3\2\2\2\u04ba\u04bd\5T+\2\u04bb\u04bd\5f\64\2\u04bc\u046f\3\2\2\2\u04bc"+
		"\u0471\3\2\2\2\u04bc\u047a\3\2\2\2\u04bc\u047d\3\2\2\2\u04bc\u0480\3\2"+
		"\2\2\u04bc\u0492\3\2\2\2\u04bc\u0496\3\2\2\2\u04bc\u04a1\3\2\2\2\u04bc"+
		"\u04a7\3\2\2\2\u04bc\u04ba\3\2\2\2\u04bc\u04bb\3\2\2\2\u04bd\u0522\3\2"+
		"\2\2\u04be\u04bf\f\27\2\2\u04bf\u04c0\7\r\2\2\u04c0\u0521\5P)\30\u04c1"+
		"\u04c2\f\26\2\2\u04c2\u04c3\t\t\2\2\u04c3\u0521\5P)\27\u04c4\u04c5\f\25"+
		"\2\2\u04c5\u04c6\t\n\2\2\u04c6\u0521\5P)\26\u04c7\u04c8\f\24\2\2\u04c8"+
		"\u04c9\t\13\2\2\u04c9\u0521\5P)\25\u04ca\u04cb\f\23\2\2\u04cb\u04cc\t"+
		"\f\2\2\u04cc\u0521\5P)\24\u04cd\u04da\f\22\2\2\u04ce\u04db\7\b\2\2\u04cf"+
		"\u04db\7\30\2\2\u04d0\u04db\7\31\2\2\u04d1\u04db\7\32\2\2\u04d2\u04db"+
		"\7^\2\2\u04d3\u04d4\7^\2\2\u04d4\u04db\7h\2\2\u04d5\u04db\7U\2\2\u04d6"+
		"\u04db\7c\2\2\u04d7\u04db\7O\2\2\u04d8\u04db\7e\2\2\u04d9\u04db\7x\2\2"+
		"\u04da\u04ce\3\2\2\2\u04da\u04cf\3\2\2\2\u04da\u04d0\3\2\2\2\u04da\u04d1"+
		"\3\2\2\2\u04da\u04d2\3\2\2\2\u04da\u04d3\3\2\2\2\u04da\u04d5\3\2\2\2\u04da"+
		"\u04d6\3\2\2\2\u04da\u04d7\3\2\2\2\u04da\u04d8\3\2\2\2\u04da\u04d9\3\2"+
		"\2\2\u04db\u04dc\3\2\2\2\u04dc\u0521\5P)\23\u04dd\u04de\f\21\2\2\u04de"+
		"\u04df\7\"\2\2\u04df\u0521\5P)\22\u04e0\u04e1\f\20\2\2\u04e1\u04e2\7n"+
		"\2\2\u04e2\u0521\5P)\21\u04e3\u04e4\f\t\2\2\u04e4\u04e6\7^\2\2\u04e5\u04e7"+
		"\7h\2\2\u04e6\u04e5\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7\u04e8\3\2\2\2\u04e8"+
		"\u0521\5P)\n\u04e9\u04eb\f\b\2\2\u04ea\u04ec\7h\2\2\u04eb\u04ea\3\2\2"+
		"\2\u04eb\u04ec\3\2\2\2\u04ec\u04ed\3\2\2\2\u04ed\u04ee\7)\2\2\u04ee\u04ef"+
		"\5P)\2\u04ef\u04f0\7\"\2\2\u04f0\u04f1\5P)\t\u04f1\u0521\3\2\2\2\u04f2"+
		"\u04f3\f\f\2\2\u04f3\u04f4\7/\2\2\u04f4\u0521\5\u00a4S\2\u04f5\u04f7\f"+
		"\13\2\2\u04f6\u04f8\7h\2\2\u04f7\u04f6\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8"+
		"\u04f9\3\2\2\2\u04f9\u04fa\t\r\2\2\u04fa\u04fd\5P)\2\u04fb\u04fc\7E\2"+
		"\2\u04fc\u04fe\5P)\2\u04fd\u04fb\3\2\2\2\u04fd\u04fe\3\2\2\2\u04fe\u0521"+
		"\3\2\2\2\u04ff\u0504\f\n\2\2\u0500\u0505\7_\2\2\u0501\u0505\7i\2\2\u0502"+
		"\u0503\7h\2\2\u0503\u0505\7j\2\2\u0504\u0500\3\2\2\2\u0504\u0501\3\2\2"+
		"\2\u0504\u0502\3\2\2\2\u0505\u0521\3\2\2\2\u0506\u0508\f\7\2\2\u0507\u0509"+
		"\7h\2\2\u0508\u0507\3\2\2\2\u0508\u0509\3\2\2\2\u0509\u050a\3\2\2\2\u050a"+
		"\u051e\7U\2\2\u050b\u0515\7\5\2\2\u050c\u0516\5> \2\u050d\u0512\5P)\2"+
		"\u050e\u050f\7\7\2\2\u050f\u0511\5P)\2\u0510\u050e\3\2\2\2\u0511\u0514"+
		"\3\2\2\2\u0512\u0510\3\2\2\2\u0512\u0513\3\2\2\2\u0513\u0516\3\2\2\2\u0514"+
		"\u0512\3\2\2\2\u0515\u050c\3\2\2\2\u0515\u050d\3\2\2\2\u0515\u0516\3\2"+
		"\2\2\u0516\u0517\3\2\2\2\u0517\u051f\7\6\2\2\u0518\u0519\5\u009aN\2\u0519"+
		"\u051a\7\4\2\2\u051a\u051c\3\2\2\2\u051b\u0518\3\2\2\2\u051b\u051c\3\2"+
		"\2\2\u051c\u051d\3\2\2\2\u051d\u051f\5\u009cO\2\u051e\u050b\3\2\2\2\u051e"+
		"\u051b\3\2\2\2\u051f\u0521\3\2\2\2\u0520\u04be\3\2\2\2\u0520\u04c1\3\2"+
		"\2\2\u0520\u04c4\3\2\2\2\u0520\u04c7\3\2\2\2\u0520\u04ca\3\2\2\2\u0520"+
		"\u04cd\3\2\2\2\u0520\u04dd\3\2\2\2\u0520\u04e0\3\2\2\2\u0520\u04e3\3\2"+
		"\2\2\u0520\u04e9\3\2\2\2\u0520\u04f2\3\2\2\2\u0520\u04f5\3\2\2\2\u0520"+
		"\u04ff\3\2\2\2\u0520\u0506\3\2\2\2\u0521\u0524\3\2\2\2\u0522\u0520\3\2"+
		"\2\2\u0522\u0523\3\2\2\2\u0523Q\3\2\2\2\u0524\u0522\3\2\2\2\u0525\u0526"+
		"\7w\2\2\u0526\u0532\5\u00a6T\2\u0527\u0528\7\5\2\2\u0528\u052d\5\u00a2"+
		"R\2\u0529\u052a\7\7\2\2\u052a\u052c\5\u00a2R\2\u052b\u0529\3\2\2\2\u052c"+
		"\u052f\3\2\2\2\u052d\u052b\3\2\2\2\u052d\u052e\3\2\2\2\u052e\u0530\3\2"+
		"\2\2\u052f\u052d\3\2\2\2\u0530\u0531\7\6\2\2\u0531\u0533\3\2\2\2\u0532"+
		"\u0527\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u0546\3\2\2\2\u0534\u0535\7m"+
		"\2\2\u0535\u053e\t\16\2\2\u0536\u0537\7\u0084\2\2\u0537\u053f\7j\2\2\u0538"+
		"\u0539\7\u0084\2\2\u0539\u053f\7:\2\2\u053a\u053f\7+\2\2\u053b\u053f\7"+
		"}\2\2\u053c\u053d\7g\2\2\u053d\u053f\7\34\2\2\u053e\u0536\3\2\2\2\u053e"+
		"\u0538\3\2\2\2\u053e\u053a\3\2\2\2\u053e\u053b\3\2\2\2\u053e\u053c\3\2"+
		"\2\2\u053f\u0543\3\2\2\2\u0540\u0541\7e\2\2\u0541\u0543\5\u0096L\2\u0542"+
		"\u0534\3\2\2\2\u0542\u0540\3\2\2\2\u0543\u0545\3\2\2\2\u0544\u0542\3\2"+
		"\2\2\u0545\u0548\3\2\2\2\u0546\u0544\3\2\2\2\u0546\u0547\3\2\2\2\u0547"+
		"\u0553\3\2\2\2\u0548\u0546\3\2\2\2\u0549\u054b\7h\2\2\u054a\u0549\3\2"+
		"\2\2\u054a\u054b\3\2\2\2\u054b\u054c\3\2\2\2\u054c\u0551\7;\2\2\u054d"+
		"\u054e\7X\2\2\u054e\u0552\7<\2\2\u054f\u0550\7X\2\2\u0550\u0552\7T\2\2"+
		"\u0551\u054d\3\2\2\2\u0551\u054f\3\2\2\2\u0551\u0552\3\2\2\2\u0552\u0554"+
		"\3\2\2\2\u0553\u054a\3\2\2\2\u0553\u0554\3\2\2\2\u0554S\3\2\2\2\u0555"+
		"\u0556\7u\2\2\u0556\u055b\7\5\2\2\u0557\u055c\7S\2\2\u0558\u0559\t\17"+
		"\2\2\u0559\u055a\7\7\2\2\u055a\u055c\5\u008eH\2\u055b\u0557\3\2\2\2\u055b"+
		"\u0558\3\2\2\2\u055c\u055d\3\2\2\2\u055d\u055e\7\6\2\2\u055eU\3\2\2\2"+
		"\u055f\u0562\5\u00a2R\2\u0560\u0561\7/\2\2\u0561\u0563\5\u00a4S\2\u0562"+
		"\u0560\3\2\2\2\u0562\u0563\3\2\2\2\u0563\u0565\3\2\2\2\u0564\u0566\t\7"+
		"\2\2\u0565\u0564\3\2\2\2\u0565\u0566\3\2\2\2\u0566W\3\2\2\2\u0567\u0568"+
		"\7\63\2\2\u0568\u056a\5\u0096L\2\u0569\u0567\3\2\2\2\u0569\u056a\3\2\2"+
		"\2\u056a\u058f\3\2\2\2\u056b\u056c\7s\2\2\u056c\u056f\7a\2\2\u056d\u056f"+
		"\7\u008d\2\2\u056e\u056b\3\2\2\2\u056e\u056d\3\2\2\2\u056f\u0570\3\2\2"+
		"\2\u0570\u0571\7\5\2\2\u0571\u0576\5V,\2\u0572\u0573\7\7\2\2\u0573\u0575"+
		"\5V,\2\u0574\u0572\3\2\2\2\u0575\u0578\3\2\2\2\u0576\u0574\3\2\2\2\u0576"+
		"\u0577\3\2\2\2\u0577\u0579\3\2\2\2\u0578\u0576\3\2\2\2\u0579\u057a\7\6"+
		"\2\2\u057a\u057b\5N(\2\u057b\u0590\3\2\2\2\u057c\u057d\7.\2\2\u057d\u057e"+
		"\7\5\2\2\u057e\u057f\5P)\2\u057f\u0580\7\6\2\2\u0580\u0590\3\2\2\2\u0581"+
		"\u0582\7L\2\2\u0582\u0583\7a\2\2\u0583\u0584\7\5\2\2\u0584\u0589\5\u00a2"+
		"R\2\u0585\u0586\7\7\2\2\u0586\u0588\5\u00a2R\2\u0587\u0585\3\2\2\2\u0588"+
		"\u058b\3\2\2\2\u0589\u0587\3\2\2\2\u0589\u058a\3\2\2\2\u058a\u058c\3\2"+
		"\2\2\u058b\u0589\3\2\2\2\u058c\u058d\7\6\2\2\u058d\u058e\5R*\2\u058e\u0590"+
		"\3\2\2\2\u058f\u056e\3\2\2\2\u058f\u057c\3\2\2\2\u058f\u0581\3\2\2\2\u0590"+
		"Y\3\2\2\2\u0591\u0593\7\u0096\2\2\u0592\u0594\7v\2\2\u0593\u0592\3\2\2"+
		"\2\u0593\u0594\3\2\2\2\u0594\u0595\3\2\2\2\u0595\u0596\5\u0086D\2\u0596"+
		"\u0597\7#\2\2\u0597\u0598\7\5\2\2\u0598\u0599\5> \2\u0599\u05a3\7\6\2"+
		"\2\u059a\u059b\7\7\2\2\u059b\u059c\5\u0086D\2\u059c\u059d\7#\2\2\u059d"+
		"\u059e\7\5\2\2\u059e\u059f\5> \2\u059f\u05a0\7\6\2\2\u05a0\u05a2\3\2\2"+
		"\2\u05a1\u059a\3\2\2\2\u05a2\u05a5\3\2\2\2\u05a3\u05a1\3\2\2\2\u05a3\u05a4"+
		"\3\2\2\2\u05a4[\3\2\2\2\u05a5\u05a3\3\2\2\2\u05a6\u05a7\5\u009aN\2\u05a7"+
		"\u05a8\7\4\2\2\u05a8\u05aa\3\2\2\2\u05a9\u05a6\3\2\2\2\u05a9\u05aa\3\2"+
		"\2\2\u05aa\u05ab\3\2\2\2\u05ab\u05b1\5\u009cO\2\u05ac\u05ad\7W\2\2\u05ad"+
		"\u05ae\7*\2\2\u05ae\u05b2\5\u00a8U\2\u05af\u05b0\7h\2\2\u05b0\u05b2\7"+
		"W\2\2\u05b1\u05ac\3\2\2\2\u05b1\u05af\3\2\2\2\u05b1\u05b2\3\2\2\2\u05b2"+
		"]\3\2\2\2\u05b3\u05b6\5P)\2\u05b4\u05b5\7/\2\2\u05b5\u05b7\5\u00a4S\2"+
		"\u05b6\u05b4\3\2\2\2\u05b6\u05b7\3\2\2\2\u05b7\u05b9\3\2\2\2\u05b8\u05ba"+
		"\t\7\2\2\u05b9\u05b8\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba_\3\2\2\2\u05bb"+
		"\u05bf\5\u0088E\2\u05bc\u05bf\5\u0096L\2\u05bd\u05bf\7\u00ad\2\2\u05be"+
		"\u05bb\3\2\2\2\u05be\u05bc\3\2\2\2\u05be\u05bd\3\2\2\2\u05bfa\3\2\2\2"+
		"\u05c0\u05cc\5\u009cO\2\u05c1\u05c2\7\5\2\2\u05c2\u05c7\5\u00a2R\2\u05c3"+
		"\u05c4\7\7\2\2\u05c4\u05c6\5\u00a2R\2\u05c5\u05c3\3\2\2\2\u05c6\u05c9"+
		"\3\2\2\2\u05c7\u05c5\3\2\2\2\u05c7\u05c8\3\2\2\2\u05c8\u05ca\3\2\2\2\u05c9"+
		"\u05c7\3\2\2\2\u05ca\u05cb\7\6\2\2\u05cb\u05cd\3\2\2\2\u05cc\u05c1\3\2"+
		"\2\2\u05cc\u05cd\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce\u05cf\7#\2\2\u05cf"+
		"\u05d0\7\5\2\2\u05d0\u05d1\5> \2\u05d1\u05d2\7\6\2\2\u05d2c\3\2\2\2\u05d3"+
		"\u05e3\7\t\2\2\u05d4\u05d5\5\u009cO\2\u05d5\u05d6\7\4\2\2\u05d6\u05d7"+
		"\7\t\2\2\u05d7\u05e3\3\2\2\2\u05d8\u05db\5P)\2\u05d9\u05db\5f\64\2\u05da"+
		"\u05d8\3\2\2\2\u05da\u05d9\3\2\2\2\u05db\u05e0\3\2\2\2\u05dc\u05de\7#"+
		"\2\2\u05dd\u05dc\3\2\2\2\u05dd\u05de\3\2\2\2\u05de\u05df\3\2\2\2\u05df"+
		"\u05e1\5\u0092J\2\u05e0\u05dd\3\2\2\2\u05e0\u05e1\3\2\2\2\u05e1\u05e3"+
		"\3\2\2\2\u05e2\u05d3\3\2\2\2\u05e2\u05d4\3\2\2\2\u05e2\u05da\3\2\2\2\u05e3"+
		"e\3\2\2\2\u05e4\u05e5\7\u0098\2\2\u05e5\u05e6\7\5\2\2\u05e6\u05e7\5P)"+
		"\2\u05e7\u05e8\7\6\2\2\u05e8\u05e9\7\u0099\2\2\u05e9\u05eb\7\5\2\2\u05ea"+
		"\u05ec\5l\67\2\u05eb\u05ea\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec\u05ed\3\2"+
		"\2\2\u05ed\u05ee\7o\2\2\u05ee\u05ef\7*\2\2\u05ef\u05f1\5p9\2\u05f0\u05f2"+
		"\5t;\2\u05f1\u05f0\3\2\2\2\u05f1\u05f2\3\2\2\2\u05f2\u05f3\3\2\2\2\u05f3"+
		"\u05f4\7\6\2\2\u05f4\u068f\3\2\2\2\u05f5\u05f6\7\u00a0\2\2\u05f6\u05f7"+
		"\7\5\2\2\u05f7\u05f8\7\6\2\2\u05f8\u05f9\7\u0099\2\2\u05f9\u05fb\7\5\2"+
		"\2\u05fa\u05fc\5l\67\2\u05fb\u05fa\3\2\2\2\u05fb\u05fc\3\2\2\2\u05fc\u05fe"+
		"\3\2\2\2\u05fd\u05ff\5n8\2\u05fe\u05fd\3\2\2\2\u05fe\u05ff\3\2\2\2\u05ff"+
		"\u0600\3\2\2\2\u0600\u068f\7\6\2\2\u0601\u0602\7\u00a1\2\2\u0602\u0603"+
		"\7\5\2\2\u0603\u0604\7\6\2\2\u0604\u0605\7\u0099\2\2\u0605\u0607\7\5\2"+
		"\2\u0606\u0608\5l\67\2\u0607\u0606\3\2\2\2\u0607\u0608\3\2\2\2\u0608\u0609"+
		"\3\2\2\2\u0609\u060a\7o\2\2\u060a\u060b\7*\2\2\u060b\u060c\5p9\2\u060c"+
		"\u060d\7\6\2\2\u060d\u068f\3\2\2\2\u060e\u060f\7\u00a2\2\2\u060f\u0610"+
		"\7\5\2\2\u0610\u0612\5P)\2\u0611\u0613\5h\65\2\u0612\u0611\3\2\2\2\u0612"+
		"\u0613\3\2\2\2\u0613\u0615\3\2\2\2\u0614\u0616\5j\66\2\u0615\u0614\3\2"+
		"\2\2\u0615\u0616\3\2\2\2\u0616\u0617\3\2\2\2\u0617\u0618\7\6\2\2\u0618"+
		"\u0619\7\u0099\2\2\u0619\u061b\7\5\2\2\u061a\u061c\5l\67\2\u061b\u061a"+
		"\3\2\2\2\u061b\u061c\3\2\2\2\u061c\u061d\3\2\2\2\u061d\u061e\7o\2\2\u061e"+
		"\u061f\7*\2\2\u061f\u0620\5p9\2\u0620\u0621\7\6\2\2\u0621\u068f\3\2\2"+
		"\2\u0622\u0623\7\u00a3\2\2\u0623\u0624\7\5\2\2\u0624\u0625\5P)\2\u0625"+
		"\u0626\7\6\2\2\u0626\u0627\7\u0099\2\2\u0627\u0629\7\5\2\2\u0628\u062a"+
		"\5l\67\2\u0629\u0628\3\2\2\2\u0629\u062a\3\2\2\2\u062a\u062b\3\2\2\2\u062b"+
		"\u062c\7o\2\2\u062c\u062d\7*\2\2\u062d\u062f\5p9\2\u062e\u0630\5t;\2\u062f"+
		"\u062e\3\2\2\2\u062f\u0630\3\2\2\2\u0630\u0631\3\2\2\2\u0631\u0632\7\6"+
		"\2\2\u0632\u068f\3\2\2\2\u0633\u0634\7\u00a4\2\2\u0634\u0635\7\5\2\2\u0635"+
		"\u0637\5P)\2\u0636\u0638\5h\65\2\u0637\u0636\3\2\2\2\u0637\u0638\3\2\2"+
		"\2\u0638\u063a\3\2\2\2\u0639\u063b\5j\66\2\u063a\u0639\3\2\2\2\u063a\u063b"+
		"\3\2\2\2\u063b\u063c\3\2\2\2\u063c\u063d\7\6\2\2\u063d\u063e\7\u0099\2"+
		"\2\u063e\u0640\7\5\2\2\u063f\u0641\5l\67\2\u0640\u063f\3\2\2\2\u0640\u0641"+
		"\3\2\2\2\u0641\u0642\3\2\2\2\u0642\u0643\7o\2\2\u0643\u0644\7*\2\2\u0644"+
		"\u0645\5p9\2\u0645\u0646\7\6\2\2\u0646\u068f\3\2\2\2\u0647\u0648\7\u00a5"+
		"\2\2\u0648\u0649\7\5\2\2\u0649\u064a\5P)\2\u064a\u064b\7\7\2\2\u064b\u064c"+
		"\5\u0088E\2\u064c\u064d\7\6\2\2\u064d\u064e\7\u0099\2\2\u064e\u0650\7"+
		"\5\2\2\u064f\u0651\5l\67\2\u0650\u064f\3\2\2\2\u0650\u0651\3\2\2\2\u0651"+
		"\u0652\3\2\2\2\u0652\u0653\7o\2\2\u0653\u0654\7*\2\2\u0654\u0656\5p9\2"+
		"\u0655\u0657\5t;\2\u0656\u0655\3\2\2\2\u0656\u0657\3\2\2\2\u0657\u0658"+
		"\3\2\2\2\u0658\u0659\7\6\2\2\u0659\u068f\3\2\2\2\u065a\u065b\7\u00a6\2"+
		"\2\u065b\u065c\7\5\2\2\u065c\u065d\5P)\2\u065d\u065e\7\6\2\2\u065e\u065f"+
		"\7\u0099\2\2\u065f\u0661\7\5\2\2\u0660\u0662\5l\67\2\u0661\u0660\3\2\2"+
		"\2\u0661\u0662\3\2\2\2\u0662\u0663\3\2\2\2\u0663\u0664\7o\2\2\u0664\u0665"+
		"\7*\2\2\u0665\u0666\5p9\2\u0666\u0667\7\6\2\2\u0667\u068f\3\2\2\2\u0668"+
		"\u0669\7\u00a7\2\2\u0669\u066a\7\5\2\2\u066a\u066b\7\6\2\2\u066b\u066c"+
		"\7\u0099\2\2\u066c\u066e\7\5\2\2\u066d\u066f\5l\67\2\u066e\u066d\3\2\2"+
		"\2\u066e\u066f\3\2\2\2\u066f\u0671\3\2\2\2\u0670\u0672\5n8\2\u0671\u0670"+
		"\3\2\2\2\u0671\u0672\3\2\2\2\u0672\u0673\3\2\2\2\u0673\u068f\7\6\2\2\u0674"+
		"\u0675\7\u00a8\2\2\u0675\u0676\7\5\2\2\u0676\u0677\7\6\2\2\u0677\u0678"+
		"\7\u0099\2\2\u0678\u067a\7\5\2\2\u0679\u067b\5l\67\2\u067a\u0679\3\2\2"+
		"\2\u067a\u067b\3\2\2\2\u067b\u067c\3\2\2\2\u067c\u067d\7o\2\2\u067d\u067e"+
		"\7*\2\2\u067e\u067f\5p9\2\u067f\u0680\7\6\2\2\u0680\u068f\3\2\2\2\u0681"+
		"\u0682\7\u00a9\2\2\u0682\u0683\7\5\2\2\u0683\u0684\7\6\2\2\u0684\u0685"+
		"\7\u0099\2\2\u0685\u0687\7\5\2\2\u0686\u0688\5l\67\2\u0687\u0686\3\2\2"+
		"\2\u0687\u0688\3\2\2\2\u0688\u0689\3\2\2\2\u0689\u068a\7o\2\2\u068a\u068b"+
		"\7*\2\2\u068b\u068c\5p9\2\u068c\u068d\7\6\2\2\u068d\u068f\3\2\2\2\u068e"+
		"\u05e4\3\2\2\2\u068e\u05f5\3\2\2\2\u068e\u0601\3\2\2\2\u068e\u060e\3\2"+
		"\2\2\u068e\u0622\3\2\2\2\u068e\u0633\3\2\2\2\u068e\u0647\3\2\2\2\u068e"+
		"\u065a\3\2\2\2\u068e\u0668\3\2\2\2\u068e\u0674\3\2\2\2\u068e\u0681\3\2"+
		"\2\2\u068fg\3\2\2\2\u0690\u0691\7\7\2\2\u0691\u0692\5\u0088E\2\u0692i"+
		"\3\2\2\2\u0693\u0694\7\7\2\2\u0694\u0695\5\u0088E\2\u0695k\3\2\2\2\u0696"+
		"\u0697\7\u009a\2\2\u0697\u0699\7*\2\2\u0698\u069a\5P)\2\u0699\u0698\3"+
		"\2\2\2\u069a\u069b\3\2\2\2\u069b\u0699\3\2\2\2\u069b\u069c\3\2\2\2\u069c"+
		"m\3\2\2\2\u069d\u069e\7o\2\2\u069e\u06a0\7*\2\2\u069f\u06a1\5P)\2\u06a0"+
		"\u069f\3\2\2\2\u06a1\u06a2\3\2\2\2\u06a2\u06a0\3\2\2\2\u06a2\u06a3\3\2"+
		"\2\2\u06a3o\3\2\2\2\u06a4\u06a6\5P)\2\u06a5\u06a7\5r:\2\u06a6\u06a5\3"+
		"\2\2\2\u06a6\u06a7\3\2\2\2\u06a7\u06af\3\2\2\2\u06a8\u06a9\7\7\2\2\u06a9"+
		"\u06ab\5P)\2\u06aa\u06ac\5r:\2\u06ab\u06aa\3\2\2\2\u06ab\u06ac\3\2\2\2"+
		"\u06ac\u06ae\3\2\2\2\u06ad\u06a8\3\2\2\2\u06ae\u06b1\3\2\2\2\u06af\u06ad"+
		"\3\2\2\2\u06af\u06b0\3\2\2\2\u06b0q\3\2\2\2\u06b1\u06af\3\2\2\2\u06b2"+
		"\u06b3\t\7\2\2\u06b3s\3\2\2\2\u06b4\u06bb\t\20\2\2\u06b5\u06bc\5v<\2\u06b6"+
		"\u06b7\7)\2\2\u06b7\u06b8\5v<\2\u06b8\u06b9\7\"\2\2\u06b9\u06ba\5x=\2"+
		"\u06ba\u06bc\3\2\2\2\u06bb\u06b5\3\2\2\2\u06bb\u06b6\3\2\2\2\u06bcu\3"+
		"\2\2\2\u06bd\u06be\5\u0088E\2\u06be\u06bf\7\u009c\2\2\u06bf\u06c5\3\2"+
		"\2\2\u06c0\u06c1\7\u009d\2\2\u06c1\u06c5\7\u009c\2\2\u06c2\u06c3\7\u009e"+
		"\2\2\u06c3\u06c5\7\u0080\2\2\u06c4\u06bd\3\2\2\2\u06c4\u06c0\3\2\2\2\u06c4"+
		"\u06c2\3\2\2\2\u06c5w\3\2\2\2\u06c6\u06c7\7\u009e\2\2\u06c7\u06ce\7\u0080"+
		"\2\2\u06c8\u06c9\7\u009d\2\2\u06c9\u06ce\7\u009f\2\2\u06ca\u06cb\5\u0088"+
		"E\2\u06cb\u06cc\7\u009f\2\2\u06cc\u06ce\3\2\2\2\u06cd\u06c6\3\2\2\2\u06cd"+
		"\u06c8\3\2\2\2\u06cd\u06ca\3\2\2\2\u06cey\3\2\2\2\u06cf\u06d0\5\u009a"+
		"N\2\u06d0\u06d1\7\4\2\2\u06d1\u06d3\3\2\2\2\u06d2\u06cf\3\2\2\2\u06d2"+
		"\u06d3\3\2\2\2\u06d3\u06d4\3\2\2\2\u06d4\u06d9\5\u009cO\2\u06d5\u06d7"+
		"\7#\2\2\u06d6\u06d5\3\2\2\2\u06d6\u06d7\3\2\2\2\u06d7\u06d8\3\2\2\2\u06d8"+
		"\u06da\5\u00b4[\2\u06d9\u06d6\3\2\2\2\u06d9\u06da\3\2\2\2\u06da\u06e0"+
		"\3\2\2\2\u06db\u06dc\7W\2\2\u06dc\u06dd\7*\2\2\u06dd\u06e1\5\u00a8U\2"+
		"\u06de\u06df\7h\2\2\u06df\u06e1\7W\2\2\u06e0\u06db\3\2\2\2\u06e0\u06de"+
		"\3\2\2\2\u06e0\u06e1\3\2\2\2\u06e1\u06ff\3\2\2\2\u06e2\u06ec\7\5\2\2\u06e3"+
		"\u06e8\5z>\2\u06e4\u06e5\7\7\2\2\u06e5\u06e7\5z>\2\u06e6\u06e4\3\2\2\2"+
		"\u06e7\u06ea\3\2\2\2\u06e8\u06e6\3\2\2\2\u06e8\u06e9\3\2\2\2\u06e9\u06ed"+
		"\3\2\2\2\u06ea\u06e8\3\2\2\2\u06eb\u06ed\5|?\2\u06ec\u06e3\3\2\2\2\u06ec"+
		"\u06eb\3\2\2\2\u06ed\u06ee\3\2\2\2\u06ee\u06f3\7\6\2\2\u06ef\u06f1\7#"+
		"\2\2\u06f0\u06ef\3\2\2\2\u06f0\u06f1\3\2\2\2\u06f1\u06f2\3\2\2\2\u06f2"+
		"\u06f4\5\u00b4[\2\u06f3\u06f0\3\2\2\2\u06f3\u06f4\3\2\2\2\u06f4\u06ff"+
		"\3\2\2\2\u06f5\u06f6\7\5\2\2\u06f6\u06f7\5> \2\u06f7\u06fc\7\6\2\2\u06f8"+
		"\u06fa\7#\2\2\u06f9\u06f8\3\2\2\2\u06f9\u06fa\3\2\2\2\u06fa\u06fb\3\2"+
		"\2\2\u06fb\u06fd\5\u00b4[\2\u06fc\u06f9\3\2\2\2\u06fc\u06fd\3\2\2\2\u06fd"+
		"\u06ff\3\2\2\2\u06fe\u06d2\3\2\2\2\u06fe\u06e2\3\2\2\2\u06fe\u06f5\3\2"+
		"\2\2\u06ff{\3\2\2\2\u0700\u0707\5z>\2\u0701\u0702\5~@\2\u0702\u0703\5"+
		"z>\2\u0703\u0704\5\u0080A\2\u0704\u0706\3\2\2\2\u0705\u0701\3\2\2\2\u0706"+
		"\u0709\3\2\2\2\u0707\u0705\3\2\2\2\u0707\u0708\3\2\2\2\u0708}\3\2\2\2"+
		"\u0709\u0707\3\2\2\2\u070a\u0718\7\7\2\2\u070b\u070d\7f\2\2\u070c\u070b"+
		"\3\2\2\2\u070c\u070d\3\2\2\2\u070d\u0714\3\2\2\2\u070e\u0710\7b\2\2\u070f"+
		"\u0711\7p\2\2\u0710\u070f\3\2\2\2\u0710\u0711\3\2\2\2\u0711\u0715\3\2"+
		"\2\2\u0712\u0715\7Y\2\2\u0713\u0715\7\65\2\2\u0714\u070e\3\2\2\2\u0714"+
		"\u0712\3\2\2\2\u0714\u0713\3\2\2\2\u0714\u0715\3\2\2\2\u0715\u0716\3\2"+
		"\2\2\u0716\u0718\7`\2\2\u0717\u070a\3\2\2\2\u0717\u070c\3\2\2\2\u0718"+
		"\177\3\2\2\2\u0719\u071a\7m\2\2\u071a\u0728\5P)\2\u071b\u071c\7\u008f"+
		"\2\2\u071c\u071d\7\5\2\2\u071d\u0722\5\u00a2R\2\u071e\u071f\7\7\2\2\u071f"+
		"\u0721\5\u00a2R\2\u0720\u071e\3\2\2\2\u0721\u0724\3\2\2\2\u0722\u0720"+
		"\3\2\2\2\u0722\u0723\3\2\2\2\u0723\u0725\3\2\2\2\u0724\u0722\3\2\2\2\u0725"+
		"\u0726\7\6\2\2\u0726\u0728\3\2\2\2\u0727\u0719\3\2\2\2\u0727\u071b\3\2"+
		"\2\2\u0727\u0728\3\2\2\2\u0728\u0081\3\2\2\2\u0729\u072b\7\u0083\2\2\u072a"+
		"\u072c\t\6\2\2\u072b\u072a\3\2\2\2\u072b\u072c\3\2\2\2\u072c\u072d\3\2"+
		"\2\2\u072d\u0732\5d\63\2\u072e\u072f\7\7\2\2\u072f\u0731\5d\63\2\u0730"+
		"\u072e\3\2\2\2\u0731\u0734\3\2\2\2\u0732\u0730\3\2\2\2\u0732\u0733\3\2"+
		"\2\2\u0733\u0741\3\2\2\2\u0734\u0732\3\2\2\2\u0735\u073f\7M\2\2\u0736"+
		"\u073b\5z>\2\u0737\u0738\7\7\2\2\u0738\u073a\5z>\2\u0739\u0737\3\2\2\2"+
		"\u073a\u073d\3\2\2\2\u073b\u0739\3\2\2\2\u073b\u073c\3\2\2\2\u073c\u0740"+
		"\3\2\2\2\u073d\u073b\3\2\2\2\u073e\u0740\5|?\2\u073f\u0736\3\2\2\2\u073f"+
		"\u073e\3\2\2\2\u0740\u0742\3\2\2\2\u0741\u0735\3\2\2\2\u0741\u0742\3\2"+
		"\2\2\u0742\u0745\3\2\2\2\u0743\u0744\7\u0095\2\2\u0744\u0746\5P)\2\u0745"+
		"\u0743\3\2\2\2\u0745\u0746\3\2\2\2\u0746\u0755\3\2\2\2\u0747\u0748\7P"+
		"\2\2\u0748\u0749\7*\2\2\u0749\u074e\5P)\2\u074a\u074b\7\7\2\2\u074b\u074d"+
		"\5P)\2\u074c\u074a\3\2\2\2\u074d\u0750\3\2\2\2\u074e\u074c\3\2\2\2\u074e"+
		"\u074f\3\2\2\2\u074f\u0753\3\2\2\2\u0750\u074e\3\2\2\2\u0751\u0752\7Q"+
		"\2\2\u0752\u0754\5P)\2\u0753\u0751\3\2\2\2\u0753\u0754\3\2\2\2\u0754\u0756"+
		"\3\2\2\2\u0755\u0747\3\2\2\2\u0755\u0756\3\2\2\2\u0756\u0774\3\2\2\2\u0757"+
		"\u0758\7\u0091\2\2\u0758\u0759\7\5\2\2\u0759\u075e\5P)\2\u075a\u075b\7"+
		"\7\2\2\u075b\u075d\5P)\2\u075c\u075a\3\2\2\2\u075d\u0760\3\2\2\2\u075e"+
		"\u075c\3\2\2\2\u075e\u075f\3\2\2\2\u075f\u0761\3\2\2\2\u0760\u075e\3\2"+
		"\2\2\u0761\u0770\7\6\2\2\u0762\u0763\7\7\2\2\u0763\u0764\7\5\2\2\u0764"+
		"\u0769\5P)\2\u0765\u0766\7\7\2\2\u0766\u0768\5P)\2\u0767\u0765\3\2\2\2"+
		"\u0768\u076b\3\2\2\2\u0769\u0767\3\2\2\2\u0769\u076a\3\2\2\2\u076a\u076c"+
		"\3\2\2\2\u076b\u0769\3\2\2\2\u076c\u076d\7\6\2\2\u076d\u076f\3\2\2\2\u076e"+
		"\u0762\3\2\2\2\u076f\u0772\3\2\2\2\u0770\u076e\3\2\2\2\u0770\u0771\3\2"+
		"\2\2\u0771\u0774\3\2\2\2\u0772\u0770\3\2\2\2\u0773\u0729\3\2\2\2\u0773"+
		"\u0757\3\2\2\2\u0774\u0083\3\2\2\2\u0775\u077b\7\u008c\2\2\u0776\u0777"+
		"\7\u008c\2\2\u0777\u077b\7\37\2\2\u0778\u077b\7\\\2\2\u0779\u077b\7F\2"+
		"\2\u077a\u0775\3\2\2\2\u077a\u0776\3\2\2\2\u077a\u0778\3\2\2\2\u077a\u0779"+
		"\3\2\2\2\u077b\u0085\3\2\2\2\u077c\u0788\5\u009cO\2\u077d\u077e\7\5\2"+
		"\2\u077e\u0783\5\u00a2R\2\u077f\u0780\7\7\2\2\u0780\u0782\5\u00a2R\2\u0781"+
		"\u077f\3\2\2\2\u0782\u0785\3\2\2\2\u0783\u0781\3\2\2\2\u0783\u0784\3\2"+
		"\2\2\u0784\u0786\3\2\2\2\u0785\u0783\3\2\2\2\u0786\u0787\7\6\2\2\u0787"+
		"\u0789\3\2\2\2\u0788\u077d\3\2\2\2\u0788\u0789\3\2\2\2\u0789\u0087\3\2"+
		"\2\2\u078a\u078c\t\n\2\2\u078b\u078a\3\2\2\2\u078b\u078c\3\2\2\2\u078c"+
		"\u078d\3\2\2\2\u078d\u078e\7\u00ab\2\2\u078e\u0089\3\2\2\2\u078f\u0790"+
		"\t\21\2\2\u0790\u008b\3\2\2\2\u0791\u0792\t\22\2\2\u0792\u008d\3\2\2\2"+
		"\u0793\u0794\7\u00ad\2\2\u0794\u008f\3\2\2\2\u0795\u0798\5P)\2\u0796\u0798"+
		"\5H%\2\u0797\u0795\3\2\2\2\u0797\u0796\3\2\2\2\u0798\u0091\3\2\2\2\u0799"+
		"\u079a\t\23\2\2\u079a\u0093\3\2\2\2\u079b\u079c\t\24\2\2\u079c\u0095\3"+
		"\2\2\2\u079d\u079e\5\u00b8]\2\u079e\u0097\3\2\2\2\u079f\u07a0\5\u00b8"+
		"]\2\u07a0\u0099\3\2\2\2\u07a1\u07a2\5\u00b8]\2\u07a2\u009b\3\2\2\2\u07a3"+
		"\u07a4\5\u00b8]\2\u07a4\u009d\3\2\2\2\u07a5\u07a6\5\u00b8]\2\u07a6\u009f"+
		"\3\2\2\2\u07a7\u07a8\5\u00b8]\2\u07a8\u00a1\3\2\2\2\u07a9\u07aa\5\u00b8"+
		"]\2\u07aa\u00a3\3\2\2\2\u07ab\u07ac\5\u00b8]\2\u07ac\u00a5\3\2\2\2\u07ad"+
		"\u07ae\5\u00b8]\2\u07ae\u00a7\3\2\2\2\u07af\u07b0\5\u00b8]\2\u07b0\u00a9"+
		"\3\2\2\2\u07b1\u07b2\5\u00b8]\2\u07b2\u00ab\3\2\2\2\u07b3\u07b4\5\u00b8"+
		"]\2\u07b4\u00ad\3\2\2\2\u07b5\u07b6\5\u00b8]\2\u07b6\u00af\3\2\2\2\u07b7"+
		"\u07b8\5\u00b8]\2\u07b8\u00b1\3\2\2\2\u07b9\u07ba\5\u00b8]\2\u07ba\u00b3"+
		"\3\2\2\2\u07bb\u07bc\5\u00b8]\2\u07bc\u00b5\3\2\2\2\u07bd\u07be\5\u00b8"+
		"]\2\u07be\u00b7\3\2\2\2\u07bf\u07c7\7\u00aa\2\2\u07c0\u07c7\5\u0094K\2"+
		"\u07c1\u07c7\7\u00ad\2\2\u07c2\u07c3\7\5\2\2\u07c3\u07c4\5\u00b8]\2\u07c4"+
		"\u07c5\7\6\2\2\u07c5\u07c7\3\2\2\2\u07c6\u07bf\3\2\2\2\u07c6\u07c0\3\2"+
		"\2\2\u07c6\u07c1\3\2\2\2\u07c6\u07c2\3\2\2\2\u07c7\u00b9\3\2\2\2\u0114"+
		"\u00bc\u00be\u00c9\u00d0\u00d5\u00db\u00e1\u00e3\u0103\u010a\u0112\u0115"+
		"\u011e\u0122\u012a\u012e\u0130\u0135\u0137\u013b\u0142\u0145\u014a\u014e"+
		"\u0153\u015c\u015f\u0165\u0167\u016b\u0171\u0176\u0181\u0187\u018b\u0191"+
		"\u0196\u019f\u01a6\u01ac\u01b0\u01b4\u01ba\u01bf\u01c6\u01d1\u01d4\u01d6"+
		"\u01dc\u01e2\u01e6\u01ed\u01f3\u01f9\u01ff\u0204\u0210\u0215\u0220\u0225"+
		"\u0228\u022f\u0232\u0239\u0242\u0245\u024b\u024d\u0251\u0259\u025e\u0266"+
		"\u026b\u0273\u0278\u0280\u0285\u028b\u0292\u0295\u029d\u02a7\u02aa\u02b0"+
		"\u02b2\u02b5\u02c8\u02ce\u02d7\u02dc\u02e5\u02f0\u02f7\u02fd\u0303\u030c"+
		"\u0313\u0317\u0319\u031d\u0324\u0326\u032a\u032d\u0334\u033b\u033e\u0348"+
		"\u034b\u0351\u0353\u0357\u035e\u0361\u0369\u0373\u0376\u037c\u037e\u0382"+
		"\u0389\u0392\u0396\u0398\u039c\u03a5\u03aa\u03ac\u03b5\u03c0\u03c7\u03ca"+
		"\u03cd\u03da\u03e8\u03ed\u03f0\u03fd\u040b\u0410\u0419\u041c\u0422\u0424"+
		"\u042a\u042f\u0435\u0441\u0445\u044a\u044e\u0451\u0463\u0468\u046d\u0475"+
		"\u047a\u0483\u048a\u048e\u049e\u04a1\u04a9\u04b2\u04b6\u04bc\u04da\u04e6"+
		"\u04eb\u04f7\u04fd\u0504\u0508\u0512\u0515\u051b\u051e\u0520\u0522\u052d"+
		"\u0532\u053e\u0542\u0546\u054a\u0551\u0553\u055b\u0562\u0565\u0569\u056e"+
		"\u0576\u0589\u058f\u0593\u05a3\u05a9\u05b1\u05b6\u05b9\u05be\u05c7\u05cc"+
		"\u05da\u05dd\u05e0\u05e2\u05eb\u05f1\u05fb\u05fe\u0607\u0612\u0615\u061b"+
		"\u0629\u062f\u0637\u063a\u0640\u0650\u0656\u0661\u066e\u0671\u067a\u0687"+
		"\u068e\u069b\u06a2\u06a6\u06ab\u06af\u06bb\u06c4\u06cd\u06d2\u06d6\u06d9"+
		"\u06e0\u06e8\u06ec\u06f0\u06f3\u06f9\u06fc\u06fe\u0707\u070c\u0710\u0714"+
		"\u0717\u0722\u0727\u072b\u0732\u073b\u073f\u0741\u0745\u074e\u0753\u0755"+
		"\u075e\u0769\u0770\u0773\u077a\u0783\u0788\u078b\u0797\u07c6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}