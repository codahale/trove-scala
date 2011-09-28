package com.codahale.trove.generic

import gnu.trove.iterator.TShortIterator

case class ShortIterator(val underlying: TShortIterator) extends Iterator[Short] {
  def hasNext = underlying.hasNext

  def next() = underlying.next()
}
