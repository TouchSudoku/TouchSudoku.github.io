// Generated from /Users/dhan/Documents/GitHub/TouchSudoku.github.io/Sudoku.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SudokuParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, NUM=7, BOX=8, COL=9, ROW=10, 
		CELL=11, ANS=12, PUZZLE=13, WS=14;
	public static final int
		RULE_sudoku = 0, RULE_puzzle = 1, RULE_solution = 2, RULE_answer = 3, 
		RULE_logic = 4, RULE_double_clue = 5, RULE_single_target = 6, RULE_simple_target = 7, 
		RULE_double_target = 8, RULE_filler = 9, RULE_single_filler = 10, RULE_multi_filler = 11, 
		RULE_unit_filler = 12, RULE_double_filler = 13, RULE_pointer = 14, RULE_simple_pointer = 15, 
		RULE_unit_pointer = 16, RULE_double_pointer = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"sudoku", "puzzle", "solution", "answer", "logic", "double_clue", "single_target", 
			"simple_target", "double_target", "filler", "single_filler", "multi_filler", 
			"unit_filler", "double_filler", "pointer", "simple_pointer", "unit_pointer", 
			"double_pointer"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'&'", "'='", "'-'", "'+'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "NUM", "BOX", "COL", "ROW", 
			"CELL", "ANS", "PUZZLE", "WS"
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
	public String getGrammarFileName() { return "Sudoku.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SudokuParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SudokuContext extends ParserRuleContext {
		public PuzzleContext puzzle() {
			return getRuleContext(PuzzleContext.class,0);
		}
		public SolutionContext solution() {
			return getRuleContext(SolutionContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(SudokuParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(SudokuParser.WS, i);
		}
		public SudokuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sudoku; }
	}

	public final SudokuContext sudoku() throws RecognitionException {
		SudokuContext _localctx = new SudokuContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sudoku);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			puzzle();
			setState(37);
			match(T__0);
			setState(38);
			solution();
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(39);
				match(WS);
				}
				}
				setState(44);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PuzzleContext extends ParserRuleContext {
		public TerminalNode PUZZLE() { return getToken(SudokuParser.PUZZLE, 0); }
		public PuzzleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puzzle; }
	}

	public final PuzzleContext puzzle() throws RecognitionException {
		PuzzleContext _localctx = new PuzzleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_puzzle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(PUZZLE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SolutionContext extends ParserRuleContext {
		public AnswerContext answer() {
			return getRuleContext(AnswerContext.class,0);
		}
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
		}
		public SolutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_solution; }
	}

	public final SolutionContext solution() throws RecognitionException {
		SolutionContext _localctx = new SolutionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_solution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			answer();
			setState(48);
			match(T__1);
			setState(49);
			logic();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AnswerContext extends ParserRuleContext {
		public TerminalNode ANS() { return getToken(SudokuParser.ANS, 0); }
		public AnswerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answer; }
	}

	public final AnswerContext answer() throws RecognitionException {
		AnswerContext _localctx = new AnswerContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_answer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(ANS);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LogicContext extends ParserRuleContext {
		public Single_targetContext single_target() {
			return getRuleContext(Single_targetContext.class,0);
		}
		public List<PointerContext> pointer() {
			return getRuleContexts(PointerContext.class);
		}
		public PointerContext pointer(int i) {
			return getRuleContext(PointerContext.class,i);
		}
		public Double_targetContext double_target() {
			return getRuleContext(Double_targetContext.class,0);
		}
		public List<Double_clueContext> double_clue() {
			return getRuleContexts(Double_clueContext.class);
		}
		public Double_clueContext double_clue(int i) {
			return getRuleContext(Double_clueContext.class,i);
		}
		public LogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic; }
	}

	public final LogicContext logic() throws RecognitionException {
		LogicContext _localctx = new LogicContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_logic);
		int _la;
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOX:
			case COL:
			case ROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				single_target();
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(54);
					match(T__2);
					setState(55);
					pointer();
					}
					}
					setState(60);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				double_target();
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2 || _la==T__3) {
					{
					{
					setState(62);
					double_clue();
					}
					}
					setState(67);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Double_clueContext extends ParserRuleContext {
		public Double_pointerContext double_pointer() {
			return getRuleContext(Double_pointerContext.class,0);
		}
		public Double_fillerContext double_filler() {
			return getRuleContext(Double_fillerContext.class,0);
		}
		public Double_clueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_clue; }
	}

	public final Double_clueContext double_clue() throws RecognitionException {
		Double_clueContext _localctx = new Double_clueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_double_clue);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(T__2);
				setState(71);
				double_pointer();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(T__3);
				setState(73);
				double_filler();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Single_targetContext extends ParserRuleContext {
		public Simple_targetContext simple_target() {
			return getRuleContext(Simple_targetContext.class,0);
		}
		public List<FillerContext> filler() {
			return getRuleContexts(FillerContext.class);
		}
		public FillerContext filler(int i) {
			return getRuleContext(FillerContext.class,i);
		}
		public Single_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_target; }
	}

	public final Single_targetContext single_target() throws RecognitionException {
		Single_targetContext _localctx = new Single_targetContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_single_target);
		try {
			int _alt;
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				simple_target();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				simple_target();
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(78);
						match(T__3);
						setState(79);
						filler();
						}
						} 
					}
					setState(84);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Simple_targetContext extends ParserRuleContext {
		public TerminalNode BOX() { return getToken(SudokuParser.BOX, 0); }
		public TerminalNode COL() { return getToken(SudokuParser.COL, 0); }
		public TerminalNode ROW() { return getToken(SudokuParser.ROW, 0); }
		public Simple_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_target; }
	}

	public final Simple_targetContext simple_target() throws RecognitionException {
		Simple_targetContext _localctx = new Simple_targetContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_simple_target);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1792L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Double_targetContext extends ParserRuleContext {
		public List<Simple_targetContext> simple_target() {
			return getRuleContexts(Simple_targetContext.class);
		}
		public Simple_targetContext simple_target(int i) {
			return getRuleContext(Simple_targetContext.class,i);
		}
		public List<FillerContext> filler() {
			return getRuleContexts(FillerContext.class);
		}
		public FillerContext filler(int i) {
			return getRuleContext(FillerContext.class,i);
		}
		public List<PointerContext> pointer() {
			return getRuleContexts(PointerContext.class);
		}
		public PointerContext pointer(int i) {
			return getRuleContext(PointerContext.class,i);
		}
		public Double_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_target; }
	}

	public final Double_targetContext double_target() throws RecognitionException {
		Double_targetContext _localctx = new Double_targetContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_double_target);
		int _la;
		try {
			int _alt;
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(T__4);
				setState(90);
				match(T__4);
				setState(91);
				simple_target();
				setState(92);
				match(T__3);
				setState(93);
				simple_target();
				setState(94);
				match(T__5);
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(95);
					match(T__3);
					setState(96);
					filler();
					}
					}
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(102);
					match(T__2);
					setState(103);
					pointer();
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(109);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(T__4);
				setState(112);
				simple_target();
				setState(113);
				match(T__3);
				setState(114);
				simple_target();
				setState(115);
				match(T__5);
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(116);
						match(T__3);
						setState(117);
						filler();
						}
						} 
					}
					setState(122);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(123);
						match(T__2);
						setState(124);
						pointer();
						}
						} 
					}
					setState(129);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FillerContext extends ParserRuleContext {
		public Single_fillerContext single_filler() {
			return getRuleContext(Single_fillerContext.class,0);
		}
		public Multi_fillerContext multi_filler() {
			return getRuleContext(Multi_fillerContext.class,0);
		}
		public Unit_fillerContext unit_filler() {
			return getRuleContext(Unit_fillerContext.class,0);
		}
		public FillerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filler; }
	}

	public final FillerContext filler() throws RecognitionException {
		FillerContext _localctx = new FillerContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_filler);
		try {
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				single_filler();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				multi_filler();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				unit_filler();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				match(T__4);
				setState(136);
				unit_filler();
				setState(137);
				match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Single_fillerContext extends ParserRuleContext {
		public TerminalNode CELL() { return getToken(SudokuParser.CELL, 0); }
		public Single_fillerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_filler; }
	}

	public final Single_fillerContext single_filler() throws RecognitionException {
		Single_fillerContext _localctx = new Single_fillerContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_single_filler);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CELL:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				match(CELL);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(T__4);
				setState(143);
				match(CELL);
				setState(144);
				match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Multi_fillerContext extends ParserRuleContext {
		public List<FillerContext> filler() {
			return getRuleContexts(FillerContext.class);
		}
		public FillerContext filler(int i) {
			return getRuleContext(FillerContext.class,i);
		}
		public Multi_fillerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi_filler; }
	}

	public final Multi_fillerContext multi_filler() throws RecognitionException {
		Multi_fillerContext _localctx = new Multi_fillerContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_multi_filler);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__4);
			setState(148);
			filler();
			setState(151); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(149);
				match(T__3);
				setState(150);
				filler();
				}
				}
				setState(153); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			setState(155);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Unit_fillerContext extends ParserRuleContext {
		public Single_targetContext single_target() {
			return getRuleContext(Single_targetContext.class,0);
		}
		public List<PointerContext> pointer() {
			return getRuleContexts(PointerContext.class);
		}
		public PointerContext pointer(int i) {
			return getRuleContext(PointerContext.class,i);
		}
		public List<FillerContext> filler() {
			return getRuleContexts(FillerContext.class);
		}
		public FillerContext filler(int i) {
			return getRuleContext(FillerContext.class,i);
		}
		public Unit_fillerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit_filler; }
	}

	public final Unit_fillerContext unit_filler() throws RecognitionException {
		Unit_fillerContext _localctx = new Unit_fillerContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_unit_filler);
		int _la;
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				match(T__4);
				setState(158);
				single_target();
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(159);
					match(T__2);
					setState(160);
					pointer();
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(166);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(T__4);
				setState(169);
				single_target();
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(170);
					match(T__3);
					setState(171);
					filler();
					}
					}
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(177);
				match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Double_fillerContext extends ParserRuleContext {
		public Single_targetContext single_target() {
			return getRuleContext(Single_targetContext.class,0);
		}
		public List<FillerContext> filler() {
			return getRuleContexts(FillerContext.class);
		}
		public FillerContext filler(int i) {
			return getRuleContext(FillerContext.class,i);
		}
		public Double_fillerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_filler; }
	}

	public final Double_fillerContext double_filler() throws RecognitionException {
		Double_fillerContext _localctx = new Double_fillerContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_double_filler);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__4);
			setState(182);
			single_target();
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(183);
				match(T__3);
				setState(184);
				filler();
				setState(185);
				match(T__3);
				setState(186);
				filler();
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(193);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PointerContext extends ParserRuleContext {
		public Simple_pointerContext simple_pointer() {
			return getRuleContext(Simple_pointerContext.class,0);
		}
		public Unit_pointerContext unit_pointer() {
			return getRuleContext(Unit_pointerContext.class,0);
		}
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_pointer);
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CELL:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				simple_pointer();
				}
				break;
			case T__4:
			case BOX:
			case COL:
			case ROW:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				unit_pointer();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Simple_pointerContext extends ParserRuleContext {
		public TerminalNode CELL() { return getToken(SudokuParser.CELL, 0); }
		public Simple_pointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_pointer; }
	}

	public final Simple_pointerContext simple_pointer() throws RecognitionException {
		Simple_pointerContext _localctx = new Simple_pointerContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_simple_pointer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(CELL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Unit_pointerContext extends ParserRuleContext {
		public Simple_targetContext simple_target() {
			return getRuleContext(Simple_targetContext.class,0);
		}
		public Single_targetContext single_target() {
			return getRuleContext(Single_targetContext.class,0);
		}
		public List<PointerContext> pointer() {
			return getRuleContexts(PointerContext.class);
		}
		public PointerContext pointer(int i) {
			return getRuleContext(PointerContext.class,i);
		}
		public Unit_pointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit_pointer; }
	}

	public final Unit_pointerContext unit_pointer() throws RecognitionException {
		Unit_pointerContext _localctx = new Unit_pointerContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_unit_pointer);
		int _la;
		try {
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOX:
			case COL:
			case ROW:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				simple_target();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(T__4);
				setState(203);
				single_target();
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(204);
					match(T__2);
					setState(205);
					pointer();
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(211);
				match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Double_pointerContext extends ParserRuleContext {
		public Single_targetContext single_target() {
			return getRuleContext(Single_targetContext.class,0);
		}
		public List<PointerContext> pointer() {
			return getRuleContexts(PointerContext.class);
		}
		public PointerContext pointer(int i) {
			return getRuleContext(PointerContext.class,i);
		}
		public Double_pointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_double_pointer; }
	}

	public final Double_pointerContext double_pointer() throws RecognitionException {
		Double_pointerContext _localctx = new Double_pointerContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_double_pointer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(T__4);
			setState(216);
			single_target();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(217);
				match(T__2);
				setState(218);
				pointer();
				}
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(224);
			match(T__5);
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

	public static final String _serializedATN =
		"\u0004\u0001\u000e\u00e3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000)\b\u0000\n\u0000\f\u0000,\t"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u00049\b\u0004\n\u0004\f\u0004<\t\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004@\b\u0004\n\u0004\f\u0004C\t\u0004\u0003\u0004E\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005K\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006Q\b\u0006\n\u0006\f\u0006"+
		"T\t\u0006\u0003\u0006V\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bb\b\b\n\b\f\b"+
		"e\t\b\u0001\b\u0001\b\u0005\bi\b\b\n\b\f\bl\t\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bw\b\b\n\b\f"+
		"\bz\t\b\u0001\b\u0001\b\u0005\b~\b\b\n\b\f\b\u0081\t\b\u0003\b\u0083\b"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u008c"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0092\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u0098\b\u000b\u000b\u000b\f"+
		"\u000b\u0099\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u00a2\b\f\n\f\f\f\u00a5\t\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0005\f\u00ad\b\f\n\f\f\f\u00b0\t\f\u0001\f\u0001\f\u0003\f\u00b4"+
		"\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00bd"+
		"\b\r\n\r\f\r\u00c0\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u00c6\b\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0005\u0010\u00cf\b\u0010\n\u0010\f\u0010\u00d2"+
		"\t\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00d6\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00dc\b\u0011\n\u0011"+
		"\f\u0011\u00df\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0000\u0000"+
		"\u0012\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"\u0000\u0001\u0001\u0000\b\n\u00e9\u0000$\u0001\u0000"+
		"\u0000\u0000\u0002-\u0001\u0000\u0000\u0000\u0004/\u0001\u0000\u0000\u0000"+
		"\u00063\u0001\u0000\u0000\u0000\bD\u0001\u0000\u0000\u0000\nJ\u0001\u0000"+
		"\u0000\u0000\fU\u0001\u0000\u0000\u0000\u000eW\u0001\u0000\u0000\u0000"+
		"\u0010\u0082\u0001\u0000\u0000\u0000\u0012\u008b\u0001\u0000\u0000\u0000"+
		"\u0014\u0091\u0001\u0000\u0000\u0000\u0016\u0093\u0001\u0000\u0000\u0000"+
		"\u0018\u00b3\u0001\u0000\u0000\u0000\u001a\u00b5\u0001\u0000\u0000\u0000"+
		"\u001c\u00c5\u0001\u0000\u0000\u0000\u001e\u00c7\u0001\u0000\u0000\u0000"+
		" \u00d5\u0001\u0000\u0000\u0000\"\u00d7\u0001\u0000\u0000\u0000$%\u0003"+
		"\u0002\u0001\u0000%&\u0005\u0001\u0000\u0000&*\u0003\u0004\u0002\u0000"+
		"\')\u0005\u000e\u0000\u0000(\'\u0001\u0000\u0000\u0000),\u0001\u0000\u0000"+
		"\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+\u0001\u0001"+
		"\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000-.\u0005\r\u0000\u0000.\u0003"+
		"\u0001\u0000\u0000\u0000/0\u0003\u0006\u0003\u000001\u0005\u0002\u0000"+
		"\u000012\u0003\b\u0004\u00002\u0005\u0001\u0000\u0000\u000034\u0005\f"+
		"\u0000\u00004\u0007\u0001\u0000\u0000\u00005:\u0003\f\u0006\u000067\u0005"+
		"\u0003\u0000\u000079\u0003\u001c\u000e\u000086\u0001\u0000\u0000\u0000"+
		"9<\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000"+
		"\u0000;E\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000=A\u0003\u0010"+
		"\b\u0000>@\u0003\n\u0005\u0000?>\u0001\u0000\u0000\u0000@C\u0001\u0000"+
		"\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BE\u0001"+
		"\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000D5\u0001\u0000\u0000\u0000"+
		"D=\u0001\u0000\u0000\u0000E\t\u0001\u0000\u0000\u0000FG\u0005\u0003\u0000"+
		"\u0000GK\u0003\"\u0011\u0000HI\u0005\u0004\u0000\u0000IK\u0003\u001a\r"+
		"\u0000JF\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000K\u000b\u0001"+
		"\u0000\u0000\u0000LV\u0003\u000e\u0007\u0000MR\u0003\u000e\u0007\u0000"+
		"NO\u0005\u0004\u0000\u0000OQ\u0003\u0012\t\u0000PN\u0001\u0000\u0000\u0000"+
		"QT\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000"+
		"\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000UL\u0001\u0000"+
		"\u0000\u0000UM\u0001\u0000\u0000\u0000V\r\u0001\u0000\u0000\u0000WX\u0007"+
		"\u0000\u0000\u0000X\u000f\u0001\u0000\u0000\u0000YZ\u0005\u0005\u0000"+
		"\u0000Z[\u0005\u0005\u0000\u0000[\\\u0003\u000e\u0007\u0000\\]\u0005\u0004"+
		"\u0000\u0000]^\u0003\u000e\u0007\u0000^c\u0005\u0006\u0000\u0000_`\u0005"+
		"\u0004\u0000\u0000`b\u0003\u0012\t\u0000a_\u0001\u0000\u0000\u0000be\u0001"+
		"\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000"+
		"dj\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000fg\u0005\u0003\u0000"+
		"\u0000gi\u0003\u001c\u000e\u0000hf\u0001\u0000\u0000\u0000il\u0001\u0000"+
		"\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000km\u0001"+
		"\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000mn\u0005\u0006\u0000\u0000"+
		"n\u0083\u0001\u0000\u0000\u0000op\u0005\u0005\u0000\u0000pq\u0003\u000e"+
		"\u0007\u0000qr\u0005\u0004\u0000\u0000rs\u0003\u000e\u0007\u0000sx\u0005"+
		"\u0006\u0000\u0000tu\u0005\u0004\u0000\u0000uw\u0003\u0012\t\u0000vt\u0001"+
		"\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000"+
		"xy\u0001\u0000\u0000\u0000y\u007f\u0001\u0000\u0000\u0000zx\u0001\u0000"+
		"\u0000\u0000{|\u0005\u0003\u0000\u0000|~\u0003\u001c\u000e\u0000}{\u0001"+
		"\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000"+
		"\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082Y\u0001\u0000\u0000\u0000"+
		"\u0082o\u0001\u0000\u0000\u0000\u0083\u0011\u0001\u0000\u0000\u0000\u0084"+
		"\u008c\u0003\u0014\n\u0000\u0085\u008c\u0003\u0016\u000b\u0000\u0086\u008c"+
		"\u0003\u0018\f\u0000\u0087\u0088\u0005\u0005\u0000\u0000\u0088\u0089\u0003"+
		"\u0018\f\u0000\u0089\u008a\u0005\u0006\u0000\u0000\u008a\u008c\u0001\u0000"+
		"\u0000\u0000\u008b\u0084\u0001\u0000\u0000\u0000\u008b\u0085\u0001\u0000"+
		"\u0000\u0000\u008b\u0086\u0001\u0000\u0000\u0000\u008b\u0087\u0001\u0000"+
		"\u0000\u0000\u008c\u0013\u0001\u0000\u0000\u0000\u008d\u0092\u0005\u000b"+
		"\u0000\u0000\u008e\u008f\u0005\u0005\u0000\u0000\u008f\u0090\u0005\u000b"+
		"\u0000\u0000\u0090\u0092\u0005\u0006\u0000\u0000\u0091\u008d\u0001\u0000"+
		"\u0000\u0000\u0091\u008e\u0001\u0000\u0000\u0000\u0092\u0015\u0001\u0000"+
		"\u0000\u0000\u0093\u0094\u0005\u0005\u0000\u0000\u0094\u0097\u0003\u0012"+
		"\t\u0000\u0095\u0096\u0005\u0004\u0000\u0000\u0096\u0098\u0003\u0012\t"+
		"\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000"+
		"\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009c\u0005\u0006\u0000"+
		"\u0000\u009c\u0017\u0001\u0000\u0000\u0000\u009d\u009e\u0005\u0005\u0000"+
		"\u0000\u009e\u00a3\u0003\f\u0006\u0000\u009f\u00a0\u0005\u0003\u0000\u0000"+
		"\u00a0\u00a2\u0003\u001c\u000e\u0000\u00a1\u009f\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u0006\u0000\u0000"+
		"\u00a7\u00b4\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u0005\u0000\u0000"+
		"\u00a9\u00ae\u0003\f\u0006\u0000\u00aa\u00ab\u0005\u0004\u0000\u0000\u00ab"+
		"\u00ad\u0003\u0012\t\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad\u00b0"+
		"\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0001\u0000\u0000\u0000\u00af\u00b1\u0001\u0000\u0000\u0000\u00b0\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005\u0006\u0000\u0000\u00b2\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b3\u009d\u0001\u0000\u0000\u0000\u00b3\u00a8"+
		"\u0001\u0000\u0000\u0000\u00b4\u0019\u0001\u0000\u0000\u0000\u00b5\u00b6"+
		"\u0005\u0005\u0000\u0000\u00b6\u00be\u0003\f\u0006\u0000\u00b7\u00b8\u0005"+
		"\u0004\u0000\u0000\u00b8\u00b9\u0003\u0012\t\u0000\u00b9\u00ba\u0005\u0004"+
		"\u0000\u0000\u00ba\u00bb\u0003\u0012\t\u0000\u00bb\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bc\u00b7\u0001\u0000\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000"+
		"\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c1\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c2\u0005\u0006\u0000\u0000\u00c2\u001b\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c6\u0003\u001e\u000f\u0000\u00c4\u00c6\u0003 \u0010\u0000"+
		"\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000"+
		"\u00c6\u001d\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\u000b\u0000\u0000"+
		"\u00c8\u001f\u0001\u0000\u0000\u0000\u00c9\u00d6\u0003\u000e\u0007\u0000"+
		"\u00ca\u00cb\u0005\u0005\u0000\u0000\u00cb\u00d0\u0003\f\u0006\u0000\u00cc"+
		"\u00cd\u0005\u0003\u0000\u0000\u00cd\u00cf\u0003\u001c\u000e\u0000\u00ce"+
		"\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d2\u0001\u0000\u0000\u0000\u00d0"+
		"\u00ce\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d4\u0005\u0006\u0000\u0000\u00d4\u00d6\u0001\u0000\u0000\u0000\u00d5"+
		"\u00c9\u0001\u0000\u0000\u0000\u00d5\u00ca\u0001\u0000\u0000\u0000\u00d6"+
		"!\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005\u0005\u0000\u0000\u00d8\u00dd"+
		"\u0003\f\u0006\u0000\u00d9\u00da\u0005\u0003\u0000\u0000\u00da\u00dc\u0003"+
		"\u001c\u000e\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc\u00df\u0001"+
		"\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00de\u0001"+
		"\u0000\u0000\u0000\u00de\u00e0\u0001\u0000\u0000\u0000\u00df\u00dd\u0001"+
		"\u0000\u0000\u0000\u00e0\u00e1\u0005\u0006\u0000\u0000\u00e1#\u0001\u0000"+
		"\u0000\u0000\u0017*:ADJRUcjx\u007f\u0082\u008b\u0091\u0099\u00a3\u00ae"+
		"\u00b3\u00be\u00c5\u00d0\u00d5\u00dd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}