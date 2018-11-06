package ru.hse.spb

import java.util.Scanner

import org.antlr.v4.runtime.{CharStreams, CommonTokenStream}

object Main {
  def main(args: Array[String]): Unit = {
    println("Welcome to the Calculator!\n" +
      "Enter an expression and press Enter.\n" +
      "Supported operators are * / % + - < <= > >= == != && || and the parenthesis ().\n" +
      "To exit, send EOF (press Ctrl+D).")
    val scanner = new Scanner(System.in)
    while (scanner.hasNextLine) {
      val lexer = new ExpLexer(CharStreams.fromString(scanner.nextLine()))
      val tokens = new CommonTokenStream(lexer)
      val parser = new ExpParser(tokens)
      println(parser.eval().value)
    }
  }
}
