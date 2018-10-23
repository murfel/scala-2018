import org.antlr.v4.runtime._
import org.junit.Test
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue

class EvaluationTests {
  def test(input: String, expected: Int): Unit = {
    val lexer = new ExpLexer(CharStreams.fromString(input))
    val tokens = new CommonTokenStream(lexer)
    val parser = new ExpParser(tokens)
    val actual = parser.eval().value
    assertEquals(0, parser.getNumberOfSyntaxErrors)
    assertEquals(expected, actual)
  }

  def testSyntaxError(input: String): Unit = {
    val lexer = new ExpLexer(CharStreams.fromString(input))
    val tokens = new CommonTokenStream(lexer)
    val parser = new ExpParser(tokens)
    parser.eval()
    assertTrue(parser.getNumberOfSyntaxErrors > 0)
  }

  @Test
  def `multiplication`(): Unit = test("1 * 2", 2)

  @Test
  def `addition`(): Unit = test("1 + 2", 3)

  @Test
  def `inequality`(): Unit = test("1 < 2", 1)

  @Test
  def `equality`(): Unit = test("1 != 1", 0)

  @Test
  def `and expression`(): Unit = test("1 && 0", 0)

  @Test
  def `or expression`(): Unit = test("0 || 1", 1)

  @Test
  def `expression with two minuses`(): Unit = test("10 - 1 - 2", 7)

  @Test
  def `expression with two equality signs`(): Unit = test("1 == 2 == 3", 0)

  @Test
  def `simple expression with parenthesis`(): Unit = test("(4 == 5) != 6", 1)

  @Test
  def `simple expression tests associativity`(): Unit = test("4 == 5 != 6", 1)

  @Test
  def `complex expression`(): Unit = test(
    "1 % ( 2 <= 3 ) * ( 4 == ( ( 5 ) ) != 6 ) - 7 - 8 < 9 || 10 && 11 / ( 12 ) >= ( 13 > 14 )", 1)

  @Test
  def `syntax error no operator`(): Unit = testSyntaxError("1 1")

  @Test
  def `syntax error no operator, with parenthesis`(): Unit = testSyntaxError("1(1)")
}
