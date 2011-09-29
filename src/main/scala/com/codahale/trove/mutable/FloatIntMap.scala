// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TFloatIntMap
import com.codahale.trove.collection.FloatIntIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TFloatIntHashMap

class FloatIntMap private(private val underlying: TFloatIntMap)
  extends Map[Float, Int]
          with MapLike[Float, Int, FloatIntMap] {

  override def empty = FloatIntMap.empty

  def +=(kv: (Float, Int)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: Float) = {
    underlying.remove(key)
    this
  }

  override def update(key: Float, value: Int) {
    underlying.put(key, value)
  }

  def get(key: Float) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: Float) = underlying.get(key)

  def iterator = new FloatIntIterator(underlying.iterator())

  override def size = underlying.size()
}

object FloatIntMap {
  type Coll = Map[_, _]

  def empty: FloatIntMap = new FloatIntMap(new TFloatIntHashMap())

  def apply(elems: (Float, Int)*): FloatIntMap = (newBuilder ++= elems).result

  def newBuilder = new FloatIntMapBuilder(empty)

  class FloatIntMapCanBuildFrom extends CanBuildFrom[Coll, (Float, Int), FloatIntMap] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class FloatIntMapBuilder(map: FloatIntMap) extends Builder[(Float, Int), FloatIntMap] {
    def +=(elem: (Float, Int)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: Float, value: Int) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom: CanBuildFrom[Coll, (Float, Int), FloatIntMap] = new FloatIntMapCanBuildFrom
}
