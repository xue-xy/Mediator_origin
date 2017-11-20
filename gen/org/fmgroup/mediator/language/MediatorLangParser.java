// Generated from /Users/liyi/Library/Mobile Documents/com~apple~CloudDocs/项目/Mediator/src-antlr/MediatorLang.g4 by ANTLR 4.7
package org.fmgroup.mediator.language;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MediatorLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, LINE_COMMENT=63, COMMENT=64, IGNORE=65, 
		INT=66, REAL=67, STRING=68, BOOLEAN=69, ID=70;
	public static final int
		RULE_prog = 0, RULE_dependency = 1, RULE_typedef = 2, RULE_statement = 3, 
		RULE_statements = 4, RULE_entityTemplate = 5, RULE_function = 6, RULE_localVariableDef = 7, 
		RULE_funcInterface = 8, RULE_portsDecl = 9, RULE_compInterface = 10, RULE_variableSegment = 11, 
		RULE_transitionSegment = 12, RULE_transition = 13, RULE_automaton = 14, 
		RULE_componentSegment = 15, RULE_internalSegment = 16, RULE_connectionSegment = 17, 
		RULE_componentDecl = 18, RULE_connectionDecl = 19, RULE_system = 20, RULE_term = 21, 
		RULE_value = 22, RULE_type = 23, RULE_typeorvalue = 24, RULE_scopedID = 25;
	public static final String[] ruleNames = {
		"prog", "dependency", "typedef", "statement", "statements", "template",
		"function", "localVariableDef", "funcInterface", "portsDecl", "entityInterface",
		"variableSegment", "transitionSegment", "transition", "automaton", "componentSegment", 
		"internalSegment", "connectionSegment", "componentDecl", "connectionDecl", 
		"system", "term", "value", "type", "typeorvalue", "scopedID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'import'", "'.'", "'*'", "';'", "'typedef'", "'as'", "','", "'='", 
		"'sync'", "'return'", "'if'", "'('", "')'", "'{'", "'}'", "'else'", "'<'", 
		"'>'", "'native'", "'function'", "':'", "'variables'", "'statements'", 
		"'in'", "'out'", "'transitions'", "'->'", "'group'", "'automaton'", "'components'", 
		"'internals'", "'connections'", "'system'", "'['", "']'", "'-'", "'!'", 
		"'%'", "'/'", "'+'", "'<='", "'>='", "'=='", "'!='", "'^'", "'^^'", "'&'", 
		"'&&'", "'|'", "'||'", "'?'", "'null'", "'int'", "'..'", "'char'", "'double'", 
		"'bool'", "'enum'", "'struct'", "'init'", "'type'", "'NULL'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "LINE_COMMENT", "COMMENT", "IGNORE", "INT", "REAL", 
		"STRING", "BOOLEAN", "ID"
	};
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
	public String getGrammarFileName() { return "MediatorLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MediatorLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<DependencyContext> dependency() {
			return getRuleContexts(DependencyContext.class);
		}
		public DependencyContext dependency(int i) {
			return getRuleContext(DependencyContext.class,i);
		}
		public List<TypedefContext> typedef() {
			return getRuleContexts(TypedefContext.class);
		}
		public TypedefContext typedef(int i) {
			return getRuleContext(TypedefContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<AutomatonContext> automaton() {
			return getRuleContexts(AutomatonContext.class);
		}
		public AutomatonContext automaton(int i) {
			return getRuleContext(AutomatonContext.class,i);
		}
		public List<SystemContext> system() {
			return getRuleContexts(SystemContext.class);
		}
		public SystemContext system(int i) {
			return getRuleContext(SystemContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__18) | (1L << T__19) | (1L << T__28) | (1L << T__32))) != 0)) {
				{
				setState(57);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
					{
					setState(52);
					dependency();
					}
					break;
				case T__4:
					{
					setState(53);
					typedef();
					}
					break;
				case T__18:
				case T__19:
					{
					setState(54);
					function();
					}
					break;
				case T__28:
					{
					setState(55);
					automaton();
					}
					break;
				case T__32:
					{
					setState(56);
					system();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(61);
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

	public static class DependencyContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MediatorLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MediatorLangParser.ID, i);
		}
		public DependencyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dependency; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterDependency(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitDependency(this);
		}
	}

	public final DependencyContext dependency() throws RecognitionException {
		DependencyContext _localctx = new DependencyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dependency);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__0);
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(63);
					match(ID);
					setState(64);
					match(T__1);
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(70);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(71);
			match(T__3);
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

	public static class TypedefContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(MediatorLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MediatorLangParser.ID, i);
		}
		public TypedefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterTypedef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitTypedef(this);
		}
	}

	public final TypedefContext typedef() throws RecognitionException {
		TypedefContext _localctx = new TypedefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_typedef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__4);
			setState(74);
			type(0);
			setState(75);
			match(T__5);
			setState(76);
			match(ID);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(77);
				match(T__6);
				setState(78);
				match(ID);
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
			match(T__3);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IteStatementContext extends StatementContext {
		public TermContext condition;
		public StatementContext thenstmt;
		public StatementsContext thenstmts;
		public StatementContext elsestmt;
		public StatementsContext elsestmts;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public IteStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterIteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitIteStatement(this);
		}
	}
	public static class AssignmentStatementContext extends StatementContext {
		public TermContext target;
		public TermContext expr;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public AssignmentStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitAssignmentStatement(this);
		}
	}
	public static class ReturnStatementContext extends StatementContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ReturnStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitReturnStatement(this);
		}
	}
	public static class SynchronizingStatementContext extends StatementContext {
		public List<TerminalNode> ID() { return getTokens(MediatorLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MediatorLangParser.ID, i);
		}
		public SynchronizingStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterSynchronizingStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitSynchronizingStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		int _la;
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__33:
			case T__35:
			case T__36:
			case T__51:
			case INT:
			case REAL:
			case STRING:
			case BOOLEAN:
			case ID:
				_localctx = new AssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(86);
					((AssignmentStatementContext)_localctx).target = term(0);
					setState(87);
					match(T__7);
					}
					break;
				}
				setState(91);
				((AssignmentStatementContext)_localctx).expr = term(0);
				setState(92);
				match(T__3);
				}
				break;
			case T__8:
				_localctx = new SynchronizingStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(T__8);
				setState(95);
				match(ID);
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(96);
					match(T__6);
					setState(97);
					match(ID);
					}
					}
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(103);
				match(T__3);
				}
				break;
			case T__9:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				match(T__9);
				setState(105);
				term(0);
				setState(106);
				match(T__3);
				}
				break;
			case T__10:
				_localctx = new IteStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
				match(T__10);
				setState(109);
				match(T__11);
				setState(110);
				((IteStatementContext)_localctx).condition = term(0);
				setState(111);
				match(T__12);
				setState(117);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__33:
				case T__35:
				case T__36:
				case T__51:
				case INT:
				case REAL:
				case STRING:
				case BOOLEAN:
				case ID:
					{
					setState(112);
					((IteStatementContext)_localctx).thenstmt = statement();
					}
					break;
				case T__13:
					{
					setState(113);
					match(T__13);
					setState(114);
					((IteStatementContext)_localctx).thenstmts = statements();
					setState(115);
					match(T__14);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(127);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(119);
					match(T__15);
					setState(125);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__8:
					case T__9:
					case T__10:
					case T__11:
					case T__33:
					case T__35:
					case T__36:
					case T__51:
					case INT:
					case REAL:
					case STRING:
					case BOOLEAN:
					case ID:
						{
						setState(120);
						((IteStatementContext)_localctx).elsestmt = statement();
						}
						break;
					case T__13:
						{
						setState(121);
						match(T__13);
						setState(122);
						((IteStatementContext)_localctx).elsestmts = statements();
						setState(123);
						match(T__14);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
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

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (T__8 - 9)) | (1L << (T__9 - 9)) | (1L << (T__10 - 9)) | (1L << (T__11 - 9)) | (1L << (T__33 - 9)) | (1L << (T__35 - 9)) | (1L << (T__36 - 9)) | (1L << (T__51 - 9)) | (1L << (INT - 9)) | (1L << (REAL - 9)) | (1L << (STRING - 9)) | (1L << (BOOLEAN - 9)) | (1L << (ID - 9)))) != 0)) {
				{
				{
				setState(131);
				statement();
				}
				}
				setState(136);
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

	public static class EntityTemplateContext extends ParserRuleContext {
		public List<LocalVariableDefContext> localVariableDef() {
			return getRuleContexts(LocalVariableDefContext.class);
		}
		public LocalVariableDefContext localVariableDef(int i) {
			return getRuleContext(LocalVariableDefContext.class,i);
		}
		public EntityTemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entityTemplate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterEntityTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitEntityTemplate(this);
		}
	}

	public final EntityTemplateContext entityTemplate() throws RecognitionException {
		EntityTemplateContext _localctx = new EntityTemplateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_entityTemplate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__16);
			setState(138);
			localVariableDef();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(139);
				match(T__6);
				setState(140);
				localVariableDef();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			match(T__17);
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

	public static class FunctionContext extends ParserRuleContext {
		public boolean isNative = false;
		public Token name;
		public TypeContext returnType;
		public FuncInterfaceContext funcInterface() {
			return getRuleContext(FuncInterfaceContext.class,0);
		}
		public TerminalNode ID() { return getToken(MediatorLangParser.ID, 0); }
		public EntityTemplateContext entityTemplate() {
			return getRuleContext(EntityTemplateContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<LocalVariableDefContext> localVariableDef() {
			return getRuleContexts(LocalVariableDefContext.class);
		}
		public LocalVariableDefContext localVariableDef(int i) {
			return getRuleContext(LocalVariableDefContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(148);
				match(T__18);
				((FunctionContext)_localctx).isNative =  true; 
				}
			}

			setState(152);
			match(T__19);
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(153);
				entityTemplate();
				}
			}

			setState(156);
			((FunctionContext)_localctx).name = match(ID);
			setState(157);
			match(T__11);
			setState(158);
			funcInterface();
			setState(159);
			match(T__12);
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(160);
				match(T__20);
				setState(161);
				((FunctionContext)_localctx).returnType = type(0);
				}
				break;
			}
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(164);
				if (!(!_localctx.isNative)) throw new FailedPredicateException(this, "!$isNative");
				setState(165);
				match(T__13);
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__21 || _la==T__22) {
					{
					setState(186);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__21:
						{
						setState(166);
						match(T__21);
						setState(167);
						match(T__13);
						setState(173);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==ID) {
							{
							{
							setState(168);
							localVariableDef();
							setState(169);
							match(T__3);
							}
							}
							setState(175);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(176);
						match(T__14);
						}
						break;
					case T__22:
						{
						setState(177);
						match(T__22);
						setState(178);
						match(T__13);
						setState(182);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (((((_la - 9)) & ~0x3f) == 0 && ((1L << (_la - 9)) & ((1L << (T__8 - 9)) | (1L << (T__9 - 9)) | (1L << (T__10 - 9)) | (1L << (T__11 - 9)) | (1L << (T__33 - 9)) | (1L << (T__35 - 9)) | (1L << (T__36 - 9)) | (1L << (T__51 - 9)) | (1L << (INT - 9)) | (1L << (REAL - 9)) | (1L << (STRING - 9)) | (1L << (BOOLEAN - 9)) | (1L << (ID - 9)))) != 0)) {
							{
							{
							setState(179);
							statement();
							}
							}
							setState(184);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(185);
						match(T__14);
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
				match(T__14);
				}
				break;
			case 2:
				{
				setState(192);
				if (!(_localctx.isNative)) throw new FailedPredicateException(this, "$isNative");
				setState(193);
				match(T__3);
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

	public static class LocalVariableDefContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MediatorLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MediatorLangParser.ID, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public LocalVariableDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterLocalVariableDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitLocalVariableDef(this);
		}
	}

	public final LocalVariableDefContext localVariableDef() throws RecognitionException {
		LocalVariableDefContext _localctx = new LocalVariableDefContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_localVariableDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(ID);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(197);
				match(T__6);
				setState(198);
				match(ID);
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
			match(T__20);
			setState(205);
			type(0);
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

	public static class FuncInterfaceContext extends ParserRuleContext {
		public List<LocalVariableDefContext> localVariableDef() {
			return getRuleContexts(LocalVariableDefContext.class);
		}
		public LocalVariableDefContext localVariableDef(int i) {
			return getRuleContext(LocalVariableDefContext.class,i);
		}
		public FuncInterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcInterface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterFuncInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitFuncInterface(this);
		}
	}

	public final FuncInterfaceContext funcInterface() throws RecognitionException {
		FuncInterfaceContext _localctx = new FuncInterfaceContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funcInterface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(207);
				localVariableDef();
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(208);
					match(T__6);
					setState(209);
					localVariableDef();
					}
					}
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class PortsDeclContext extends ParserRuleContext {
		public Token direction;
		public List<TerminalNode> ID() { return getTokens(MediatorLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MediatorLangParser.ID, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public PortsDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_portsDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterPortsDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitPortsDecl(this);
		}
	}

	public final PortsDeclContext portsDecl() throws RecognitionException {
		PortsDeclContext _localctx = new PortsDeclContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_portsDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(ID);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(218);
				match(T__6);
				setState(219);
				match(ID);
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(225);
			match(T__20);
			setState(226);
			((PortsDeclContext)_localctx).direction = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__23 || _la==T__24) ) {
				((PortsDeclContext)_localctx).direction = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(227);
			type(0);
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

	public static class CompInterfaceContext extends ParserRuleContext {
		public List<PortsDeclContext> portsDecl() {
			return getRuleContexts(PortsDeclContext.class);
		}
		public PortsDeclContext portsDecl(int i) {
			return getRuleContext(PortsDeclContext.class,i);
		}
		public CompInterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compInterface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterCompInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitCompInterface(this);
		}
	}

	public final CompInterfaceContext compInterface() throws RecognitionException {
		CompInterfaceContext _localctx = new CompInterfaceContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_compInterface);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(229);
				portsDecl();
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(230);
					match(T__6);
					setState(231);
					portsDecl();
					}
					}
					setState(236);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class VariableSegmentContext extends ParserRuleContext {
		public List<LocalVariableDefContext> localVariableDef() {
			return getRuleContexts(LocalVariableDefContext.class);
		}
		public LocalVariableDefContext localVariableDef(int i) {
			return getRuleContext(LocalVariableDefContext.class,i);
		}
		public VariableSegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableSegment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterVariableSegment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitVariableSegment(this);
		}
	}

	public final VariableSegmentContext variableSegment() throws RecognitionException {
		VariableSegmentContext _localctx = new VariableSegmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableSegment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(T__21);
			setState(240);
			match(T__13);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(241);
				localVariableDef();
				setState(242);
				match(T__3);
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249);
			match(T__14);
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

	public static class TransitionSegmentContext extends ParserRuleContext {
		public List<TransitionContext> transition() {
			return getRuleContexts(TransitionContext.class);
		}
		public TransitionContext transition(int i) {
			return getRuleContext(TransitionContext.class,i);
		}
		public TransitionSegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transitionSegment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterTransitionSegment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitTransitionSegment(this);
		}
	}

	public final TransitionSegmentContext transitionSegment() throws RecognitionException {
		TransitionSegmentContext _localctx = new TransitionSegmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_transitionSegment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(T__25);
			setState(252);
			match(T__13);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & ((1L << (T__11 - 12)) | (1L << (T__27 - 12)) | (1L << (T__33 - 12)) | (1L << (T__35 - 12)) | (1L << (T__36 - 12)) | (1L << (T__51 - 12)) | (1L << (INT - 12)) | (1L << (REAL - 12)) | (1L << (STRING - 12)) | (1L << (BOOLEAN - 12)) | (1L << (ID - 12)))) != 0)) {
				{
				{
				setState(253);
				transition();
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(259);
			match(T__14);
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

	public static class TransitionContext extends ParserRuleContext {
		public TransitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transition; }
	 
		public TransitionContext() { }
		public void copyFrom(TransitionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TransitionGroupContext extends TransitionContext {
		public List<TransitionContext> transition() {
			return getRuleContexts(TransitionContext.class);
		}
		public TransitionContext transition(int i) {
			return getRuleContext(TransitionContext.class,i);
		}
		public TransitionGroupContext(TransitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterTransitionGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitTransitionGroup(this);
		}
	}
	public static class TransitionSingleContext extends TransitionContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TransitionSingleContext(TransitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterTransitionSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitTransitionSingle(this);
		}
	}

	public final TransitionContext transition() throws RecognitionException {
		TransitionContext _localctx = new TransitionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_transition);
		int _la;
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__33:
			case T__35:
			case T__36:
			case T__51:
			case INT:
			case REAL:
			case STRING:
			case BOOLEAN:
			case ID:
				_localctx = new TransitionSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(261);
				term(0);
				setState(262);
				match(T__26);
				setState(268);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__13:
					{
					setState(263);
					match(T__13);
					setState(264);
					statements();
					setState(265);
					match(T__14);
					}
					break;
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__33:
				case T__35:
				case T__36:
				case T__51:
				case INT:
				case REAL:
				case STRING:
				case BOOLEAN:
				case ID:
					{
					setState(267);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__27:
				_localctx = new TransitionGroupContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				match(T__27);
				setState(271);
				match(T__13);
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & ((1L << (T__11 - 12)) | (1L << (T__27 - 12)) | (1L << (T__33 - 12)) | (1L << (T__35 - 12)) | (1L << (T__36 - 12)) | (1L << (T__51 - 12)) | (1L << (INT - 12)) | (1L << (REAL - 12)) | (1L << (STRING - 12)) | (1L << (BOOLEAN - 12)) | (1L << (ID - 12)))) != 0)) {
					{
					{
					setState(272);
					transition();
					}
					}
					setState(277);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(278);
				match(T__14);
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

	public static class AutomatonContext extends ParserRuleContext {
		public Token name;
		public CompInterfaceContext compInterface() {
			return getRuleContext(CompInterfaceContext.class,0);
		}
		public TerminalNode ID() { return getToken(MediatorLangParser.ID, 0); }
		public EntityTemplateContext entityTemplate() {
			return getRuleContext(EntityTemplateContext.class,0);
		}
		public List<VariableSegmentContext> variableSegment() {
			return getRuleContexts(VariableSegmentContext.class);
		}
		public VariableSegmentContext variableSegment(int i) {
			return getRuleContext(VariableSegmentContext.class,i);
		}
		public List<TransitionSegmentContext> transitionSegment() {
			return getRuleContexts(TransitionSegmentContext.class);
		}
		public TransitionSegmentContext transitionSegment(int i) {
			return getRuleContext(TransitionSegmentContext.class,i);
		}
		public AutomatonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_automaton; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterAutomaton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitAutomaton(this);
		}
	}

	public final AutomatonContext automaton() throws RecognitionException {
		AutomatonContext _localctx = new AutomatonContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_automaton);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(T__28);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(282);
				entityTemplate();
				}
			}

			setState(285);
			((AutomatonContext)_localctx).name = match(ID);
			setState(286);
			match(T__11);
			setState(287);
			compInterface();
			setState(288);
			match(T__12);
			setState(289);
			match(T__13);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__21 || _la==T__25) {
				{
				setState(292);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__21:
					{
					setState(290);
					variableSegment();
					}
					break;
				case T__25:
					{
					setState(291);
					transitionSegment();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(297);
			match(T__14);
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

	public static class ComponentSegmentContext extends ParserRuleContext {
		public List<ComponentDeclContext> componentDecl() {
			return getRuleContexts(ComponentDeclContext.class);
		}
		public ComponentDeclContext componentDecl(int i) {
			return getRuleContext(ComponentDeclContext.class,i);
		}
		public ComponentSegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentSegment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterComponentSegment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitComponentSegment(this);
		}
	}

	public final ComponentSegmentContext componentSegment() throws RecognitionException {
		ComponentSegmentContext _localctx = new ComponentSegmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_componentSegment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(T__29);
			setState(300);
			match(T__13);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(301);
				componentDecl();
				setState(302);
				match(T__3);
				}
				}
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(309);
			match(T__14);
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

	public static class InternalSegmentContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MediatorLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MediatorLangParser.ID, i);
		}
		public InternalSegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_internalSegment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterInternalSegment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitInternalSegment(this);
		}
	}

	public final InternalSegmentContext internalSegment() throws RecognitionException {
		InternalSegmentContext _localctx = new InternalSegmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_internalSegment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			match(T__30);
			setState(312);
			match(ID);
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(313);
				match(T__6);
				setState(314);
				match(ID);
				}
				}
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(320);
			match(T__3);
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

	public static class ConnectionSegmentContext extends ParserRuleContext {
		public List<ConnectionDeclContext> connectionDecl() {
			return getRuleContexts(ConnectionDeclContext.class);
		}
		public ConnectionDeclContext connectionDecl(int i) {
			return getRuleContext(ConnectionDeclContext.class,i);
		}
		public ConnectionSegmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connectionSegment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterConnectionSegment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitConnectionSegment(this);
		}
	}

	public final ConnectionSegmentContext connectionSegment() throws RecognitionException {
		ConnectionSegmentContext _localctx = new ConnectionSegmentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_connectionSegment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(T__31);
			setState(323);
			match(T__13);
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & ((1L << (T__11 - 12)) | (1L << (T__52 - 12)) | (1L << (T__54 - 12)) | (1L << (T__55 - 12)) | (1L << (T__56 - 12)) | (1L << (T__57 - 12)) | (1L << (T__58 - 12)) | (1L << (T__60 - 12)) | (1L << (T__61 - 12)) | (1L << (ID - 12)))) != 0)) {
				{
				{
				setState(324);
				connectionDecl();
				setState(325);
				match(T__3);
				}
				}
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(332);
			match(T__14);
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

	public static class ComponentDeclContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MediatorLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MediatorLangParser.ID, i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ComponentDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterComponentDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitComponentDecl(this);
		}
	}

	public final ComponentDeclContext componentDecl() throws RecognitionException {
		ComponentDeclContext _localctx = new ComponentDeclContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_componentDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(ID);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(335);
				match(T__6);
				setState(336);
				match(ID);
				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(342);
			match(T__20);
			setState(343);
			type(0);
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

	public static class ConnectionDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ConnectionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connectionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterConnectionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitConnectionDecl(this);
		}
	}

	public final ConnectionDeclContext connectionDecl() throws RecognitionException {
		ConnectionDeclContext _localctx = new ConnectionDeclContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_connectionDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			type(0);
			setState(346);
			match(T__11);
			setState(347);
			term(0);
			setState(348);
			match(T__12);
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

	public static class SystemContext extends ParserRuleContext {
		public Token name;
		public CompInterfaceContext compInterface() {
			return getRuleContext(CompInterfaceContext.class,0);
		}
		public TerminalNode ID() { return getToken(MediatorLangParser.ID, 0); }
		public EntityTemplateContext entityTemplate() {
			return getRuleContext(EntityTemplateContext.class,0);
		}
		public List<ComponentSegmentContext> componentSegment() {
			return getRuleContexts(ComponentSegmentContext.class);
		}
		public ComponentSegmentContext componentSegment(int i) {
			return getRuleContext(ComponentSegmentContext.class,i);
		}
		public List<InternalSegmentContext> internalSegment() {
			return getRuleContexts(InternalSegmentContext.class);
		}
		public InternalSegmentContext internalSegment(int i) {
			return getRuleContext(InternalSegmentContext.class,i);
		}
		public List<ConnectionSegmentContext> connectionSegment() {
			return getRuleContexts(ConnectionSegmentContext.class);
		}
		public ConnectionSegmentContext connectionSegment(int i) {
			return getRuleContext(ConnectionSegmentContext.class,i);
		}
		public SystemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_system; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterSystem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitSystem(this);
		}
	}

	public final SystemContext system() throws RecognitionException {
		SystemContext _localctx = new SystemContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_system);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(T__32);
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(351);
				entityTemplate();
				}
			}

			setState(354);
			((SystemContext)_localctx).name = match(ID);
			setState(355);
			match(T__11);
			setState(356);
			compInterface();
			setState(357);
			match(T__12);
			setState(358);
			match(T__13);
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) {
				{
				setState(362);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__29:
					{
					setState(359);
					componentSegment();
					}
					break;
				case T__30:
					{
					setState(360);
					internalSegment();
					}
					break;
				case T__31:
					{
					setState(361);
					connectionSegment();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(367);
			match(T__14);
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

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueTermContext extends TermContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValueTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterValueTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitValueTerm(this);
		}
	}
	public static class IteTermContext extends TermContext {
		public TermContext condition;
		public TermContext ifTrue;
		public TermContext ifFalse;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public IteTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterIteTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitIteTerm(this);
		}
	}
	public static class BinaryOprTermContext extends TermContext {
		public TermContext left;
		public Token opr;
		public TermContext right;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public BinaryOprTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterBinaryOprTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitBinaryOprTerm(this);
		}
	}
	public static class ElementTermContext extends TermContext {
		public TermContext container;
		public TermContext key;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public ElementTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterElementTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitElementTerm(this);
		}
	}
	public static class BracketTermContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public BracketTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterBracketTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitBracketTerm(this);
		}
	}
	public static class TupleTermContext extends TermContext {
		public TermContext left;
		public TermContext right;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TupleTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterTupleTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitTupleTerm(this);
		}
	}
	public static class SingleOprTermContext extends TermContext {
		public Token opr;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public SingleOprTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterSingleOprTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitSingleOprTerm(this);
		}
	}
	public static class ListTermContext extends TermContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ListTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterListTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitListTerm(this);
		}
	}
	public static class CallTermContext extends TermContext {
		public TermContext callee;
		public TermContext args;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public CallTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterCallTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitCallTerm(this);
		}
	}
	public static class FieldTermContext extends TermContext {
		public TermContext structure;
		public Token key;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode ID() { return getToken(MediatorLangParser.ID, 0); }
		public FieldTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterFieldTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitFieldTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				{
				_localctx = new BracketTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(370);
				match(T__11);
				setState(371);
				term(0);
				setState(372);
				match(T__12);
				}
				break;
			case T__33:
				{
				_localctx = new ListTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(374);
				match(T__33);
				setState(375);
				term(0);
				setState(376);
				match(T__34);
				}
				break;
			case T__35:
				{
				_localctx = new SingleOprTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(378);
				((SingleOprTermContext)_localctx).opr = match(T__35);
				setState(379);
				term(25);
				}
				break;
			case T__36:
				{
				_localctx = new SingleOprTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(380);
				((SingleOprTermContext)_localctx).opr = match(T__36);
				setState(381);
				term(24);
				}
				break;
			case T__51:
			case INT:
			case REAL:
			case STRING:
			case BOOLEAN:
			case ID:
				{
				_localctx = new ValueTermContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(382);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(460);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(458);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(385);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(386);
						((BinaryOprTermContext)_localctx).opr = match(T__37);
						setState(387);
						((BinaryOprTermContext)_localctx).right = term(21);
						}
						break;
					case 2:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(388);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(389);
						((BinaryOprTermContext)_localctx).opr = match(T__2);
						setState(390);
						((BinaryOprTermContext)_localctx).right = term(20);
						}
						break;
					case 3:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(391);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(392);
						((BinaryOprTermContext)_localctx).opr = match(T__38);
						setState(393);
						((BinaryOprTermContext)_localctx).right = term(19);
						}
						break;
					case 4:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(394);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(395);
						((BinaryOprTermContext)_localctx).opr = match(T__39);
						setState(396);
						((BinaryOprTermContext)_localctx).right = term(18);
						}
						break;
					case 5:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(397);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(398);
						((BinaryOprTermContext)_localctx).opr = match(T__35);
						setState(399);
						((BinaryOprTermContext)_localctx).right = term(17);
						}
						break;
					case 6:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(400);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(401);
						((BinaryOprTermContext)_localctx).opr = match(T__16);
						setState(402);
						((BinaryOprTermContext)_localctx).right = term(16);
						}
						break;
					case 7:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(403);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(404);
						((BinaryOprTermContext)_localctx).opr = match(T__40);
						setState(405);
						((BinaryOprTermContext)_localctx).right = term(15);
						}
						break;
					case 8:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(406);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(407);
						((BinaryOprTermContext)_localctx).opr = match(T__17);
						setState(408);
						((BinaryOprTermContext)_localctx).right = term(14);
						}
						break;
					case 9:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(409);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(410);
						((BinaryOprTermContext)_localctx).opr = match(T__41);
						setState(411);
						((BinaryOprTermContext)_localctx).right = term(13);
						}
						break;
					case 10:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(412);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(413);
						((BinaryOprTermContext)_localctx).opr = match(T__42);
						setState(414);
						((BinaryOprTermContext)_localctx).right = term(12);
						}
						break;
					case 11:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(415);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(416);
						((BinaryOprTermContext)_localctx).opr = match(T__43);
						setState(417);
						((BinaryOprTermContext)_localctx).right = term(11);
						}
						break;
					case 12:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(418);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(419);
						((BinaryOprTermContext)_localctx).opr = match(T__44);
						setState(420);
						((BinaryOprTermContext)_localctx).right = term(10);
						}
						break;
					case 13:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(421);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(422);
						((BinaryOprTermContext)_localctx).opr = match(T__45);
						setState(423);
						((BinaryOprTermContext)_localctx).right = term(9);
						}
						break;
					case 14:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(424);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(425);
						((BinaryOprTermContext)_localctx).opr = match(T__46);
						setState(426);
						((BinaryOprTermContext)_localctx).right = term(8);
						}
						break;
					case 15:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(427);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(428);
						((BinaryOprTermContext)_localctx).opr = match(T__47);
						setState(429);
						((BinaryOprTermContext)_localctx).right = term(7);
						}
						break;
					case 16:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(430);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(431);
						((BinaryOprTermContext)_localctx).opr = match(T__48);
						setState(432);
						((BinaryOprTermContext)_localctx).right = term(6);
						}
						break;
					case 17:
						{
						_localctx = new BinaryOprTermContext(new TermContext(_parentctx, _parentState));
						((BinaryOprTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(433);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(434);
						((BinaryOprTermContext)_localctx).opr = match(T__49);
						setState(435);
						((BinaryOprTermContext)_localctx).right = term(5);
						}
						break;
					case 18:
						{
						_localctx = new IteTermContext(new TermContext(_parentctx, _parentState));
						((IteTermContext)_localctx).condition = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(436);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(437);
						match(T__50);
						setState(438);
						((IteTermContext)_localctx).ifTrue = term(0);
						setState(439);
						match(T__20);
						setState(440);
						((IteTermContext)_localctx).ifFalse = term(4);
						}
						break;
					case 19:
						{
						_localctx = new TupleTermContext(new TermContext(_parentctx, _parentState));
						((TupleTermContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(442);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(443);
						match(T__6);
						setState(444);
						((TupleTermContext)_localctx).right = term(3);
						}
						break;
					case 20:
						{
						_localctx = new CallTermContext(new TermContext(_parentctx, _parentState));
						((CallTermContext)_localctx).callee = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(445);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(446);
						match(T__11);
						setState(447);
						((CallTermContext)_localctx).args = term(0);
						setState(448);
						match(T__12);
						}
						break;
					case 21:
						{
						_localctx = new ElementTermContext(new TermContext(_parentctx, _parentState));
						((ElementTermContext)_localctx).container = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(450);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(451);
						match(T__33);
						setState(452);
						((ElementTermContext)_localctx).key = term(0);
						setState(453);
						match(T__34);
						}
						break;
					case 22:
						{
						_localctx = new FieldTermContext(new TermContext(_parentctx, _parentState));
						((FieldTermContext)_localctx).structure = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(455);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(456);
						match(T__1);
						setState(457);
						((FieldTermContext)_localctx).key = match(ID);
						}
						break;
					}
					} 
				}
				setState(462);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntValueContext extends ValueContext {
		public TerminalNode INT() { return getToken(MediatorLangParser.INT, 0); }
		public IntValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterIntValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitIntValue(this);
		}
	}
	public static class BoolValueContext extends ValueContext {
		public TerminalNode BOOLEAN() { return getToken(MediatorLangParser.BOOLEAN, 0); }
		public BoolValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterBoolValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitBoolValue(this);
		}
	}
	public static class IdValueContext extends ValueContext {
		public ScopedIDContext scopedID() {
			return getRuleContext(ScopedIDContext.class,0);
		}
		public IdValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterIdValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitIdValue(this);
		}
	}
	public static class DoubleValueContext extends ValueContext {
		public TerminalNode REAL() { return getToken(MediatorLangParser.REAL, 0); }
		public DoubleValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterDoubleValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitDoubleValue(this);
		}
	}
	public static class StrValueContext extends ValueContext {
		public TerminalNode STRING() { return getToken(MediatorLangParser.STRING, 0); }
		public StrValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterStrValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitStrValue(this);
		}
	}
	public static class NullValueContext extends ValueContext {
		public NullValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterNullValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitNullValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_value);
		try {
			setState(469);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				match(INT);
				}
				break;
			case REAL:
				_localctx = new DoubleValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				match(REAL);
				}
				break;
			case STRING:
				_localctx = new StrValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(465);
				match(STRING);
				}
				break;
			case BOOLEAN:
				_localctx = new BoolValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(466);
				match(BOOLEAN);
				}
				break;
			case ID:
				_localctx = new IdValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(467);
				scopedID();
				}
				break;
			case T__51:
				_localctx = new NullValueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(468);
				match(T__51);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BracketTypeContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BracketTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterBracketType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitBracketType(this);
		}
	}
	public static class CharTypeContext extends TypeContext {
		public CharTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterCharType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitCharType(this);
		}
	}
	public static class DoubleTypeContext extends TypeContext {
		public DoubleTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterDoubleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitDoubleType(this);
		}
	}
	public static class IdTypeContext extends TypeContext {
		public ScopedIDContext scopedID() {
			return getRuleContext(ScopedIDContext.class,0);
		}
		public IdTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterIdType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitIdType(this);
		}
	}
	public static class AbstractTypeContext extends TypeContext {
		public AbstractTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterAbstractType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitAbstractType(this);
		}
	}
	public static class IntTypeContext extends TypeContext {
		public IntTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitIntType(this);
		}
	}
	public static class EnumTypeContext extends TypeContext {
		public List<TerminalNode> ID() { return getTokens(MediatorLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MediatorLangParser.ID, i);
		}
		public EnumTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterEnumType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitEnumType(this);
		}
	}
	public static class InitTypeContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public InitTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterInitType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitInitType(this);
		}
	}
	public static class ListTypeContext extends TypeContext {
		public TermContext capacity;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ListTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterListType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitListType(this);
		}
	}
	public static class BoolTypeContext extends TypeContext {
		public BoolTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterBoolType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitBoolType(this);
		}
	}
	public static class InterfaceTypeContext extends TypeContext {
		public ScopedIDContext scopedID() {
			return getRuleContext(ScopedIDContext.class,0);
		}
		public List<TypeorvalueContext> typeorvalue() {
			return getRuleContexts(TypeorvalueContext.class);
		}
		public TypeorvalueContext typeorvalue(int i) {
			return getRuleContext(TypeorvalueContext.class,i);
		}
		public InterfaceTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitInterfaceType(this);
		}
	}
	public static class BoundedIntTypeContext extends TypeContext {
		public TermContext lbound;
		public TermContext ubound;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public BoundedIntTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterBoundedIntType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitBoundedIntType(this);
		}
	}
	public static class StructTypeContext extends TypeContext {
		public List<TerminalNode> ID() { return getTokens(MediatorLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MediatorLangParser.ID, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public StructTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterStructType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitStructType(this);
		}
	}
	public static class NullTypeContext extends TypeContext {
		public NullTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterNullType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitNullType(this);
		}
	}
	public static class UnionTypeContext extends TypeContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public UnionTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterUnionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitUnionType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_type, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				_localctx = new BracketTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(472);
				match(T__11);
				setState(473);
				type(0);
				setState(474);
				match(T__12);
				}
				break;
			case 2:
				{
				_localctx = new IntTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(476);
				match(T__52);
				}
				break;
			case 3:
				{
				_localctx = new BoundedIntTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(477);
				match(T__52);
				setState(478);
				((BoundedIntTypeContext)_localctx).lbound = term(0);
				setState(479);
				match(T__53);
				setState(480);
				((BoundedIntTypeContext)_localctx).ubound = term(0);
				}
				break;
			case 4:
				{
				_localctx = new CharTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(482);
				match(T__54);
				}
				break;
			case 5:
				{
				_localctx = new DoubleTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(483);
				match(T__55);
				}
				break;
			case 6:
				{
				_localctx = new BoolTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(484);
				match(T__56);
				}
				break;
			case 7:
				{
				_localctx = new EnumTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(485);
				match(T__57);
				setState(486);
				match(T__13);
				setState(487);
				match(ID);
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(488);
					match(T__6);
					setState(489);
					match(ID);
					}
					}
					setState(494);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(495);
				match(T__14);
				}
				break;
			case 8:
				{
				_localctx = new StructTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(496);
				match(T__58);
				setState(497);
				match(T__13);
				setState(503); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(498);
					match(ID);
					setState(499);
					match(T__20);
					setState(500);
					type(0);
					setState(501);
					match(T__3);
					}
					}
					setState(505); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(507);
				match(T__14);
				}
				break;
			case 9:
				{
				_localctx = new AbstractTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(509);
				match(T__60);
				}
				break;
			case 10:
				{
				_localctx = new NullTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(510);
				match(T__61);
				}
				break;
			case 11:
				{
				_localctx = new IdTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(511);
				scopedID();
				}
				break;
			case 12:
				{
				_localctx = new InterfaceTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(512);
				scopedID();
				setState(524);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(513);
					match(T__16);
					setState(514);
					typeorvalue();
					setState(519);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__6) {
						{
						{
						setState(515);
						match(T__6);
						setState(516);
						typeorvalue();
						}
						}
						setState(521);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(522);
					match(T__17);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(542);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(540);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						_localctx = new UnionTypeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(528);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(529);
						match(T__48);
						setState(530);
						type(6);
						}
						break;
					case 2:
						{
						_localctx = new ListTypeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(531);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(532);
						match(T__33);
						setState(534);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & ((1L << (T__11 - 12)) | (1L << (T__33 - 12)) | (1L << (T__35 - 12)) | (1L << (T__36 - 12)) | (1L << (T__51 - 12)) | (1L << (INT - 12)) | (1L << (REAL - 12)) | (1L << (STRING - 12)) | (1L << (BOOLEAN - 12)) | (1L << (ID - 12)))) != 0)) {
							{
							setState(533);
							((ListTypeContext)_localctx).capacity = term(0);
							}
						}

						setState(536);
						match(T__34);
						}
						break;
					case 3:
						{
						_localctx = new InitTypeContext(new TypeContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(537);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(538);
						match(T__59);
						setState(539);
						term(0);
						}
						break;
					}
					} 
				}
				setState(544);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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

	public static class TypeorvalueContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TypeorvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeorvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterTypeorvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitTypeorvalue(this);
		}
	}

	public final TypeorvalueContext typeorvalue() throws RecognitionException {
		TypeorvalueContext _localctx = new TypeorvalueContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_typeorvalue);
		try {
			setState(547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
				type(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(546);
				value();
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

	public static class ScopedIDContext extends ParserRuleContext {
		public Token ID;
		public List<Token> scopes = new ArrayList<Token>();
		public Token identifier;
		public List<TerminalNode> ID() { return getTokens(MediatorLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MediatorLangParser.ID, i);
		}
		public ScopedIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scopedID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).enterScopedID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MediatorLangListener ) ((MediatorLangListener)listener).exitScopedID(this);
		}
	}

	public final ScopedIDContext scopedID() throws RecognitionException {
		ScopedIDContext _localctx = new ScopedIDContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_scopedID);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(549);
					((ScopedIDContext)_localctx).ID = match(ID);
					((ScopedIDContext)_localctx).scopes.add(((ScopedIDContext)_localctx).ID);
					setState(550);
					match(T__1);
					}
					} 
				}
				setState(555);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			setState(556);
			((ScopedIDContext)_localctx).identifier = match(ID);
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
		case 6:
			return function_sempred((FunctionContext)_localctx, predIndex);
		case 21:
			return term_sempred((TermContext)_localctx, predIndex);
		case 23:
			return type_sempred((TypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean function_sempred(FunctionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return !_localctx.isNative;
		case 1:
			return _localctx.isNative;
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 20);
		case 3:
			return precpred(_ctx, 19);
		case 4:
			return precpred(_ctx, 18);
		case 5:
			return precpred(_ctx, 17);
		case 6:
			return precpred(_ctx, 16);
		case 7:
			return precpred(_ctx, 15);
		case 8:
			return precpred(_ctx, 14);
		case 9:
			return precpred(_ctx, 13);
		case 10:
			return precpred(_ctx, 12);
		case 11:
			return precpred(_ctx, 11);
		case 12:
			return precpred(_ctx, 10);
		case 13:
			return precpred(_ctx, 9);
		case 14:
			return precpred(_ctx, 8);
		case 15:
			return precpred(_ctx, 7);
		case 16:
			return precpred(_ctx, 6);
		case 17:
			return precpred(_ctx, 5);
		case 18:
			return precpred(_ctx, 4);
		case 19:
			return precpred(_ctx, 3);
		case 20:
			return precpred(_ctx, 2);
		case 21:
			return precpred(_ctx, 23);
		case 22:
			return precpred(_ctx, 22);
		case 23:
			return precpred(_ctx, 21);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 24:
			return precpred(_ctx, 5);
		case 25:
			return precpred(_ctx, 7);
		case 26:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3H\u0231\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\7\2<\n\2\f\2\16\2?\13\2\3\3\3"+
		"\3\3\3\7\3D\n\3\f\3\16\3G\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4"+
		"R\n\4\f\4\16\4U\13\4\3\4\3\4\3\5\3\5\3\5\5\5\\\n\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\7\5e\n\5\f\5\16\5h\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5x\n\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0080\n\5\5\5"+
		"\u0082\n\5\5\5\u0084\n\5\3\6\7\6\u0087\n\6\f\6\16\6\u008a\13\6\3\7\3\7"+
		"\3\7\3\7\7\7\u0090\n\7\f\7\16\7\u0093\13\7\3\7\3\7\3\b\3\b\5\b\u0099\n"+
		"\b\3\b\3\b\5\b\u009d\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a5\n\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\7\b\u00ae\n\b\f\b\16\b\u00b1\13\b\3\b\3\b\3\b\3\b"+
		"\7\b\u00b7\n\b\f\b\16\b\u00ba\13\b\3\b\7\b\u00bd\n\b\f\b\16\b\u00c0\13"+
		"\b\3\b\3\b\3\b\5\b\u00c5\n\b\3\t\3\t\3\t\7\t\u00ca\n\t\f\t\16\t\u00cd"+
		"\13\t\3\t\3\t\3\t\3\n\3\n\3\n\7\n\u00d5\n\n\f\n\16\n\u00d8\13\n\5\n\u00da"+
		"\n\n\3\13\3\13\3\13\7\13\u00df\n\13\f\13\16\13\u00e2\13\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\7\f\u00eb\n\f\f\f\16\f\u00ee\13\f\5\f\u00f0\n\f\3"+
		"\r\3\r\3\r\3\r\3\r\7\r\u00f7\n\r\f\r\16\r\u00fa\13\r\3\r\3\r\3\16\3\16"+
		"\3\16\7\16\u0101\n\16\f\16\16\16\u0104\13\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u010f\n\17\3\17\3\17\3\17\7\17\u0114\n\17\f"+
		"\17\16\17\u0117\13\17\3\17\5\17\u011a\n\17\3\20\3\20\5\20\u011e\n\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0127\n\20\f\20\16\20\u012a\13"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\7\21\u0133\n\21\f\21\16\21\u0136"+
		"\13\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u013e\n\22\f\22\16\22\u0141"+
		"\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\7\23\u014a\n\23\f\23\16\23\u014d"+
		"\13\23\3\23\3\23\3\24\3\24\3\24\7\24\u0154\n\24\f\24\16\24\u0157\13\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\5\26\u0163\n\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u016d\n\26\f\26\16\26\u0170\13"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\5\27\u0182\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u01cd\n\27\f\27\16"+
		"\27\u01d0\13\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01d8\n\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\7\31\u01ed\n\31\f\31\16\31\u01f0\13\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\6\31\u01fa\n\31\r\31\16\31\u01fb\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0208\n\31\f\31\16\31\u020b"+
		"\13\31\3\31\3\31\5\31\u020f\n\31\5\31\u0211\n\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\5\31\u0219\n\31\3\31\3\31\3\31\3\31\7\31\u021f\n\31\f\31\16\31"+
		"\u0222\13\31\3\32\3\32\5\32\u0226\n\32\3\33\3\33\7\33\u022a\n\33\f\33"+
		"\16\33\u022d\13\33\3\33\3\33\3\33\2\4,\60\34\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\2\4\4\2\5\5HH\3\2\32\33\2\u0279\2=\3\2"+
		"\2\2\4@\3\2\2\2\6K\3\2\2\2\b\u0083\3\2\2\2\n\u0088\3\2\2\2\f\u008b\3\2"+
		"\2\2\16\u0098\3\2\2\2\20\u00c6\3\2\2\2\22\u00d9\3\2\2\2\24\u00db\3\2\2"+
		"\2\26\u00ef\3\2\2\2\30\u00f1\3\2\2\2\32\u00fd\3\2\2\2\34\u0119\3\2\2\2"+
		"\36\u011b\3\2\2\2 \u012d\3\2\2\2\"\u0139\3\2\2\2$\u0144\3\2\2\2&\u0150"+
		"\3\2\2\2(\u015b\3\2\2\2*\u0160\3\2\2\2,\u0181\3\2\2\2.\u01d7\3\2\2\2\60"+
		"\u0210\3\2\2\2\62\u0225\3\2\2\2\64\u022b\3\2\2\2\66<\5\4\3\2\67<\5\6\4"+
		"\28<\5\16\b\29<\5\36\20\2:<\5*\26\2;\66\3\2\2\2;\67\3\2\2\2;8\3\2\2\2"+
		";9\3\2\2\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\3\3\2\2\2?=\3\2\2"+
		"\2@E\7\3\2\2AB\7H\2\2BD\7\4\2\2CA\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2"+
		"\2FH\3\2\2\2GE\3\2\2\2HI\t\2\2\2IJ\7\6\2\2J\5\3\2\2\2KL\7\7\2\2LM\5\60"+
		"\31\2MN\7\b\2\2NS\7H\2\2OP\7\t\2\2PR\7H\2\2QO\3\2\2\2RU\3\2\2\2SQ\3\2"+
		"\2\2ST\3\2\2\2TV\3\2\2\2US\3\2\2\2VW\7\6\2\2W\7\3\2\2\2XY\5,\27\2YZ\7"+
		"\n\2\2Z\\\3\2\2\2[X\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\5,\27\2^_\7\6\2\2"+
		"_\u0084\3\2\2\2`a\7\13\2\2af\7H\2\2bc\7\t\2\2ce\7H\2\2db\3\2\2\2eh\3\2"+
		"\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2i\u0084\7\6\2\2jk\7\f\2\2"+
		"kl\5,\27\2lm\7\6\2\2m\u0084\3\2\2\2no\7\r\2\2op\7\16\2\2pq\5,\27\2qw\7"+
		"\17\2\2rx\5\b\5\2st\7\20\2\2tu\5\n\6\2uv\7\21\2\2vx\3\2\2\2wr\3\2\2\2"+
		"ws\3\2\2\2x\u0081\3\2\2\2y\177\7\22\2\2z\u0080\5\b\5\2{|\7\20\2\2|}\5"+
		"\n\6\2}~\7\21\2\2~\u0080\3\2\2\2\177z\3\2\2\2\177{\3\2\2\2\u0080\u0082"+
		"\3\2\2\2\u0081y\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\3\2\2\2\u0083"+
		"[\3\2\2\2\u0083`\3\2\2\2\u0083j\3\2\2\2\u0083n\3\2\2\2\u0084\t\3\2\2\2"+
		"\u0085\u0087\5\b\5\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\13\3\2\2\2\u008a\u0088\3\2\2\2\u008b"+
		"\u008c\7\23\2\2\u008c\u0091\5\20\t\2\u008d\u008e\7\t\2\2\u008e\u0090\5"+
		"\20\t\2\u008f\u008d\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7\24"+
		"\2\2\u0095\r\3\2\2\2\u0096\u0097\7\25\2\2\u0097\u0099\b\b\1\2\u0098\u0096"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c\7\26\2\2"+
		"\u009b\u009d\5\f\7\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e"+
		"\3\2\2\2\u009e\u009f\7H\2\2\u009f\u00a0\7\16\2\2\u00a0\u00a1\5\22\n\2"+
		"\u00a1\u00a4\7\17\2\2\u00a2\u00a3\7\27\2\2\u00a3\u00a5\5\60\31\2\u00a4"+
		"\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00c4\3\2\2\2\u00a6\u00a7\6\b"+
		"\2\3\u00a7\u00be\7\20\2\2\u00a8\u00a9\7\30\2\2\u00a9\u00af\7\20\2\2\u00aa"+
		"\u00ab\5\20\t\2\u00ab\u00ac\7\6\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00aa\3"+
		"\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00bd\7\21\2\2\u00b3\u00b4\7"+
		"\31\2\2\u00b4\u00b8\7\20\2\2\u00b5\u00b7\5\b\5\2\u00b6\u00b5\3\2\2\2\u00b7"+
		"\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2"+
		"\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bd\7\21\2\2\u00bc\u00a8\3\2\2\2\u00bc"+
		"\u00b3\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c5\7\21\2\2\u00c2"+
		"\u00c3\6\b\3\3\u00c3\u00c5\7\6\2\2\u00c4\u00a6\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c5\17\3\2\2\2\u00c6\u00cb\7H\2\2\u00c7\u00c8\7\t\2\2\u00c8\u00ca"+
		"\7H\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00cf\7\27"+
		"\2\2\u00cf\u00d0\5\60\31\2\u00d0\21\3\2\2\2\u00d1\u00d6\5\20\t\2\u00d2"+
		"\u00d3\7\t\2\2\u00d3\u00d5\5\20\t\2\u00d4\u00d2\3\2\2\2\u00d5\u00d8\3"+
		"\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8"+
		"\u00d6\3\2\2\2\u00d9\u00d1\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\23\3\2\2"+
		"\2\u00db\u00e0\7H\2\2\u00dc\u00dd\7\t\2\2\u00dd\u00df\7H\2\2\u00de\u00dc"+
		"\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\7\27\2\2\u00e4\u00e5\t"+
		"\3\2\2\u00e5\u00e6\5\60\31\2\u00e6\25\3\2\2\2\u00e7\u00ec\5\24\13\2\u00e8"+
		"\u00e9\7\t\2\2\u00e9\u00eb\5\24\13\2\u00ea\u00e8\3\2\2\2\u00eb\u00ee\3"+
		"\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee"+
		"\u00ec\3\2\2\2\u00ef\u00e7\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\27\3\2\2"+
		"\2\u00f1\u00f2\7\30\2\2\u00f2\u00f8\7\20\2\2\u00f3\u00f4\5\20\t\2\u00f4"+
		"\u00f5\7\6\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f7\u00fa\3\2"+
		"\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fb\u00fc\7\21\2\2\u00fc\31\3\2\2\2\u00fd\u00fe\7\34"+
		"\2\2\u00fe\u0102\7\20\2\2\u00ff\u0101\5\34\17\2\u0100\u00ff\3\2\2\2\u0101"+
		"\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105\3\2"+
		"\2\2\u0104\u0102\3\2\2\2\u0105\u0106\7\21\2\2\u0106\33\3\2\2\2\u0107\u0108"+
		"\5,\27\2\u0108\u010e\7\35\2\2\u0109\u010a\7\20\2\2\u010a\u010b\5\n\6\2"+
		"\u010b\u010c\7\21\2\2\u010c\u010f\3\2\2\2\u010d\u010f\5\b\5\2\u010e\u0109"+
		"\3\2\2\2\u010e\u010d\3\2\2\2\u010f\u011a\3\2\2\2\u0110\u0111\7\36\2\2"+
		"\u0111\u0115\7\20\2\2\u0112\u0114\5\34\17\2\u0113\u0112\3\2\2\2\u0114"+
		"\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2"+
		"\2\2\u0117\u0115\3\2\2\2\u0118\u011a\7\21\2\2\u0119\u0107\3\2\2\2\u0119"+
		"\u0110\3\2\2\2\u011a\35\3\2\2\2\u011b\u011d\7\37\2\2\u011c\u011e\5\f\7"+
		"\2\u011d\u011c\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120"+
		"\7H\2\2\u0120\u0121\7\16\2\2\u0121\u0122\5\26\f\2\u0122\u0123\7\17\2\2"+
		"\u0123\u0128\7\20\2\2\u0124\u0127\5\30\r\2\u0125\u0127\5\32\16\2\u0126"+
		"\u0124\3\2\2\2\u0126\u0125\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2"+
		"\2\2\u0128\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u0128\3\2\2\2\u012b"+
		"\u012c\7\21\2\2\u012c\37\3\2\2\2\u012d\u012e\7 \2\2\u012e\u0134\7\20\2"+
		"\2\u012f\u0130\5&\24\2\u0130\u0131\7\6\2\2\u0131\u0133\3\2\2\2\u0132\u012f"+
		"\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135"+
		"\u0137\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0138\7\21\2\2\u0138!\3\2\2\2"+
		"\u0139\u013a\7!\2\2\u013a\u013f\7H\2\2\u013b\u013c\7\t\2\2\u013c\u013e"+
		"\7H\2\2\u013d\u013b\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f"+
		"\u0140\3\2\2\2\u0140\u0142\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0143\7\6"+
		"\2\2\u0143#\3\2\2\2\u0144\u0145\7\"\2\2\u0145\u014b\7\20\2\2\u0146\u0147"+
		"\5(\25\2\u0147\u0148\7\6\2\2\u0148\u014a\3\2\2\2\u0149\u0146\3\2\2\2\u014a"+
		"\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014e\3\2"+
		"\2\2\u014d\u014b\3\2\2\2\u014e\u014f\7\21\2\2\u014f%\3\2\2\2\u0150\u0155"+
		"\7H\2\2\u0151\u0152\7\t\2\2\u0152\u0154\7H\2\2\u0153\u0151\3\2\2\2\u0154"+
		"\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0158\3\2"+
		"\2\2\u0157\u0155\3\2\2\2\u0158\u0159\7\27\2\2\u0159\u015a\5\60\31\2\u015a"+
		"\'\3\2\2\2\u015b\u015c\5\60\31\2\u015c\u015d\7\16\2\2\u015d\u015e\5,\27"+
		"\2\u015e\u015f\7\17\2\2\u015f)\3\2\2\2\u0160\u0162\7#\2\2\u0161\u0163"+
		"\5\f\7\2\u0162\u0161\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164\3\2\2\2\u0164"+
		"\u0165\7H\2\2\u0165\u0166\7\16\2\2\u0166\u0167\5\26\f\2\u0167\u0168\7"+
		"\17\2\2\u0168\u016e\7\20\2\2\u0169\u016d\5 \21\2\u016a\u016d\5\"\22\2"+
		"\u016b\u016d\5$\23\2\u016c\u0169\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016b"+
		"\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f"+
		"\u0171\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0172\7\21\2\2\u0172+\3\2\2\2"+
		"\u0173\u0174\b\27\1\2\u0174\u0175\7\16\2\2\u0175\u0176\5,\27\2\u0176\u0177"+
		"\7\17\2\2\u0177\u0182\3\2\2\2\u0178\u0179\7$\2\2\u0179\u017a\5,\27\2\u017a"+
		"\u017b\7%\2\2\u017b\u0182\3\2\2\2\u017c\u017d\7&\2\2\u017d\u0182\5,\27"+
		"\33\u017e\u017f\7\'\2\2\u017f\u0182\5,\27\32\u0180\u0182\5.\30\2\u0181"+
		"\u0173\3\2\2\2\u0181\u0178\3\2\2\2\u0181\u017c\3\2\2\2\u0181\u017e\3\2"+
		"\2\2\u0181\u0180\3\2\2\2\u0182\u01ce\3\2\2\2\u0183\u0184\f\26\2\2\u0184"+
		"\u0185\7(\2\2\u0185\u01cd\5,\27\27\u0186\u0187\f\25\2\2\u0187\u0188\7"+
		"\5\2\2\u0188\u01cd\5,\27\26\u0189\u018a\f\24\2\2\u018a\u018b\7)\2\2\u018b"+
		"\u01cd\5,\27\25\u018c\u018d\f\23\2\2\u018d\u018e\7*\2\2\u018e\u01cd\5"+
		",\27\24\u018f\u0190\f\22\2\2\u0190\u0191\7&\2\2\u0191\u01cd\5,\27\23\u0192"+
		"\u0193\f\21\2\2\u0193\u0194\7\23\2\2\u0194\u01cd\5,\27\22\u0195\u0196"+
		"\f\20\2\2\u0196\u0197\7+\2\2\u0197\u01cd\5,\27\21\u0198\u0199\f\17\2\2"+
		"\u0199\u019a\7\24\2\2\u019a\u01cd\5,\27\20\u019b\u019c\f\16\2\2\u019c"+
		"\u019d\7,\2\2\u019d\u01cd\5,\27\17\u019e\u019f\f\r\2\2\u019f\u01a0\7-"+
		"\2\2\u01a0\u01cd\5,\27\16\u01a1\u01a2\f\f\2\2\u01a2\u01a3\7.\2\2\u01a3"+
		"\u01cd\5,\27\r\u01a4\u01a5\f\13\2\2\u01a5\u01a6\7/\2\2\u01a6\u01cd\5,"+
		"\27\f\u01a7\u01a8\f\n\2\2\u01a8\u01a9\7\60\2\2\u01a9\u01cd\5,\27\13\u01aa"+
		"\u01ab\f\t\2\2\u01ab\u01ac\7\61\2\2\u01ac\u01cd\5,\27\n\u01ad\u01ae\f"+
		"\b\2\2\u01ae\u01af\7\62\2\2\u01af\u01cd\5,\27\t\u01b0\u01b1\f\7\2\2\u01b1"+
		"\u01b2\7\63\2\2\u01b2\u01cd\5,\27\b\u01b3\u01b4\f\6\2\2\u01b4\u01b5\7"+
		"\64\2\2\u01b5\u01cd\5,\27\7\u01b6\u01b7\f\5\2\2\u01b7\u01b8\7\65\2\2\u01b8"+
		"\u01b9\5,\27\2\u01b9\u01ba\7\27\2\2\u01ba\u01bb\5,\27\6\u01bb\u01cd\3"+
		"\2\2\2\u01bc\u01bd\f\4\2\2\u01bd\u01be\7\t\2\2\u01be\u01cd\5,\27\5\u01bf"+
		"\u01c0\f\31\2\2\u01c0\u01c1\7\16\2\2\u01c1\u01c2\5,\27\2\u01c2\u01c3\7"+
		"\17\2\2\u01c3\u01cd\3\2\2\2\u01c4\u01c5\f\30\2\2\u01c5\u01c6\7$\2\2\u01c6"+
		"\u01c7\5,\27\2\u01c7\u01c8\7%\2\2\u01c8\u01cd\3\2\2\2\u01c9\u01ca\f\27"+
		"\2\2\u01ca\u01cb\7\4\2\2\u01cb\u01cd\7H\2\2\u01cc\u0183\3\2\2\2\u01cc"+
		"\u0186\3\2\2\2\u01cc\u0189\3\2\2\2\u01cc\u018c\3\2\2\2\u01cc\u018f\3\2"+
		"\2\2\u01cc\u0192\3\2\2\2\u01cc\u0195\3\2\2\2\u01cc\u0198\3\2\2\2\u01cc"+
		"\u019b\3\2\2\2\u01cc\u019e\3\2\2\2\u01cc\u01a1\3\2\2\2\u01cc\u01a4\3\2"+
		"\2\2\u01cc\u01a7\3\2\2\2\u01cc\u01aa\3\2\2\2\u01cc\u01ad\3\2\2\2\u01cc"+
		"\u01b0\3\2\2\2\u01cc\u01b3\3\2\2\2\u01cc\u01b6\3\2\2\2\u01cc\u01bc\3\2"+
		"\2\2\u01cc\u01bf\3\2\2\2\u01cc\u01c4\3\2\2\2\u01cc\u01c9\3\2\2\2\u01cd"+
		"\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf-\3\2\2\2"+
		"\u01d0\u01ce\3\2\2\2\u01d1\u01d8\7D\2\2\u01d2\u01d8\7E\2\2\u01d3\u01d8"+
		"\7F\2\2\u01d4\u01d8\7G\2\2\u01d5\u01d8\5\64\33\2\u01d6\u01d8\7\66\2\2"+
		"\u01d7\u01d1\3\2\2\2\u01d7\u01d2\3\2\2\2\u01d7\u01d3\3\2\2\2\u01d7\u01d4"+
		"\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d6\3\2\2\2\u01d8/\3\2\2\2\u01d9"+
		"\u01da\b\31\1\2\u01da\u01db\7\16\2\2\u01db\u01dc\5\60\31\2\u01dc\u01dd"+
		"\7\17\2\2\u01dd\u0211\3\2\2\2\u01de\u0211\7\67\2\2\u01df\u01e0\7\67\2"+
		"\2\u01e0\u01e1\5,\27\2\u01e1\u01e2\78\2\2\u01e2\u01e3\5,\27\2\u01e3\u0211"+
		"\3\2\2\2\u01e4\u0211\79\2\2\u01e5\u0211\7:\2\2\u01e6\u0211\7;\2\2\u01e7"+
		"\u01e8\7<\2\2\u01e8\u01e9\7\20\2\2\u01e9\u01ee\7H\2\2\u01ea\u01eb\7\t"+
		"\2\2\u01eb\u01ed\7H\2\2\u01ec\u01ea\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee"+
		"\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f1\3\2\2\2\u01f0\u01ee\3\2"+
		"\2\2\u01f1\u0211\7\21\2\2\u01f2\u01f3\7=\2\2\u01f3\u01f9\7\20\2\2\u01f4"+
		"\u01f5\7H\2\2\u01f5\u01f6\7\27\2\2\u01f6\u01f7\5\60\31\2\u01f7\u01f8\7"+
		"\6\2\2\u01f8\u01fa\3\2\2\2\u01f9\u01f4\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb"+
		"\u01f9\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\7\21"+
		"\2\2\u01fe\u0211\3\2\2\2\u01ff\u0211\7?\2\2\u0200\u0211\7@\2\2\u0201\u0211"+
		"\5\64\33\2\u0202\u020e\5\64\33\2\u0203\u0204\7\23\2\2\u0204\u0209\5\62"+
		"\32\2\u0205\u0206\7\t\2\2\u0206\u0208\5\62\32\2\u0207\u0205\3\2\2\2\u0208"+
		"\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020c\3\2"+
		"\2\2\u020b\u0209\3\2\2\2\u020c\u020d\7\24\2\2\u020d\u020f\3\2\2\2\u020e"+
		"\u0203\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0211\3\2\2\2\u0210\u01d9\3\2"+
		"\2\2\u0210\u01de\3\2\2\2\u0210\u01df\3\2\2\2\u0210\u01e4\3\2\2\2\u0210"+
		"\u01e5\3\2\2\2\u0210\u01e6\3\2\2\2\u0210\u01e7\3\2\2\2\u0210\u01f2\3\2"+
		"\2\2\u0210\u01ff\3\2\2\2\u0210\u0200\3\2\2\2\u0210\u0201\3\2\2\2\u0210"+
		"\u0202\3\2\2\2\u0211\u0220\3\2\2\2\u0212\u0213\f\7\2\2\u0213\u0214\7\63"+
		"\2\2\u0214\u021f\5\60\31\b\u0215\u0216\f\t\2\2\u0216\u0218\7$\2\2\u0217"+
		"\u0219\5,\27\2\u0218\u0217\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021a\3\2"+
		"\2\2\u021a\u021f\7%\2\2\u021b\u021c\f\b\2\2\u021c\u021d\7>\2\2\u021d\u021f"+
		"\5,\27\2\u021e\u0212\3\2\2\2\u021e\u0215\3\2\2\2\u021e\u021b\3\2\2\2\u021f"+
		"\u0222\3\2\2\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221\61\3\2\2"+
		"\2\u0222\u0220\3\2\2\2\u0223\u0226\5\60\31\2\u0224\u0226\5.\30\2\u0225"+
		"\u0223\3\2\2\2\u0225\u0224\3\2\2\2\u0226\63\3\2\2\2\u0227\u0228\7H\2\2"+
		"\u0228\u022a\7\4\2\2\u0229\u0227\3\2\2\2\u022a\u022d\3\2\2\2\u022b\u0229"+
		"\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022e\3\2\2\2\u022d\u022b\3\2\2\2\u022e"+
		"\u022f\7H\2\2\u022f\65\3\2\2\29;=ES[fw\177\u0081\u0083\u0088\u0091\u0098"+
		"\u009c\u00a4\u00af\u00b8\u00bc\u00be\u00c4\u00cb\u00d6\u00d9\u00e0\u00ec"+
		"\u00ef\u00f8\u0102\u010e\u0115\u0119\u011d\u0126\u0128\u0134\u013f\u014b"+
		"\u0155\u0162\u016c\u016e\u0181\u01cc\u01ce\u01d7\u01ee\u01fb\u0209\u020e"+
		"\u0210\u0218\u021e\u0220\u0225\u022b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}