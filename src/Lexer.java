// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: src/Lexer.flex

import compilerTools.Token;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class Lexer {

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
    "\1\5\1\0\1\6\1\7\1\0\1\5\1\0\1\10"+
    "\1\11\1\12\1\0\1\13\1\14\1\0\1\15\1\16"+
    "\11\17\1\0\1\20\2\0\1\21\2\0\1\22\1\23"+
    "\1\24\1\22\1\25\7\22\1\26\1\27\1\30\1\31"+
    "\12\22\4\0\1\22\1\0\1\32\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\2\22\1\43\1\44"+
    "\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54"+
    "\4\22\1\55\1\56\1\57\1\60\7\0\1\3\73\0"+
    "\1\22\7\0\1\22\3\0\1\22\3\0\1\22\1\0"+
    "\1\22\6\0\1\22\1\0\1\22\4\0\1\61\7\0"+
    "\1\22\3\0\1\22\3\0\1\22\1\0\1\22\6\0"+
    "\1\62\1\0\1\22\u012b\0\2\3\326\0\u0100\3";

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
    "\1\0\1\1\2\2\1\3\2\1\1\4\1\5\1\6"+
    "\2\1\2\7\1\10\16\11\1\12\1\13\1\0\1\14"+
    "\2\0\1\2\2\15\17\11\1\16\2\11\1\0\1\17"+
    "\2\0\21\11\1\20\1\11\2\0\1\2\17\11\1\16"+
    "\1\0\1\11\1\21\2\11\1\22\7\11\1\23\1\11"+
    "\1\0\7\11\1\24\1\11\1\25\1\20\6\11\1\26"+
    "\15\11\1\20\23\11\1\27\12\11\1\30\1\11\1\31"+
    "\1\11\1\32\10\11\1\26\1\11";

  private static int [] zzUnpackAction() {
    int [] result = new int[191];
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
    "\0\0\0\63\0\63\0\146\0\63\0\231\0\314\0\63"+
    "\0\63\0\63\0\377\0\u0132\0\u0165\0\u0198\0\63\0\u01cb"+
    "\0\u01fe\0\u0231\0\u0264\0\u0297\0\u02ca\0\u02fd\0\u0330\0\u0363"+
    "\0\u0396\0\u03c9\0\u03fc\0\u042f\0\u0462\0\63\0\63\0\u0495"+
    "\0\u04c8\0\u04fb\0\u052e\0\u0561\0\63\0\u0594\0\u05c7\0\u05fa"+
    "\0\u062d\0\u0660\0\u0693\0\u06c6\0\u06f9\0\u072c\0\u075f\0\u0792"+
    "\0\u07c5\0\u07f8\0\u082b\0\u085e\0\u0891\0\u08c4\0\u08f7\0\u092a"+
    "\0\u095d\0\63\0\u0990\0\u09c3\0\u09f6\0\u0a29\0\u0a5c\0\u0a8f"+
    "\0\u0ac2\0\u0af5\0\u0b28\0\u0b5b\0\u0b8e\0\u0bc1\0\u0bf4\0\u0c27"+
    "\0\u0c5a\0\u0c8d\0\u0cc0\0\u0cf3\0\u0d26\0\u01cb\0\u0d59\0\u0d8c"+
    "\0\u0dbf\0\u0990\0\u0df2\0\u0e25\0\u0e58\0\u0e8b\0\u0ebe\0\u0ef1"+
    "\0\u0f24\0\u0f57\0\u0f8a\0\u0fbd\0\u0ff0\0\u1023\0\u1056\0\u1089"+
    "\0\u10bc\0\u01cb\0\u10ef\0\u1122\0\u01cb\0\u1155\0\u1188\0\u01cb"+
    "\0\u11bb\0\u11ee\0\u1221\0\u1254\0\u1287\0\u12ba\0\u12ed\0\u01cb"+
    "\0\u1320\0\u1353\0\u1386\0\u13b9\0\u13ec\0\u141f\0\u1452\0\u1485"+
    "\0\u14b8\0\u01cb\0\u14eb\0\63\0\u13ec\0\u151e\0\u1551\0\u1584"+
    "\0\u15b7\0\u15ea\0\u161d\0\u1650\0\u1683\0\u16b6\0\u16e9\0\u171c"+
    "\0\u174f\0\u1782\0\u17b5\0\u17e8\0\u181b\0\u184e\0\u1881\0\u18b4"+
    "\0\u18e7\0\u191a\0\u194d\0\u1980\0\u19b3\0\u19e6\0\u1a19\0\u1a4c"+
    "\0\u1a7f\0\u1ab2\0\u1ae5\0\u1b18\0\u1b4b\0\u1b7e\0\u1bb1\0\u1be4"+
    "\0\u1c17\0\u1c4a\0\u1c7d\0\u1cb0\0\u1ce3\0\u01cb\0\u1d16\0\u1d49"+
    "\0\u1d7c\0\u1daf\0\u1de2\0\u1e15\0\u1e48\0\u1e7b\0\u1eae\0\u1ee1"+
    "\0\u01cb\0\u1f14\0\u01cb\0\u1f47\0\u01cb\0\u1f7a\0\u1fad\0\u1fe0"+
    "\0\u2013\0\u2046\0\u2079\0\u20ac\0\u20df\0\u01cb\0\u2112";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[191];
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
    "\1\11\1\2\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\2\10\20\1\21\1\20\1\22\1\23\1\24\1\25"+
    "\2\20\1\26\1\27\1\20\1\30\1\31\1\32\1\20"+
    "\1\33\1\34\1\35\2\20\1\36\1\5\1\37\2\20"+
    "\65\0\1\3\76\0\2\40\2\0\34\40\1\0\1\40"+
    "\1\0\2\40\22\0\34\41\3\0\2\41\14\0\1\42"+
    "\60\0\1\43\2\0\1\44\63\0\1\45\1\46\61\0"+
    "\2\16\61\0\2\20\2\0\34\20\3\0\2\20\16\0"+
    "\2\20\2\0\13\20\1\47\15\20\1\50\2\20\3\0"+
    "\2\20\16\0\2\20\2\0\24\20\1\51\7\20\3\0"+
    "\2\20\16\0\2\20\2\0\14\20\1\52\17\20\3\0"+
    "\2\20\16\0\2\20\2\0\30\20\1\53\3\20\3\0"+
    "\2\20\16\0\2\20\2\0\20\20\1\54\6\20\1\55"+
    "\4\20\3\0\2\20\16\0\2\20\2\0\23\20\1\56"+
    "\7\20\1\57\3\0\2\20\16\0\2\20\2\0\10\20"+
    "\1\60\23\20\3\0\2\20\16\0\2\20\2\0\24\20"+
    "\1\61\7\20\3\0\1\20\1\62\16\0\2\20\2\0"+
    "\14\20\1\24\17\20\3\0\2\20\16\0\2\20\2\0"+
    "\20\20\1\63\3\20\1\64\7\20\3\0\2\20\16\0"+
    "\2\20\2\0\14\20\1\65\17\20\3\0\2\20\16\0"+
    "\2\20\2\0\20\20\1\66\11\20\1\67\1\20\3\0"+
    "\2\20\16\0\2\20\2\0\24\20\1\70\7\20\3\0"+
    "\2\20\16\0\2\71\2\0\34\71\1\0\1\71\1\0"+
    "\2\71\16\0\2\41\2\0\34\41\3\0\2\41\21\0"+
    "\1\72\41\0\12\73\1\74\50\73\2\44\1\3\1\44"+
    "\1\4\56\44\16\0\2\46\61\0\2\20\2\0\14\20"+
    "\1\75\17\20\3\0\2\20\16\0\2\20\2\0\27\20"+
    "\1\76\4\20\3\0\2\20\16\0\2\20\2\0\21\20"+
    "\1\77\12\20\3\0\2\20\16\0\2\20\2\0\27\20"+
    "\1\100\1\20\1\101\2\20\3\0\2\20\16\0\2\20"+
    "\2\0\31\20\1\102\2\20\3\0\2\20\16\0\2\20"+
    "\2\0\23\20\1\103\10\20\3\0\2\20\16\0\2\20"+
    "\2\0\14\20\1\104\17\20\3\0\2\20\16\0\2\20"+
    "\2\0\31\20\1\105\2\20\3\0\2\20\16\0\2\20"+
    "\2\0\26\20\1\106\5\20\3\0\2\20\16\0\2\20"+
    "\2\0\20\20\1\107\2\20\1\110\10\20\3\0\2\20"+
    "\16\0\2\20\2\0\27\20\1\53\4\20\3\0\2\20"+
    "\16\0\2\20\2\0\22\20\1\111\11\20\3\0\2\20"+
    "\16\0\2\20\2\0\23\20\1\112\10\20\3\0\2\20"+
    "\16\0\2\20\2\0\23\20\1\113\10\20\3\0\2\20"+
    "\16\0\2\20\2\0\25\20\1\114\6\20\3\0\2\20"+
    "\16\0\2\20\2\0\23\20\1\115\10\20\3\0\2\20"+
    "\16\0\2\20\2\0\27\20\1\116\4\20\3\0\2\20"+
    "\16\0\2\20\2\0\22\20\1\117\11\20\3\0\2\20"+
    "\16\0\2\120\2\0\34\120\1\0\1\120\1\0\2\120"+
    "\12\73\1\121\62\73\1\121\2\73\1\122\45\73\16\0"+
    "\2\20\2\0\21\20\1\123\12\20\3\0\2\20\16\0"+
    "\2\20\2\0\34\20\3\0\1\124\1\20\16\0\2\20"+
    "\2\0\24\20\1\125\7\20\3\0\2\20\16\0\2\20"+
    "\2\0\14\20\1\126\17\20\3\0\2\20\16\0\2\20"+
    "\2\0\14\20\1\127\17\20\3\0\2\20\16\0\2\20"+
    "\2\0\14\20\1\116\17\20\3\0\2\20\16\0\2\20"+
    "\2\0\10\20\1\130\23\20\3\0\2\20\16\0\2\20"+
    "\2\0\23\20\1\131\10\20\3\0\2\20\16\0\2\20"+
    "\2\0\14\20\1\132\17\20\3\0\2\20\16\0\2\20"+
    "\2\0\32\20\1\133\1\20\3\0\2\20\16\0\2\20"+
    "\2\0\33\20\1\134\3\0\2\20\16\0\2\20\2\0"+
    "\33\20\1\135\3\0\2\20\16\0\2\20\2\0\14\20"+
    "\1\136\17\20\3\0\2\20\16\0\2\20\2\0\31\20"+
    "\1\137\2\20\3\0\2\20\16\0\2\20\2\0\14\20"+
    "\1\140\17\20\3\0\2\20\16\0\2\20\2\0\14\20"+
    "\1\141\17\20\3\0\2\20\16\0\2\20\2\0\24\20"+
    "\1\142\7\20\3\0\2\20\16\0\2\20\2\0\10\20"+
    "\1\140\23\20\3\0\2\20\16\0\2\143\2\0\34\143"+
    "\1\0\1\143\1\0\2\143\12\73\1\121\2\73\1\3"+
    "\45\73\16\0\2\20\2\0\10\20\1\144\23\20\3\0"+
    "\2\20\16\0\2\20\2\0\30\20\1\116\3\20\3\0"+
    "\2\20\16\0\2\20\2\0\27\20\1\145\4\20\3\0"+
    "\2\20\16\0\2\20\2\0\12\20\1\146\21\20\3\0"+
    "\2\20\16\0\2\20\2\0\23\20\1\147\10\20\3\0"+
    "\2\20\16\0\2\20\2\0\21\20\1\150\12\20\3\0"+
    "\2\20\16\0\2\20\2\0\31\20\1\151\2\20\3\0"+
    "\2\20\16\0\2\20\2\0\27\20\1\152\4\20\3\0"+
    "\2\20\16\0\2\20\2\0\20\20\1\153\13\20\3\0"+
    "\2\20\16\0\2\20\2\0\26\20\1\154\5\20\3\0"+
    "\2\20\16\0\2\20\2\0\10\20\1\155\23\20\3\0"+
    "\2\20\16\0\2\20\2\0\27\20\1\156\4\20\3\0"+
    "\2\20\16\0\2\20\2\0\10\20\1\157\23\20\3\0"+
    "\2\20\16\0\2\20\2\0\27\20\1\160\4\20\3\0"+
    "\2\20\16\0\2\20\2\0\31\20\1\161\2\20\3\0"+
    "\2\20\16\0\2\162\2\0\34\162\1\0\1\162\1\0"+
    "\2\162\16\0\2\20\2\0\23\20\1\53\10\20\3\0"+
    "\2\20\16\0\2\20\2\0\17\20\1\163\14\20\3\0"+
    "\2\20\16\0\2\20\2\0\14\20\1\164\17\20\3\0"+
    "\2\20\16\0\2\20\2\0\14\20\1\165\17\20\3\0"+
    "\2\20\16\0\2\20\2\0\27\20\1\166\4\20\3\0"+
    "\2\20\16\0\2\20\2\0\14\20\1\167\17\20\3\0"+
    "\2\20\16\0\2\20\2\0\32\20\1\170\1\20\3\0"+
    "\2\20\16\0\2\20\2\0\27\20\1\171\4\20\3\0"+
    "\2\20\16\0\2\20\2\0\24\20\1\145\7\20\3\0"+
    "\2\20\16\0\2\20\2\0\27\20\1\172\4\20\3\0"+
    "\2\20\16\0\2\20\2\0\20\20\1\173\13\20\3\0"+
    "\2\20\16\0\2\174\2\0\34\174\1\0\1\174\1\0"+
    "\2\174\16\0\2\20\2\0\10\20\1\175\23\20\3\0"+
    "\2\20\16\0\2\20\2\0\27\20\1\176\4\20\3\0"+
    "\2\20\16\0\2\20\2\0\3\20\1\177\30\20\3\0"+
    "\2\20\16\0\2\20\2\0\32\20\1\200\1\20\3\0"+
    "\2\20\16\0\2\20\2\0\27\20\1\201\4\20\3\0"+
    "\2\20\16\0\2\20\2\0\20\20\1\202\13\20\3\0"+
    "\2\20\16\0\2\20\2\0\4\20\1\203\27\20\3\0"+
    "\2\20\16\0\2\20\2\0\27\20\1\204\4\20\3\0"+
    "\2\20\16\0\2\20\2\0\7\20\1\205\24\20\3\0"+
    "\2\20\16\0\2\20\2\0\30\20\1\206\3\20\3\0"+
    "\2\20\16\0\2\20\2\0\22\20\1\207\11\20\3\0"+
    "\2\20\16\0\2\20\2\0\13\20\1\210\20\20\3\0"+
    "\2\20\16\0\2\20\2\0\14\20\1\211\17\20\3\0"+
    "\2\20\16\0\2\20\2\0\24\20\1\212\7\20\3\0"+
    "\2\20\16\0\2\20\2\0\4\20\1\213\27\20\3\0"+
    "\2\20\16\0\2\20\2\0\20\20\1\214\13\20\3\0"+
    "\2\20\16\0\2\20\2\0\1\20\1\215\1\216\2\20"+
    "\1\217\1\220\25\20\3\0\2\20\16\0\2\20\2\0"+
    "\25\20\1\221\6\20\3\0\2\20\16\0\2\20\2\0"+
    "\10\20\1\222\23\20\3\0\2\20\16\0\2\20\2\0"+
    "\27\20\1\223\4\20\3\0\2\20\16\0\2\20\2\0"+
    "\23\20\1\224\10\20\3\0\2\20\16\0\2\20\2\0"+
    "\20\20\1\225\13\20\3\0\2\20\16\0\2\20\2\0"+
    "\23\20\1\226\10\20\3\0\2\20\16\0\2\20\2\0"+
    "\10\20\1\227\10\20\1\230\12\20\3\0\2\20\16\0"+
    "\2\20\2\0\21\20\1\231\12\20\3\0\2\20\16\0"+
    "\2\20\2\0\14\20\1\232\17\20\3\0\2\20\16\0"+
    "\2\20\2\0\11\20\1\233\22\20\3\0\2\20\16\0"+
    "\2\20\2\0\20\20\1\234\13\20\3\0\2\20\16\0"+
    "\2\20\2\0\3\20\1\235\30\20\3\0\2\20\16\0"+
    "\2\20\2\0\13\20\1\236\20\20\3\0\2\20\16\0"+
    "\2\20\2\0\14\20\1\237\17\20\3\0\2\20\16\0"+
    "\2\20\2\0\14\20\1\240\17\20\3\0\2\20\16\0"+
    "\2\20\2\0\31\20\1\241\2\20\3\0\2\20\16\0"+
    "\2\20\2\0\21\20\1\242\12\20\3\0\2\20\16\0"+
    "\2\20\2\0\10\20\1\243\23\20\3\0\2\20\16\0"+
    "\2\20\2\0\10\20\1\244\23\20\3\0\2\20\16\0"+
    "\2\20\2\0\16\20\1\244\15\20\3\0\2\20\16\0"+
    "\2\20\2\0\30\20\1\245\3\20\3\0\2\20\16\0"+
    "\2\20\2\0\27\20\1\246\4\20\3\0\2\20\16\0"+
    "\2\20\2\0\30\20\1\247\3\20\3\0\2\20\16\0"+
    "\2\20\2\0\10\20\1\250\23\20\3\0\2\20\16\0"+
    "\2\20\2\0\13\20\1\251\20\20\3\0\2\20\16\0"+
    "\2\20\2\0\23\20\1\252\10\20\3\0\2\20\16\0"+
    "\2\20\2\0\10\20\1\253\23\20\3\0\2\20\16\0"+
    "\2\20\2\0\20\20\1\254\13\20\3\0\2\20\16\0"+
    "\2\20\2\0\23\20\1\255\10\20\3\0\2\20\16\0"+
    "\2\20\2\0\27\20\1\256\4\20\3\0\2\20\16\0"+
    "\2\20\2\0\31\20\1\257\2\20\3\0\2\20\16\0"+
    "\2\20\2\0\1\20\1\215\1\216\3\20\1\220\25\20"+
    "\3\0\2\20\16\0\2\20\2\0\14\20\1\260\17\20"+
    "\3\0\2\20\16\0\2\20\2\0\10\20\1\261\23\20"+
    "\3\0\2\20\16\0\2\20\2\0\31\20\1\262\2\20"+
    "\3\0\2\20\16\0\2\20\2\0\27\20\1\263\4\20"+
    "\3\0\2\20\16\0\2\20\2\0\33\20\1\264\3\0"+
    "\2\20\16\0\2\20\2\0\12\20\1\256\21\20\3\0"+
    "\2\20\16\0\2\20\2\0\24\20\1\265\7\20\3\0"+
    "\2\20\16\0\2\20\2\0\34\20\3\0\1\266\1\20"+
    "\16\0\2\20\2\0\30\20\1\267\3\20\3\0\2\20"+
    "\16\0\2\20\2\0\27\20\1\270\4\20\3\0\2\20"+
    "\16\0\2\20\2\0\10\20\1\265\23\20\3\0\2\20"+
    "\16\0\2\20\2\0\12\20\1\271\21\20\3\0\2\20"+
    "\16\0\2\20\2\0\23\20\1\272\10\20\3\0\2\20"+
    "\16\0\2\20\2\0\10\20\1\273\23\20\3\0\2\20"+
    "\16\0\2\20\2\0\32\20\1\274\1\20\3\0\2\20"+
    "\16\0\2\20\2\0\14\20\1\275\17\20\3\0\2\20"+
    "\16\0\2\20\2\0\30\20\1\276\3\20\3\0\2\20"+
    "\16\0\2\20\2\0\21\20\1\256\12\20\3\0\2\20"+
    "\16\0\2\20\2\0\16\20\1\277\15\20\3\0\2\20"+
    "\16\0\2\20\2\0\27\20\1\264\4\20\3\0\2\20";

  private static int [] zzUnpackTrans() {
    int [] result = new int[8517];
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
    "\1\0\2\11\1\1\1\11\2\1\3\11\4\1\1\11"+
    "\16\1\2\11\1\0\1\1\2\0\1\1\1\11\23\1"+
    "\1\0\1\11\2\0\23\1\2\0\21\1\1\0\16\1"+
    "\1\0\11\1\1\11\103\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[191];
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
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
    private Token token(String lexeme, String lexicalComp, int line, int column){
        return new Token(lexeme, lexicalComp, line+1, column+1);
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
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
  public Token yylex() throws java.io.IOException {
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

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
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
            { return token(yytext(), "ERROR", yyline, yycolumn);
            }
            // fall through
          case 27: break;
          case 2:
            { /*Ignorar*/
            }
            // fall through
          case 28: break;
          case 3:
            { return token(yytext(), "OP_LOGICO", yyline, yycolumn);
            }
            // fall through
          case 29: break;
          case 4:
            { return token(yytext(), "PARENTESIS_A", yyline, yycolumn);
            }
            // fall through
          case 30: break;
          case 5:
            { return token(yytext(), "PARENTESIS_C", yyline, yycolumn);
            }
            // fall through
          case 31: break;
          case 6:
            { return token(yytext(), "COMA", yyline, yycolumn);
            }
            // fall through
          case 32: break;
          case 7:
            { return token(yytext(), "NUMERO", yyline, yycolumn);
            }
            // fall through
          case 33: break;
          case 8:
            { return token(yytext(), "PUNTO_COMA", yyline, yycolumn);
            }
            // fall through
          case 34: break;
          case 9:
            { return token(yytext(), "ERROR_2", yyline, yycolumn);
            }
            // fall through
          case 35: break;
          case 10:
            { return token(yytext(), "LLAVE_A", yyline, yycolumn);
            }
            // fall through
          case 36: break;
          case 11:
            { return token(yytext(), "LLAVE_C", yyline, yycolumn);
            }
            // fall through
          case 37: break;
          case 12:
            { return token(yytext(), "IDENTIFICADOR", yyline, yycolumn);
            }
            // fall through
          case 38: break;
          case 13:
            { return token(yytext(), "ERROR_1", yyline, yycolumn);
            }
            // fall through
          case 39: break;
          case 14:
            { return token(yytext(), "ESTRUCTURA_SI", yyline, yycolumn);
            }
            // fall through
          case 40: break;
          case 15:
            { return token(yytext(), "OP_ASIG", yyline, yycolumn);
            }
            // fall through
          case 41: break;
          case 16:
            { return token(yytext(), "MOVIMIENTO", yyline, yycolumn);
            }
            // fall through
          case 42: break;
          case 17:
            { return token(yytext(), "TIPO_DATO", yyline, yycolumn);
            }
            // fall through
          case 43: break;
          case 18:
            { return token(yytext(), "FIN", yyline, yycolumn);
            }
            // fall through
          case 44: break;
          case 19:
            { return token(yytext(), "TOMAR", yyline, yycolumn);
            }
            // fall through
          case 45: break;
          case 20:
            { return token(yytext(), "PINTAR", yyline, yycolumn);
            }
            // fall through
          case 46: break;
          case 21:
            { return token(yytext(), "COLOR", yyline, yycolumn);
            }
            // fall through
          case 47: break;
          case 22:
            { return token(yytext(), "CICLO_M", yyline, yycolumn);
            }
            // fall through
          case 48: break;
          case 23:
            { return token(yytext(), "ROMPE_CICLO", yyline, yycolumn);
            }
            // fall through
          case 49: break;
          case 24:
            { return token(yytext(), "LANZAR", yyline, yycolumn);
            }
            // fall through
          case 50: break;
          case 25:
            { return token(yytext(), "DETENER_PINTAR", yyline, yycolumn);
            }
            // fall through
          case 51: break;
          case 26:
            { return token(yytext(), "VER", yyline, yycolumn);
            }
            // fall through
          case 52: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
