package com.codahale.trove.mutable

import gnu.trove.set.TIntSet
import gnu.trove.set.hash.TIntHashSet
import scala.collection.mutable.{GrowingBuilder, Builder}
import scala.collection.generic.{CanBuildFrom}
import com.codahale.trove.generic.{IntSetFactory, IntIterator}

class IntSet(private[this] val underlying: TIntSet)
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

  def +=(elem: Int) = {
    underlying.add(elem)
    this
  }

  def contains(elem: Int) = underlying.contains(elem)

  def iterator = new IntIterator(underlying.iterator)
}


object IntSet extends IntSetFactory[IntSet] {
  def empty: IntSet = new IntSet(new TIntHashSet())
  def newBuilder: Builder[Int, IntSet] = new GrowingBuilder[Int, IntSet](empty)
  implicit def canBuildFrom: CanBuildFrom[IntSet, Int, IntSet] = intsetCanBuildFrom
}