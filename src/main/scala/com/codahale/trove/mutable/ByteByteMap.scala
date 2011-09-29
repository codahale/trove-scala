// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TByteByteMap
import com.codahale.trove.collection.ByteByteIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TByteByteHashMap

class ByteByteMap private(private val underlying: TByteByteMap)
  extends Map[Byte, Byte]
          with MapLike[Byte, Byte, ByteByteMap] {

  override def empty = ByteByteMap.empty

  def +=(kv: (Byte, Byte)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: Byte) = {
    underlying.remove(key)
    this
  }

  override def update(key: Byte, value: Byte) {
    underlying.put(key, value)
  }

  def get(key: Byte) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: Byte) = underlying.get(key)

  def iterator = new ByteByteIterator(underlying.iterator())

  override def size = underlying.size()
}

object ByteByteMap {
  type Coll = Map[_, _]

  def empty: ByteByteMap = new ByteByteMap(new TByteByteHashMap())

  def apply(elems: (Byte, Byte)*): ByteByteMap = (newBuilder ++= elems).result

  def newBuilder = new ByteByteMapBuilder(empty)

  class ByteByteMapCanBuildFrom extends CanBuildFrom[Coll, (Byte, Byte), ByteByteMap] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class ByteByteMapBuilder(map: ByteByteMap) extends Builder[(Byte, Byte), ByteByteMap] {
    def +=(elem: (Byte, Byte)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: Byte, value: Byte) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom: CanBuildFrom[Coll, (Byte, Byte), ByteByteMap] = new ByteByteMapCanBuildFrom
}
