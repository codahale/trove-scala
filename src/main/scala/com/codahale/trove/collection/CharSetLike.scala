package com.codahale.trove.collection

import scala.collection.{SetLike, Set}

trait CharSetLike[+This <: CharSetLike[This] with Set[Char]] extends SetLike[Char, This] { self =>

}
