// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TDoubleByteMap
import com.codahale.trove.collection.DoubleByteIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TDoubleByteHashMap

class DoubleByteMap private(private val underlying: TDoubleByteMap)
  extends Map[Double, Byte]
          with MapLike[Double, Byte, DoubleByteMap] {

  override def empty = DoubleByteMap.empty

  def +=(kv: (Double, Byte)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: Double) = {
    underlying.remove(key)
    this
  }

  override def update(key: Double, value: Byte) {
    underlying.put(key, value)
  }

  def get(key: Double) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: Double) = underlying.get(key)

  def iterator = new DoubleByteIterator(underlying.iterator())

  override def size = underlying.size()
}

object DoubleByteMap {
  type Coll = Map[_, _]

  def empty: DoubleByteMap = new DoubleByteMap(new TDoubleByteHashMap())

  def apply(elems: (Double, Byte)*): DoubleByteMap = (newBuilder ++= elems).result

  def newBuilder = new DoubleByteMapBuilder(empty)

  class DoubleByteMapCanBuildFrom extends CanBuildFrom[Coll, (Double, Byte), DoubleByteMap] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class DoubleByteMapBuilder(map: DoubleByteMap) extends Builder[(Double, Byte), DoubleByteMap] {
    def +=(elem: (Double, Byte)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: Double, value: Byte) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom: CanBuildFrom[Coll, (Double, Byte), DoubleByteMap] = new DoubleByteMapCanBuildFrom
}
