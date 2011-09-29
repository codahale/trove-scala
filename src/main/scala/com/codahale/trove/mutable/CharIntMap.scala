// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TCharIntMap
import com.codahale.trove.collection.CharIntIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TCharIntHashMap

class CharIntMap private(private val underlying: TCharIntMap)
  extends Map[Char, Int]
          with MapLike[Char, Int, CharIntMap] {

  override def empty = CharIntMap.empty

  def +=(kv: (Char, Int)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: Char) = {
    underlying.remove(key)
    this
  }

  override def update(key: Char, value: Int) {
    underlying.put(key, value)
  }

  def get(key: Char) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: Char) = underlying.get(key)

  def iterator = new CharIntIterator(underlying.iterator())

  override def size = underlying.size()
}

object CharIntMap {
  type Coll = Map[_, _]

  def empty: CharIntMap = new CharIntMap(new TCharIntHashMap())

  def apply(elems: (Char, Int)*): CharIntMap = (newBuilder ++= elems).result

  def newBuilder = new CharIntMapBuilder(empty)

  class CharIntMapCanBuildFrom extends CanBuildFrom[Coll, (Char, Int), CharIntMap] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class CharIntMapBuilder(map: CharIntMap) extends Builder[(Char, Int), CharIntMap] {
    def +=(elem: (Char, Int)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: Char, value: Int) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom: CanBuildFrom[Coll, (Char, Int), CharIntMap] = new CharIntMapCanBuildFrom
}
