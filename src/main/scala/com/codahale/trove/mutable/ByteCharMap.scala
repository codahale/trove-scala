// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TByteCharMap
import com.codahale.trove.collection.ByteCharIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TByteCharHashMap

class ByteCharMap private(private val underlying: TByteCharMap)
  extends Map[Byte, Char]
          with MapLike[Byte, Char, ByteCharMap] {

  override def empty = ByteCharMap.empty

  def +=(kv: (Byte, Char)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: Byte) = {
    underlying.remove(key)
    this
  }

  override def update(key: Byte, value: Char) {
    underlying.put(key, value)
  }

  def get(key: Byte) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: Byte) = underlying.get(key)

  def iterator = new ByteCharIterator(underlying.iterator())

  override def size = underlying.size()
}

object ByteCharMap {
  type Coll = Map[_, _]

  def empty: ByteCharMap = new ByteCharMap(new TByteCharHashMap())

  def apply(elems: (Byte, Char)*): ByteCharMap = (newBuilder ++= elems).result

  def newBuilder = new ByteCharMapBuilder(empty)

  class ByteCharMapCanBuildFrom extends CanBuildFrom[Coll, (Byte, Char), ByteCharMap] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class ByteCharMapBuilder(map: ByteCharMap) extends Builder[(Byte, Char), ByteCharMap] {
    def +=(elem: (Byte, Char)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: Byte, value: Char) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom: CanBuildFrom[Coll, (Byte, Char), ByteCharMap] = new ByteCharMapCanBuildFrom
}
