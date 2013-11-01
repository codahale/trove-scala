// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TObjectCharMap
import com.codahale.trove.collection.ObjectCharIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TObjectCharHashMap

class ObjectCharMap[A] private(private val underlying: TObjectCharMap[A])
  extends Map[A, Char]
          with MapLike[A, Char, ObjectCharMap[A]] {

  override def empty = ObjectCharMap.empty[A]

  def +=(kv: (A, Char)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: A) = {
    underlying.remove(key)
    this
  }

  override def update(key: A, value: Char) {
    underlying.put(key, value)
  }

  def get(key: A) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: A) = underlying.get(key)

  def iterator = new ObjectCharIterator[A](underlying.iterator())

  override def size = underlying.size()
}

object ObjectCharMap {
  type Coll = Map[_, _]

  def empty[A]: ObjectCharMap[A] = new ObjectCharMap[A](new TObjectCharHashMap[A]())

  def apply[A](elems: (A, Char)*): ObjectCharMap[A] = (newBuilder ++= elems).result

  def newBuilder[A] = new ObjectCharMapBuilder[A](empty)

  class ObjectCharMapCanBuildFrom[A] extends CanBuildFrom[Coll, (A, Char), ObjectCharMap[A]] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class ObjectCharMapBuilder[A](map: ObjectCharMap[A]) extends Builder[(A, Char), ObjectCharMap[A]] {
    def +=(elem: (A, Char)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: A, value: Char) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom[A]: CanBuildFrom[Coll, (A, Char), ObjectCharMap[A]] = new ObjectCharMapCanBuildFrom[A]
}
