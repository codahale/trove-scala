// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TFloatDoubleMap
import com.codahale.trove.collection.FloatDoubleIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TFloatDoubleHashMap

class FloatDoubleMap private(private val underlying: TFloatDoubleMap)
  extends Map[Float, Double]
          with MapLike[Float, Double, FloatDoubleMap] {

  override def empty = FloatDoubleMap.empty

  def +=(kv: (Float, Double)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: Float) = {
    underlying.remove(key)
    this
  }

  override def update(key: Float, value: Double) {
    underlying.put(key, value)
  }

  def get(key: Float) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: Float) = underlying.get(key)

  def iterator = new FloatDoubleIterator(underlying.iterator())

  override def size = underlying.size()
}

object FloatDoubleMap {
  type Coll = Map[_, _]

  def empty: FloatDoubleMap = new FloatDoubleMap(new TFloatDoubleHashMap())

  def apply(elems: (Float, Double)*): FloatDoubleMap = (newBuilder ++= elems).result

  def newBuilder = new FloatDoubleMapBuilder(empty)

  class FloatDoubleMapCanBuildFrom extends CanBuildFrom[Coll, (Float, Double), FloatDoubleMap] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class FloatDoubleMapBuilder(map: FloatDoubleMap) extends Builder[(Float, Double), FloatDoubleMap] {
    def +=(elem: (Float, Double)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: Float, value: Double) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom: CanBuildFrom[Coll, (Float, Double), FloatDoubleMap] = new FloatDoubleMapCanBuildFrom
}
