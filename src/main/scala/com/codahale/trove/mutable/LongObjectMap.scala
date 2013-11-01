// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TLongObjectMap
import com.codahale.trove.collection.LongObjectIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TLongObjectHashMap

class LongObjectMap[A] private(private val underlying: TLongObjectMap[A])
  extends Map[Long, A]
          with MapLike[Long, A, LongObjectMap[A]] {

  override def empty = LongObjectMap.empty[A]

  def +=(kv: (Long, A)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: Long) = {
    underlying.remove(key)
    this
  }

  override def update(key: Long, value: A) {
    underlying.put(key, value)
  }

  def get(key: Long) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: Long) = underlying.get(key)

  def iterator = new LongObjectIterator[A](underlying.iterator())

  override def size = underlying.size()
}

object LongObjectMap {
  type Coll = Map[_, _]

  def empty[A]: LongObjectMap[A] = new LongObjectMap[A](new TLongObjectHashMap[A]())

  def apply[A](elems: (Long, A)*): LongObjectMap[A] = (newBuilder ++= elems).result

  def newBuilder[A] = new LongObjectMapBuilder[A](empty)

  class LongObjectMapCanBuildFrom[A] extends CanBuildFrom[Coll, (Long, A), LongObjectMap[A]] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class LongObjectMapBuilder[A](map: LongObjectMap[A]) extends Builder[(Long, A), LongObjectMap[A]] {
    def +=(elem: (Long, A)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: Long, value: A) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom[A]: CanBuildFrom[Coll, (Long, A), LongObjectMap[A]] = new LongObjectMapCanBuildFrom[A]
}
