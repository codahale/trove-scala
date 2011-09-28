// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import scala.collection.mutable.{Builder, Buffer}
import gnu.trove.list.array.TDoubleArrayList
import scala.collection.{TraversableOnce, Traversable}
import com.codahale.trove.collection.DoubleIterator

class DoubleBuffer(private val underlying: TDoubleArrayList)
  extends Buffer[Double]
          with Builder[Double, DoubleBuffer] {
  
  def +=(elem: Double) = {
    underlying.add(elem)
    this
  }

  def +=:(elem: Double) = this.+=(elem)

  override def ++=(xs: TraversableOnce[Double]) = {
    xs match {
      case b: DoubleBuffer => underlying.addAll(b.underlying)
      case other => super.++=(other)
    }
    this
  }

  override def ++=:(xs: TraversableOnce[Double]) = this.++=(xs)

  override def --=(xs: TraversableOnce[Double]) = {
    xs match {
      case b: DoubleBuffer => underlying.removeAll(b.underlying)
      case other => super.--=(other)
    }
    this
  }

  override def -=(x: Double) = {
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

  def insertAll(n: Int, elems: Traversable[Double]) {
    elems match {
      case b: DoubleBuffer => underlying.insert(n, b.underlying.toArray)
      case other => underlying.insert(n, elems.toArray)
    }
  }

  def length = underlying.size()

  def remove(n: Int) = underlying.removeAt(n)

  def update(n: Int, newelem: Double) {
    underlying.replace(n, newelem)
  }

  def iterator = new DoubleIterator(underlying.iterator())

  def result() = this
}

object DoubleBuffer {
  def newBuilder: Builder[Double, DoubleBuffer] = new DoubleBuffer(new TDoubleArrayList())
  
  def empty: DoubleBuffer = newBuilder.result()

  def apply(elems: Double*): DoubleBuffer = {
    if (elems.isEmpty) empty
    else {
      val b = newBuilder
      b ++= elems
      b.result
    }
  }
  
  def unapplySeq[A](x: DoubleBuffer): Some[DoubleBuffer] = Some(x)
}
