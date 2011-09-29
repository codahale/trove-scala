// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.collection

import gnu.trove.iterator.TCharFloatIterator

case class CharFloatIterator(val underlying: TCharFloatIterator) extends Iterator[(Char, Float)] {
  def hasNext = underlying.hasNext

  def next() = {
    underlying.advance()
    (underlying.key(), underlying.value())
  }
}

