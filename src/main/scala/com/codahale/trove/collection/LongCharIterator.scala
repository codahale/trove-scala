// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.collection

import gnu.trove.iterator.TLongCharIterator

case class LongCharIterator(val underlying: TLongCharIterator) extends Iterator[(Long, Char)] {
  def hasNext = underlying.hasNext

  def next() = {
    underlying.advance()
    (underlying.key(), underlying.value())
  }
}

