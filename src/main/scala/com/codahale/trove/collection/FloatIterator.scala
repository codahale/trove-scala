// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.collection

import gnu.trove.iterator.TFloatIterator

case class FloatIterator(val underlying: TFloatIterator) extends Iterator[Float] {
  def hasNext = underlying.hasNext

  def next() = underlying.next()
}
