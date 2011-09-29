// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TDoubleIntMap
import com.codahale.trove.collection.DoubleIntIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TDoubleIntHashMap

class DoubleIntMap private(private val underlying: TDoubleIntMap)
  extends Map[Double, Int]
          with MapLike[Double, Int, DoubleIntMap] {

  override def empty = DoubleIntMap.empty

  def +=(kv: (Double, Int)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: Double) = {
    underlying.remove(key)
    this
  }

  override def update(key: Double, value: Int) {
    underlying.put(key, value)
  }

  def get(key: Double) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: Double) = underlying.get(key)

  def iterator = new DoubleIntIterator(underlying.iterator())

  override def size = underlying.size()
}

object DoubleIntMap {
  type Coll = Map[_, _]

  def empty: DoubleIntMap = new DoubleIntMap(new TDoubleIntHashMap())

  def apply(elems: (Double, Int)*): DoubleIntMap = (newBuilder ++= elems).result

  def newBuilder = new DoubleIntMapBuilder(empty)

  class DoubleIntMapCanBuildFrom extends CanBuildFrom[Coll, (Double, Int), DoubleIntMap] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class DoubleIntMapBuilder(map: DoubleIntMap) extends Builder[(Double, Int), DoubleIntMap] {
    def +=(elem: (Double, Int)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: Double, value: Int) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom: CanBuildFrom[Coll, (Double, Int), DoubleIntMap] = new DoubleIntMapCanBuildFrom
}
