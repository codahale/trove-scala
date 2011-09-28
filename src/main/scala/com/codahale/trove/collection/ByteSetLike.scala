package com.codahale.trove.collection

import scala.collection.{SetLike, Set}

trait ByteSetLike[+This <: ByteSetLike[This] with Set[Byte]] extends SetLike[Byte, This] { self =>

}
