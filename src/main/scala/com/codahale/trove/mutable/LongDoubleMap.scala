// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TLongDoubleMap
import com.codahale.trove.collection.LongDoubleIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TLongDoubleHashMap

class LongDoubleMap private(private val underlying: TLongDoubleMap)
  extends Map[Long, Double]
          with MapLike[Long, Double, LongDoubleMap] {

  override def empty = LongDoubleMap.empty

  def +=(kv: (Long, Double)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: Long) = {
    underlying.remove(key)
    this
  }

  override def update(key: Long, value: Double) {
    underlying.put(key, value)
  }

  def get(key: Long) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: Long) = underlying.get(key)

  def iterator = new LongDoubleIterator(underlying.iterator())

  override def size = underlying.size()
}

object LongDoubleMap {
  type Coll = Map[_, _]

  def empty: LongDoubleMap = new LongDoubleMap(new TLongDoubleHashMap())

  def apply(elems: (Long, Double)*): LongDoubleMap = (newBuilder ++= elems).result

  def newBuilder = new LongDoubleMapBuilder(empty)

  class LongDoubleMapCanBuildFrom extends CanBuildFrom[Coll, (Long, Double), LongDoubleMap] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class LongDoubleMapBuilder(map: LongDoubleMap) extends Builder[(Long, Double), LongDoubleMap] {
    def +=(elem: (Long, Double)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: Long, value: Double) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom: CanBuildFrom[Coll, (Long, Double), LongDoubleMap] = new LongDoubleMapCanBuildFrom
}
