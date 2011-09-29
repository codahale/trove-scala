// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.collection

import gnu.trove.iterator.TDoubleFloatIterator

case class DoubleFloatIterator(val underlying: TDoubleFloatIterator) extends Iterator[(Double, Float)] {
  def hasNext = underlying.hasNext

  def next() = {
    underlying.advance()
    (underlying.key(), underlying.value())
  }
}

