// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TObjectFloatMap
import com.codahale.trove.collection.ObjectFloatIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TObjectFloatHashMap

class ObjectFloatMap[A] private(private val underlying: TObjectFloatMap[A])
  extends Map[A, Float]
          with MapLike[A, Float, ObjectFloatMap[A]] {

  override def empty = ObjectFloatMap.empty[A]

  def +=(kv: (A, Float)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: A) = {
    underlying.remove(key)
    this
  }

  override def update(key: A, value: Float) {
    underlying.put(key, value)
  }

  def get(key: A) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: A) = underlying.get(key)

  def iterator = new ObjectFloatIterator[A](underlying.iterator())

  override def size = underlying.size()
}

object ObjectFloatMap {
  type Coll = Map[_, _]

  def empty[A]: ObjectFloatMap[A] = new ObjectFloatMap[A](new TObjectFloatHashMap[A]())

  def apply[A](elems: (A, Float)*): ObjectFloatMap[A] = (newBuilder ++= elems).result

  def newBuilder[A] = new ObjectFloatMapBuilder[A](empty)

  class ObjectFloatMapCanBuildFrom[A] extends CanBuildFrom[Coll, (A, Float), ObjectFloatMap[A]] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class ObjectFloatMapBuilder[A](map: ObjectFloatMap[A]) extends Builder[(A, Float), ObjectFloatMap[A]] {
    def +=(elem: (A, Float)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: A, value: Float) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom[A]: CanBuildFrom[Coll, (A, Float), ObjectFloatMap[A]] = new ObjectFloatMapCanBuildFrom[A]
}
