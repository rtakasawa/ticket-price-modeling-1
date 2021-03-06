package domain

import enumeratum.{ Enum, EnumEntry }

sealed trait Gender extends EnumEntry

object Gender extends Enum[Gender] {
  override def values = findValues
  case object Male   extends Gender
  case object Female extends Gender
}
