/* The following code was generated by JFlex 1.4.3 on 17/02/21, 12:39 p. m. */

package Analizador;
import static Analizador.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 17/02/21, 12:39 p. m. from the specification file
 * <tt>src/Analizador/Lexico.flex</tt>
 */
class Lexico {

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
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\13\2\0\1\3\22\0\1\3\1\41\1\14\1\52"+
    "\1\0\1\36\1\37\1\15\1\44\1\45\1\35\1\33\1\3\1\34"+
    "\1\57\1\12\12\2\1\60\1\56\1\43\1\32\1\42\2\0\32\1"+
    "\1\50\1\0\1\51\1\0\1\1\1\0\1\10\1\16\1\7\1\26"+
    "\1\17\1\25\1\24\1\11\1\20\2\1\1\22\1\53\1\21\1\23"+
    "\1\54\1\1\1\5\1\30\1\4\1\27\1\55\1\31\1\1\1\6"+
    "\1\1\1\46\1\40\1\47\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\2\2\1\5\1\6"+
    "\1\7\1\10\12\2\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\1\3\2\1\31\1\32\1\33"+
    "\5\2\1\34\4\2\1\35\5\2\1\36\4\2\1\37"+
    "\1\40\1\41\1\42\1\43\1\44\1\45\1\46\1\47"+
    "\1\50\1\51\1\52\1\53\1\54\2\0\7\2\1\55"+
    "\3\2\1\56\11\2\1\57\2\2\2\0\4\2\1\60"+
    "\1\61\1\62\1\63\1\64\1\65\2\2\1\66\10\2"+
    "\1\3\1\0\1\67\1\2\1\70\3\2\1\71\1\72"+
    "\2\2\1\73\2\2\1\74\1\0\5\2\1\75\1\76"+
    "\1\77\1\0\1\100\3\2\1\101\1\0\1\2\1\102"+
    "\1\2\1\103\1\0\1\104\1\4";

