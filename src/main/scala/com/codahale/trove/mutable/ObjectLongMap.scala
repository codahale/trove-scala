// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TObjectLongMap
import com.codahale.trove.collection.ObjectLongIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TObjectLongHashMap

class ObjectLongMap[A] private(private val underlying: TObjectLongMap[A])
  extends Map[A, Long]
          with MapLike[A, Long, ObjectLongMap[A]] {

  override def empty = ObjectLongMap.empty[A]

  def +=(kv: (A, Long)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: A) = {
    underlying.remove(key)
    this
  }

  override def update(key: A, value: Long) {
    underlying.put(key, value)
  }

  def get(key: A) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: A) = underlying.get(key)

  def iterator = new ObjectLongIterator[A](underlying.iterator())

  override def size = underlying.size()
}

object ObjectLongMap {
  type Coll = Map[_, _]

  def empty[A]: ObjectLongMap[A] = new ObjectLongMap[A](new TObjectLongHashMap[A]())

  def apply[A](elems: (A, Long)*): ObjectLongMap[A] = (newBuilder ++= elems).result

  def newBuilder[A] = new ObjectLongMapBuilder[A](empty)

  class ObjectLongMapCanBuildFrom[A] extends CanBuildFrom[Coll, (A, Long), ObjectLongMap[A]] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class ObjectLongMapBuilder[A](map: ObjectLongMap[A]) extends Builder[(A, Long), ObjectLongMap[A]] {
    def +=(elem: (A, Long)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: A, value: Long) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom[A]: CanBuildFrom[Coll, (A, Long), ObjectLongMap[A]] = new ObjectLongMapCanBuildFrom[A]
}
