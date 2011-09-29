@header@

package com.codahale.trove.mutable

import gnu.trove.map.T@keyType@@valueType@Map
import com.codahale.trove.collection.@keyType@@valueType@Iterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.T@keyType@@valueType@HashMap

class @keyType@@valueType@Map private(private val underlying: T@keyType@@valueType@Map)
  extends Map[@keyType@, @valueType@]
          with MapLike[@keyType@, @valueType@, @keyType@@valueType@Map] {

  override def empty = @keyType@@valueType@Map.empty

  def +=(kv: (@keyType@, @valueType@)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: @keyType@) = {
    underlying.remove(key)
    this
  }

  override def update(key: @keyType@, value: @valueType@) {
    underlying.put(key, value)
  }

  def get(key: @keyType@) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: @keyType@) = underlying.get(key)

  def iterator = new @keyType@@valueType@Iterator(underlying.iterator())

  override def size = underlying.size()
}

object @keyType@@valueType@Map {
  type Coll = Map[_, _]

  def empty: @keyType@@valueType@Map = new @keyType@@valueType@Map(new T@keyType@@valueType@HashMap())

  def apply(elems: (@keyType@, @valueType@)*): @keyType@@valueType@Map = (newBuilder ++= elems).result

  def newBuilder = new @keyType@@valueType@MapBuilder(empty)

  class @keyType@@valueType@MapCanBuildFrom extends CanBuildFrom[Coll, (@keyType@, @valueType@), @keyType@@valueType@Map] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class @keyType@@valueType@MapBuilder(map: @keyType@@valueType@Map) extends Builder[(@keyType@, @valueType@), @keyType@@valueType@Map] {
    def +=(elem: (@keyType@, @valueType@)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: @keyType@, value: @valueType@) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom: CanBuildFrom[Coll, (@keyType@, @valueType@), @keyType@@valueType@Map] = new @keyType@@valueType@MapCanBuildFrom
}