  private static int [] zzUnpackAction() {
    int [] result = new int[167];
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
    "\0\0\0\61\0\142\0\223\0\304\0\365\0\u0126\0\u0157"+
    "\0\61\0\61\0\61\0\u0188\0\u01b9\0\u01ea\0\u021b\0\u024c"+
    "\0\u027d\0\u02ae\0\u02df\0\u0310\0\u0341\0\u0372\0\u03a3\0\u03d4"+
    "\0\u0405\0\u0436\0\u0467\0\u0498\0\u04c9\0\u04fa\0\u052b\0\u055c"+
    "\0\61\0\61\0\61\0\61\0\61\0\u058d\0\u05be\0\u05ef"+
    "\0\u0620\0\61\0\61\0\61\0\u0651\0\u0682\0\u06b3\0\u06e4"+
    "\0\u0715\0\61\0\u0746\0\u0777\0\u07a8\0\u07d9\0\142\0\u080a"+
    "\0\u083b\0\u086c\0\u089d\0\u08ce\0\u08ff\0\u0930\0\u0961\0\u0992"+
    "\0\u09c3\0\61\0\61\0\61\0\61\0\61\0\61\0\61"+
    "\0\61\0\61\0\61\0\61\0\61\0\61\0\61\0\u09f4"+
    "\0\u0a25\0\u0a56\0\u0a87\0\u0ab8\0\u0ae9\0\u0b1a\0\u0b4b\0\u0b7c"+
    "\0\142\0\u0bad\0\u0bde\0\u0c0f\0\142\0\u0c40\0\u0c71\0\u0ca2"+
    "\0\u0cd3\0\u0d04\0\u0d35\0\u0d66\0\u0d97\0\u0dc8\0\142\0\u0df9"+
    "\0\u0e2a\0\u0e5b\0\u0e8c\0\u0ebd\0\u0eee\0\u0f1f\0\u0f50\0\142"+
    "\0\142\0\142\0\142\0\142\0\142\0\u0f81\0\u0fb2\0\142"+
    "\0\u0fe3\0\u1014\0\u1045\0\u1076\0\u10a7\0\u10d8\0\u1109\0\u113a"+
    "\0\61\0\u116b\0\142\0\u119c\0\142\0\u11cd\0\u11fe\0\u122f"+
    "\0\142\0\142\0\u1260\0\u1291\0\142\0\u12c2\0\u12f3\0\142"+
    "\0\u1324\0\u1355\0\u1386\0\u13b7\0\u13e8\0\u1419\0\142\0\142"+
    "\0\142\0\u144a\0\142\0\u147b\0\u14ac\0\u14dd\0\142\0\u150e"+
    "\0\u153f\0\142\0\u1570\0\61\0\u15a1\0\142\0\u15d2";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[167];
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
    "\1\2\1\3\1\4\1\5\1\6\2\3\1\7\2\3"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\2\3\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
    "\1\47\1\50\1\51\1\52\1\53\1\54\62\0\2\3"+
    "\1\0\6\3\4\0\14\3\21\0\3\3\5\0\1\4"+
    "\61\0\1\5\56\0\2\3\1\0\1\3\1\55\4\3"+
    "\4\0\14\3\21\0\3\3\4\0\2\3\1\0\4\3"+
    "\1\56\1\57\4\0\2\3\1\60\2\3\1\61\6\3"+
    "\21\0\3\3\35\0\1\62\27\0\2\3\1\0\2\3"+
    "\1\63\3\3\4\0\14\3\21\0\3\3\4\0\2\3"+
    "\1\0\6\3\4\0\4\3\1\64\7\3\21\0\3\3"+
    "\4\0\2\3\1\0\6\3\4\0\3\3\1\65\1\3"+
    "\1\66\1\3\1\67\4\3\21\0\3\3\4\0\2\3"+
    "\1\0\4\3\1\70\1\3\4\0\14\3\21\0\3\3"+
    "\4\0\2\3\1\0\6\3\4\0\5\3\1\71\6\3"+
    "\21\0\3\3\4\0\2\3\1\0\4\3\1\72\1\3"+
    "\4\0\4\3\1\73\7\3\21\0\3\3\4\0\2\3"+
    "\1\0\6\3\4\0\1\3\1\74\3\3\1\75\6\3"+
    "\21\0\3\3\4\0\2\3\1\0\6\3\4\0\12\3"+
    "\1\76\1\3\21\0\3\3\4\0\2\3\1\0\1\77"+
    "\5\3\4\0\13\3\1\100\21\0\3\3\4\0\2\3"+
    "\1\0\5\3\1\101\4\0\14\3\21\0\3\3\35\0"+
    "\1\102\60\0\1\103\1\104\57\0\1\105\1\0\1\106"+
    "\56\0\1\107\60\0\1\110\65\0\1\111\61\0\1\112"+
    "\52\0\1\113\60\0\1\114\7\0\1\115\50\0\1\116"+
    "\10\0\1\117\51\0\1\120\44\0\1\121\41\0\2\3"+
    "\1\0\4\3\1\122\1\3\4\0\14\3\21\0\3\3"+
    "\4\0\2\3\1\0\1\3\1\123\4\3\4\0\14\3"+
    "\21\0\3\3\4\0\2\3\1\0\6\3\4\0\5\3"+
    "\1\124\6\3\21\0\3\3\4\0\2\3\1\0\2\3"+
    "\1\125\3\3\4\0\11\3\1\126\2\3\21\0\3\3"+
    "\4\0\2\3\1\0\6\3\4\0\12\3\1\127\1\3"+
    "\21\0\3\3\4\0\2\3\1\0\4\3\1\130\1\3"+
    "\4\0\14\3\21\0\3\3\4\0\2\3\1\0\6\3"+
    "\4\0\3\3\1\131\10\3\21\0\3\3\4\0\2\3"+
    "\1\0\6\3\4\0\11\3\1\132\2\3\21\0\3\3"+
    "\4\0\2\3\1\0\1\133\5\3\4\0\14\3\21\0"+
    "\3\3\4\0\2\3\1\0\6\3\4\0\12\3\1\134"+
    "\1\3\21\0\3\3\4\0\2\3\1\0\1\135\5\3"+
    "\4\0\14\3\21\0\3\3\4\0\2\3\1\0\6\3"+
    "\4\0\12\3\1\136\1\3\21\0\3\3\4\0\2\3"+
    "\1\0\6\3\4\0\14\3\21\0\1\137\2\3\4\0"+
    "\2\3\1\0\6\3\4\0\3\3\1\140\10\3\21\0"+
    "\3\3\4\0\2\3\1\0\6\3\4\0\4\3\1\141"+
    "\7\3\21\0\3\3\4\0\2\3\1\0\6\3\4\0"+
    "\5\3\1\142\6\3\21\0\3\3\4\0\2\3\1\0"+
    "\6\3\4\0\7\3\1\143\4\3\21\0\3\3\4\0"+
    "\2\3\1\0\6\3\4\0\11\3\1\144\2\3\21\0"+
    "\3\3\4\0\2\3\1\0\6\3\4\0\2\3\1\145"+
    "\11\3\21\0\3\3\4\0\2\3\1\0\1\3\1\146"+
    "\4\3\4\0\10\3\1\147\3\3\21\0\3\3\4\0"+
    "\2\3\1\0\6\3\4\0\2\3\1\150\11\3\21\0"+
    "\3\3\4\0\2\3\1\0\6\3\4\0\2\3\1\151"+
    "\11\3\21\0\3\3\5\0\1\152\77\0\1\153\40\0"+
    "\2\3\1\0\6\3\4\0\2\3\1\154\11\3\21\0"+
    "\3\3\4\0\2\3\1\0\6\3\4\0\2\3\1\155"+
    "\11\3\21\0\3\3\4\0\2\3\1\0\6\3\4\0"+
    "\2\3\1\156\11\3\21\0\3\3\4\0\2\3\1\0"+
    "\3\3\1\157\2\3\4\0\14\3\21\0\3\3\4\0"+
    "\2\3\1\0\6\3\4\0\1\3\1\160\12\3\21\0"+
    "\3\3\4\0\2\3\1\0\6\3\4\0\1\3\1\161"+
    "\12\3\21\0\3\3\4\0\2\3\1\0\1\3\1\162"+
    "\4\3\4\0\14\3\21\0\3\3\4\0\2\3\1\0"+
    "\1\163\5\3\4\0\14\3\21\0\3\3\4\0\2\3"+
    "\1\0\6\3\4\0\1\3\1\164\12\3\21\0\3\3"+
    "\4\0\2\3\1\0\6\3\4\0\1\3\1\165\12\3"+
    "\21\0\3\3\4\0\2\3\1\0\1\166\5\3\4\0"+
    "\14\3\21\0\3\3\4\0\2\3\1\0\6\3\4\0"+
    "\1\3\1\167\12\3\21\0\3\3\4\0\2\3\1\0"+
    "\6\3\4\0\6\3\1\170\5\3\21\0\3\3\4\0"+
    "\2\3\1\0\6\3\4\0\12\3\1\171\1\3\21\0"+
    "\3\3\4\0\2\3\1\0\4\3\1\172\1\3\4\0"+
    "\14\3\21\0\3\3\4\0\2\3\1\0\4\3\1\173"+
    "\1\3\4\0\14\3\21\0\3\3\4\0\2\3\1\0"+
    "\6\3\4\0\1\174\13\3\21\0\3\3\4\0\2\3"+
    "\1\0\6\3\4\0\3\3\1\175\10\3\21\0\3\3"+
    "\4\0\2\3\1\0\6\3\4\0\2\3\1\176\11\3"+
    "\21\0\3\3\4\0\2\3\1\0\1\177\5\3\4\0"+
    "\14\3\21\0\3\3\4\0\2\3\1\0\6\3\4\0"+
    "\4\3\1\200\7\3\21\0\3\3\5\0\1\152\42\0"+
    "\1\201\22\0\1\202\52\0\2\3\1\0\6\3\4\0"+
    "\3\3\1\203\10\3\21\0\3\3\4\0\2\3\1\0"+
    "\6\3\4\0\3\3\1\204\10\3\21\0\3\3\4\0"+
    "\2\3\1\0\6\3\4\0\10\3\1\205\3\3\21\0"+
    "\3\3\4\0\2\3\1\0\4\3\1\206\1\3\4\0"+
    "\14\3\21\0\3\3\4\0\2\3\1\0\1\3\1\207"+
    "\4\3\4\0\14\3\21\0\3\3\4\0\2\3\1\0"+
    "\6\3\4\0\12\3\1\210\1\3\21\0\3\3\4\0"+
    "\2\3\1\0\6\3\4\0\1\3\1\211\12\3\21\0"+
    "\3\3\4\0\2\3\1\0\1\212\5\3\4\0\14\3"+
    "\21\0\3\3\4\0\2\3\1\0\6\3\4\0\11\3"+
    "\1\213\2\3\21\0\3\3\4\0\2\3\1\0\6\3"+
    "\4\0\4\3\1\214\7\3\21\0\3\3\4\0\2\3"+
    "\1\0\6\3\4\0\6\3\1\215\5\3\21\0\3\3"+
    "\4\0\2\3\1\0\6\3\4\0\3\3\1\216\10\3"+
    "\21\0\3\3\4\0\2\3\1\0\3\3\1\217\2\3"+
    "\4\0\14\3\21\0\3\3\4\0\2\3\1\0\6\3"+
    "\4\0\1\3\1\220\12\3\21\0\3\3\25\0\1\221"+
    "\37\0\2\3\1\0\1\222\5\3\4\0\14\3\21\0"+
    "\3\3\4\0\2\3\1\0\1\223\5\3\4\0\14\3"+
    "\21\0\3\3\4\0\2\3\1\0\6\3\4\0\1\3"+
    "\1\224\12\3\21\0\3\3\4\0\2\3\1\0\6\3"+
    "\4\0\14\3\21\0\1\3\1\225\1\3\4\0\2\3"+
    "\1\0\6\3\4\0\4\3\1\226\7\3\21\0\3\3"+
    "\4\0\2\3\1\0\6\3\4\0\1\3\1\227\12\3"+
    "\21\0\3\3\4\0\2\3\1\0\6\3\4\0\6\3"+
    "\1\230\5\3\21\0\3\3\4\0\2\3\1\0\5\3"+
    "\1\231\4\0\14\3\21\0\3\3\32\0\1\232\32\0"+
    "\2\3\1\0\6\3\4\0\7\3\1\233\4\3\21\0"+
    "\3\3\4\0\2\3\1\0\3\3\1\234\2\3\4\0"+
    "\14\3\21\0\3\3\4\0\2\3\1\0\4\3\1\235"+
    "\1\3\4\0\14\3\21\0\3\3\4\0\2\3\1\0"+
    "\4\3\1\236\1\3\4\0\14\3\21\0\3\3\4\0"+
    "\2\3\1\0\1\237\5\3\4\0\14\3\21\0\3\3"+
    "\31\0\1\240\33\0\2\3\1\0\5\3\1\241\4\0"+
    "\14\3\21\0\3\3\4\0\2\3\1\0\6\3\4\0"+
    "\14\3\21\0\1\242\2\3\4\0\2\3\1\0\3\3"+
    "\1\243\2\3\4\0\14\3\21\0\3\3\22\0\1\244"+
    "\42\0\2\3\1\0\6\3\1\245\3\0\14\3\21\0"+
    "\3\3\4\0\2\3\1\0\6\3\4\0\1\3\1\246"+
    "\12\3\21\0\3\3\15\0\1\247\46\0\13\247\1\0"+
    "\45\247";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5635];
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
    "\1\0\1\11\6\1\3\11\25\1\5\11\4\1\3\11"+
    "\5\1\1\11\17\1\16\11\2\0\30\1\2\0\25\1"+
    "\1\11\1\0\16\1\1\0\10\1\1\0\5\1\1\0"+
    "\3\1\1\11\1\0\2\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[167];
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
    public String lexemas;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexico(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexico(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 130) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
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
        case 57: 
          { lexemas = yytext(); return Op_boolFalse;
          }
        case 69: break;
        case 44: 
          { lexemas = yytext(); return Op_desIzq;
          }
        case 70: break;
        case 22: 
          { lexemas=yytext(); return Llave_c;
          }
        case 71: break;
        case 37: 
          { lexemas = yytext(); return Op_asigModulo;
          }
        case 72: break;
        case 42: 
          { lexemas = yytext(); return Op_desDer;
          }
        case 73: break;
        case 7: 
          { lexemas=yytext(); return Comillas;
          }
        case 74: break;
        case 59: 
          { lexemas=yytext(); return Using;
          }
        case 75: break;
        case 10: 
          { lexemas=yytext(); return Suma;
          }
        case 76: break;
        case 30: 
          { lexemas=yytext(); return Do;
          }
        case 77: break;
        case 63: 
          { lexemas=yytext(); return Switch;
          }
        case 78: break;
        case 34: 
          { lexemas = yytext(); return Op_asigResta;
          }
        case 79: break;
        case 31: 
          { lexemas = yytext(); return Op_igual;
          }
        case 80: break;
        case 28: 
          { lexemas = yytext(); return Op_asigDiv;
          }
        case 81: break;
        case 20: 
          { lexemas=yytext(); return Parentesis_c;
          }
        case 82: break;
        case 6: 
          { return Linea;
          }
        case 83: break;
        case 41: 
          { lexemas = yytext(); return Op_mayorE;
          }
        case 84: break;
        case 65: 
          { lexemas=yytext(); return Default;
          }
        case 85: break;
        case 53: 
          { lexemas=yytext(); return Else;
          }
        case 86: break;
        case 24: 
          { lexemas = yytext(); return Corchete_c;
          }
        case 87: break;
        case 58: 
          { lexemas=yytext(); return T_float;
          }
        case 88: break;
        case 36: 
          { lexemas = yytext(); return Op_asigMult;
          }
        case 89: break;
        case 49: 
          { lexemas=yytext(); return Case;
          }
        case 90: break;
        case 43: 
          { lexemas = yytext(); return Op_menorE;
          }
        case 91: break;
        case 56: 
          { lexemas=yytext(); return Void;
          }
        case 92: break;
        case 18: 
          { lexemas = yytext(); return Op_menor;
          }
        case 93: break;
        case 47: 
          { lexemas=yytext(); return Std;
          }
        case 94: break;
        case 40: 
          { lexemas = yytext(); return Op_diferente;
          }
        case 95: break;
        case 50: 
          { lexemas=yytext(); return T_char;
          }
        case 96: break;
        case 13: 
          { lexemas=yytext(); return Modulo;
          }
        case 97: break;
        case 38: 
          { lexemas=yytext(); return Op_and;
          }
        case 98: break;
        case 25: 
          { lexemas=yytext(); return P_coma;
          }
        case 99: break;
        case 16: 
          { lexemas=yytext(); return Op_not;
          }
        case 100: break;
        case 29: 
          { lexemas=yytext(); return If;
          }
        case 101: break;
        case 68: 
          { lexemas=yytext(); return Namespace;
          }
        case 102: break;
        case 8: 
          { lexemas=yytext(); return Comillas_s;
          }
        case 103: break;
        case 48: 
          { lexemas = yytext(); return Op_boolTrue;
          }
        case 104: break;
        case 21: 
          { lexemas=yytext(); return Llave_a;
          }
        case 105: break;
        case 2: 
          { lexemas=yytext(); return Identificador;
          }
        case 106: break;
        case 26: 
          { lexemas=yytext(); return Punto;
          }
        case 107: break;
        case 35: 
          { lexemas = yytext(); return Op_decremento;
          }
        case 108: break;
        case 32: 
          { lexemas = yytext(); return Op_asigSuma;
          }
        case 109: break;
        case 11: 
          { lexemas=yytext(); return Resta;
          }
        case 110: break;
        case 66: 
          { lexemas=yytext(); return Iostream;
          }
        case 111: break;
        case 33: 
          { lexemas = yytext(); return Op_incremento;
          }
        case 112: break;
        case 12: 
          { lexemas=yytext(); return Multiplicacion;
          }
        case 113: break;
        case 55: 
          { lexemas=yytext(); return Main;
          }
        case 114: break;
        case 52: 
          { lexemas=yytext(); return T_byte;
          }
        case 115: break;
        case 46: 
          { lexemas=yytext(); return T_int;
          }
        case 116: break;
        case 45: 
          { lexemas=yytext(); return Cin;
          }
        case 117: break;
        case 64: 
          { lexemas=yytext(); return Printf;
          }
        case 118: break;
        case 1: 
          { return ERROR;
          }
        case 119: break;
        case 61: 
          { lexemas=yytext(); return T_double;
          }
        case 120: break;
        case 19: 
          { lexemas=yytext(); return Parentesis_a;
          }
        case 121: break;
        case 3: 
          { lexemas=yytext(); return Numero;
          }
        case 122: break;
        case 14: 
          { lexemas=yytext(); return Op_andB;
          }
        case 123: break;
        case 15: 
          { lexemas=yytext(); return Op_orB;
          }
        case 124: break;
        case 51: 
          { lexemas=yytext(); return Cout;
          }
        case 125: break;
        case 23: 
          { lexemas = yytext(); return Corchete_a;
          }
        case 126: break;
        case 5: 
          { lexemas=yytext(); return Division;
          }
        case 127: break;
        case 4: 
          { /*Ignore*/
          }
        case 128: break;
        case 67: 
          { lexemas=yytext(); return Include;
          }
        case 129: break;
        case 27: 
          { lexemas=yytext(); return DPuntos;
          }
        case 130: break;
        case 17: 
          { lexemas = yytext(); return Op_mayor;
          }
        case 131: break;
        case 54: 
          { lexemas=yytext(); return T_long;
          }
        case 132: break;
        case 9: 
          { lexemas=yytext(); return Igual;
          }
        case 133: break;
        case 39: 
          { lexemas=yytext(); return Op_or;
          }
        case 134: break;
        case 62: 
          { lexemas=yytext(); return Cadena;
          }
        case 135: break;
        case 60: 
          { lexemas=yytext(); return While;
          }
        case 136: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
