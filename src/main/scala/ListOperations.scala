package com.babsaai.ninetynine

object ListOperations {

  def last(list: List[Any]): Any = {
    list match {
      case head :: Nil   => head
      case _ :: tail     => last(tail)
      case _             => throw new NoSuchElementException
    }
  }

  def penultimate(list: List[Any]): Any = {
    list match {
      case head :: _ :: Nil   => head
      case _ :: tail          => penultimate(tail)
      case _                  => throw new NoSuchElementException
    }
  }


}