// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TObjectIntMap
import com.codahale.trove.collection.ObjectIntIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TObjectIntHashMap

class ObjectIntMap[A] private(private val underlying: TObjectIntMap[A])
  extends Map[A, Int]
          with MapLike[A, Int, ObjectIntMap[A]] {

  override def empty = ObjectIntMap.empty[A]

  def +=(kv: (A, Int)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: A) = {
    underlying.remove(key)
    this
  }

  override def update(key: A, value: Int) {
    underlying.put(key, value)
  }

  def get(key: A) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: A) = underlying.get(key)

  def iterator = new ObjectIntIterator[A](underlying.iterator())

  override def size = underlying.size()
}

object ObjectIntMap {
  type Coll = Map[_, _]

  def empty[A]: ObjectIntMap[A] = new ObjectIntMap[A](new TObjectIntHashMap[A]())

  def apply[A](elems: (A, Int)*): ObjectIntMap[A] = (newBuilder ++= elems).result

  def newBuilder[A] = new ObjectIntMapBuilder[A](empty)

  class ObjectIntMapCanBuildFrom[A] extends CanBuildFrom[Coll, (A, Int), ObjectIntMap[A]] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class ObjectIntMapBuilder[A](map: ObjectIntMap[A]) extends Builder[(A, Int), ObjectIntMap[A]] {
    def +=(elem: (A, Int)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: A, value: Int) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom[A]: CanBuildFrom[Coll, (A, Int), ObjectIntMap[A]] = new ObjectIntMapCanBuildFrom[A]
}
