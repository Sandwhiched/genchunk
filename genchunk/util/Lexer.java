package genchunk.util;

import java.util.ArrayList;

public class Lexer {
    public static ArrayList<Token> lex(String code) {
        final String[] splitCode = code.split("\\s+");

        ArrayList<Token> lexedTokens = new ArrayList<Token>();

        for (String rawValue : splitCode) { 
            if (rawValue.equals("chunkExampleKeyword")) {
                lexedTokens.add(new Token(Token.TokenType.KEYWORD, rawValue));
            }

            else if (rawValue.matches("[a-zA-Z_][a-zA-Z0-9_]*")) {
                lexedTokens.add(new Token(Token.TokenType.IDENTIFIER, rawValue));
            }

            else if (rawValue.matches("[0-9]+")) {
                lexedTokens.add(new Token(Token.TokenType.LITERAL, rawValue));
            }

            else if (rawValue.matches("[+\\-*/%]")) {
                lexedTokens.add(new Token(Token.TokenType.OPERATOR, rawValue));
            }

            else if (rawValue.matches(";")) {
                lexedTokens.add(new Token(Token.TokenType.SEMICOLON, rawValue));
            }
            
            else {
                Errors.unknownToken(rawValue);
            }
        }

        return lexedTokens;
    }
}