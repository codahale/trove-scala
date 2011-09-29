// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TFloatLongMap
import com.codahale.trove.collection.FloatLongIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TFloatLongHashMap

class FloatLongMap private(private val underlying: TFloatLongMap)
  extends Map[Float, Long]
          with MapLike[Float, Long, FloatLongMap] {

  override def empty = FloatLongMap.empty

  def +=(kv: (Float, Long)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: Float) = {
    underlying.remove(key)
    this
  }

  override def update(key: Float, value: Long) {
    underlying.put(key, value)
  }

  def get(key: Float) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: Float) = underlying.get(key)

  def iterator = new FloatLongIterator(underlying.iterator())

  override def size = underlying.size()
}

object FloatLongMap {
  type Coll = Map[_, _]

  def empty: FloatLongMap = new FloatLongMap(new TFloatLongHashMap())

  def apply(elems: (Float, Long)*): FloatLongMap = (newBuilder ++= elems).result

  def newBuilder = new FloatLongMapBuilder(empty)

  class FloatLongMapCanBuildFrom extends CanBuildFrom[Coll, (Float, Long), FloatLongMap] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class FloatLongMapBuilder(map: FloatLongMap) extends Builder[(Float, Long), FloatLongMap] {
    def +=(elem: (Float, Long)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: Float, value: Long) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom: CanBuildFrom[Coll, (Float, Long), FloatLongMap] = new FloatLongMapCanBuildFrom
}
