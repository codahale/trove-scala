// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TCharDoubleMap
import com.codahale.trove.collection.CharDoubleIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TCharDoubleHashMap

class CharDoubleMap private(private val underlying: TCharDoubleMap)
  extends Map[Char, Double]
          with MapLike[Char, Double, CharDoubleMap] {

  override def empty = CharDoubleMap.empty

  def +=(kv: (Char, Double)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: Char) = {
    underlying.remove(key)
    this
  }

  override def update(key: Char, value: Double) {
    underlying.put(key, value)
  }

  def get(key: Char) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: Char) = underlying.get(key)

  def iterator = new CharDoubleIterator(underlying.iterator())

  override def size = underlying.size()
}

object CharDoubleMap {
  type Coll = Map[_, _]

  def empty: CharDoubleMap = new CharDoubleMap(new TCharDoubleHashMap())

  def apply(elems: (Char, Double)*): CharDoubleMap = (newBuilder ++= elems).result

  def newBuilder = new CharDoubleMapBuilder(empty)

  class CharDoubleMapCanBuildFrom extends CanBuildFrom[Coll, (Char, Double), CharDoubleMap] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class CharDoubleMapBuilder(map: CharDoubleMap) extends Builder[(Char, Double), CharDoubleMap] {
    def +=(elem: (Char, Double)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: Char, value: Double) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom: CanBuildFrom[Coll, (Char, Double), CharDoubleMap] = new CharDoubleMapCanBuildFrom
}
