package com.codahale.trove.mutable

import gnu.trove.set.T@type@Set
import gnu.trove.set.hash.T@type@HashSet
import scala.collection.mutable.{GrowingBuilder, Builder}
import scala.collection.generic.{CanBuildFrom}
import com.codahale.trove.generic.{@type@SetFactory, @type@Iterator}

class @type@Set(private[this] val underlying: T@type@Set)
  extends scala.collection.mutable.Set[@type@]
          with com.codahale.trove.collection.@type@Set
          with com.codahale.trove.collection.@type@SetLike[@type@Set]
          with scala.collection.mutable.SetLike[@type@, @type@Set]
          with Serializable {

  override def empty = @type@Set.empty

  def -=(elem: @type@) = {
    underlying.remove(elem)
    this
  }

  def +=(elem: @type@) = {
    underlying.add(elem)
    this
  }

  def contains(elem: @type@) = underlying.contains(elem)

  def iterator = new @type@Iterator(underlying.iterator)
}


object @type@Set extends @type@SetFactory[@type@Set] {
  def empty: @type@Set = new @type@Set(new T@type@HashSet())
  def newBuilder: Builder[@type@, @type@Set] = new GrowingBuilder[@type@, @type@Set](empty)
  implicit def canBuildFrom: CanBuildFrom[@type@Set, @type@, @type@Set] = @lowercaseType@setCanBuildFrom
}
