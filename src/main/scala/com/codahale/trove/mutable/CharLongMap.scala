// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TCharLongMap
import com.codahale.trove.collection.CharLongIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TCharLongHashMap

class CharLongMap private(private val underlying: TCharLongMap)
  extends Map[Char, Long]
          with MapLike[Char, Long, CharLongMap] {

  override def empty = CharLongMap.empty

  def +=(kv: (Char, Long)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: Char) = {
    underlying.remove(key)
    this
  }

  override def update(key: Char, value: Long) {
    underlying.put(key, value)
  }

  def get(key: Char) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: Char) = underlying.get(key)

  def iterator = new CharLongIterator(underlying.iterator())

  override def size = underlying.size()
}

object CharLongMap {
  type Coll = Map[_, _]

  def empty: CharLongMap = new CharLongMap(new TCharLongHashMap())

  def apply(elems: (Char, Long)*): CharLongMap = (newBuilder ++= elems).result

  def newBuilder = new CharLongMapBuilder(empty)

  class CharLongMapCanBuildFrom extends CanBuildFrom[Coll, (Char, Long), CharLongMap] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class CharLongMapBuilder(map: CharLongMap) extends Builder[(Char, Long), CharLongMap] {
    def +=(elem: (Char, Long)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: Char, value: Long) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom: CanBuildFrom[Coll, (Char, Long), CharLongMap] = new CharLongMapCanBuildFrom
}
