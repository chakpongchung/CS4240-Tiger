package edu.cs4240.tiger.parser;

/**
 * @author Roi Atalla
 */
public class Token {
	private TokenClass tokenClass;
	private String token;
	
	private String line;
	private int lineNum;
	
	public Token(TokenClass tokenClass, String token, String line, int lineNum) {
		this.setTokenClass(tokenClass);
		this.setToken(token);
		this.setLine(line);
		this.setLineNum(lineNum);
	}
	
	public TokenClass getTokenClass() {
		return tokenClass;
	}
	
	public void setTokenClass(TokenClass tokenClass) {
		this.tokenClass = tokenClass;
	}
	
	public String getToken() {
		return token;
	}
	
	public void setToken(String token) {
		this.token = token;
	}
	
	public String getLine() {
		return line;
	}
	
	public void setLine(String line) {
		this.line = line;
	}
	
	public int getLineNum() {
		return lineNum;
	}
	
	public void setLineNum(int lineNum) {
		this.lineNum = lineNum;
	}
	
	@Override
	public String toString() {
		return tokenClass + " on line (" + lineNum + ") \"" + line + "\": " + token;
	}
}
