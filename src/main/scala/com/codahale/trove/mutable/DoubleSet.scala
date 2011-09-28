// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.set.TDoubleSet
import gnu.trove.set.hash.TDoubleHashSet
import scala.collection.mutable.{GrowingBuilder, Builder}
import scala.collection.generic.{CanBuildFrom}
import com.codahale.trove.collection.DoubleIterator
import com.codahale.trove.generic.DoubleSetFactory

class DoubleSet(private val underlying: TDoubleSet)
  extends scala.collection.mutable.Set[Double]
          with com.codahale.trove.collection.DoubleSet
          with com.codahale.trove.collection.DoubleSetLike[DoubleSet]
          with scala.collection.mutable.SetLike[Double, DoubleSet]
          with Serializable {

  override def empty = DoubleSet.empty

  def -=(elem: Double) = {
    underlying.remove(elem)
    this
  }

  override def --=(xs: TraversableOnce[Double]) = {
    xs match {
      case s: DoubleSet => underlying.removeAll(s.underlying)
      case other => super.--=(other)
    }
    this
  }

  def +=(elem: Double) = {
    underlying.add(elem)
    this
  }

  override def ++=(xs: TraversableOnce[Double]) = {
    xs match {
      case s: DoubleSet => underlying.addAll(s.underlying)
      case other => super.++=(other)
    }
    this
  }

  def contains(elem: Double) = underlying.contains(elem)

  def iterator = new DoubleIterator(underlying.iterator)

  override def size = underlying.size
}


object DoubleSet extends DoubleSetFactory[DoubleSet] {
  def empty: DoubleSet = new DoubleSet(new TDoubleHashSet())
  def newBuilder: Builder[Double, DoubleSet] = new GrowingBuilder[Double, DoubleSet](empty)
  implicit def canBuildFrom: CanBuildFrom[DoubleSet, Double, DoubleSet] = primitiveDoubleSetCanBuildFrom
}
