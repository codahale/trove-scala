@header@

package com.codahale.trove.collection

import gnu.trove.iterator.T@keyType@@valueType@Iterator

case class @keyType@@valueType@Iterator(val underlying: T@keyType@@valueType@Iterator) extends Iterator[(@keyType@, @valueType@)] {
  def hasNext = underlying.hasNext

  def next() = {
    underlying.advance()
    (underlying.key(), underlying.value())
  }
}

