// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TObjectDoubleMap
import com.codahale.trove.collection.ObjectDoubleIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TObjectDoubleHashMap

class ObjectDoubleMap[A] private(private val underlying: TObjectDoubleMap[A])
  extends Map[A, Double]
          with MapLike[A, Double, ObjectDoubleMap[A]] {

  override def empty = ObjectDoubleMap.empty[A]

  def +=(kv: (A, Double)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: A) = {
    underlying.remove(key)
    this
  }

  override def update(key: A, value: Double) {
    underlying.put(key, value)
  }

  def get(key: A) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: A) = underlying.get(key)

  def iterator = new ObjectDoubleIterator[A](underlying.iterator())

  override def size = underlying.size()
}

object ObjectDoubleMap {
  type Coll = Map[_, _]

  def empty[A]: ObjectDoubleMap[A] = new ObjectDoubleMap[A](new TObjectDoubleHashMap[A]())

  def apply[A](elems: (A, Double)*): ObjectDoubleMap[A] = (newBuilder ++= elems).result

  def newBuilder[A] = new ObjectDoubleMapBuilder[A](empty)

  class ObjectDoubleMapCanBuildFrom[A] extends CanBuildFrom[Coll, (A, Double), ObjectDoubleMap[A]] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class ObjectDoubleMapBuilder[A](map: ObjectDoubleMap[A]) extends Builder[(A, Double), ObjectDoubleMap[A]] {
    def +=(elem: (A, Double)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: A, value: Double) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom[A]: CanBuildFrom[Coll, (A, Double), ObjectDoubleMap[A]] = new ObjectDoubleMapCanBuildFrom[A]
}
