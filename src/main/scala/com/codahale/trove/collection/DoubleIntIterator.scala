// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.collection

import gnu.trove.iterator.TDoubleIntIterator

case class DoubleIntIterator(val underlying: TDoubleIntIterator) extends Iterator[(Double, Int)] {
  def hasNext = underlying.hasNext

  def next() = {
    underlying.advance()
    (underlying.key(), underlying.value())
  }
}

