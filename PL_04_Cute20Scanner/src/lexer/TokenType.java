package lexer;


public enum TokenType {
	INT,
	ID, 
	TRUE, FALSE, NOT,
	PLUS, MINUS, TIMES, DIV,   //special chractor
	LT, GT, EQ, APOSTROPHE,    //special chractor
	L_PAREN, R_PAREN,QUESTION, //special chractor
	DEFINE, LAMBDA, COND, QUOTE,
	CAR, CDR, CONS,
	ATOM_Q, NULL_Q, EQ_Q; 
	
	static TokenType fromSpecialCharactor(char ch) {
		switch ( ch ) {
			case '+':
				return PLUS;
			//?ÇòÎ®∏Ï? Special Charactor?óê ???ï¥ ?Ü†?Å∞?ùÑ Î∞òÌôò?ïò?èÑÎ°? ?ûë?Ñ±
			default:
				throw new IllegalArgumentException("unregistered char: " + ch);
		}
	}
}
