/* The following code was generated by JFlex 1.4.3 on 12/02/21, 6:55 p. m. */

package Analizador;
import java_cup.runtime.Symbol;

/*  José Luis Quintero Cañizalez - Edison Mauricio Riaño Alvarado */


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 12/02/21, 6:55 p. m. from the specification file
 * <tt>../Sintactico/src/Analizador/LexicoCup.flex</tt>
 */
class LexicoCup implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
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
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  3,  5,  0,  3,  3,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     3, 32,  6, 47,  0, 29, 30,  0, 35, 36, 28, 26,  3, 27, 45,  4, 
     2,  2,  2,  2,  2,  2,  2,  2,  2,  2, 46, 44, 34, 25, 33,  0, 
     0,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 39,  0, 40,  0,  1, 
     0, 15,  7, 13, 21, 10, 20, 19, 14, 11,  1, 48, 17, 41, 12, 18, 
    43,  1, 16, 23,  9, 22, 42, 24,  1,  8,  1, 37, 31, 38,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\12\2"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\3\2\1\27\1\30\1\31\1\32\1\4\1\33\5\2"+
    "\1\34\11\2\1\35\4\2\1\36\1\37\1\40\1\41"+
    "\1\42\1\43\1\44\1\45\1\46\1\47\1\50\1\51"+
    "\1\52\1\53\1\0\7\2\1\54\1\2\1\55\6\2"+
    "\1\56\6\2\1\0\3\2\1\57\1\2\1\60\1\61"+
    "\1\2\1\62\1\63\1\64\1\65\11\2\1\3\1\66"+
    "\1\67\1\2\1\70\1\2\1\71\1\72\4\2\1\73"+
    "\1\2\1\74\2\2\1\75\1\2\1\76\1\77\1\100"+
    "\1\101\1\102\1\103";

  private static int [] zzUnpackAction() {
    int [] result = new int[147];
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
    "\0\0\0\61\0\142\0\223\0\304\0\365\0\61\0\u0126"+
    "\0\u0157\0\u0188\0\u01b9\0\u01ea\0\u021b\0\u024c\0\u027d\0\u02ae"+
    "\0\u02df\0\u0310\0\u0341\0\u0372\0\u03a3\0\u03d4\0\u0405\0\u0436"+
    "\0\u0467\0\u0498\0\u04c9\0\u04fa\0\61\0\61\0\61\0\61"+
    "\0\61\0\u052b\0\u055c\0\u058d\0\61\0\61\0\61\0\61"+
    "\0\u05be\0\61\0\u05ef\0\u0620\0\u0651\0\u0682\0\u06b3\0\142"+
    "\0\u06e4\0\u0715\0\u0746\0\u0777\0\u07a8\0\u07d9\0\u080a\0\u083b"+
    "\0\u086c\0\u089d\0\u08ce\0\u08ff\0\u0930\0\u0961\0\61\0\61"+
    "\0\61\0\61\0\61\0\61\0\61\0\61\0\61\0\61"+
    "\0\61\0\61\0\61\0\61\0\u0992\0\u09c3\0\u09f4\0\u0a25"+
    "\0\u0a56\0\u0a87\0\u0ab8\0\u0ae9\0\142\0\u0b1a\0\142\0\u0b4b"+
    "\0\u0b7c\0\u0bad\0\u0bde\0\u0c0f\0\u0c40\0\142\0\u0c71\0\u0ca2"+
    "\0\u0cd3\0\u0d04\0\u0d35\0\u0d66\0\u0d97\0\u0dc8\0\u0df9\0\u0e2a"+
    "\0\142\0\u0e5b\0\142\0\142\0\u0e8c\0\142\0\142\0\142"+
    "\0\142\0\u0ebd\0\u0eee\0\u0f1f\0\u0f50\0\u0f81\0\u0fb2\0\u0fe3"+
    "\0\u1014\0\u1045\0\61\0\142\0\142\0\u1076\0\142\0\u10a7"+
    "\0\142\0\142\0\u10d8\0\u1109\0\u113a\0\u116b\0\142\0\u119c"+
    "\0\142\0\u11cd\0\u11fe\0\142\0\u122f\0\142\0\142\0\142"+
    "\0\142\0\142\0\142";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[147];
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
    "\1\2\1\3\1\4\1\5\1\6\1\5\1\7\1\10"+
    "\1\3\1\11\1\12\1\13\1\3\1\14\3\3\1\15"+
    "\2\3\1\16\1\17\1\3\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\1\46\1\47\1\50\1\3\62\0\2\3"+
    "\4\0\22\3\20\0\3\3\4\0\1\3\2\0\1\4"+
    "\61\0\1\5\1\0\1\5\57\0\1\51\24\0\1\52"+
    "\30\0\2\3\4\0\1\3\1\53\7\3\1\54\10\3"+
    "\20\0\3\3\4\0\1\3\1\0\2\3\4\0\11\3"+
    "\1\55\10\3\20\0\3\3\4\0\1\3\1\0\2\3"+
    "\4\0\12\3\1\56\7\3\20\0\3\3\4\0\1\3"+
    "\1\0\2\3\4\0\5\3\1\57\7\3\1\60\4\3"+
    "\20\0\3\3\4\0\1\3\1\0\2\3\4\0\4\3"+
    "\1\61\2\3\1\62\1\63\2\3\1\64\6\3\20\0"+
    "\3\3\4\0\1\3\1\0\2\3\4\0\13\3\1\65"+
    "\6\3\20\0\3\3\4\0\1\3\1\0\2\3\4\0"+
    "\10\3\1\66\1\3\1\67\1\70\6\3\20\0\3\3"+
    "\4\0\1\3\1\0\2\3\4\0\3\3\1\71\7\3"+
    "\1\72\6\3\20\0\3\3\4\0\1\3\1\0\2\3"+
    "\4\0\2\3\1\73\3\3\1\74\12\3\1\75\20\0"+
    "\3\3\4\0\1\3\1\0\2\3\4\0\7\3\1\76"+
    "\12\3\20\0\3\3\4\0\1\3\31\0\1\77\60\0"+
    "\1\100\1\101\57\0\1\102\1\0\1\103\56\0\1\104"+
    "\60\0\1\105\65\0\1\106\61\0\1\107\52\0\1\110"+
    "\60\0\1\111\7\0\1\112\50\0\1\113\10\0\1\114"+
    "\51\0\1\115\26\0\2\3\4\0\10\3\1\116\11\3"+
    "\20\0\3\3\4\0\1\3\1\0\2\3\4\0\13\3"+
    "\1\117\6\3\20\0\3\3\4\0\1\3\1\0\2\3"+
    "\4\0\11\3\1\120\10\3\20\0\3\3\4\0\1\3"+
    "\5\51\1\0\53\51\1\0\2\3\4\0\2\3\1\121"+
    "\17\3\20\0\3\3\4\0\1\3\1\0\2\3\4\0"+
    "\3\3\1\122\16\3\20\0\3\3\4\0\1\3\1\0"+
    "\2\3\4\0\17\3\1\123\2\3\20\0\3\3\4\0"+
    "\1\3\1\0\2\3\4\0\20\3\1\124\1\3\20\0"+
    "\3\3\4\0\1\3\1\0\2\3\4\0\2\3\1\125"+
    "\3\3\1\126\13\3\20\0\3\3\4\0\1\3\1\0"+
    "\2\3\4\0\5\3\1\127\14\3\20\0\3\3\4\0"+
    "\1\3\1\0\2\3\4\0\10\3\1\130\11\3\20\0"+
    "\3\3\4\0\1\3\1\0\2\3\4\0\20\3\1\131"+
    "\1\3\20\0\3\3\4\0\1\3\1\0\2\3\4\0"+
    "\17\3\1\132\2\3\20\0\3\3\4\0\1\3\1\0"+
    "\2\3\4\0\5\3\1\133\14\3\20\0\3\3\4\0"+
    "\1\3\1\0\2\3\4\0\12\3\1\134\7\3\20\0"+
    "\3\3\4\0\1\3\1\0\2\3\4\0\13\3\1\135"+
    "\6\3\20\0\3\3\4\0\1\3\1\0\2\3\4\0"+
    "\11\3\1\136\10\3\20\0\3\3\4\0\1\3\1\0"+
    "\2\3\4\0\15\3\1\137\4\3\20\0\3\3\4\0"+
    "\1\3\1\0\2\3\4\0\17\3\1\140\2\3\20\0"+
    "\3\3\4\0\1\3\1\0\2\3\4\0\11\3\1\141"+
    "\10\3\20\0\3\3\4\0\1\3\1\0\2\3\4\0"+
    "\10\3\1\142\11\3\20\0\3\3\4\0\1\3\1\0"+
    "\2\3\4\0\4\3\1\143\15\3\20\0\3\3\4\0"+
    "\1\3\1\0\2\3\4\0\4\3\1\144\15\3\20\0"+
    "\3\3\4\0\1\3\2\0\1\145\57\0\2\3\4\0"+
    "\4\3\1\146\15\3\20\0\3\3\4\0\1\3\1\0"+
    "\2\3\4\0\4\3\1\147\15\3\20\0\3\3\4\0"+
    "\1\3\1\0\2\3\4\0\4\3\1\150\15\3\20\0"+
    "\3\3\4\0\1\3\1\0\2\3\4\0\3\3\1\151"+
    "\16\3\20\0\3\3\4\0\1\3\1\0\2\3\4\0"+
    "\10\3\1\152\11\3\20\0\3\3\4\0\1\3\1\0"+
    "\2\3\4\0\3\3\1\153\16\3\20\0\3\3\4\0"+
    "\1\3\1\0\2\3\4\0\3\3\1\154\16\3\20\0"+
    "\3\3\4\0\1\3\1\0\2\3\4\0\12\3\1\155"+
    "\7\3\20\0\3\3\4\0\1\3\1\0\2\3\4\0"+
    "\11\3\1\156\10\3\20\0\3\3\4\0\1\3\1\0"+
    "\2\3\4\0\3\3\1\157\16\3\20\0\3\3\4\0"+
    "\1\3\1\0\2\3\4\0\2\3\1\160\17\3\20\0"+
    "\3\3\4\0\1\3\1\0\2\3\4\0\14\3\1\161"+
    "\5\3\20\0\3\3\4\0\1\3\1\0\2\3\4\0"+
    "\20\3\1\162\1\3\20\0\3\3\4\0\1\3\1\0"+
    "\2\3\4\0\10\3\1\163\11\3\20\0\3\3\4\0"+
    "\1\3\1\0\2\3\4\0\4\3\1\164\3\3\1\165"+
    "\11\3\20\0\3\3\4\0\1\3\1\0\2\3\4\0"+
    "\1\166\21\3\20\0\3\3\4\0\1\3\1\0\2\3"+
    "\4\0\4\3\1\167\15\3\20\0\3\3\4\0\1\3"+
    "\1\0\2\3\4\0\5\3\1\170\14\3\20\0\3\3"+
    "\4\0\1\3\1\0\2\3\4\0\2\3\1\171\17\3"+
    "\20\0\3\3\4\0\1\3\1\0\2\3\4\0\12\3"+
    "\1\172\7\3\20\0\3\3\4\0\1\3\2\0\1\145"+
    "\41\0\1\173\15\0\2\3\4\0\5\3\1\174\14\3"+
    "\20\0\3\3\4\0\1\3\1\0\2\3\4\0\16\3"+
    "\1\175\3\3\20\0\3\3\4\0\1\3\1\0\2\3"+
    "\4\0\5\3\1\176\14\3\20\0\3\3\4\0\1\3"+
    "\1\0\2\3\4\0\22\3\20\0\3\3\4\0\1\177"+
    "\1\0\2\3\4\0\17\3\1\200\2\3\20\0\3\3"+
    "\4\0\1\3\1\0\2\3\4\0\3\3\1\201\16\3"+
    "\20\0\3\3\4\0\1\3\1\0\2\3\4\0\2\3"+
    "\1\202\17\3\20\0\3\3\4\0\1\3\1\0\2\3"+
    "\4\0\5\3\1\203\14\3\20\0\3\3\4\0\1\3"+
    "\1\0\2\3\4\0\17\3\1\204\2\3\20\0\3\3"+
    "\4\0\1\3\1\0\2\3\4\0\12\3\1\205\7\3"+
    "\20\0\3\3\4\0\1\3\1\0\2\3\4\0\5\3"+
    "\1\206\14\3\20\0\3\3\4\0\1\3\1\0\2\3"+
    "\4\0\15\3\1\207\4\3\20\0\3\3\4\0\1\3"+
    "\1\0\2\3\4\0\6\3\1\210\13\3\20\0\3\3"+
    "\4\0\1\3\1\0\2\3\4\0\3\3\1\211\16\3"+
    "\20\0\3\3\4\0\1\3\1\0\2\3\4\0\2\3"+
    "\1\212\17\3\20\0\3\3\4\0\1\3\1\0\2\3"+
    "\4\0\16\3\1\213\3\3\20\0\3\3\4\0\1\3"+
    "\1\0\2\3\4\0\3\3\1\214\16\3\20\0\3\3"+
    "\4\0\1\3\1\0\2\3\4\0\12\3\1\215\7\3"+
    "\20\0\3\3\4\0\1\3\1\0\2\3\4\0\3\3"+
    "\1\216\16\3\20\0\3\3\4\0\1\3\1\0\2\3"+
    "\4\0\14\3\1\217\5\3\20\0\3\3\4\0\1\3"+
    "\1\0\2\3\4\0\7\3\1\220\12\3\20\0\3\3"+
    "\4\0\1\3\1\0\2\3\4\0\15\3\1\221\4\3"+
    "\20\0\3\3\4\0\1\3\1\0\2\3\4\0\3\3"+
    "\1\222\16\3\20\0\3\3\4\0\1\3\1\0\2\3"+
    "\4\0\2\3\1\223\17\3\20\0\3\3\4\0\1\3";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4704];
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


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\4\1\1\11\25\1\5\11\3\1\4\11"+
    "\1\1\1\11\24\1\16\11\1\0\27\1\1\0\25\1"+
    "\1\11\30\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[147];
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

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexicoCup(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  LexicoCup(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
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


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
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
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 43: 
          { return new Symbol(sym.Op_desIzq, yychar, yyline, yytext());
          }
        case 68: break;
        case 31: 
          { return new Symbol(sym.Op_asigSuma, yychar, yyline, yytext());
          }
        case 69: break;
        case 18: 
          { return new Symbol(sym.Parent_c, yychar, yyline, yytext());
          }
        case 70: break;
        case 62: 
          { return new Symbol(sym.T_double, yychar, yyline, yytext());
          }
        case 71: break;
        case 19: 
          { return new Symbol(sym.Llave_a, yychar, yyline, yytext());
          }
        case 72: break;
        case 63: 
          { return new Symbol(sym.Cadena, yychar, yyline, yytext());
          }
        case 73: break;
        case 55: 
          { return new Symbol(sym.Void, yychar, yyline, yytext());
          }
        case 74: break;
        case 53: 
          { return new Symbol(sym.T_long, yychar, yyline, yytext());
          }
        case 75: break;
        case 64: 
          { return new Symbol(sym.Switch, yychar, yyline, yytext());
          }
        case 76: break;
        case 56: 
          { return new Symbol(sym.Break, yychar, yyline, yytext());
          }
        case 77: break;
        case 57: 
          { return new Symbol(sym.Op_boolFalse, yychar, yyline, yytext());
          }
        case 78: break;
        case 49: 
          { return new Symbol(sym.Else, yychar, yyline, yytext());
          }
        case 79: break;
        case 45: 
          { return new Symbol(sym.Cin, yychar, yyline, yytext());
          }
        case 80: break;
        case 44: 
          { return new Symbol(sym.T_int, yychar, yyline, yytext());
          }
        case 81: break;
        case 30: 
          { return new Symbol(sym.Op_igual, yychar, yyline, yytext());
          }
        case 82: break;
        case 21: 
          { return new Symbol(sym.Corchete_a, yychar, yyline, yytext());
          }
        case 83: break;
        case 59: 
          { return new Symbol(sym.Scanf, yychar, yyline, yytext());
          }
        case 84: break;
        case 5: 
          { return new Symbol(sym.Division, yychar, yyline, yytext());
          }
        case 85: break;
        case 47: 
          { return new Symbol(sym.T_byte, yychar, yyline, yytext());
          }
        case 86: break;
        case 29: 
          { return new Symbol(sym.Do, yychar, yyline, yytext());
          }
        case 87: break;
        case 25: 
          { return new Symbol(sym.DPuntos, yychar, yyline, yytext());
          }
        case 88: break;
        case 46: 
          { return new Symbol(sym.For, yychar, yyline, yytext());
          }
        case 89: break;
        case 6: 
          { return new Symbol(sym.Comillas, yychar, yyline, yytext());
          }
        case 90: break;
        case 35: 
          { return new Symbol(sym.Op_asigMult, yychar, yyline, yytext());
          }
        case 91: break;
        case 9: 
          { return new Symbol(sym.Resta, yychar, yyline, yytext());
          }
        case 92: break;
        case 40: 
          { return new Symbol(sym.Op_mayorE, yychar, yyline, yytext());
          }
        case 93: break;
        case 39: 
          { return new Symbol(sym.Op_diferente, yychar, yyline, yytext());
          }
        case 94: break;
        case 67: 
          { return new Symbol(sym.Default, yychar, yyline, yytext());
          }
        case 95: break;
        case 20: 
          { return new Symbol(sym.Llave_c, yychar, yyline, yytext());
          }
        case 96: break;
        case 38: 
          { return new Symbol(sym.Op_or, yychar, yyline, yytext());
          }
        case 97: break;
        case 65: 
          { return new Symbol(sym.Printf, yychar, yyline, yytext());
          }
        case 98: break;
        case 42: 
          { return new Symbol(sym.Op_menorE, yychar, yyline, yytext());
          }
        case 99: break;
        case 33: 
          { return new Symbol(sym.Op_asigResta, yychar, yyline, yytext());
          }
        case 100: break;
        case 22: 
          { return new Symbol(sym.Corchete_c, yychar, yyline, yytext());
          }
        case 101: break;
        case 28: 
          { return new Symbol(sym.If, yychar, yyline, yytext());
          }
        case 102: break;
        case 32: 
          { return new Symbol(sym.Op_incremento, yychar, yyline, yytext());
          }
        case 103: break;
        case 61: 
          { return new Symbol(sym.Define, yychar, yyline, yytext());
          }
        case 104: break;
        case 27: 
          { return new Symbol(sym.Op_asigDiv, yychar, yyline, yytext());
          }
        case 105: break;
        case 50: 
          { return new Symbol(sym.T_char, yychar, yyline, yytext());
          }
        case 106: break;
        case 51: 
          { return new Symbol(sym.Case, yychar, yyline, yytext());
          }
        case 107: break;
        case 54: 
          { return new Symbol(sym.Main, yychar, yyline, yytext());
          }
        case 108: break;
        case 12: 
          { return new Symbol(sym.Op_andB, yychar, yyline, yytext());
          }
        case 109: break;
        case 17: 
          { return new Symbol(sym.Parent_a, yychar, yyline, yytext());
          }
        case 110: break;
        case 14: 
          { return new Symbol(sym.Op_not, yychar, yyline, yytext());
          }
        case 111: break;
        case 23: 
          { return new Symbol(sym.P_coma, yychar, yyline, yytext());
          }
        case 112: break;
        case 52: 
          { return new Symbol(sym.Cout, yychar, yyline, yytext());
          }
        case 113: break;
        case 15: 
          { return new Symbol(sym.Op_mayor, yychar, yyline, yytext());
          }
        case 114: break;
        case 13: 
          { return new Symbol(sym.Op_orB, yychar, yyline, yytext());
          }
        case 115: break;
        case 10: 
          { return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());
          }
        case 116: break;
        case 11: 
          { return new Symbol(sym.Resto, yychar, yyline, yytext());
          }
        case 117: break;
        case 66: 
          { return new Symbol(sym.Include, yychar, yyline, yytext());
          }
        case 118: break;
        case 34: 
          { return new Symbol(sym.Op_decremento, yychar, yyline, yytext());
          }
        case 119: break;
        case 8: 
          { return new Symbol(sym.Suma, yychar, yyline, yytext());
          }
        case 120: break;
        case 16: 
          { return new Symbol(sym.Op_menor, yychar, yyline, yytext());
          }
        case 121: break;
        case 58: 
          { return new Symbol(sym.T_float, yychar, yyline, yytext());
          }
        case 122: break;
        case 48: 
          { return new Symbol(sym.Op_boolTrue, yychar, yyline, yytext());
          }
        case 123: break;
        case 1: 
          { return new Symbol(sym.ERROR, yychar, yyline, yytext());
          }
        case 124: break;
        case 37: 
          { return new Symbol(sym.Op_and, yychar, yyline, yytext());
          }
        case 125: break;
        case 26: 
          { return new Symbol(sym.Numeral, yychar, yyline, yytext());
          }
        case 126: break;
        case 60: 
          { return new Symbol(sym.While, yychar, yyline, yytext());
          }
        case 127: break;
        case 24: 
          { return new Symbol(sym.Punto, yychar, yyline, yytext());
          }
        case 128: break;
        case 41: 
          { return new Symbol(sym.Op_desDer, yychar, yyline, yytext());
          }
        case 129: break;
        case 4: 
          { /*Ignore*/
          }
        case 130: break;
        case 7: 
          { return new Symbol(sym.Igual, yychar, yyline, yytext());
          }
        case 131: break;
        case 2: 
          { return new Symbol(sym.Identificador, yychar, yyline, yytext());
          }
        case 132: break;
        case 3: 
          { return new Symbol(sym.Numero, yychar, yyline, yytext());
          }
        case 133: break;
        case 36: 
          { return new Symbol(sym.Op_asigResto, yychar, yyline, yytext());
          }
        case 134: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
