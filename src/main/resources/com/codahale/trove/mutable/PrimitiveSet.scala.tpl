@header@

package com.codahale.trove.mutable

import gnu.trove.set.T@type@Set
import gnu.trove.set.hash.T@type@HashSet
import scala.collection.mutable.{GrowingBuilder, Builder}
import scala.collection.generic.{CanBuildFrom}
import com.codahale.trove.collection.@type@Iterator
import com.codahale.trove.generic.@type@SetFactory

class @type@Set(private val underlying: T@type@Set)
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

  override def --=(xs: TraversableOnce[@type@]) = {
    xs match {
      case s: @type@Set => underlying.removeAll(s.underlying)
      case other => super.--=(other)
    }
    this
  }

  def +=(elem: @type@) = {
    underlying.add(elem)
    this
  }

  override def ++=(xs: TraversableOnce[@type@]) = {
    xs match {
      case s: @type@Set => underlying.addAll(s.underlying)
      case other => super.++=(other)
    }
    this
  }

  def contains(elem: @type@) = underlying.contains(elem)

  def iterator = new @type@Iterator(underlying.iterator)

  override def size = underlying.size
}


object @type@Set extends @type@SetFactory[@type@Set] {
  def empty: @type@Set = new @type@Set(new T@type@HashSet())
  def newBuilder: Builder[@type@, @type@Set] = new GrowingBuilder[@type@, @type@Set](empty)
  implicit def canBuildFrom: CanBuildFrom[@type@Set, @type@, @type@Set] = primitive@type@SetCanBuildFrom
}
