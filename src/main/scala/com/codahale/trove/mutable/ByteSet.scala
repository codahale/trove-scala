// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.mutable

import gnu.trove.set.hash.TByteHashSet
import gnu.trove.impl.unmodifiable.TUnmodifiableByteSet
import scala.collection.mutable.{GrowingBuilder, Builder}
import scala.collection.generic.{CanBuildFrom}
import com.codahale.trove.collection.ByteIterator
import com.codahale.trove.generic.ByteSetFactory
import com.codahale.trove.immutable.{ByteSet => ImmutableByteSet}

class ByteSet(private val underlying: TByteHashSet)
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

  override def --=(xs: TraversableOnce[Byte]) = {
    xs match {
      case s: ByteSet => underlying.removeAll(s.underlying)
      case other => super.--=(other)
    }
    this
  }

  def +=(elem: Byte) = {
    underlying.add(elem)
    this
  }

  override def ++=(xs: TraversableOnce[Byte]) = {
    xs match {
      case s: ByteSet => underlying.addAll(s.underlying)
      case other => super.++=(other)
    }
    this
  }

  override def sizeHint(size: Int) {
    underlying.ensureCapacity(size)
  }

  def contains(elem: Byte) = underlying.contains(elem)

  def iterator = new ByteIterator(underlying.iterator)

  override def toSet[B >: Byte] = new ImmutableByteSet(new TUnmodifiableByteSet(underlying)).asInstanceOf[scala.collection.immutable.Set[B]]

  override def size = underlying.size
}


object ByteSet extends ByteSetFactory[ByteSet] {
  def empty: ByteSet = new ByteSet(new TByteHashSet())
  def newBuilder: Builder[Byte, ByteSet] = new GrowingBuilder[Byte, ByteSet](empty)
  implicit def canBuildFrom: CanBuildFrom[ByteSet, Byte, ByteSet] = primitiveByteSetCanBuildFrom
}
