// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.collection

import gnu.trove.iterator.TObjectDoubleIterator

case class ObjectDoubleIterator[A](val underlying: TObjectDoubleIterator[A]) extends Iterator[(A, Double)] {
  def hasNext = underlying.hasNext

  def next() = {
    underlying.advance()
    (underlying.key(), underlying.value())
  }
}

