// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.collection

import gnu.trove.iterator.TIntIntIterator

case class IntIntIterator(val underlying: TIntIntIterator) extends Iterator[(Int, Int)] {
  def hasNext = underlying.hasNext

  def next() = {
    underlying.advance()
    (underlying.key(), underlying.value())
  }
}

