// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.collection

import gnu.trove.iterator.TByteIterator

case class ByteIterator(val underlying: TByteIterator) extends Iterator[Byte] {
  def hasNext = underlying.hasNext

  def next() = underlying.next()
}
