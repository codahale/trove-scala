package com.codahale.trove.immutable

import com.codahale.trove.collection
import com.codahale.trove.generic.{@type@SetFactory, @type@Iterator}
import gnu.trove.impl.unmodifiable.TUnmodifiable@type@Set
import scala.collection.mutable.{SetBuilder, Builder}
import gnu.trove.set.hash.T@type@HashSet

class @type@Set(val underlying: TUnmodifiable@type@Set) extends scala.collection.immutable.Set[@type@]
                      with collection.@type@Set
                      with collection.@type@SetLike[@type@Set]
                      with Serializable {
  override def empty: @type@Set = @type@Set.empty

  def +(elem: @type@): @type@Set = {
    val newSet = new T@type@HashSet(underlying)
    newSet.add(elem)
    new @type@Set(new TUnmodifiable@type@Set(newSet))
  }

  def -(elem: @type@): @type@Set = {
    val newSet = new T@type@HashSet(underlying)
    newSet.remove(elem)
    new @type@Set(new TUnmodifiable@type@Set(newSet))
  }

  def contains(elem: @type@): Boolean = underlying.contains(elem)

  def iterator = new @type@Iterator(underlying.iterator)
}

object @type@Set extends @type@SetFactory[@type@Set] {
  val empty: @type@Set = new @type@Set(new TUnmodifiable@type@Set(new T@type@HashSet(0)))
  def newBuilder: Builder[@type@, @type@Set] = new SetBuilder[@type@, @type@Set](empty)
}
