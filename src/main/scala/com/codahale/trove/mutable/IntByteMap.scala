// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TIntByteMap
import com.codahale.trove.collection.IntByteIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TIntByteHashMap

class IntByteMap private(private val underlying: TIntByteMap)
  extends Map[Int, Byte]
          with MapLike[Int, Byte, IntByteMap] {

  override def empty = IntByteMap.empty

  def +=(kv: (Int, Byte)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: Int) = {
    underlying.remove(key)
    this
  }

  override def update(key: Int, value: Byte) {
    underlying.put(key, value)
  }

  def get(key: Int) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: Int) = underlying.get(key)

  def iterator = new IntByteIterator(underlying.iterator())

  override def size = underlying.size()
}

object IntByteMap {
  type Coll = Map[_, _]

  def empty: IntByteMap = new IntByteMap(new TIntByteHashMap())

  def apply(elems: (Int, Byte)*): IntByteMap = (newBuilder ++= elems).result

  def newBuilder = new IntByteMapBuilder(empty)

  class IntByteMapCanBuildFrom extends CanBuildFrom[Coll, (Int, Byte), IntByteMap] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class IntByteMapBuilder(map: IntByteMap) extends Builder[(Int, Byte), IntByteMap] {
    def +=(elem: (Int, Byte)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: Int, value: Byte) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom: CanBuildFrom[Coll, (Int, Byte), IntByteMap] = new IntByteMapCanBuildFrom
}
