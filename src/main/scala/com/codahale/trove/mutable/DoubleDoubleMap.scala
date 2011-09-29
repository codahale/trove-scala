// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TDoubleDoubleMap
import com.codahale.trove.collection.DoubleDoubleIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TDoubleDoubleHashMap

class DoubleDoubleMap private(private val underlying: TDoubleDoubleMap)
  extends Map[Double, Double]
          with MapLike[Double, Double, DoubleDoubleMap] {

  override def empty = DoubleDoubleMap.empty

  def +=(kv: (Double, Double)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: Double) = {
    underlying.remove(key)
    this
  }

  override def update(key: Double, value: Double) {
    underlying.put(key, value)
  }

  def get(key: Double) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: Double) = underlying.get(key)

  def iterator = new DoubleDoubleIterator(underlying.iterator())

  override def size = underlying.size()
}

object DoubleDoubleMap {
  type Coll = Map[_, _]

  def empty: DoubleDoubleMap = new DoubleDoubleMap(new TDoubleDoubleHashMap())

  def apply(elems: (Double, Double)*): DoubleDoubleMap = (newBuilder ++= elems).result

  def newBuilder = new DoubleDoubleMapBuilder(empty)

  class DoubleDoubleMapCanBuildFrom extends CanBuildFrom[Coll, (Double, Double), DoubleDoubleMap] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class DoubleDoubleMapBuilder(map: DoubleDoubleMap) extends Builder[(Double, Double), DoubleDoubleMap] {
    def +=(elem: (Double, Double)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: Double, value: Double) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom: CanBuildFrom[Coll, (Double, Double), DoubleDoubleMap] = new DoubleDoubleMapCanBuildFrom
}
