// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.collection

import gnu.trove.iterator.TCharIterator

case class CharIterator(val underlying: TCharIterator) extends Iterator[Char] {
  def hasNext = underlying.hasNext

  def next() = underlying.next()
}
