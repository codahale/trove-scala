// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.immutable

import com.codahale.trove.collection
import com.codahale.trove.generic.IntSetFactory
import gnu.trove.impl.unmodifiable.TUnmodifiableIntSet
import scala.collection.mutable.{SetBuilder, Builder}
import scala.collection.GenTraversableOnce
import gnu.trove.set.hash.TIntHashSet

class IntSet(private val underlying: TUnmodifiableIntSet)
  extends scala.collection.immutable.Set[Int]
          with collection.IntSet
          with collection.IntSetLike[IntSet]
          with Serializable {
  override def empty: IntSet = IntSet.empty

  override def ++(xs: GenTraversableOnce[Int]) = {
    val newSet = new TIntHashSet(underlying)
    xs match {
      case s: IntSet => newSet.addAll(s.underlying)
      case other => other.foreach(newSet.add)
    }
    new IntSet(new TUnmodifiableIntSet(newSet))
  }

  def +(elem: Int): IntSet = {
    val newSet = new TIntHashSet(underlying)
    newSet.add(elem)
    new IntSet(new TUnmodifiableIntSet(newSet))
  }

  override def --(xs: GenTraversableOnce[Int]) = {
    val newSet = new TIntHashSet(underlying)
    xs match {
      case s: IntSet => newSet.removeAll(s.underlying)
      case other => other.foreach(newSet.remove)
    }
    new IntSet(new TUnmodifiableIntSet(newSet))
  }

  def -(elem: Int): IntSet = {
    val newSet = new TIntHashSet(underlying)
    newSet.remove(elem)
    new IntSet(new TUnmodifiableIntSet(newSet))
  }

  def contains(elem: Int): Boolean = underlying.contains(elem)

  def iterator = new collection.IntIterator(underlying.iterator)

  override def toSet[B >: Int] = this.asInstanceOf[scala.collection.immutable.Set[B]]

  override def size = underlying.size
}

object IntSet extends IntSetFactory[IntSet] {
  val empty: IntSet = new IntSet(new TUnmodifiableIntSet(new TIntHashSet(0)))
  def newBuilder: Builder[Int, IntSet] = new SetBuilder[Int, IntSet](empty)
}
