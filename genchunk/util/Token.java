package genchunk.util;

public class Token {
    public enum TokenType {
        KEYWORD,
        IDENTIFIER,
        LITERAL,
        OPERATOR,
        SEMICOLON;
    }

    public TokenType type;
    public String value;

    public Token(TokenType type, String value) {
        this.type = type;
        this.value = value;
    }
}