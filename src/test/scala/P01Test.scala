package com.babsaai.ninetynine

import java.util.NoSuchElementException

import org.scalatest.FlatSpec

class P01Test extends FlatSpec {

  it should "throw NSEException if list is empty" in {
    val list = Nil
    assertThrows[NoSuchElementException](P01.last(list))
  }

  it should "return only element if size is 1" in {
    val list = List(1)
    assert(P01.last(list) == 1)
  }

  it should "return the last element" in {
    val list = List(1, 2, 4)
    assert(P01.last(list) == 4)
  }
}