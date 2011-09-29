// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TIntCharMap
import com.codahale.trove.collection.IntCharIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TIntCharHashMap

class IntCharMap private(private val underlying: TIntCharMap)
  extends Map[Int, Char]
          with MapLike[Int, Char, IntCharMap] {

  override def empty = IntCharMap.empty

  def +=(kv: (Int, Char)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: Int) = {
    underlying.remove(key)
    this
  }

  override def update(key: Int, value: Char) {
    underlying.put(key, value)
  }

  def get(key: Int) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: Int) = underlying.get(key)

  def iterator = new IntCharIterator(underlying.iterator())

  override def size = underlying.size()
}

object IntCharMap {
  type Coll = Map[_, _]

  def empty: IntCharMap = new IntCharMap(new TIntCharHashMap())

  def apply(elems: (Int, Char)*): IntCharMap = (newBuilder ++= elems).result

  def newBuilder = new IntCharMapBuilder(empty)

  class IntCharMapCanBuildFrom extends CanBuildFrom[Coll, (Int, Char), IntCharMap] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class IntCharMapBuilder(map: IntCharMap) extends Builder[(Int, Char), IntCharMap] {
    def +=(elem: (Int, Char)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: Int, value: Char) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom: CanBuildFrom[Coll, (Int, Char), IntCharMap] = new IntCharMapCanBuildFrom
}
