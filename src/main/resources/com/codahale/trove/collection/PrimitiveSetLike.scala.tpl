@header@

package com.codahale.trove.collection

import scala.collection.{SetLike, Set}

trait @type@SetLike[+This <: @type@SetLike[This] with Set[@type@]] extends SetLike[@type@, This] { self =>

}
