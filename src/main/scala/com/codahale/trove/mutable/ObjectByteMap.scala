// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TObjectByteMap
import com.codahale.trove.collection.ObjectByteIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TObjectByteHashMap

class ObjectByteMap[A] private(private val underlying: TObjectByteMap[A])
  extends Map[A, Byte]
          with MapLike[A, Byte, ObjectByteMap[A]] {

  override def empty = ObjectByteMap.empty[A]

  def +=(kv: (A, Byte)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: A) = {
    underlying.remove(key)
    this
  }

  override def update(key: A, value: Byte) {
    underlying.put(key, value)
  }

  def get(key: A) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: A) = underlying.get(key)

  def iterator = new ObjectByteIterator[A](underlying.iterator())

  override def size = underlying.size()
}

object ObjectByteMap {
  type Coll = Map[_, _]

  def empty[A]: ObjectByteMap[A] = new ObjectByteMap[A](new TObjectByteHashMap[A]())

  def apply[A](elems: (A, Byte)*): ObjectByteMap[A] = (newBuilder ++= elems).result

  def newBuilder[A] = new ObjectByteMapBuilder[A](empty)

  class ObjectByteMapCanBuildFrom[A] extends CanBuildFrom[Coll, (A, Byte), ObjectByteMap[A]] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class ObjectByteMapBuilder[A](map: ObjectByteMap[A]) extends Builder[(A, Byte), ObjectByteMap[A]] {
    def +=(elem: (A, Byte)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: A, value: Byte) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom[A]: CanBuildFrom[Coll, (A, Byte), ObjectByteMap[A]] = new ObjectByteMapCanBuildFrom[A]
}
