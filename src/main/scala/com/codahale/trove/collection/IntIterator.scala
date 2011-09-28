// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.collection

import gnu.trove.iterator.TIntIterator

case class IntIterator(val underlying: TIntIterator) extends Iterator[Int] {
  def hasNext = underlying.hasNext

  def next() = underlying.next()
}
