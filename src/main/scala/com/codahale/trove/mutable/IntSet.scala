// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.set.hash.TIntHashSet
import gnu.trove.impl.unmodifiable.TUnmodifiableIntSet
import scala.collection.mutable.{GrowingBuilder, Builder}
import scala.collection.generic.{CanBuildFrom}
import com.codahale.trove.collection.IntIterator
import com.codahale.trove.generic.IntSetFactory
import com.codahale.trove.immutable.{IntSet => ImmutableIntSet}

class IntSet(private val underlying: TIntHashSet)
  extends scala.collection.mutable.Set[Int]
          with com.codahale.trove.collection.IntSet
          with com.codahale.trove.collection.IntSetLike[IntSet]
          with scala.collection.mutable.SetLike[Int, IntSet]
          with Serializable {

  override def empty = IntSet.empty

  def -=(elem: Int) = {
    underlying.remove(elem)
    this
  }

  override def --=(xs: TraversableOnce[Int]) = {
    xs match {
      case s: IntSet => underlying.removeAll(s.underlying)
      case other => super.--=(other)
    }
    this
  }

  def +=(elem: Int) = {
    underlying.add(elem)
    this
  }

  override def ++=(xs: TraversableOnce[Int]) = {
    xs match {
      case s: IntSet => underlying.addAll(s.underlying)
      case other => super.++=(other)
    }
    this
  }

  override def sizeHint(size: Int) {
    underlying.ensureCapacity(size)
  }

  def contains(elem: Int) = underlying.contains(elem)

  def iterator = new IntIterator(underlying.iterator)

  override def toSet[B >: Int] = new ImmutableIntSet(new TUnmodifiableIntSet(underlying)).asInstanceOf[scala.collection.immutable.Set[B]]

  override def size = underlying.size
}


object IntSet extends IntSetFactory[IntSet] {
  def empty: IntSet = new IntSet(new TIntHashSet())
  def newBuilder: Builder[Int, IntSet] = new GrowingBuilder[Int, IntSet](empty)
  implicit def canBuildFrom: CanBuildFrom[IntSet, Int, IntSet] = primitiveIntSetCanBuildFrom
}
