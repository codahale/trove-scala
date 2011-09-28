package com.codahale.trove.immutable

import com.codahale.trove.collection
import com.codahale.trove.generic.{ByteSetFactory, ByteIterator}
import gnu.trove.impl.unmodifiable.TUnmodifiableByteSet
import scala.collection.mutable.{SetBuilder, Builder}
import gnu.trove.set.hash.TByteHashSet

class ByteSet(val underlying: TUnmodifiableByteSet) extends scala.collection.immutable.Set[Byte]
                      with collection.ByteSet
                      with collection.ByteSetLike[ByteSet]
                      with Serializable {
  override def empty: ByteSet = ByteSet.empty

  def +(elem: Byte): ByteSet = {
    val newSet = new TByteHashSet(underlying)
    newSet.add(elem)
    new ByteSet(new TUnmodifiableByteSet(newSet))
  }

  def -(elem: Byte): ByteSet = {
    val newSet = new TByteHashSet(underlying)
    newSet.remove(elem)
    new ByteSet(new TUnmodifiableByteSet(newSet))
  }

  def contains(elem: Byte): Boolean = underlying.contains(elem)

  def iterator = new ByteIterator(underlying.iterator)
}

object ByteSet extends ByteSetFactory[ByteSet] {
  val empty: ByteSet = new ByteSet(new TUnmodifiableByteSet(new TByteHashSet(0)))
  def newBuilder: Builder[Byte, ByteSet] = new SetBuilder[Byte, ByteSet](empty)
}
