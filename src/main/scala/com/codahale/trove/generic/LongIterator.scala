package com.codahale.trove.generic

import gnu.trove.iterator.TLongIterator

case class LongIterator(val underlying: TLongIterator) extends Iterator[Long] {
  def hasNext = underlying.hasNext

  def next() = underlying.next()
}
