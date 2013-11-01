// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TDoubleObjectMap
import com.codahale.trove.collection.DoubleObjectIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TDoubleObjectHashMap

class DoubleObjectMap[A] private(private val underlying: TDoubleObjectMap[A])
  extends Map[Double, A]
          with MapLike[Double, A, DoubleObjectMap[A]] {

  override def empty = DoubleObjectMap.empty[A]

  def +=(kv: (Double, A)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: Double) = {
    underlying.remove(key)
    this
  }

  override def update(key: Double, value: A) {
    underlying.put(key, value)
  }

  def get(key: Double) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: Double) = underlying.get(key)

  def iterator = new DoubleObjectIterator[A](underlying.iterator())

  override def size = underlying.size()
}

object DoubleObjectMap {
  type Coll = Map[_, _]

  def empty[A]: DoubleObjectMap[A] = new DoubleObjectMap[A](new TDoubleObjectHashMap[A]())

  def apply[A](elems: (Double, A)*): DoubleObjectMap[A] = (newBuilder ++= elems).result

  def newBuilder[A] = new DoubleObjectMapBuilder[A](empty)

  class DoubleObjectMapCanBuildFrom[A] extends CanBuildFrom[Coll, (Double, A), DoubleObjectMap[A]] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class DoubleObjectMapBuilder[A](map: DoubleObjectMap[A]) extends Builder[(Double, A), DoubleObjectMap[A]] {
    def +=(elem: (Double, A)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: Double, value: A) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom[A]: CanBuildFrom[Coll, (Double, A), DoubleObjectMap[A]] = new DoubleObjectMapCanBuildFrom[A]
}
