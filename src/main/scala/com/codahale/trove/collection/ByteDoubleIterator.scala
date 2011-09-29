// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.collection

import gnu.trove.iterator.TByteDoubleIterator

case class ByteDoubleIterator(val underlying: TByteDoubleIterator) extends Iterator[(Byte, Double)] {
  def hasNext = underlying.hasNext

  def next() = {
    underlying.advance()
    (underlying.key(), underlying.value())
  }
}

