@header@

package com.codahale.trove.collection

import gnu.trove.iterator.TObject@valueType@Iterator

case class Object@valueType@Iterator[A](val underlying: TObject@valueType@Iterator[A]) extends Iterator[(A, @valueType@)] {
  def hasNext = underlying.hasNext

  def next() = {
    underlying.advance()
    (underlying.key(), underlying.value())
  }
}

