// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TDoubleLongMap
import com.codahale.trove.collection.DoubleLongIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TDoubleLongHashMap

class DoubleLongMap private(private val underlying: TDoubleLongMap)
  extends Map[Double, Long]
          with MapLike[Double, Long, DoubleLongMap] {

  override def empty = DoubleLongMap.empty

  def +=(kv: (Double, Long)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: Double) = {
    underlying.remove(key)
    this
  }

  override def update(key: Double, value: Long) {
    underlying.put(key, value)
  }

  def get(key: Double) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: Double) = underlying.get(key)

  def iterator = new DoubleLongIterator(underlying.iterator())

  override def size = underlying.size()
}

object DoubleLongMap {
  type Coll = Map[_, _]

  def empty: DoubleLongMap = new DoubleLongMap(new TDoubleLongHashMap())

  def apply(elems: (Double, Long)*): DoubleLongMap = (newBuilder ++= elems).result

  def newBuilder = new DoubleLongMapBuilder(empty)

  class DoubleLongMapCanBuildFrom extends CanBuildFrom[Coll, (Double, Long), DoubleLongMap] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class DoubleLongMapBuilder(map: DoubleLongMap) extends Builder[(Double, Long), DoubleLongMap] {
    def +=(elem: (Double, Long)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: Double, value: Long) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom: CanBuildFrom[Coll, (Double, Long), DoubleLongMap] = new DoubleLongMapCanBuildFrom
}
