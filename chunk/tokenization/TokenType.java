package chunk.tokenization;

public enum TokenType {
    // Single-character
    LEFT_PAREN, RIGHT_PAREN, LEFT_BRACE, RIGHT_BRACE, DOT,
    COMMA, PLUS, MINUS, ASTERISK, SLASH, SEMICOLON,

    // Literals
    IDENTIFIER, STRING, NUMBER,

    // Other
    EOF
}
