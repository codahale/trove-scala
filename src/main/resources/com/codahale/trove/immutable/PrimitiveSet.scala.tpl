@header@

package com.codahale.trove.immutable

import com.codahale.trove.collection
import com.codahale.trove.generic.@type@SetFactory
import gnu.trove.impl.unmodifiable.TUnmodifiable@type@Set
import scala.collection.mutable.{SetBuilder, Builder}
import scala.collection.GenTraversableOnce
import gnu.trove.set.hash.T@type@HashSet

class @type@Set(private val underlying: TUnmodifiable@type@Set)
  extends scala.collection.immutable.Set[@type@]
          with collection.@type@Set
          with collection.@type@SetLike[@type@Set]
          with Serializable {
  override def empty: @type@Set = @type@Set.empty

  override def ++(xs: GenTraversableOnce[@type@]) = {
    val newSet = new T@type@HashSet(underlying)
    xs match {
      case s: @type@Set => newSet.addAll(s.underlying)
      case other => other.foreach(newSet.add)
    }
    new @type@Set(new TUnmodifiable@type@Set(newSet))
  }

  def +(elem: @type@): @type@Set = {
    val newSet = new T@type@HashSet(underlying)
    newSet.add(elem)
    new @type@Set(new TUnmodifiable@type@Set(newSet))
  }

  override def --(xs: GenTraversableOnce[@type@]) = {
    val newSet = new T@type@HashSet(underlying)
    xs match {
      case s: @type@Set => newSet.removeAll(s.underlying)
      case other => other.foreach(newSet.remove)
    }
    new @type@Set(new TUnmodifiable@type@Set(newSet))
  }

  def -(elem: @type@): @type@Set = {
    val newSet = new T@type@HashSet(underlying)
    newSet.remove(elem)
    new @type@Set(new TUnmodifiable@type@Set(newSet))
  }

  def contains(elem: @type@): Boolean = underlying.contains(elem)

  def iterator = new collection.@type@Iterator(underlying.iterator)

  override def toSet[B >: @type@] = this.asInstanceOf[scala.collection.immutable.Set[B]]

  override def size = underlying.size
}

object @type@Set extends @type@SetFactory[@type@Set] {
  val empty: @type@Set = new @type@Set(new TUnmodifiable@type@Set(new T@type@HashSet(0)))
  def newBuilder: Builder[@type@, @type@Set] = new SetBuilder[@type@, @type@Set](empty)
}
