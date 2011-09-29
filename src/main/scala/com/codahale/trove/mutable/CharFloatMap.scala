// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TCharFloatMap
import com.codahale.trove.collection.CharFloatIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TCharFloatHashMap

class CharFloatMap private(private val underlying: TCharFloatMap)
  extends Map[Char, Float]
          with MapLike[Char, Float, CharFloatMap] {

  override def empty = CharFloatMap.empty

  def +=(kv: (Char, Float)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: Char) = {
    underlying.remove(key)
    this
  }

  override def update(key: Char, value: Float) {
    underlying.put(key, value)
  }

  def get(key: Char) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: Char) = underlying.get(key)

  def iterator = new CharFloatIterator(underlying.iterator())

  override def size = underlying.size()
}

object CharFloatMap {
  type Coll = Map[_, _]

  def empty: CharFloatMap = new CharFloatMap(new TCharFloatHashMap())

  def apply(elems: (Char, Float)*): CharFloatMap = (newBuilder ++= elems).result

  def newBuilder = new CharFloatMapBuilder(empty)

  class CharFloatMapCanBuildFrom extends CanBuildFrom[Coll, (Char, Float), CharFloatMap] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class CharFloatMapBuilder(map: CharFloatMap) extends Builder[(Char, Float), CharFloatMap] {
    def +=(elem: (Char, Float)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: Char, value: Float) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom: CanBuildFrom[Coll, (Char, Float), CharFloatMap] = new CharFloatMapCanBuildFrom
}
