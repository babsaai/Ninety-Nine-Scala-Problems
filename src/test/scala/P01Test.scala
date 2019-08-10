package com.babsaai.ninetynine

import java.util.NoSuchElementException

import org.scalatest.FlatSpec

// Find the last element of a list.
// Example:
// scala> last(List(1, 1, 2, 3, 5, 8))
// res0: Int = 8

class P01Test extends FlatSpec {

  it should "throw NSEException if list is empty" in {
    val list = Nil
    assertThrows[NoSuchElementException](ListOperations.last(list))
  }

  it should "return only element if size is 1" in {
    val list = List(1)
    assert(ListOperations.last(list) == 1)
  }

  it should "return the last element" in {
    val list = List(1, 2, 4)
    assert(ListOperations.last(list) == 4)
  }

  it should "work with strings too" in {
    val list = List("a","b")
    assert(ListOperations.last(list) == "b")
  }
}