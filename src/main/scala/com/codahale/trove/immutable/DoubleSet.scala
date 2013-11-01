// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.immutable

import com.codahale.trove.collection
import com.codahale.trove.generic.DoubleSetFactory
import gnu.trove.impl.unmodifiable.TUnmodifiableDoubleSet
import scala.collection.mutable.{SetBuilder, Builder}
import scala.collection.GenTraversableOnce
import gnu.trove.set.hash.TDoubleHashSet

class DoubleSet(private val underlying: TUnmodifiableDoubleSet)
  extends scala.collection.immutable.Set[Double]
          with collection.DoubleSet
          with collection.DoubleSetLike[DoubleSet]
          with Serializable {
  override def empty: DoubleSet = DoubleSet.empty

  override def ++(xs: GenTraversableOnce[Double]) = {
    val newSet = new TDoubleHashSet(underlying)
    xs match {
      case s: DoubleSet => newSet.addAll(s.underlying)
      case other => other.foreach(newSet.add)
    }
    new DoubleSet(new TUnmodifiableDoubleSet(newSet))
  }

  def +(elem: Double): DoubleSet = {
    val newSet = new TDoubleHashSet(underlying)
    newSet.add(elem)
    new DoubleSet(new TUnmodifiableDoubleSet(newSet))
  }

  override def --(xs: GenTraversableOnce[Double]) = {
    val newSet = new TDoubleHashSet(underlying)
    xs match {
      case s: DoubleSet => newSet.removeAll(s.underlying)
      case other => other.foreach(newSet.remove)
    }
    new DoubleSet(new TUnmodifiableDoubleSet(newSet))
  }

  def -(elem: Double): DoubleSet = {
    val newSet = new TDoubleHashSet(underlying)
    newSet.remove(elem)
    new DoubleSet(new TUnmodifiableDoubleSet(newSet))
  }

  def contains(elem: Double): Boolean = underlying.contains(elem)

  def iterator = new collection.DoubleIterator(underlying.iterator)

  override def toSet[B >: Double] = this.asInstanceOf[scala.collection.immutable.Set[B]]

  override def size = underlying.size
}

object DoubleSet extends DoubleSetFactory[DoubleSet] {
  val empty: DoubleSet = new DoubleSet(new TUnmodifiableDoubleSet(new TDoubleHashSet(0)))
  def newBuilder: Builder[Double, DoubleSet] = new SetBuilder[Double, DoubleSet](empty)
}
