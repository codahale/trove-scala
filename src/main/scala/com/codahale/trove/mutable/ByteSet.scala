package com.codahale.trove.mutable

import gnu.trove.set.TByteSet
import gnu.trove.set.hash.TByteHashSet
import scala.collection.mutable.{GrowingBuilder, Builder}
import scala.collection.generic.{CanBuildFrom}
import com.codahale.trove.generic.{ByteSetFactory, ByteIterator}

class ByteSet(private[this] val underlying: TByteSet)
  extends scala.collection.mutable.Set[Byte]
          with com.codahale.trove.collection.ByteSet
          with com.codahale.trove.collection.ByteSetLike[ByteSet]
          with scala.collection.mutable.SetLike[Byte, ByteSet]
          with Serializable {

  override def empty = ByteSet.empty

  def -=(elem: Byte) = {
    underlying.remove(elem)
    this
  }

  def +=(elem: Byte) = {
    underlying.add(elem)
    this
  }

  def contains(elem: Byte) = underlying.contains(elem)

  def iterator = new ByteIterator(underlying.iterator)
}


object ByteSet extends ByteSetFactory[ByteSet] {
  def empty: ByteSet = new ByteSet(new TByteHashSet())
  def newBuilder: Builder[Byte, ByteSet] = new GrowingBuilder[Byte, ByteSet](empty)
  implicit def canBuildFrom: CanBuildFrom[ByteSet, Byte, ByteSet] = bytesetCanBuildFrom
}
