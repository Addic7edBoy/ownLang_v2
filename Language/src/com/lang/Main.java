package com.lang;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.lang.parser.ast.Statement;

public final class Main {
    public static void main(String[] args) throws IOException {
        final String str = new String(Files.readAllBytes(Paths.get("program.amb")), "UTF-8");
        final List<Token> tokens = new Lexer(str).tokenize();
        final Statement prog = new Parser(tokens).parse();
        //System.out.println(prog.toString());
        prog.execute();
    }
}
