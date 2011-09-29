// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.collection

import gnu.trove.iterator.TDoubleDoubleIterator

case class DoubleDoubleIterator(val underlying: TDoubleDoubleIterator) extends Iterator[(Double, Double)] {
  def hasNext = underlying.hasNext

  def next() = {
    underlying.advance()
    (underlying.key(), underlying.value())
  }
}

