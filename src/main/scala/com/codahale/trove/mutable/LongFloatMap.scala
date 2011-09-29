// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TLongFloatMap
import com.codahale.trove.collection.LongFloatIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TLongFloatHashMap

class LongFloatMap private(private val underlying: TLongFloatMap)
  extends Map[Long, Float]
          with MapLike[Long, Float, LongFloatMap] {

  override def empty = LongFloatMap.empty

  def +=(kv: (Long, Float)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: Long) = {
    underlying.remove(key)
    this
  }

  override def update(key: Long, value: Float) {
    underlying.put(key, value)
  }

  def get(key: Long) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: Long) = underlying.get(key)

  def iterator = new LongFloatIterator(underlying.iterator())

  override def size = underlying.size()
}

object LongFloatMap {
  type Coll = Map[_, _]

  def empty: LongFloatMap = new LongFloatMap(new TLongFloatHashMap())

  def apply(elems: (Long, Float)*): LongFloatMap = (newBuilder ++= elems).result

  def newBuilder = new LongFloatMapBuilder(empty)

  class LongFloatMapCanBuildFrom extends CanBuildFrom[Coll, (Long, Float), LongFloatMap] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class LongFloatMapBuilder(map: LongFloatMap) extends Builder[(Long, Float), LongFloatMap] {
    def +=(elem: (Long, Float)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: Long, value: Float) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom: CanBuildFrom[Coll, (Long, Float), LongFloatMap] = new LongFloatMapCanBuildFrom
}
