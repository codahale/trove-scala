// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.map.TCharObjectMap
import com.codahale.trove.collection.CharObjectIterator
import scala.collection.generic.CanBuildFrom
import scala.collection.mutable._
import gnu.trove.map.hash.TCharObjectHashMap

class CharObjectMap[A] private(private val underlying: TCharObjectMap[A])
  extends Map[Char, A]
          with MapLike[Char, A, CharObjectMap[A]] {

  override def empty = CharObjectMap.empty[A]

  def +=(kv: (Char, A)) = {
    underlying.put(kv._1, kv._2)
    this
  }

  def -=(key: Char) = {
    underlying.remove(key)
    this
  }

  override def update(key: Char, value: A) {
    underlying.put(key, value)
  }

  def get(key: Char) = if (underlying.containsKey(key)) Some(underlying.get(key)) else None

  override def apply(key: Char) = underlying.get(key)

  def iterator = new CharObjectIterator[A](underlying.iterator())

  override def size = underlying.size()
}

object CharObjectMap {
  type Coll = Map[_, _]

  def empty[A]: CharObjectMap[A] = new CharObjectMap[A](new TCharObjectHashMap[A]())

  def apply[A](elems: (Char, A)*): CharObjectMap[A] = (newBuilder ++= elems).result

  def newBuilder[A] = new CharObjectMapBuilder[A](empty)

  class CharObjectMapCanBuildFrom[A] extends CanBuildFrom[Coll, (Char, A), CharObjectMap[A]] {
    def apply(from: Coll) = newBuilder

    def apply() = newBuilder
  }

  class CharObjectMapBuilder[A](map: CharObjectMap[A]) extends Builder[(Char, A), CharObjectMap[A]] {
    def +=(elem: (Char, A)) = {
      map(elem._1) = elem._2
      this
    }

    def update(key: Char, value: A) {
      map(key) = value
    }

    def clear() {
      map.clear()
    }

    def result() = map
  }

  implicit def canBuildFrom[A]: CanBuildFrom[Coll, (Char, A), CharObjectMap[A]] = new CharObjectMapCanBuildFrom[A]
}
