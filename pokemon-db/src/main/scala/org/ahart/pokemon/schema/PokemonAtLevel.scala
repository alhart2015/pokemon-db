package org.ahart.pokemon.schema

case class PokemonAtLevel(
                         name: String,
                         id: Int,
                         hp: Int,
                         attack: Int,
                         defense: Int,
                         specialAttack: Int,
                         specialDefense: Int,
                         speed: Int
                         ) {
  def total(): Int = {
    hp + attack + defense + specialAttack + specialDefense + speed
  }
}
