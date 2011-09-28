package com.codahale.trove.generic

import gnu.trove.iterator.TIntIterator

case class IntIterator(val underlying: TIntIterator) extends Iterator[Int] {
  def hasNext = underlying.hasNext

  def next() = underlying.next()
}
