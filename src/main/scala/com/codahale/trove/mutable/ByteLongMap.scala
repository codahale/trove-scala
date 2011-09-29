// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TByteLongMap
import com.codahale.trove.collection.ByteLongIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TByteLongHashMap

class ByteLongMap private(private val underlying: TByteLongMap)
  extends Map[Byte, Long]
          with MapLike[Byte, Long, ByteLongMap] {

  override def empty = ByteLongMap.empty

  def +=(kv: (Byte, Long)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: Byte) = {
    underlying.remove(key)
    this
  }

  override def update(key: Byte, value: Long) {
    underlying.put(key, value)
  }

  def get(key: Byte) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: Byte) = underlying.get(key)

  def iterator = new ByteLongIterator(underlying.iterator())

  override def size = underlying.size()
}

object ByteLongMap {
  type Coll = Map[_, _]

  def empty: ByteLongMap = new ByteLongMap(new TByteLongHashMap())

  def apply(elems: (Byte, Long)*): ByteLongMap = (newBuilder ++= elems).result

  def newBuilder = new ByteLongMapBuilder(empty)

  class ByteLongMapCanBuildFrom extends CanBuildFrom[Coll, (Byte, Long), ByteLongMap] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class ByteLongMapBuilder(map: ByteLongMap) extends Builder[(Byte, Long), ByteLongMap] {
    def +=(elem: (Byte, Long)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: Byte, value: Long) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom: CanBuildFrom[Coll, (Byte, Long), ByteLongMap] = new ByteLongMapCanBuildFrom
}
