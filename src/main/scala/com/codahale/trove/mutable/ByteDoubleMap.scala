// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TByteDoubleMap
import com.codahale.trove.collection.ByteDoubleIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TByteDoubleHashMap

class ByteDoubleMap private(private val underlying: TByteDoubleMap)
  extends Map[Byte, Double]
          with MapLike[Byte, Double, ByteDoubleMap] {

  override def empty = ByteDoubleMap.empty

  def +=(kv: (Byte, Double)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: Byte) = {
    underlying.remove(key)
    this
  }

  override def update(key: Byte, value: Double) {
    underlying.put(key, value)
  }

  def get(key: Byte) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: Byte) = underlying.get(key)

  def iterator = new ByteDoubleIterator(underlying.iterator())

  override def size = underlying.size()
}

object ByteDoubleMap {
  type Coll = Map[_, _]

  def empty: ByteDoubleMap = new ByteDoubleMap(new TByteDoubleHashMap())

  def apply(elems: (Byte, Double)*): ByteDoubleMap = (newBuilder ++= elems).result

  def newBuilder = new ByteDoubleMapBuilder(empty)

  class ByteDoubleMapCanBuildFrom extends CanBuildFrom[Coll, (Byte, Double), ByteDoubleMap] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class ByteDoubleMapBuilder(map: ByteDoubleMap) extends Builder[(Byte, Double), ByteDoubleMap] {
    def +=(elem: (Byte, Double)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: Byte, value: Double) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom: CanBuildFrom[Coll, (Byte, Double), ByteDoubleMap] = new ByteDoubleMapCanBuildFrom
}
