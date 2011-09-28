// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import scala.collection.mutable.{Builder, Buffer}
import gnu.trove.list.array.TLongArrayList
import scala.collection.{TraversableOnce, Traversable}
import com.codahale.trove.collection.LongIterator

class LongBuffer(private val underlying: TLongArrayList)
  extends Buffer[Long]
          with Builder[Long, LongBuffer] {
  
  def +=(elem: Long) = {
    underlying.add(elem)
    this
  }

  def +=:(elem: Long) = this.+=(elem)

  override def ++=(xs: TraversableOnce[Long]) = {
    xs match {
      case b: LongBuffer => underlying.addAll(b.underlying)
      case other => super.++=(other)
    }
    this
  }

  override def ++=:(xs: TraversableOnce[Long]) = this.++=(xs)

  override def --=(xs: TraversableOnce[Long]) = {
    xs match {
      case b: LongBuffer => underlying.removeAll(b.underlying)
      case other => super.--=(other)
    }
    this
  }

  override def -=(x: Long) = {
    underlying.remove(x)
    this
  }

  override def sizeHint(size: Int) {
    underlying.ensureCapacity(size)
  }

  def apply(n: Int) = underlying.get(n)

  def clear() {
    underlying.clear()
  }

  def insertAll(n: Int, elems: Traversable[Long]) {
    elems match {
      case b: LongBuffer => underlying.insert(n, b.underlying.toArray)
      case other => underlying.insert(n, elems.toArray)
    }
  }

  def length = underlying.size()

  def remove(n: Int) = underlying.removeAt(n)

  def update(n: Int, newelem: Long) {
    underlying.replace(n, newelem)
  }

  def iterator = new LongIterator(underlying.iterator())

  def result() = this
}

object LongBuffer {
  def newBuilder: Builder[Long, LongBuffer] = new LongBuffer(new TLongArrayList())
  
  def empty: LongBuffer = newBuilder.result()

  def apply(elems: Long*): LongBuffer = {
    if (elems.isEmpty) empty
    else {
      val b = newBuilder
      b ++= elems
      b.result
    }
  }
  
  def unapplySeq[A](x: LongBuffer): Some[LongBuffer] = Some(x)
}
