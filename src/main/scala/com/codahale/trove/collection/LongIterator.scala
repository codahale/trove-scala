// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.collection

import gnu.trove.iterator.TLongIterator

case class LongIterator(val underlying: TLongIterator) extends Iterator[Long] {
  def hasNext = underlying.hasNext

  def next() = underlying.next()
}
