// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.set.TFloatSet
import gnu.trove.set.hash.TFloatHashSet
import scala.collection.mutable.{GrowingBuilder, Builder}
import scala.collection.generic.{CanBuildFrom}
import com.codahale.trove.collection.FloatIterator
import com.codahale.trove.generic.FloatSetFactory

class FloatSet(private val underlying: TFloatSet)
  extends scala.collection.mutable.Set[Float]
          with com.codahale.trove.collection.FloatSet
          with com.codahale.trove.collection.FloatSetLike[FloatSet]
          with scala.collection.mutable.SetLike[Float, FloatSet]
          with Serializable {

  override def empty = FloatSet.empty

  def -=(elem: Float) = {
    underlying.remove(elem)
    this
  }

  override def --=(xs: TraversableOnce[Float]) = {
    xs match {
      case s: FloatSet => underlying.removeAll(s.underlying)
      case other => super.--=(other)
    }
    this
  }

  def +=(elem: Float) = {
    underlying.add(elem)
    this
  }

  override def ++=(xs: TraversableOnce[Float]) = {
    xs match {
      case s: FloatSet => underlying.addAll(s.underlying)
      case other => super.++=(other)
    }
    this
  }

  def contains(elem: Float) = underlying.contains(elem)

  def iterator = new FloatIterator(underlying.iterator)

  override def size = underlying.size
}


object FloatSet extends FloatSetFactory[FloatSet] {
  def empty: FloatSet = new FloatSet(new TFloatHashSet())
  def newBuilder: Builder[Float, FloatSet] = new GrowingBuilder[Float, FloatSet](empty)
  implicit def canBuildFrom: CanBuildFrom[FloatSet, Float, FloatSet] = primitiveFloatSetCanBuildFrom
}
