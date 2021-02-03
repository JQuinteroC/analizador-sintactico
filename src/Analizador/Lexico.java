/* The following code was generated by JFlex 1.4.3 on 3/02/21, 6:19 a. m. */

package Analizador;
import static Analizador.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 3/02/21, 6:19 a. m. from the specification file
 * <tt>../Sintactico/src/Analizador/Lexico.flex</tt>
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
    "\11\0\1\3\1\5\1\0\2\3\22\0\1\3\1\37\1\6\2\0"+
    "\1\42\1\35\1\0\1\43\1\44\1\34\1\32\1\3\1\33\1\55"+
    "\1\4\12\2\1\0\1\54\1\41\1\31\1\40\2\0\32\1\1\47"+
    "\1\0\1\50\1\0\1\1\1\0\1\17\1\7\1\15\1\25\1\12"+
    "\1\24\1\23\1\16\1\13\2\1\1\21\1\51\1\14\1\22\1\53"+
    "\1\1\1\20\1\27\1\11\1\26\1\52\1\30\1\1\1\10\1\1"+
    "\1\45\1\36\1\46\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\12\2"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\1\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\3\2\1\26\1\27\1\4\1\30\4\2\1\31\6\2"+
    "\1\32\4\2\1\33\1\34\1\35\1\36\1\37\1\40"+
    "\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50"+
    "\1\0\6\2\1\51\4\2\1\52\6\2\1\0\3\2"+
    "\1\53\1\54\1\55\1\56\1\57\10\2\1\3\1\60"+
    "\1\61\1\2\1\62\1\63\3\2\1\64\1\2\1\65"+
    "\2\2\1\66\1\67\1\70\1\71\1\72";

  private static int [] zzUnpackAction() {
    int [] result = new int[125];
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
    "\0\0\0\56\0\134\0\212\0\270\0\346\0\56\0\u0114"+
    "\0\u0142\0\u0170\0\u019e\0\u01cc\0\u01fa\0\u0228\0\u0256\0\u0284"+
    "\0\u02b2\0\u02e0\0\u030e\0\u033c\0\u036a\0\u0398\0\u03c6\0\u03f4"+
    "\0\u0422\0\u0450\0\u047e\0\u04ac\0\56\0\56\0\56\0\56"+
    "\0\56\0\u04da\0\u0508\0\u0536\0\56\0\56\0\u0564\0\56"+
    "\0\u0592\0\u05c0\0\u05ee\0\u061c\0\134\0\u064a\0\u0678\0\u06a6"+
    "\0\u06d4\0\u0702\0\u0730\0\u075e\0\u078c\0\u07ba\0\u07e8\0\u0816"+
    "\0\56\0\56\0\56\0\56\0\56\0\56\0\56\0\56"+
    "\0\56\0\56\0\56\0\56\0\56\0\56\0\u0844\0\u0872"+
    "\0\u08a0\0\u08ce\0\u08fc\0\u092a\0\u0958\0\134\0\u0986\0\u09b4"+
    "\0\u09e2\0\u0a10\0\134\0\u0a3e\0\u0a6c\0\u0a9a\0\u0ac8\0\u0af6"+
    "\0\u0b24\0\u0b52\0\u0b80\0\u0bae\0\u0bdc\0\134\0\134\0\134"+
    "\0\134\0\134\0\u0c0a\0\u0c38\0\u0c66\0\u0c94\0\u0cc2\0\u0cf0"+
    "\0\u0d1e\0\u0d4c\0\56\0\134\0\134\0\u0d7a\0\134\0\134"+
    "\0\u0da8\0\u0dd6\0\u0e04\0\134\0\u0e32\0\134\0\u0e60\0\u0e8e"+
    "\0\134\0\134\0\134\0\134\0\134";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[125];
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
    "\1\44\1\45\1\46\57\0\2\3\4\0\22\3\20\0"+
    "\3\3\4\0\1\4\56\0\1\5\1\0\1\5\54\0"+
    "\1\47\24\0\1\50\25\0\2\3\4\0\1\3\1\51"+
    "\20\3\20\0\3\3\3\0\2\3\4\0\11\3\1\52"+
    "\10\3\20\0\3\3\3\0\2\3\4\0\12\3\1\53"+
    "\7\3\20\0\3\3\3\0\2\3\4\0\5\3\1\54"+
    "\7\3\1\55\4\3\20\0\3\3\3\0\2\3\4\0"+
    "\7\3\1\56\12\3\20\0\3\3\3\0\2\3\4\0"+
    "\13\3\1\57\6\3\20\0\3\3\3\0\2\3\4\0"+
    "\10\3\1\60\1\3\1\61\1\62\6\3\20\0\3\3"+
    "\3\0\2\3\4\0\3\3\1\63\7\3\1\64\6\3"+
    "\20\0\3\3\3\0\2\3\4\0\2\3\1\65\3\3"+
    "\1\66\12\3\1\67\20\0\3\3\3\0\2\3\4\0"+
    "\7\3\1\70\12\3\20\0\3\3\33\0\1\71\55\0"+
    "\1\72\1\73\54\0\1\74\1\0\1\75\53\0\1\76"+
    "\61\0\1\77\56\0\1\100\50\0\1\101\55\0\1\102"+
    "\6\0\1\103\46\0\1\104\7\0\1\105\45\0\1\106"+
    "\57\0\1\107\23\0\2\3\4\0\10\3\1\110\11\3"+
    "\20\0\3\3\3\0\2\3\4\0\13\3\1\111\6\3"+
    "\20\0\3\3\3\0\2\3\4\0\11\3\1\112\10\3"+
    "\20\0\3\3\2\0\5\47\1\0\50\47\1\0\2\3"+
    "\4\0\2\3\1\113\17\3\20\0\3\3\3\0\2\3"+
    "\4\0\17\3\1\114\2\3\20\0\3\3\3\0\2\3"+
    "\4\0\20\3\1\115\1\3\20\0\3\3\3\0\2\3"+
    "\4\0\2\3\1\116\17\3\20\0\3\3\3\0\2\3"+
    "\4\0\10\3\1\117\11\3\20\0\3\3\3\0\2\3"+
    "\4\0\5\3\1\120\14\3\20\0\3\3\3\0\2\3"+
    "\4\0\12\3\1\121\7\3\20\0\3\3\3\0\2\3"+
    "\4\0\13\3\1\122\6\3\20\0\3\3\3\0\2\3"+
    "\4\0\11\3\1\123\10\3\20\0\3\3\3\0\2\3"+
    "\4\0\15\3\1\124\4\3\20\0\3\3\3\0\2\3"+
    "\4\0\17\3\1\125\2\3\20\0\3\3\3\0\2\3"+
    "\4\0\11\3\1\126\10\3\20\0\3\3\3\0\2\3"+
    "\4\0\10\3\1\127\11\3\20\0\3\3\3\0\2\3"+
    "\4\0\4\3\1\130\15\3\20\0\3\3\3\0\2\3"+
    "\4\0\4\3\1\131\15\3\20\0\3\3\4\0\1\132"+
    "\54\0\2\3\4\0\4\3\1\133\15\3\20\0\3\3"+
    "\3\0\2\3\4\0\4\3\1\134\15\3\20\0\3\3"+
    "\3\0\2\3\4\0\4\3\1\135\15\3\20\0\3\3"+
    "\3\0\2\3\4\0\3\3\1\136\16\3\20\0\3\3"+
    "\3\0\2\3\4\0\3\3\1\137\16\3\20\0\3\3"+
    "\3\0\2\3\4\0\3\3\1\140\16\3\20\0\3\3"+
    "\3\0\2\3\4\0\11\3\1\141\10\3\20\0\3\3"+
    "\3\0\2\3\4\0\14\3\1\142\5\3\20\0\3\3"+
    "\3\0\2\3\4\0\20\3\1\143\1\3\20\0\3\3"+
    "\3\0\2\3\4\0\10\3\1\144\11\3\20\0\3\3"+
    "\3\0\2\3\4\0\10\3\1\145\11\3\20\0\3\3"+
    "\3\0\2\3\4\0\1\146\21\3\20\0\3\3\3\0"+
    "\2\3\4\0\4\3\1\147\15\3\20\0\3\3\3\0"+
    "\2\3\4\0\5\3\1\150\14\3\20\0\3\3\3\0"+
    "\2\3\4\0\2\3\1\151\17\3\20\0\3\3\3\0"+
    "\2\3\4\0\12\3\1\152\7\3\20\0\3\3\4\0"+
    "\1\132\41\0\1\153\12\0\2\3\4\0\5\3\1\154"+
    "\14\3\20\0\3\3\3\0\2\3\4\0\16\3\1\155"+
    "\3\3\20\0\3\3\3\0\2\3\4\0\5\3\1\156"+
    "\14\3\20\0\3\3\3\0\2\3\4\0\3\3\1\157"+
    "\16\3\20\0\3\3\3\0\2\3\4\0\2\3\1\160"+
    "\17\3\20\0\3\3\3\0\2\3\4\0\17\3\1\161"+
    "\2\3\20\0\3\3\3\0\2\3\4\0\12\3\1\162"+
    "\7\3\20\0\3\3\3\0\2\3\4\0\5\3\1\163"+
    "\14\3\20\0\3\3\3\0\2\3\4\0\15\3\1\164"+
    "\4\3\20\0\3\3\3\0\2\3\4\0\6\3\1\165"+
    "\13\3\20\0\3\3\3\0\2\3\4\0\3\3\1\166"+
    "\16\3\20\0\3\3\3\0\2\3\4\0\2\3\1\167"+
    "\17\3\20\0\3\3\3\0\2\3\4\0\12\3\1\170"+
    "\7\3\20\0\3\3\3\0\2\3\4\0\3\3\1\171"+
    "\16\3\20\0\3\3\3\0\2\3\4\0\14\3\1\172"+
    "\5\3\20\0\3\3\3\0\2\3\4\0\7\3\1\173"+
    "\12\3\20\0\3\3\3\0\2\3\4\0\15\3\1\174"+
    "\4\3\20\0\3\3\3\0\2\3\4\0\2\3\1\175"+
    "\17\3\20\0\3\3\2\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3772];
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
    "\1\0\1\11\4\1\1\11\25\1\5\11\3\1\2\11"+
    "\1\1\1\11\20\1\16\11\1\0\22\1\1\0\20\1"+
    "\1\11\22\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[125];
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
    while (i < 128) {
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
        case 50: 
          { lexemas = yytext(); return Op_boolFalse;
          }
        case 59: break;
        case 39: 
          { lexemas = yytext(); return Op_desIzq;
          }
        case 60: break;
        case 19: 
          { lexemas=yytext(); return Llave_c;
          }
        case 61: break;
        case 42: 
          { lexemas=yytext(); return For;
          }
        case 62: break;
        case 37: 
          { lexemas = yytext(); return Op_desDer;
          }
        case 63: break;
        case 6: 
          { lexemas=yytext(); return Comillas;
          }
        case 64: break;
        case 8: 
          { lexemas=yytext(); return Suma;
          }
        case 65: break;
        case 26: 
          { lexemas=yytext(); return Do;
          }
        case 66: break;
        case 56: 
          { lexemas=yytext(); return Switch;
          }
        case 67: break;
        case 30: 
          { lexemas = yytext(); return Op_asigResta;
          }
        case 68: break;
        case 27: 
          { lexemas = yytext(); return Op_igual;
          }
        case 69: break;
        case 24: 
          { lexemas = yytext(); return Op_asigDiv;
          }
        case 70: break;
        case 17: 
          { lexemas=yytext(); return Parentesis_c;
          }
        case 71: break;
        case 36: 
          { lexemas = yytext(); return Op_mayorE;
          }
        case 72: break;
        case 58: 
          { lexemas=yytext(); return Default;
          }
        case 73: break;
        case 45: 
          { lexemas=yytext(); return Else;
          }
        case 74: break;
        case 21: 
          { lexemas = yytext(); return Corchete_c;
          }
        case 75: break;
        case 51: 
          { lexemas=yytext(); return T_float;
          }
        case 76: break;
        case 32: 
          { lexemas = yytext(); return Op_asigMult;
          }
        case 77: break;
        case 38: 
          { lexemas = yytext(); return Op_menorE;
          }
        case 78: break;
        case 49: 
          { lexemas=yytext(); return Void;
          }
        case 79: break;
        case 15: 
          { lexemas = yytext(); return Op_menor;
          }
        case 80: break;
        case 52: 
          { lexemas=yytext(); return Scanf;
          }
        case 81: break;
        case 35: 
          { lexemas = yytext(); return Op_diferente;
          }
        case 82: break;
        case 46: 
          { lexemas=yytext(); return T_char;
          }
        case 83: break;
        case 22: 
          { lexemas=yytext(); return P_coma;
          }
        case 84: break;
        case 33: 
          { lexemas=yytext(); return Op_and;
          }
        case 85: break;
        case 13: 
          { lexemas=yytext(); return Op_not;
          }
        case 86: break;
        case 25: 
          { lexemas=yytext(); return If;
          }
        case 87: break;
        case 40: 
          { lexemas = yytext(); return Op_asigResto;
          }
        case 88: break;
        case 44: 
          { lexemas = yytext(); return Op_boolTrue;
          }
        case 89: break;
        case 18: 
          { lexemas=yytext(); return Llave_a;
          }
        case 90: break;
        case 2: 
          { lexemas=yytext(); return Identificador;
          }
        case 91: break;
        case 23: 
          { lexemas=yytext(); return Punto;
          }
        case 92: break;
        case 31: 
          { lexemas = yytext(); return Op_decremento;
          }
        case 93: break;
        case 28: 
          { lexemas = yytext(); return Op_asigSuma;
          }
        case 94: break;
        case 9: 
          { lexemas=yytext(); return Resta;
          }
        case 95: break;
        case 29: 
          { lexemas = yytext(); return Op_incremento;
          }
        case 96: break;
        case 10: 
          { lexemas=yytext(); return Multiplicacion;
          }
        case 97: break;
        case 48: 
          { lexemas=yytext(); return Main;
          }
        case 98: break;
        case 43: 
          { lexemas=yytext(); return T_byte;
          }
        case 99: break;
        case 41: 
          { lexemas=yytext(); return T_int;
          }
        case 100: break;
        case 57: 
          { lexemas=yytext(); return Printf;
          }
        case 101: break;
        case 1: 
          { return ERROR;
          }
        case 102: break;
        case 54: 
          { lexemas=yytext(); return T_double;
          }
        case 103: break;
        case 16: 
          { lexemas=yytext(); return Parentesis_a;
          }
        case 104: break;
        case 3: 
          { lexemas=yytext(); return Numero;
          }
        case 105: break;
        case 11: 
          { lexemas=yytext(); return Op_andB;
          }
        case 106: break;
        case 12: 
          { lexemas=yytext(); return Op_orB;
          }
        case 107: break;
        case 20: 
          { lexemas = yytext(); return Corchete_a;
          }
        case 108: break;
        case 5: 
          { lexemas=yytext(); return Division;
          }
        case 109: break;
        case 4: 
          { /*Ignore*/
          }
        case 110: break;
        case 14: 
          { lexemas = yytext(); return Op_mayor;
          }
        case 111: break;
        case 47: 
          { lexemas=yytext(); return T_long;
          }
        case 112: break;
        case 7: 
          { lexemas=yytext(); return Igual;
          }
        case 113: break;
        case 34: 
          { lexemas=yytext(); return Op_or;
          }
        case 114: break;
        case 55: 
          { lexemas=yytext(); return Cadena;
          }
        case 115: break;
        case 53: 
          { lexemas=yytext(); return While;
          }
        case 116: break;
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
