package com.codahale.trove.generic

import gnu.trove.iterator.TFloatIterator

case class FloatIterator(val underlying: TFloatIterator) extends Iterator[Float] {
  def hasNext = underlying.hasNext

  def next() = underlying.next()
}
