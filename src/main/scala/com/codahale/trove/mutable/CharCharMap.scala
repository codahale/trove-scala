// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TCharCharMap
import com.codahale.trove.collection.CharCharIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TCharCharHashMap

class CharCharMap private(private val underlying: TCharCharMap)
  extends Map[Char, Char]
          with MapLike[Char, Char, CharCharMap] {

  override def empty = CharCharMap.empty

  def +=(kv: (Char, Char)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: Char) = {
    underlying.remove(key)
    this
  }

  override def update(key: Char, value: Char) {
    underlying.put(key, value)
  }

  def get(key: Char) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: Char) = underlying.get(key)

  def iterator = new CharCharIterator(underlying.iterator())

  override def size = underlying.size()
}

object CharCharMap {
  type Coll = Map[_, _]

  def empty: CharCharMap = new CharCharMap(new TCharCharHashMap())

  def apply(elems: (Char, Char)*): CharCharMap = (newBuilder ++= elems).result

  def newBuilder = new CharCharMapBuilder(empty)

  class CharCharMapCanBuildFrom extends CanBuildFrom[Coll, (Char, Char), CharCharMap] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class CharCharMapBuilder(map: CharCharMap) extends Builder[(Char, Char), CharCharMap] {
    def +=(elem: (Char, Char)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: Char, value: Char) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom: CanBuildFrom[Coll, (Char, Char), CharCharMap] = new CharCharMapCanBuildFrom
}
