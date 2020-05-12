package rtoken;

import java.io.*;
import java.util.*;

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
		// 97 ~ 122 소문 03일떄 3
		// 65 ~ 90 대문 3일때 3
		// 48 ~ 57 숫 012일떄 2 3일때 3
		// 45 = - 0일때 1
		for(int i = 0; i<128 ; i++){
			for(int j = 0; j< 4; j++){
				transM[j][i] = -1;//해당되지 않는 모든 entry는 -1
			}
		}
		for(int i = 97; i< 123; i++){
			transM[0][i] = 3;
			transM[3][i] = 3;
		}
		for(int i = 65; i< 91; i++){
			transM[3][i] = 3;
		}
		for(int i = 48; i< 58; i++){
			transM[0][i] = 2;
			transM[1][i] = 2;
			transM[2][i] = 2;
			transM[3][i] = 3;
		}
		transM[0][45] = 1;
	}
	private Token nextToken() {
		int stateOld = 0 , stateNew;
		
		if(!st.hasMoreTokens()) return null;
		
		String temp = st.nextToken();
		
		Token result = null;
		
		for(int i = 0; i<temp.length(); i++) {
			//과제
			//하나씩 TM을 이용하여 판별
			stateNew = transM[stateOld][temp.charAt(i)];
			// reject상태 예외처리(메세지 출력후 리턴)
			if(stateNew == -1) {
				System.out.println("Error");
				return result;
			}
			// 업데이트
			stateOld = stateNew;
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
		//과제
		//입력된 모든 token에 대하여 nextToken으로 식별 후 리스트에 추가하여 반환
		List<Token> to = new ArrayList<>();
		Token next = nextToken();
		while(next != null) {
			to.add(next);
			next = nextToken();
		}
		return to;
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileReader fr =  new FileReader("./as03.txt");
		@SuppressWarnings("resource")
		BufferedReader bf = new BufferedReader(fr);
		String source = bf.readLine();
		Scanner s = new Scanner(source);
		List<Token> tokens = s.tokenize();
		System.out.println(tokens);
	}
}
