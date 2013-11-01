@header@

package com.codahale.trove.collection

import gnu.trove.iterator.T@keyType@ObjectIterator

case class @keyType@ObjectIterator[A](val underlying: T@keyType@ObjectIterator[A]) extends Iterator[(@keyType@, A)] {
  def hasNext = underlying.hasNext

  def next() = {
    underlying.advance()
    (underlying.key(), underlying.value())
  }
}

