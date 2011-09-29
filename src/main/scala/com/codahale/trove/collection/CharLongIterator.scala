// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.collection

import gnu.trove.iterator.TCharLongIterator

case class CharLongIterator(val underlying: TCharLongIterator) extends Iterator[(Char, Long)] {
  def hasNext = underlying.hasNext

  def next() = {
    underlying.advance()
    (underlying.key(), underlying.value())
  }
}

