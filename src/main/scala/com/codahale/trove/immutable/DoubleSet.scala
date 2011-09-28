package com.codahale.trove.immutable

import com.codahale.trove.collection
import com.codahale.trove.generic.{DoubleSetFactory, DoubleIterator}
import gnu.trove.impl.unmodifiable.TUnmodifiableDoubleSet
import scala.collection.mutable.{SetBuilder, Builder}
import gnu.trove.set.hash.TDoubleHashSet

class DoubleSet(val underlying: TUnmodifiableDoubleSet) extends scala.collection.immutable.Set[Double]
                      with collection.DoubleSet
                      with collection.DoubleSetLike[DoubleSet]
                      with Serializable {
  override def empty: DoubleSet = DoubleSet.empty

  def +(elem: Double): DoubleSet = {
    val newSet = new TDoubleHashSet(underlying)
    newSet.add(elem)
    new DoubleSet(new TUnmodifiableDoubleSet(newSet))
  }

  def -(elem: Double): DoubleSet = {
    val newSet = new TDoubleHashSet(underlying)
    newSet.remove(elem)
    new DoubleSet(new TUnmodifiableDoubleSet(newSet))
  }

  def contains(elem: Double): Boolean = underlying.contains(elem)

  def iterator = new DoubleIterator(underlying.iterator)
}

object DoubleSet extends DoubleSetFactory[DoubleSet] {
  val empty: DoubleSet = new DoubleSet(new TUnmodifiableDoubleSet(new TDoubleHashSet(0)))
  def newBuilder: Builder[Double, DoubleSet] = new SetBuilder[Double, DoubleSet](empty)
}
