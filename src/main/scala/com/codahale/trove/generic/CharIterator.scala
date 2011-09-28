package com.codahale.trove.generic

import gnu.trove.iterator.TCharIterator

case class CharIterator(val underlying: TCharIterator) extends Iterator[Char] {
  def hasNext = underlying.hasNext

  def next() = underlying.next()
}
