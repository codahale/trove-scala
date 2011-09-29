// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.collection

import gnu.trove.iterator.TFloatFloatIterator

case class FloatFloatIterator(val underlying: TFloatFloatIterator) extends Iterator[(Float, Float)] {
  def hasNext = underlying.hasNext

  def next() = {
    underlying.advance()
    (underlying.key(), underlying.value())
  }
}

