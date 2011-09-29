// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.collection

import gnu.trove.iterator.TDoubleCharIterator

case class DoubleCharIterator(val underlying: TDoubleCharIterator) extends Iterator[(Double, Char)] {
  def hasNext = underlying.hasNext

  def next() = {
    underlying.advance()
    (underlying.key(), underlying.value())
  }
}

