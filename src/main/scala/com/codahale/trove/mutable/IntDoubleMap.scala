// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TIntDoubleMap
import com.codahale.trove.collection.IntDoubleIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TIntDoubleHashMap

class IntDoubleMap private(private val underlying: TIntDoubleMap)
  extends Map[Int, Double]
          with MapLike[Int, Double, IntDoubleMap] {

  override def empty = IntDoubleMap.empty

  def +=(kv: (Int, Double)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: Int) = {
    underlying.remove(key)
    this
  }

  override def update(key: Int, value: Double) {
    underlying.put(key, value)
  }

  def get(key: Int) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: Int) = underlying.get(key)

  def iterator = new IntDoubleIterator(underlying.iterator())

  override def size = underlying.size()
}

object IntDoubleMap {
  type Coll = Map[_, _]

  def empty: IntDoubleMap = new IntDoubleMap(new TIntDoubleHashMap())

  def apply(elems: (Int, Double)*): IntDoubleMap = (newBuilder ++= elems).result

  def newBuilder = new IntDoubleMapBuilder(empty)

  class IntDoubleMapCanBuildFrom extends CanBuildFrom[Coll, (Int, Double), IntDoubleMap] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class IntDoubleMapBuilder(map: IntDoubleMap) extends Builder[(Int, Double), IntDoubleMap] {
    def +=(elem: (Int, Double)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: Int, value: Double) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom: CanBuildFrom[Coll, (Int, Double), IntDoubleMap] = new IntDoubleMapCanBuildFrom
}
