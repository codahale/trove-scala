package com.codahale.trove.immutable

import com.codahale.trove.collection
import com.codahale.trove.generic.{IntSetFactory, IntIterator}
import gnu.trove.impl.unmodifiable.TUnmodifiableIntSet
import scala.collection.mutable.{SetBuilder, Builder}
import gnu.trove.set.hash.TIntHashSet

class IntSet(val underlying: TUnmodifiableIntSet) extends scala.collection.immutable.Set[Int]
                      with collection.IntSet
                      with collection.IntSetLike[IntSet]
                      with Serializable {
  override def empty: IntSet = IntSet.empty

  def +(elem: Int): IntSet = {
    val newSet = new TIntHashSet(underlying)
    newSet.add(elem)
    new IntSet(new TUnmodifiableIntSet(newSet))
  }

  def -(elem: Int): IntSet = {
    val newSet = new TIntHashSet(underlying)
    newSet.remove(elem)
    new IntSet(new TUnmodifiableIntSet(newSet))
  }

  def contains(elem: Int): Boolean = underlying.contains(elem)

  def iterator = new IntIterator(underlying.iterator)
}

object IntSet extends IntSetFactory[IntSet] {
  val empty: IntSet = new IntSet(new TUnmodifiableIntSet(new TIntHashSet(0)))
  def newBuilder: Builder[Int, IntSet] = new SetBuilder[Int, IntSet](empty)
}
