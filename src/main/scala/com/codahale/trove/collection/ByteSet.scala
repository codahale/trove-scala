// AUTOMATICALLY GENERATED FILE!!! DO NOT EDIT!!!

package com.codahale.trove.collection

import scala.collection.generic.{CanBuildFrom}
import com.codahale.trove.generic.ByteSetFactory
import com.codahale.trove.immutable

trait ByteSet extends collection.Set[Byte] with ByteSetLike[ByteSet] {
  override def empty: ByteSet = ByteSet.empty
}

object ByteSet extends ByteSetFactory[ByteSet] {
  val empty: ByteSet = immutable.ByteSet.empty

  def newBuilder = immutable.ByteSet.newBuilder

  implicit def canBuildFrom: CanBuildFrom[ByteSet, Byte, ByteSet] = primitiveBytesetCanBuildFrom
}
