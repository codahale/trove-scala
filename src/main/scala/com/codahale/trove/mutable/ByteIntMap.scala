// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TByteIntMap
import com.codahale.trove.collection.ByteIntIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TByteIntHashMap

class ByteIntMap private(private val underlying: TByteIntMap)
  extends Map[Byte, Int]
          with MapLike[Byte, Int, ByteIntMap] {

  override def empty = ByteIntMap.empty

  def +=(kv: (Byte, Int)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: Byte) = {
    underlying.remove(key)
    this
  }

  override def update(key: Byte, value: Int) {
    underlying.put(key, value)
  }

  def get(key: Byte) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: Byte) = underlying.get(key)

  def iterator = new ByteIntIterator(underlying.iterator())

  override def size = underlying.size()
}

object ByteIntMap {
  type Coll = Map[_, _]

  def empty: ByteIntMap = new ByteIntMap(new TByteIntHashMap())

  def apply(elems: (Byte, Int)*): ByteIntMap = (newBuilder ++= elems).result

  def newBuilder = new ByteIntMapBuilder(empty)

  class ByteIntMapCanBuildFrom extends CanBuildFrom[Coll, (Byte, Int), ByteIntMap] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class ByteIntMapBuilder(map: ByteIntMap) extends Builder[(Byte, Int), ByteIntMap] {
    def +=(elem: (Byte, Int)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: Byte, value: Int) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom: CanBuildFrom[Coll, (Byte, Int), ByteIntMap] = new ByteIntMapCanBuildFrom
}
