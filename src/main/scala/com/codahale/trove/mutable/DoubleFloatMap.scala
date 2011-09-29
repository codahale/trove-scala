// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TDoubleFloatMap
import com.codahale.trove.collection.DoubleFloatIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TDoubleFloatHashMap

class DoubleFloatMap private(private val underlying: TDoubleFloatMap)
  extends Map[Double, Float]
          with MapLike[Double, Float, DoubleFloatMap] {

  override def empty = DoubleFloatMap.empty

  def +=(kv: (Double, Float)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: Double) = {
    underlying.remove(key)
    this
  }

  override def update(key: Double, value: Float) {
    underlying.put(key, value)
  }

  def get(key: Double) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: Double) = underlying.get(key)

  def iterator = new DoubleFloatIterator(underlying.iterator())

  override def size = underlying.size()
}

object DoubleFloatMap {
  type Coll = Map[_, _]

  def empty: DoubleFloatMap = new DoubleFloatMap(new TDoubleFloatHashMap())

  def apply(elems: (Double, Float)*): DoubleFloatMap = (newBuilder ++= elems).result

  def newBuilder = new DoubleFloatMapBuilder(empty)

  class DoubleFloatMapCanBuildFrom extends CanBuildFrom[Coll, (Double, Float), DoubleFloatMap] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class DoubleFloatMapBuilder(map: DoubleFloatMap) extends Builder[(Double, Float), DoubleFloatMap] {
    def +=(elem: (Double, Float)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: Double, value: Float) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom: CanBuildFrom[Coll, (Double, Float), DoubleFloatMap] = new DoubleFloatMapCanBuildFrom
}
