@header@

package com.codahale.trove.mutable

import gnu.trove.map.T@keyType@ObjectMap
import com.codahale.trove.collection.@keyType@ObjectIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.T@keyType@ObjectHashMap

class @keyType@ObjectMap[A] private(private val underlying: T@keyType@ObjectMap[A])
  extends Map[@keyType@, A]
          with MapLike[@keyType@, A, @keyType@ObjectMap[A]] {

  override def empty = @keyType@ObjectMap.empty[A]

  def +=(kv: (@keyType@, A)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: @keyType@) = {
    underlying.remove(key)
    this
  }

  override def update(key: @keyType@, value: A) {
    underlying.put(key, value)
  }

  def get(key: @keyType@) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: @keyType@) = underlying.get(key)

  def iterator = new @keyType@ObjectIterator[A](underlying.iterator())

  override def size = underlying.size()
}

object @keyType@ObjectMap {
  type Coll = Map[_, _]

  def empty[A]: @keyType@ObjectMap[A] = new @keyType@ObjectMap[A](new T@keyType@ObjectHashMap[A]())

  def apply[A](elems: (@keyType@, A)*): @keyType@ObjectMap[A] = (newBuilder ++= elems).result

  def newBuilder[A] = new @keyType@ObjectMapBuilder[A](empty)

  class @keyType@ObjectMapCanBuildFrom[A] extends CanBuildFrom[Coll, (@keyType@, A), @keyType@ObjectMap[A]] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class @keyType@ObjectMapBuilder[A](map: @keyType@ObjectMap[A]) extends Builder[(@keyType@, A), @keyType@ObjectMap[A]] {
    def +=(elem: (@keyType@, A)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: @keyType@, value: A) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom[A]: CanBuildFrom[Coll, (@keyType@, A), @keyType@ObjectMap[A]] = new @keyType@ObjectMapCanBuildFrom[A]
}
