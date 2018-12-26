package HList

import org.junit.Assert._
import org.junit.Test

class HListTest {
  import HList.HNil

  @Test
  def testHConsOneElement(): Unit = {
    val list = "world" :: HNil
    assertEquals("world", list.head)
    assertEquals(HNil, list.tail)
  }

  @Test
  def testHConsTwoElements(): Unit = {
    val list = 42 :: "world" :: HNil
    assertEquals(42, list.head)
    assertEquals("world", list.tail.head)
    assertEquals(HNil, list.tail.tail)
  }

  @Test
  def testHConsThreeElements(): Unit = {
    val list = false :: 42 :: "world" :: HNil
    assertEquals(false, list.head)
    assertEquals(42, list.tail.head)
    assertEquals("world", list.tail.tail.head)
    assertEquals(HNil, list.tail.tail.tail)
  }

  @Test
  def testHConsAndExtend(): Unit = {
    val list = ("hello" :: 42 :: false :: HNil) ::: ("world" :: HNil)
    assertEquals("hello", list.head)
    assertEquals("world", list.tail.tail.tail.head)
  }

  @Test
  def testZipTwoEmpty(): Unit = {
    val l1 = HNil
    val l2 = HNil
    val zipped = l1 zip l2
    assertEquals(HNil, zipped)
  }

  @Test
  def testZipWithEmpty(): Unit = {
    val l1 = HNil
    val l2 = 42 :: HNil
    val zipped = l1 zip l2
    assertEquals(HNil, zipped)
  }

  @Test
  def testZipOneElementLists(): Unit = {
    val l1 = false :: HNil
    val l2 = true :: HNil
    val zipped = l1 zip l2
    assertEquals(false, zipped.head._1)
    assertEquals(true, zipped.head._2)
    assertEquals(HNil, zipped.tail)
  }

  @Test
  def testZipSimple(): Unit = {
    val l1 = "hello" :: 42 :: false :: "world" :: HNil
    val l2 = 111 :: true :: HNil
    val zipped = l1 zip l2
  }

  @Test
  def testSplitAtZeroEmptyList(): Unit = {
    val list = HNil
    val lists = list splitAt Number._0
    assertEquals(HNil, lists._1)
    assertEquals(list, lists._2)
  }

  @Test
  def testSplitAtZero(): Unit = {
    val list = "hello" :: 42 :: false :: "world" :: HNil
    val lists = list splitAt Number._0
    assertEquals(HNil, lists._1)
    assertEquals(list, lists._2)
  }

  @Test
  def testSplitAtAnyValidIndex(): Unit = {
    val list = "hello" :: 42 :: false :: "world" :: HNil
    val lists = list splitAt Number._1
    assertEquals("hello" :: HNil, lists._1)
    assertEquals(42 :: false :: "world" :: HNil, lists._2)

    val lists2 = list splitAt Number._2
    assertEquals("hello" :: 42 :: HNil, lists2._1)
    assertEquals(false :: "world" :: HNil, lists2._2)

    val lists3 = list splitAt Number._3
    assertEquals("hello" :: 42 :: false :: HNil, lists3._1)
    assertEquals("world" :: HNil, lists3._2)

    val lists4 = list splitAt Number._4
    assertEquals(list, lists4._1)
    assertEquals(HNil, lists4._2)

    // Should not compile
//    val lists5 = list splitAt Number._5
//    val lists2 = list splitAt Number._6
  }

  @Test
  def testRightAssociativityForHCons(): Unit = {
    val list = 42 :: HNil :: 555 :: HNil
    assertEquals(42 :: HNil :: (555 :: HNil), list)
    assertNotEquals((42 :: HNil) :: 555 :: HNil, list)
  }
}