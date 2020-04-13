package rtoken;

import java.io.*;
import java.util.List;
import java.util.StringTokenizer;

public class Scanner {

	public enum TokenType {
		ID(3), INT(2);
		
		private final int finalState;
		
		TokenType(int finalState){
			this.finalState = finalState;
		}
	}
	
	public static class Token {
		public final TokenType type;
		public final String lexme;
		
		Token(TokenType type, String lexme){
			this.type = type;
			this.lexme = lexme;
		}
		
		@Override
		public String toString() {
			return String.format("[%s: %s]", type.toString(), lexme);
		}
	}
	
	private int transM[][];
	private String source;
	private StringTokenizer st;
	
	public Scanner(String source) {
		this.transM = new int[4][128];
		this.source = source == null ? "" : source;
		this.st = new StringTokenizer(this.source, " ");
		initTM();
	}
	
	private void initTM() {
		// TODO Auto-generated method stub
		
	}
	private Token nextToken() {
		int stateOld = 0 , stateNew;
		
		if(!st.hasMoreTokens()) return null;
		
		String temp = st.nextToken();
		
		Token result = null;
		
		for(int i = 0; i<temp.length(); i++) {
			//����
			//�ϳ��� TM�� �̿��Ͽ� �Ǻ�
			// reject���� ����ó��(�޼��� ����� ����)
			// ������Ʈ
		}
		for(TokenType t : TokenType.values()) {
			if(t.finalState == stateOld) {
				result = new Token(t, temp);
				break;
			}
		}
		return result;
	}
	
	public List<Token> tokenize(){
		//����
		//�Էµ� ��� token�� ���Ͽ� nexttoken���� �ĺ� �� ����Ʈ�� �߰��Ͽ� ��ȯ
		return null;
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileReader fr =  new FileReader("C:/as03.txt");
		BufferedReader bf = new BufferedReader(fr);
		String source = bf.readLine();
		Scanner s = new Scanner(source);
		List<Token> tokens = s.tokenize();
		System.out.println(tokens);
	}

}
