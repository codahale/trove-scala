// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.collection

import gnu.trove.iterator.TCharDoubleIterator

case class CharDoubleIterator(val underlying: TCharDoubleIterator) extends Iterator[(Char, Double)] {
  def hasNext = underlying.hasNext

  def next() = {
    underlying.advance()
    (underlying.key(), underlying.value())
  }
}

