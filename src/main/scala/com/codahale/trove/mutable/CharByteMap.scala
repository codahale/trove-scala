// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TCharByteMap
import com.codahale.trove.collection.CharByteIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TCharByteHashMap

class CharByteMap private(private val underlying: TCharByteMap)
  extends Map[Char, Byte]
          with MapLike[Char, Byte, CharByteMap] {

  override def empty = CharByteMap.empty

  def +=(kv: (Char, Byte)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: Char) = {
    underlying.remove(key)
    this
  }

  override def update(key: Char, value: Byte) {
    underlying.put(key, value)
  }

  def get(key: Char) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: Char) = underlying.get(key)

  def iterator = new CharByteIterator(underlying.iterator())

  override def size = underlying.size()
}

object CharByteMap {
  type Coll = Map[_, _]

  def empty: CharByteMap = new CharByteMap(new TCharByteHashMap())

  def apply(elems: (Char, Byte)*): CharByteMap = (newBuilder ++= elems).result

  def newBuilder = new CharByteMapBuilder(empty)

  class CharByteMapCanBuildFrom extends CanBuildFrom[Coll, (Char, Byte), CharByteMap] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class CharByteMapBuilder(map: CharByteMap) extends Builder[(Char, Byte), CharByteMap] {
    def +=(elem: (Char, Byte)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: Char, value: Byte) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom: CanBuildFrom[Coll, (Char, Byte), CharByteMap] = new CharByteMapCanBuildFrom
}
