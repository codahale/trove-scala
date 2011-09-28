// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.collection

import gnu.trove.iterator.TDoubleIterator

case class DoubleIterator(val underlying: TDoubleIterator) extends Iterator[Double] {
  def hasNext = underlying.hasNext

  def next() = underlying.next()
}
