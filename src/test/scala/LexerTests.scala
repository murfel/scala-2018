import org.antlr.v4.runtime.CharStreams
import org.junit.Assert.assertEquals
import org.junit.Test
import ru.hse.spb.ExpLexer

import scala.collection.JavaConverters._

class LexerTests {
  /**
    * @param input a string of tokens separated by space characters
    */
  private def generateTestAndTest(input: String): Unit = {
    generateTestAndTest(input.split("\\s+").toList)
  }

  private def generateTestAndTest(input: List[String]): Unit = {
    test(input.mkString(""), input)
  }

  private def test(input: String, expected: List[String]): Unit = {
    val lexer = new ExpLexer(CharStreams.fromString(input))
    val tokens = collectionAsScalaIterable(lexer.getAllTokens).map(x => x.getText)
    assertEquals(expected, tokens)
  }

  @Test
  def `one number`(): Unit = generateTestAndTest("7")

  @Test
  def `one number in double parenthesis`(): Unit = generateTestAndTest("( ( 7 ) )")

  @Test
  def `multiplication`(): Unit = generateTestAndTest("1 * 2")

  @Test
  def `logical or`(): Unit = generateTestAndTest("1 || 2")

  @Test
  def `two same operators in a row`(): Unit = generateTestAndTest("1 == 2 == 3")

  @Test
  def `test ignores whitespaces`(): Unit = test(
    "1+ 2   \t * (3\n - 4)", List("1", "+", "2", "*", "(", "3", "-", "4", ")"))

  @Test
  def `all possible operators`(): Unit = generateTestAndTest(
    "1 % ( 2 <= 3 ) * ( 4 == ( ( 5 ) ) != 6 ) - 7 - 8 < 9 || 10 && 11 / ( 12 ) >= ( 13 > 14 )")
}