package com.babsaai.ninetynine

import org.scalatest.FlatSpec

//Find the last but one element of a list.
//Example:
//scala> penultimate(List(1, 1, 2, 3, 5, 8))
//res0: Int = 5

class P02Test extends FlatSpec {

  it should "throw NSEException if list is empty" in {
    val list = Nil
    assertThrows[NoSuchElementException](ListOperations.penultimate(list))
  }

  it should "throw NSEException if list has only 1 element" in {
    val list = List(1)
    assertThrows[NoSuchElementException](ListOperations.penultimate(list))
  }

  it should "return the last but one element" in {
    val list = List(1, 2)
    assert(ListOperations.penultimate(list) == 1)
  }

  it should "work for longer list" in {
    val list = List("a", "b", "c", "d")
    assert(ListOperations.penultimate(list) == "c")
  }

}
