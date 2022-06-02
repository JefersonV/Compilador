// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: src/LexerColor.flex

import compilerTools.TextColor;
import java.awt.Color;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class LexerColor {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\3\1\1\1\4\22\0\1\1"+
    "\1\5\1\0\1\6\1\7\1\0\1\5\1\0\2\10"+
    "\1\11\1\0\1\10\1\12\1\0\1\13\1\14\11\15"+
    "\1\0\1\10\2\0\1\16\2\0\1\17\1\20\1\21"+
    "\1\17\1\22\7\17\1\23\1\24\1\25\1\26\12\17"+
    "\4\0\1\17\1\0\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\2\17\1\40\1\41\1\42"+
    "\1\43\1\44\1\45\1\46\1\47\1\50\1\51\4\17"+
    "\1\52\1\10\1\53\1\10\7\0\1\3\73\0\1\17"+
    "\7\0\1\17\3\0\1\17\3\0\1\17\1\0\1\17"+
    "\6\0\1\17\1\0\1\17\4\0\1\54\7\0\1\17"+
    "\3\0\1\17\3\0\1\17\1\0\1\17\6\0\1\55"+
    "\1\0\1\17\u012b\0\2\3\326\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\3\2\1\1\4\2\1\2\5"+
    "\16\2\1\0\1\6\2\0\1\7\20\2\1\10\2\2"+
    "\3\0\2\7\21\2\1\11\1\2\2\0\1\7\17\2"+
    "\1\10\1\0\1\2\1\12\2\2\1\13\7\2\1\14"+
    "\1\2\1\0\7\2\1\15\1\2\1\16\1\11\6\2"+
    "\1\17\15\2\1\11\23\2\1\20\11\2\1\21\2\2"+
    "\1\22\10\2\1\17\1\2";

  private static int [] zzUnpackAction() {
    int [] result = new int[184];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\56\0\56\0\134\0\56\0\212\0\270\0\56"+
    "\0\346\0\u0114\0\u0142\0\u0170\0\u019e\0\u01cc\0\u01fa\0\u0228"+
    "\0\u0256\0\u0284\0\u02b2\0\u02e0\0\u030e\0\u033c\0\u036a\0\u0398"+
    "\0\u03c6\0\u03f4\0\u0422\0\u0450\0\u047e\0\u04ac\0\u04da\0\u0508"+
    "\0\u0536\0\u0564\0\u0592\0\u05c0\0\u05ee\0\u061c\0\u064a\0\u0678"+
    "\0\u06a6\0\u06d4\0\u0702\0\u0730\0\u075e\0\u078c\0\u07ba\0\u07e8"+
    "\0\u0816\0\u0844\0\u0872\0\u08a0\0\u08ce\0\56\0\u08fc\0\u092a"+
    "\0\u0958\0\u0986\0\u09b4\0\u09e2\0\u0a10\0\u0a3e\0\u0a6c\0\u0a9a"+
    "\0\u0ac8\0\u0af6\0\u0b24\0\u0b52\0\u0b80\0\u0bae\0\u0bdc\0\u0c0a"+
    "\0\u019e\0\u0c38\0\u0c66\0\u0c94\0\u08a0\0\u0cc2\0\u0cf0\0\u0d1e"+
    "\0\u0d4c\0\u0d7a\0\u0da8\0\u0dd6\0\u0e04\0\u0e32\0\u0e60\0\u0e8e"+
    "\0\u0ebc\0\u0eea\0\u0f18\0\u0f46\0\u019e\0\u0f74\0\u0fa2\0\u019e"+
    "\0\u0fd0\0\u0ffe\0\u019e\0\u102c\0\u105a\0\u1088\0\u10b6\0\u10e4"+
    "\0\u1112\0\u1140\0\u019e\0\u116e\0\u119c\0\u11ca\0\u11f8\0\u1226"+
    "\0\u1254\0\u1282\0\u12b0\0\u12de\0\u019e\0\u130c\0\56\0\u1226"+
    "\0\u133a\0\u1368\0\u1396\0\u13c4\0\u13f2\0\u1420\0\u144e\0\u147c"+
    "\0\u14aa\0\u14d8\0\u1506\0\u1534\0\u1562\0\u1590\0\u15be\0\u15ec"+
    "\0\u161a\0\u1648\0\u1676\0\u16a4\0\u16d2\0\u1700\0\u172e\0\u175c"+
    "\0\u178a\0\u17b8\0\u17e6\0\u1814\0\u1842\0\u1870\0\u189e\0\u18cc"+
    "\0\u18fa\0\u1928\0\u1956\0\u1984\0\u19b2\0\u19e0\0\u1a0e\0\u1a3c"+
    "\0\u019e\0\u1a6a\0\u1a98\0\u1ac6\0\u1af4\0\u1b22\0\u1b50\0\u1b7e"+
    "\0\u1bac\0\u1bda\0\u019e\0\u1c08\0\u1c36\0\u019e\0\u1c64\0\u1c92"+
    "\0\u1cc0\0\u1cee\0\u1d1c\0\u1d4a\0\u1d78\0\u1da6\0\u019e\0\u1dd4";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[184];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\0\1\4\1\5\1\6\1\7\1\10"+
    "\1\2\1\11\1\12\1\13\1\14\1\2\10\15\1\16"+
    "\1\15\1\17\1\20\1\21\1\22\2\15\1\23\1\24"+
    "\1\15\1\25\1\26\1\27\1\15\1\30\1\31\1\32"+
    "\2\15\1\5\2\15\60\0\1\3\67\0\2\33\1\0"+
    "\37\33\17\0\34\34\1\0\2\34\12\0\1\35\54\0"+
    "\1\36\1\0\1\37\56\0\1\3\1\40\54\0\2\14"+
    "\54\0\2\15\1\0\34\15\1\0\2\15\14\0\2\15"+
    "\1\0\13\15\1\41\15\15\1\42\2\15\1\0\2\15"+
    "\14\0\2\15\1\0\24\15\1\43\7\15\1\0\2\15"+
    "\14\0\2\15\1\0\14\15\1\44\17\15\1\0\2\15"+
    "\14\0\2\15\1\0\30\15\1\45\3\15\1\0\2\15"+
    "\14\0\2\15\1\0\20\15\1\46\6\15\1\47\4\15"+
    "\1\0\2\15\14\0\2\15\1\0\23\15\1\50\7\15"+
    "\1\51\1\0\2\15\14\0\2\15\1\0\10\15\1\52"+
    "\23\15\1\0\2\15\14\0\2\15\1\0\24\15\1\53"+
    "\7\15\1\0\1\15\1\54\14\0\2\15\1\0\14\15"+
    "\1\21\17\15\1\0\2\15\14\0\2\15\1\0\20\15"+
    "\1\55\3\15\1\56\7\15\1\0\2\15\14\0\2\15"+
    "\1\0\14\15\1\57\17\15\1\0\2\15\14\0\2\15"+
    "\1\0\20\15\1\60\11\15\1\61\1\15\1\0\2\15"+
    "\14\0\2\15\1\0\24\15\1\62\7\15\1\0\2\15"+
    "\14\0\2\63\1\0\37\63\14\0\2\34\1\0\34\34"+
    "\1\0\2\34\16\0\1\10\37\0\11\64\1\65\44\64"+
    "\2\37\1\66\1\37\1\67\51\37\14\0\2\40\54\0"+
    "\2\15\1\0\14\15\1\70\17\15\1\0\2\15\14\0"+
    "\2\15\1\0\27\15\1\71\4\15\1\0\2\15\14\0"+
    "\2\15\1\0\21\15\1\72\12\15\1\0\2\15\14\0"+
    "\2\15\1\0\27\15\1\73\1\15\1\74\2\15\1\0"+
    "\2\15\14\0\2\15\1\0\31\15\1\75\2\15\1\0"+
    "\2\15\14\0\2\15\1\0\23\15\1\76\10\15\1\0"+
    "\2\15\14\0\2\15\1\0\14\15\1\77\17\15\1\0"+
    "\2\15\14\0\2\15\1\0\31\15\1\100\2\15\1\0"+
    "\2\15\14\0\2\15\1\0\26\15\1\101\5\15\1\0"+
    "\2\15\14\0\2\15\1\0\20\15\1\102\2\15\1\103"+
    "\10\15\1\0\2\15\14\0\2\15\1\0\27\15\1\45"+
    "\4\15\1\0\2\15\14\0\2\15\1\0\22\15\1\104"+
    "\11\15\1\0\2\15\14\0\2\15\1\0\23\15\1\105"+
    "\10\15\1\0\2\15\14\0\2\15\1\0\23\15\1\106"+
    "\10\15\1\0\2\15\14\0\2\15\1\0\25\15\1\107"+
    "\6\15\1\0\2\15\14\0\2\15\1\0\23\15\1\110"+
    "\10\15\1\0\2\15\14\0\2\15\1\0\27\15\1\111"+
    "\4\15\1\0\2\15\14\0\2\15\1\0\22\15\1\112"+
    "\11\15\1\0\2\15\14\0\2\113\1\0\37\113\11\64"+
    "\1\114\55\64\1\114\1\64\1\115\42\64\2\0\1\66"+
    "\67\0\2\15\1\0\21\15\1\116\12\15\1\0\2\15"+
    "\14\0\2\15\1\0\34\15\1\0\1\117\1\15\14\0"+
    "\2\15\1\0\24\15\1\120\7\15\1\0\2\15\14\0"+
    "\2\15\1\0\14\15\1\121\17\15\1\0\2\15\14\0"+
    "\2\15\1\0\14\15\1\122\17\15\1\0\2\15\14\0"+
    "\2\15\1\0\14\15\1\111\17\15\1\0\2\15\14\0"+
    "\2\15\1\0\10\15\1\123\23\15\1\0\2\15\14\0"+
    "\2\15\1\0\23\15\1\124\10\15\1\0\2\15\14\0"+
    "\2\15\1\0\14\15\1\125\17\15\1\0\2\15\14\0"+
    "\2\15\1\0\32\15\1\126\1\15\1\0\2\15\14\0"+
    "\2\15\1\0\33\15\1\127\1\0\2\15\14\0\2\15"+
    "\1\0\33\15\1\130\1\0\2\15\14\0\2\15\1\0"+
    "\14\15\1\131\17\15\1\0\2\15\14\0\2\15\1\0"+
    "\31\15\1\132\2\15\1\0\2\15\14\0\2\15\1\0"+
    "\14\15\1\133\17\15\1\0\2\15\14\0\2\15\1\0"+
    "\14\15\1\134\17\15\1\0\2\15\14\0\2\15\1\0"+
    "\24\15\1\135\7\15\1\0\2\15\14\0\2\15\1\0"+
    "\10\15\1\133\23\15\1\0\2\15\14\0\2\136\1\0"+
    "\37\136\11\64\1\114\1\64\1\66\42\64\14\0\2\15"+
    "\1\0\10\15\1\137\23\15\1\0\2\15\14\0\2\15"+
    "\1\0\30\15\1\111\3\15\1\0\2\15\14\0\2\15"+
    "\1\0\27\15\1\140\4\15\1\0\2\15\14\0\2\15"+
    "\1\0\12\15\1\141\21\15\1\0\2\15\14\0\2\15"+
    "\1\0\23\15\1\142\10\15\1\0\2\15\14\0\2\15"+
    "\1\0\21\15\1\143\12\15\1\0\2\15\14\0\2\15"+
    "\1\0\31\15\1\144\2\15\1\0\2\15\14\0\2\15"+
    "\1\0\27\15\1\145\4\15\1\0\2\15\14\0\2\15"+
    "\1\0\20\15\1\146\13\15\1\0\2\15\14\0\2\15"+
    "\1\0\26\15\1\147\5\15\1\0\2\15\14\0\2\15"+
    "\1\0\10\15\1\150\23\15\1\0\2\15\14\0\2\15"+
    "\1\0\27\15\1\151\4\15\1\0\2\15\14\0\2\15"+
    "\1\0\10\15\1\152\23\15\1\0\2\15\14\0\2\15"+
    "\1\0\27\15\1\153\4\15\1\0\2\15\14\0\2\15"+
    "\1\0\31\15\1\154\2\15\1\0\2\15\14\0\2\155"+
    "\1\0\37\155\14\0\2\15\1\0\23\15\1\45\10\15"+
    "\1\0\2\15\14\0\2\15\1\0\17\15\1\156\14\15"+
    "\1\0\2\15\14\0\2\15\1\0\14\15\1\157\17\15"+
    "\1\0\2\15\14\0\2\15\1\0\14\15\1\160\17\15"+
    "\1\0\2\15\14\0\2\15\1\0\27\15\1\161\4\15"+
    "\1\0\2\15\14\0\2\15\1\0\14\15\1\162\17\15"+
    "\1\0\2\15\14\0\2\15\1\0\32\15\1\163\1\15"+
    "\1\0\2\15\14\0\2\15\1\0\27\15\1\164\4\15"+
    "\1\0\2\15\14\0\2\15\1\0\24\15\1\140\7\15"+
    "\1\0\2\15\14\0\2\15\1\0\27\15\1\165\4\15"+
    "\1\0\2\15\14\0\2\15\1\0\20\15\1\166\13\15"+
    "\1\0\2\15\14\0\2\167\1\0\37\167\14\0\2\15"+
    "\1\0\10\15\1\170\23\15\1\0\2\15\14\0\2\15"+
    "\1\0\27\15\1\171\4\15\1\0\2\15\14\0\2\15"+
    "\1\0\3\15\1\172\30\15\1\0\2\15\14\0\2\15"+
    "\1\0\32\15\1\173\1\15\1\0\2\15\14\0\2\15"+
    "\1\0\27\15\1\174\4\15\1\0\2\15\14\0\2\15"+
    "\1\0\20\15\1\175\13\15\1\0\2\15\14\0\2\15"+
    "\1\0\4\15\1\176\27\15\1\0\2\15\14\0\2\15"+
    "\1\0\27\15\1\177\4\15\1\0\2\15\14\0\2\15"+
    "\1\0\7\15\1\200\24\15\1\0\2\15\14\0\2\15"+
    "\1\0\30\15\1\201\3\15\1\0\2\15\14\0\2\15"+
    "\1\0\22\15\1\202\11\15\1\0\2\15\14\0\2\15"+
    "\1\0\13\15\1\203\20\15\1\0\2\15\14\0\2\15"+
    "\1\0\14\15\1\204\17\15\1\0\2\15\14\0\2\15"+
    "\1\0\24\15\1\205\7\15\1\0\2\15\14\0\2\15"+
    "\1\0\4\15\1\206\27\15\1\0\2\15\14\0\2\15"+
    "\1\0\20\15\1\207\13\15\1\0\2\15\14\0\2\15"+
    "\1\0\1\15\1\210\1\211\2\15\1\212\1\213\25\15"+
    "\1\0\2\15\14\0\2\15\1\0\25\15\1\214\6\15"+
    "\1\0\2\15\14\0\2\15\1\0\10\15\1\215\23\15"+
    "\1\0\2\15\14\0\2\15\1\0\27\15\1\216\4\15"+
    "\1\0\2\15\14\0\2\15\1\0\23\15\1\217\10\15"+
    "\1\0\2\15\14\0\2\15\1\0\20\15\1\220\13\15"+
    "\1\0\2\15\14\0\2\15\1\0\23\15\1\221\10\15"+
    "\1\0\2\15\14\0\2\15\1\0\10\15\1\222\10\15"+
    "\1\223\12\15\1\0\2\15\14\0\2\15\1\0\21\15"+
    "\1\224\12\15\1\0\2\15\14\0\2\15\1\0\14\15"+
    "\1\225\17\15\1\0\2\15\14\0\2\15\1\0\11\15"+
    "\1\226\22\15\1\0\2\15\14\0\2\15\1\0\20\15"+
    "\1\227\13\15\1\0\2\15\14\0\2\15\1\0\3\15"+
    "\1\230\30\15\1\0\2\15\14\0\2\15\1\0\13\15"+
    "\1\231\20\15\1\0\2\15\14\0\2\15\1\0\14\15"+
    "\1\232\17\15\1\0\2\15\14\0\2\15\1\0\14\15"+
    "\1\233\17\15\1\0\2\15\14\0\2\15\1\0\31\15"+
    "\1\234\2\15\1\0\2\15\14\0\2\15\1\0\21\15"+
    "\1\235\12\15\1\0\2\15\14\0\2\15\1\0\10\15"+
    "\1\236\23\15\1\0\2\15\14\0\2\15\1\0\10\15"+
    "\1\237\23\15\1\0\2\15\14\0\2\15\1\0\16\15"+
    "\1\237\15\15\1\0\2\15\14\0\2\15\1\0\30\15"+
    "\1\240\3\15\1\0\2\15\14\0\2\15\1\0\27\15"+
    "\1\241\4\15\1\0\2\15\14\0\2\15\1\0\30\15"+
    "\1\242\3\15\1\0\2\15\14\0\2\15\1\0\10\15"+
    "\1\243\23\15\1\0\2\15\14\0\2\15\1\0\13\15"+
    "\1\244\20\15\1\0\2\15\14\0\2\15\1\0\23\15"+
    "\1\245\10\15\1\0\2\15\14\0\2\15\1\0\10\15"+
    "\1\227\23\15\1\0\2\15\14\0\2\15\1\0\20\15"+
    "\1\246\13\15\1\0\2\15\14\0\2\15\1\0\23\15"+
    "\1\247\10\15\1\0\2\15\14\0\2\15\1\0\27\15"+
    "\1\250\4\15\1\0\2\15\14\0\2\15\1\0\31\15"+
    "\1\251\2\15\1\0\2\15\14\0\2\15\1\0\1\15"+
    "\1\210\1\211\3\15\1\213\25\15\1\0\2\15\14\0"+
    "\2\15\1\0\14\15\1\252\17\15\1\0\2\15\14\0"+
    "\2\15\1\0\10\15\1\253\23\15\1\0\2\15\14\0"+
    "\2\15\1\0\31\15\1\254\2\15\1\0\2\15\14\0"+
    "\2\15\1\0\33\15\1\255\1\0\2\15\14\0\2\15"+
    "\1\0\12\15\1\250\21\15\1\0\2\15\14\0\2\15"+
    "\1\0\24\15\1\256\7\15\1\0\2\15\14\0\2\15"+
    "\1\0\34\15\1\0\1\257\1\15\14\0\2\15\1\0"+
    "\30\15\1\260\3\15\1\0\2\15\14\0\2\15\1\0"+
    "\27\15\1\261\4\15\1\0\2\15\14\0\2\15\1\0"+
    "\10\15\1\256\23\15\1\0\2\15\14\0\2\15\1\0"+
    "\12\15\1\262\21\15\1\0\2\15\14\0\2\15\1\0"+
    "\23\15\1\263\10\15\1\0\2\15\14\0\2\15\1\0"+
    "\10\15\1\264\23\15\1\0\2\15\14\0\2\15\1\0"+
    "\32\15\1\265\1\15\1\0\2\15\14\0\2\15\1\0"+
    "\14\15\1\266\17\15\1\0\2\15\14\0\2\15\1\0"+
    "\30\15\1\267\3\15\1\0\2\15\14\0\2\15\1\0"+
    "\21\15\1\250\12\15\1\0\2\15\14\0\2\15\1\0"+
    "\16\15\1\270\15\15\1\0\2\15\14\0\2\15\1\0"+
    "\27\15\1\255\4\15\1\0\2\15";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7682];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\1\1\1\11\2\1\1\11\22\1\1\0"+
    "\1\1\2\0\24\1\3\0\1\11\24\1\2\0\21\1"+
    "\1\0\16\1\1\0\11\1\1\11\101\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[184];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
    private TextColor textColor(long start, int size, Color color){
        return new TextColor((int) start, size, color);
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexerColor(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public TextColor yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { /* Ignorar */
            }
            // fall through
          case 19: break;
          case 2:
            { /*Ignorar*/
            }
            // fall through
          case 20: break;
          case 3:
            { return textColor(yychar, yylength(), new Color(48,63,159));
            }
            // fall through
          case 21: break;
          case 4:
            { return textColor(yychar, yylength(), new Color(169,155,179));
            }
            // fall through
          case 22: break;
          case 5:
            { return textColor(yychar, yylength(), new Color(35, 120, 147));
            }
            // fall through
          case 23: break;
          case 6:
            { /* Ignorar*/
            }
            // fall through
          case 24: break;
          case 7:
            { return textColor(yychar, yylength(), new Color(146, 146, 146));
            }
            // fall through
          case 25: break;
          case 8:
            { return textColor(yychar, yylength(), new Color(48,63,129));
            }
            // fall through
          case 26: break;
          case 9:
            { return textColor(yychar, yylength(), new Color(17,94,153));
            }
            // fall through
          case 27: break;
          case 10:
            { return textColor(yychar, yylength(), new Color(148, 58, 173));
            }
            // fall through
          case 28: break;
          case 11:
            { return textColor(yychar, yylength(), new Color(198,40,40));
            }
            // fall through
          case 29: break;
          case 12:
            { return textColor(yychar, yylength(), new Color(102,41,120));
            }
            // fall through
          case 30: break;
          case 13:
            { return textColor(yychar, yylength(), new Color(212,129,6));
            }
            // fall through
          case 31: break;
          case 14:
            { return textColor(yychar, yylength(), new Color(224,195,12));
            }
            // fall through
          case 32: break;
          case 15:
            { return textColor(yychar, yylength(), new Color(121,107,255));
            }
            // fall through
          case 33: break;
          case 16:
            { return textColor(yychar, yylength(), new Color(255,64,129));
            }
            // fall through
          case 34: break;
          case 17:
            { return textColor(yychar, yylength(), new Color(239,108,0));
            }
            // fall through
          case 35: break;
          case 18:
            { return textColor(yychar, yylength(), new Color(150,0,80));
            }
            // fall through
          case 36: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
