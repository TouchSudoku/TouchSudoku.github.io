// Generated from /Users/dhan/Documents/GitHub/TouchSudoku.github.io/Sudoku.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SudokuParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

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
	public static final String[] ruleNames = {
		"sudoku", "puzzle", "solution", "answer", "logic", "double_clue", "single_target", 
		"simple_target", "double_target", "filler", "single_filler", "multi_filler", 
		"unit_filler", "double_filler", "pointer", "simple_pointer", "unit_pointer", 
		"double_pointer"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'&'", "'='", "'-'", "'+'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "NUM", "BOX", "COL", "ROW", 
		"CELL", "ANS", "PUZZLE", "WS"
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
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOX) | (1L << COL) | (1L << ROW))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20\u00e5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\7\2+\n\2\f\2\16\2.\13\2\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\6\7\6;\n\6\f\6\16\6>\13\6\3\6\3\6\7\6B\n\6\f\6"+
		"\16\6E\13\6\5\6G\n\6\3\7\3\7\3\7\3\7\5\7M\n\7\3\b\3\b\3\b\3\b\7\bS\n\b"+
		"\f\b\16\bV\13\b\5\bX\n\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\nd"+
		"\n\n\f\n\16\ng\13\n\3\n\3\n\7\nk\n\n\f\n\16\nn\13\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\7\ny\n\n\f\n\16\n|\13\n\3\n\3\n\7\n\u0080\n\n\f\n\16"+
		"\n\u0083\13\n\5\n\u0085\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u008e"+
		"\n\13\3\f\3\f\3\f\3\f\5\f\u0094\n\f\3\r\3\r\3\r\3\r\6\r\u009a\n\r\r\r"+
		"\16\r\u009b\3\r\3\r\3\16\3\16\3\16\3\16\7\16\u00a4\n\16\f\16\16\16\u00a7"+
		"\13\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00af\n\16\f\16\16\16\u00b2"+
		"\13\16\3\16\3\16\5\16\u00b6\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7"+
		"\17\u00bf\n\17\f\17\16\17\u00c2\13\17\3\17\3\17\3\20\3\20\5\20\u00c8\n"+
		"\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\7\22\u00d1\n\22\f\22\16\22\u00d4"+
		"\13\22\3\22\3\22\5\22\u00d8\n\22\3\23\3\23\3\23\3\23\7\23\u00de\n\23\f"+
		"\23\16\23\u00e1\13\23\3\23\3\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$\2\3\3\2\n\f\2\u00eb\2&\3\2\2\2\4/\3\2\2\2\6\61\3\2\2"+
		"\2\b\65\3\2\2\2\nF\3\2\2\2\fL\3\2\2\2\16W\3\2\2\2\20Y\3\2\2\2\22\u0084"+
		"\3\2\2\2\24\u008d\3\2\2\2\26\u0093\3\2\2\2\30\u0095\3\2\2\2\32\u00b5\3"+
		"\2\2\2\34\u00b7\3\2\2\2\36\u00c7\3\2\2\2 \u00c9\3\2\2\2\"\u00d7\3\2\2"+
		"\2$\u00d9\3\2\2\2&\'\5\4\3\2\'(\7\3\2\2(,\5\6\4\2)+\7\20\2\2*)\3\2\2\2"+
		"+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\3\3\2\2\2.,\3\2\2\2/\60\7\17\2\2\60\5"+
		"\3\2\2\2\61\62\5\b\5\2\62\63\7\4\2\2\63\64\5\n\6\2\64\7\3\2\2\2\65\66"+
		"\7\16\2\2\66\t\3\2\2\2\67<\5\16\b\289\7\5\2\29;\5\36\20\2:8\3\2\2\2;>"+
		"\3\2\2\2<:\3\2\2\2<=\3\2\2\2=G\3\2\2\2><\3\2\2\2?C\5\22\n\2@B\5\f\7\2"+
		"A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DG\3\2\2\2EC\3\2\2\2F\67\3\2\2"+
		"\2F?\3\2\2\2G\13\3\2\2\2HI\7\5\2\2IM\5$\23\2JK\7\6\2\2KM\5\34\17\2LH\3"+
		"\2\2\2LJ\3\2\2\2M\r\3\2\2\2NX\5\20\t\2OT\5\20\t\2PQ\7\6\2\2QS\5\24\13"+
		"\2RP\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UX\3\2\2\2VT\3\2\2\2WN\3\2\2"+
		"\2WO\3\2\2\2X\17\3\2\2\2YZ\t\2\2\2Z\21\3\2\2\2[\\\7\7\2\2\\]\7\7\2\2]"+
		"^\5\20\t\2^_\7\6\2\2_`\5\20\t\2`e\7\b\2\2ab\7\6\2\2bd\5\24\13\2ca\3\2"+
		"\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fl\3\2\2\2ge\3\2\2\2hi\7\5\2\2ik\5\36"+
		"\20\2jh\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\7"+
		"\b\2\2p\u0085\3\2\2\2qr\7\7\2\2rs\5\20\t\2st\7\6\2\2tu\5\20\t\2uz\7\b"+
		"\2\2vw\7\6\2\2wy\5\24\13\2xv\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\u0081"+
		"\3\2\2\2|z\3\2\2\2}~\7\5\2\2~\u0080\5\36\20\2\177}\3\2\2\2\u0080\u0083"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0085\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0084[\3\2\2\2\u0084q\3\2\2\2\u0085\23\3\2\2\2\u0086\u008e"+
		"\5\26\f\2\u0087\u008e\5\30\r\2\u0088\u008e\5\32\16\2\u0089\u008a\7\7\2"+
		"\2\u008a\u008b\5\32\16\2\u008b\u008c\7\b\2\2\u008c\u008e\3\2\2\2\u008d"+
		"\u0086\3\2\2\2\u008d\u0087\3\2\2\2\u008d\u0088\3\2\2\2\u008d\u0089\3\2"+
		"\2\2\u008e\25\3\2\2\2\u008f\u0094\7\r\2\2\u0090\u0091\7\7\2\2\u0091\u0092"+
		"\7\r\2\2\u0092\u0094\7\b\2\2\u0093\u008f\3\2\2\2\u0093\u0090\3\2\2\2\u0094"+
		"\27\3\2\2\2\u0095\u0096\7\7\2\2\u0096\u0099\5\24\13\2\u0097\u0098\7\6"+
		"\2\2\u0098\u009a\5\24\13\2\u0099\u0097\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\7\b"+
		"\2\2\u009e\31\3\2\2\2\u009f\u00a0\7\7\2\2\u00a0\u00a5\5\16\b\2\u00a1\u00a2"+
		"\7\5\2\2\u00a2\u00a4\5\36\20\2\u00a3\u00a1\3\2\2\2\u00a4\u00a7\3\2\2\2"+
		"\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5"+
		"\3\2\2\2\u00a8\u00a9\7\b\2\2\u00a9\u00b6\3\2\2\2\u00aa\u00ab\7\7\2\2\u00ab"+
		"\u00b0\5\16\b\2\u00ac\u00ad\7\6\2\2\u00ad\u00af\5\24\13\2\u00ae\u00ac"+
		"\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		"\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7\b\2\2\u00b4\u00b6\3\2"+
		"\2\2\u00b5\u009f\3\2\2\2\u00b5\u00aa\3\2\2\2\u00b6\33\3\2\2\2\u00b7\u00b8"+
		"\7\7\2\2\u00b8\u00c0\5\16\b\2\u00b9\u00ba\7\6\2\2\u00ba\u00bb\5\24\13"+
		"\2\u00bb\u00bc\7\6\2\2\u00bc\u00bd\5\24\13\2\u00bd\u00bf\3\2\2\2\u00be"+
		"\u00b9\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2"+
		"\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\7\b\2\2\u00c4"+
		"\35\3\2\2\2\u00c5\u00c8\5 \21\2\u00c6\u00c8\5\"\22\2\u00c7\u00c5\3\2\2"+
		"\2\u00c7\u00c6\3\2\2\2\u00c8\37\3\2\2\2\u00c9\u00ca\7\r\2\2\u00ca!\3\2"+
		"\2\2\u00cb\u00d8\5\20\t\2\u00cc\u00cd\7\7\2\2\u00cd\u00d2\5\16\b\2\u00ce"+
		"\u00cf\7\5\2\2\u00cf\u00d1\5\36\20\2\u00d0\u00ce\3\2\2\2\u00d1\u00d4\3"+
		"\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d5\u00d6\7\b\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00cb\3\2"+
		"\2\2\u00d7\u00cc\3\2\2\2\u00d8#\3\2\2\2\u00d9\u00da\7\7\2\2\u00da\u00df"+
		"\5\16\b\2\u00db\u00dc\7\5\2\2\u00dc\u00de\5\36\20\2\u00dd\u00db\3\2\2"+
		"\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e2"+
		"\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\7\b\2\2\u00e3%\3\2\2\2\31,<C"+
		"FLTWelz\u0081\u0084\u008d\u0093\u009b\u00a5\u00b0\u00b5\u00c0\u00c7\u00d2"+
		"\u00d7\u00df";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}