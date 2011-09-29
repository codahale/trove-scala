// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TFloatByteMap
import com.codahale.trove.collection.FloatByteIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TFloatByteHashMap

class FloatByteMap private(private val underlying: TFloatByteMap)
  extends Map[Float, Byte]
          with MapLike[Float, Byte, FloatByteMap] {

  override def empty = FloatByteMap.empty

  def +=(kv: (Float, Byte)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: Float) = {
    underlying.remove(key)
    this
  }

  override def update(key: Float, value: Byte) {
    underlying.put(key, value)
  }

  def get(key: Float) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: Float) = underlying.get(key)

  def iterator = new FloatByteIterator(underlying.iterator())

  override def size = underlying.size()
}

object FloatByteMap {
  type Coll = Map[_, _]

  def empty: FloatByteMap = new FloatByteMap(new TFloatByteHashMap())

  def apply(elems: (Float, Byte)*): FloatByteMap = (newBuilder ++= elems).result

  def newBuilder = new FloatByteMapBuilder(empty)

  class FloatByteMapCanBuildFrom extends CanBuildFrom[Coll, (Float, Byte), FloatByteMap] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class FloatByteMapBuilder(map: FloatByteMap) extends Builder[(Float, Byte), FloatByteMap] {
    def +=(elem: (Float, Byte)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: Float, value: Byte) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom: CanBuildFrom[Coll, (Float, Byte), FloatByteMap] = new FloatByteMapCanBuildFrom
}
