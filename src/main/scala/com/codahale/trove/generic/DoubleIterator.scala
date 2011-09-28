package com.codahale.trove.generic

import gnu.trove.iterator.TDoubleIterator

case class DoubleIterator(val underlying: TDoubleIterator) extends Iterator[Double] {
  def hasNext = underlying.hasNext

  def next() = underlying.next()
}
