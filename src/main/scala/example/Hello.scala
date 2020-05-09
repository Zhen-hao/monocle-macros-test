package example

import monocle.macros.Lenses

object Hello {
  @Lenses case class Address(streetNumber: Int, streetName: String)
}

