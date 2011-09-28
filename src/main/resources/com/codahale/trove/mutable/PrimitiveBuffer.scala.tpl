@header@

import scala.collection.mutable.{Builder, Buffer}
import gnu.trove.list.array.T@type@ArrayList
import scala.collection.{TraversableOnce, Traversable}
import com.codahale.trove.collection.@type@Iterator

class @type@Buffer(private val underlying: T@type@ArrayList)
  extends Buffer[@type@]
          with Builder[@type@, @type@Buffer] {
  
  def +=(elem: @type@) = {
    underlying.add(elem)
    this
  }

  def +=:(elem: @type@) = this.+=(elem)

  override def ++=(xs: TraversableOnce[@type@]) = {
    xs match {
      case b: @type@Buffer => underlying.addAll(b.underlying)
      case other => super.++=(other)
    }
    this
  }

  override def ++=:(xs: TraversableOnce[@type@]) = this.++=(xs)

  override def --=(xs: TraversableOnce[@type@]) = {
    xs match {
      case b: @type@Buffer => underlying.removeAll(b.underlying)
      case other => super.--=(other)
    }
    this
  }

  override def -=(x: @type@) = {
    underlying.remove(x)
    this
  }

  override def sizeHint(size: Int) {
    underlying.ensureCapacity(size)
  }

  def apply(n: Int) = underlying.get(n)

  def clear() {
    underlying.clear()
  }

  def insertAll(n: Int, elems: Traversable[@type@]) {
    elems match {
      case b: @type@Buffer => underlying.insert(n, b.underlying.toArray)
      case other => underlying.insert(n, elems.toArray)
    }
  }

  def length = underlying.size()

  def remove(n: Int) = underlying.removeAt(n)

  def update(n: Int, newelem: @type@) {
    underlying.replace(n, newelem)
  }

  def iterator = new @type@Iterator(underlying.iterator())

  def result() = this
}

object @type@Buffer {
  def newBuilder: Builder[@type@, @type@Buffer] = new @type@Buffer(new T@type@ArrayList())
  
  def empty: @type@Buffer = newBuilder.result()

  def apply(elems: @type@*): @type@Buffer = {
    if (elems.isEmpty) empty
    else {
      val b = newBuilder
      b ++= elems
      b.result
    }
  }
  
  def unapplySeq[A](x: @type@Buffer): Some[@type@Buffer] = Some(x)
}
