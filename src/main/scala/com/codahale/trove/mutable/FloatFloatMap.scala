// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TFloatFloatMap
import com.codahale.trove.collection.FloatFloatIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TFloatFloatHashMap

class FloatFloatMap private(private val underlying: TFloatFloatMap)
  extends Map[Float, Float]
          with MapLike[Float, Float, FloatFloatMap] {

  override def empty = FloatFloatMap.empty

  def +=(kv: (Float, Float)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: Float) = {
    underlying.remove(key)
    this
  }

  override def update(key: Float, value: Float) {
    underlying.put(key, value)
  }

  def get(key: Float) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: Float) = underlying.get(key)

  def iterator = new FloatFloatIterator(underlying.iterator())

  override def size = underlying.size()
}

object FloatFloatMap {
  type Coll = Map[_, _]

  def empty: FloatFloatMap = new FloatFloatMap(new TFloatFloatHashMap())

  def apply(elems: (Float, Float)*): FloatFloatMap = (newBuilder ++= elems).result

  def newBuilder = new FloatFloatMapBuilder(empty)

  class FloatFloatMapCanBuildFrom extends CanBuildFrom[Coll, (Float, Float), FloatFloatMap] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class FloatFloatMapBuilder(map: FloatFloatMap) extends Builder[(Float, Float), FloatFloatMap] {
    def +=(elem: (Float, Float)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: Float, value: Float) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom: CanBuildFrom[Coll, (Float, Float), FloatFloatMap] = new FloatFloatMapCanBuildFrom
}
