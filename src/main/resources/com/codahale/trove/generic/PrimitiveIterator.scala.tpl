package com.codahale.trove.generic

import gnu.trove.iterator.T@type@Iterator

case class @type@Iterator(val underlying: T@type@Iterator) extends Iterator[@type@] {
  def hasNext = underlying.hasNext

  def next() = underlying.next()
}
