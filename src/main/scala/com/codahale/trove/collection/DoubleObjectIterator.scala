// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.collection

import gnu.trove.iterator.TDoubleObjectIterator

case class DoubleObjectIterator[A](val underlying: TDoubleObjectIterator[A]) extends Iterator[(Double, A)] {
  def hasNext = underlying.hasNext

  def next() = {
    underlying.advance()
    (underlying.key(), underlying.value())
  }
}

