// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TLongByteMap
import com.codahale.trove.collection.LongByteIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TLongByteHashMap

class LongByteMap private(private val underlying: TLongByteMap)
  extends Map[Long, Byte]
          with MapLike[Long, Byte, LongByteMap] {

  override def empty = LongByteMap.empty

  def +=(kv: (Long, Byte)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: Long) = {
    underlying.remove(key)
    this
  }

  override def update(key: Long, value: Byte) {
    underlying.put(key, value)
  }

  def get(key: Long) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: Long) = underlying.get(key)

  def iterator = new LongByteIterator(underlying.iterator())

  override def size = underlying.size()
}

object LongByteMap {
  type Coll = Map[_, _]

  def empty: LongByteMap = new LongByteMap(new TLongByteHashMap())

  def apply(elems: (Long, Byte)*): LongByteMap = (newBuilder ++= elems).result

  def newBuilder = new LongByteMapBuilder(empty)

  class LongByteMapCanBuildFrom extends CanBuildFrom[Coll, (Long, Byte), LongByteMap] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class LongByteMapBuilder(map: LongByteMap) extends Builder[(Long, Byte), LongByteMap] {
    def +=(elem: (Long, Byte)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: Long, value: Byte) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom: CanBuildFrom[Coll, (Long, Byte), LongByteMap] = new LongByteMapCanBuildFrom
}
