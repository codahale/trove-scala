package com.codahale.trove.generic

import gnu.trove.iterator.TByteIterator

case class ByteIterator(val underlying: TByteIterator) extends Iterator[Byte] {
  def hasNext = underlying.hasNext

  def next() = underlying.next()
}
