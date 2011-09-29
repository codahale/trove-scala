// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TLongIntMap
import com.codahale.trove.collection.LongIntIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TLongIntHashMap

class LongIntMap private(private val underlying: TLongIntMap)
  extends Map[Long, Int]
          with MapLike[Long, Int, LongIntMap] {

  override def empty = LongIntMap.empty

  def +=(kv: (Long, Int)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: Long) = {
    underlying.remove(key)
    this
  }

  override def update(key: Long, value: Int) {
    underlying.put(key, value)
  }

  def get(key: Long) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: Long) = underlying.get(key)

  def iterator = new LongIntIterator(underlying.iterator())

  override def size = underlying.size()
}

object LongIntMap {
  type Coll = Map[_, _]

  def empty: LongIntMap = new LongIntMap(new TLongIntHashMap())

  def apply(elems: (Long, Int)*): LongIntMap = (newBuilder ++= elems).result

  def newBuilder = new LongIntMapBuilder(empty)

  class LongIntMapCanBuildFrom extends CanBuildFrom[Coll, (Long, Int), LongIntMap] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class LongIntMapBuilder(map: LongIntMap) extends Builder[(Long, Int), LongIntMap] {
    def +=(elem: (Long, Int)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: Long, value: Int) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom: CanBuildFrom[Coll, (Long, Int), LongIntMap] = new LongIntMapCanBuildFrom
}
