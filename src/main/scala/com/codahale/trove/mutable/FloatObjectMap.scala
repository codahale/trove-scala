// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TFloatObjectMap
import com.codahale.trove.collection.FloatObjectIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TFloatObjectHashMap

class FloatObjectMap[A] private(private val underlying: TFloatObjectMap[A])
  extends Map[Float, A]
          with MapLike[Float, A, FloatObjectMap[A]] {

  override def empty = FloatObjectMap.empty[A]

  def +=(kv: (Float, A)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: Float) = {
    underlying.remove(key)
    this
  }

  override def update(key: Float, value: A) {
    underlying.put(key, value)
  }

  def get(key: Float) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: Float) = underlying.get(key)

  def iterator = new FloatObjectIterator[A](underlying.iterator())

  override def size = underlying.size()
}

object FloatObjectMap {
  type Coll = Map[_, _]

  def empty[A]: FloatObjectMap[A] = new FloatObjectMap[A](new TFloatObjectHashMap[A]())

  def apply[A](elems: (Float, A)*): FloatObjectMap[A] = (newBuilder ++= elems).result

  def newBuilder[A] = new FloatObjectMapBuilder[A](empty)

  class FloatObjectMapCanBuildFrom[A] extends CanBuildFrom[Coll, (Float, A), FloatObjectMap[A]] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class FloatObjectMapBuilder[A](map: FloatObjectMap[A]) extends Builder[(Float, A), FloatObjectMap[A]] {
    def +=(elem: (Float, A)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: Float, value: A) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom[A]: CanBuildFrom[Coll, (Float, A), FloatObjectMap[A]] = new FloatObjectMapCanBuildFrom[A]
}
