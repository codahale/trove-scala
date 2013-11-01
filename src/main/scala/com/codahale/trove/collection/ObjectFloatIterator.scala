// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.collection

import gnu.trove.iterator.TObjectFloatIterator

case class ObjectFloatIterator[A](val underlying: TObjectFloatIterator[A]) extends Iterator[(A, Float)] {
  def hasNext = underlying.hasNext

  def next() = {
    underlying.advance()
    (underlying.key(), underlying.value())
  }
}

