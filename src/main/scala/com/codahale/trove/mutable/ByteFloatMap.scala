// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TByteFloatMap
import com.codahale.trove.collection.ByteFloatIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TByteFloatHashMap

class ByteFloatMap private(private val underlying: TByteFloatMap)
  extends Map[Byte, Float]
          with MapLike[Byte, Float, ByteFloatMap] {

  override def empty = ByteFloatMap.empty

  def +=(kv: (Byte, Float)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: Byte) = {
    underlying.remove(key)
    this
  }

  override def update(key: Byte, value: Float) {
    underlying.put(key, value)
  }

  def get(key: Byte) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: Byte) = underlying.get(key)

  def iterator = new ByteFloatIterator(underlying.iterator())

  override def size = underlying.size()
}

object ByteFloatMap {
  type Coll = Map[_, _]

  def empty: ByteFloatMap = new ByteFloatMap(new TByteFloatHashMap())

  def apply(elems: (Byte, Float)*): ByteFloatMap = (newBuilder ++= elems).result

  def newBuilder = new ByteFloatMapBuilder(empty)

  class ByteFloatMapCanBuildFrom extends CanBuildFrom[Coll, (Byte, Float), ByteFloatMap] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class ByteFloatMapBuilder(map: ByteFloatMap) extends Builder[(Byte, Float), ByteFloatMap] {
    def +=(elem: (Byte, Float)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: Byte, value: Float) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom: CanBuildFrom[Coll, (Byte, Float), ByteFloatMap] = new ByteFloatMapCanBuildFrom
}
